
package repositories.products;

import database.DatabaseConnection;
import models.products.Brand;
import models.products.Product;
import models.products.Class;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProductRepository extends AbstractCrudRepository<Product> {
    private final String productsDefaultQuery = "SELECT m.descricao AS marca_descricao, " +
                                                 "c.descricao AS classe_descricao, p.* " +
                                                 "FROM produtos AS p " +
                                                 "INNER JOIN marcas AS m ON m.id = p.marca_id " +
                                                 "INNER JOIN classes AS c ON c.id = p.classe_id ";


    private Product handleProductResult(ResultSet result) throws Exception{
        Class class_ = new Class(
                result.getString("classe_descricao"),
                result.getInt("classe_id")
        );

        Brand brand = new Brand(
                result.getString("marca_descricao"),
                result.getInt("marca_id")
        );

        return new Product(
                result.getString("descricao"),
                result.getFloat("valor_compra"),
                result.getFloat("valor_venda"),
                result.getString("unidade_compra"),
                result.getString("unidade_venda"),
                result.getInt("fator_conversao"),
                result.getString("status").charAt(0),
                result.getString("barra_entrada"),
                result.getString("barra_saida"),
                result.getFloat("estoque_minimo"),
                result.getFloat("estoque_maximo"),
                class_,
                brand,
                result.getInt("id")
        );
    }

    @Override
    public Product load(int id) throws RepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.productsDefaultQuery + "WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleProductResult(result);

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Product> fetch() throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Product> products = new ArrayList<Product>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.productsDefaultQuery);

            while(result.next()){
                products.add(this.handleProductResult(result));
            }

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

        return products;
    }
}
