
package repositories.products;

import database.DatabaseConnection;
import models.products.Brand;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;

import java.sql.*;
import java.util.ArrayList;


public class BrandRepository extends AbstractCrudRepository<Brand> {

    private String brandsDefaultQuery = "SELECT * from marcas ";

    @Override
    public Brand load(int id) throws RepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.brandsDefaultQuery + "WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return new Brand(
                result.getString("descricao"),
                result.getInt("id")
            );

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);

        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Brand> fetch() throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Brand> brands = new ArrayList<Brand>();

        try{
            ResultSet result = connection
                                    .createStatement()
                                    .executeQuery(this.brandsDefaultQuery);

            while(result.next()){
                Brand brand = new Brand(
                    result.getString("descricao"),
                    result.getInt("id")
                );

                brands.add(brand);
            }

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return brands;
    }
}
