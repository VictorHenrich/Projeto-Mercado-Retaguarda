
package repositories.products;

import database.DatabaseConnection;
import models.products.Brand;
import repositories.exceptions.BrandRepositoryError;
import repositories.patterns.CrudRepository;

import java.sql.*;
import java.util.ArrayList;


public class BrandRepository implements CrudRepository<Brand>{

    private String brandsDefaultQuery = "SELECT * from marcas ";

    @Override
    public void create(Brand register) throws BrandRepositoryError {
        String sql = "INSERT INTO marcas (id, descricao) VALUES(DEFAULT, ?)";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, register.getDescricao());

            ps.executeUpdate();

        }catch(Exception error){
            throw new BrandRepositoryError("INSERÇÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void update(int id, Brand register) throws BrandRepositoryError{

        String sql = "UPDATE marcas SET descricao = ? WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, register.getDescricao());
            ps.setInt(2, id);

            ps.executeUpdate();

        }catch(Exception error){
            throw new BrandRepositoryError("INSERÇÃO", error);

        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws BrandRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "DELETE FROM marcas WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new BrandRepositoryError("EXCLUSÃO", error);

        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Brand load(int id) throws BrandRepositoryError{
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
            throw new BrandRepositoryError("CARREGAMENTO", error);

        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Brand> fetch() throws BrandRepositoryError{
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
            throw new BrandRepositoryError("LISTAGEM", error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return brands;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
