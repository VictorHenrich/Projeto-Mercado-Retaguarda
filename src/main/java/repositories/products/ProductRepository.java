
package repositories.products;

import database.DatabaseConnection;
import models.products.Brand;
import models.products.Product;
import models.products.Class;
import repositories.exceptions.ProductRepositoryError;
import repositories.patterns.CrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProductRepository implements CrudRepository<Product>{
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
    public void create(Product register) throws ProductRepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = "INSERT INTO produtos " +
                     "(id, descricao, valor_compra, valor_venda, " +
                     "unidade_compra, unidade_venda, fator_conversao, " +
                     "status, barra_entrada, barra_saida, "+
                     "estoque_maximo, estoque_minimo, classe_id, marca_id) " +
                     "VALUES(DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.setFloat(2, register.getValorCompra());
            ps.setFloat(3, register.getValorVenda());
            ps.setString(4, register.getUnidadeCompra());
            ps.setString(5, register.getUnidadeVenda());
            ps.setInt(6, register.getFatorConversao());
            ps.setString(7, "" + register.getStatus());
            ps.setString(8, register.getBarraEntrada());
            ps.setString(9, register.getBarraSaida());
            ps.setFloat(10, register.getEstoqueMaximo());
            ps.setFloat(11, register.getEstoqueMinimo());
            ps.setInt(12, register.getClasse().getId());
            ps.setInt(13, register.getMarca().getId());

            ps.executeUpdate();

        }catch(Exception error){
            throw new ProductRepositoryError("INSERÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void update(int id, Product register) throws ProductRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "UPDATE produtos " +
                    "SET descricao = ?, valor_compra = ?, valor_venda = ?, " +
                    "unidade_compra = ?, unidade_venda = ?, fator_conversao = ?, " +
                    "status = ?, barra_entrada = ?, barra_saida = ?, "+
                    "estoque_maximo = ?, estoque_minimo = ?, classe_id = ?, marca_id = ? " +
                    "WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.setFloat(2, register.getValorCompra());
            ps.setFloat(3, register.getValorVenda());
            ps.setString(4, register.getUnidadeCompra());
            ps.setString(5, register.getUnidadeVenda());
            ps.setInt(6, register.getFatorConversao());
            ps.setString(7, "" + register.getStatus());
            ps.setString(8, register.getBarraEntrada());
            ps.setString(9, register.getBarraSaida());
            ps.setFloat(10, register.getEstoqueMaximo());
            ps.setFloat(11, register.getEstoqueMinimo());
            ps.setInt(12, register.getClasse().getId());
            ps.setInt(13, register.getMarca().getId());
            ps.setInt(14, register.getId());

            ps.executeUpdate();

        }catch(Exception error){
            throw new ProductRepositoryError("ATUALIZAÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws ProductRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "DELETE FROM produtos WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new ProductRepositoryError("EXCLUSÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Product load(int id) throws ProductRepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.productsDefaultQuery + "WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleProductResult(result);

        }catch(Exception error){
            throw new ProductRepositoryError("CARREGAMENTO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Product> fetch() throws ProductRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Product> products = new ArrayList<Product>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.productsDefaultQuery);

            while(result.next()){
                products.add(this.handleProductResult(result));
            }

        }catch(Exception error){
            throw new ProductRepositoryError("CARREGAMENTO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

        return products;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
