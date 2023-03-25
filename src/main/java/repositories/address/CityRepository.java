
package repositories.address;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.address.City;
import repositories.exceptions.CityRepositoryError;
import repositories.patterns.CrudRepository;


public class CityRepository implements CrudRepository<City>{

    @Override
    public void create(City register) throws CityRepositoryError {
        String sql = "INSERT INTO cidades (id, descricao) VALUES(DEFAULT, ?)";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.executeUpdate();
            
        }catch(Exception error){
            throw new CityRepositoryError("INSERÇÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void update(int id, City register) throws CityRepositoryError{
        String sql = "UPDATE cidades SET descricao = ? WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.setInt(2, id);
            ps.executeUpdate();
            
        }catch(Exception error){
            throw new CityRepositoryError("ATUALIZAÇÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws CityRepositoryError{
        String sql = "DELETE FROM cidades WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            
        }catch(Exception error){
            throw new CityRepositoryError("EXCLUSÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public City load(int id) throws CityRepositoryError{
        String sql = "SELECT c.descricao, c.id FROM cidades AS c WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(0, id);
            
            ResultSet result = ps.executeQuery();
            
            return new City(
                result.getString("descricao"),
                    result.getInt("id")
            );
            
        }catch(Exception error){
            throw new CityRepositoryError("CARREGAMENTO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<City> fetch() throws CityRepositoryError{
        String sql = "SELECT c.id, c.descricao FROM cidades AS c";

        Connection connection = DatabaseConnection.createConnection();

        ArrayList<City> cities = new ArrayList<City>();

        try{
            ResultSet result = connection
                                    .createStatement()
                                    .executeQuery(sql);

            while(result.next()){
                City city = new City(
                    result.getString("descricao"), 
                    result.getInt("id")
                );
                
                cities.add(city);
            }
            
        }catch(Exception error){
            throw new CityRepositoryError("LISTAGEM", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

        return cities;
    }

    @Override
    public int nextID() {
        return 0;
    }


}
