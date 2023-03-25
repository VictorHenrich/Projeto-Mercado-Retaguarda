
package repositories.address;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.address.District;
import repositories.exceptions.DistrictRepositoryError;
import repositories.patterns.CrudRepository;


public class DistrictRepository implements CrudRepository<District>{

    @Override
    public void create(District register) throws DistrictRepositoryError {

        Connection connection = DatabaseConnection.createConnection();

        String sql = "INSERT INTO bairros (id, descricao) VALUES(DEFAULT, ?)";

       try{
           PreparedStatement ps = connection.prepareStatement(sql);
           
           ps.setString(1, register.getDescricao());
           ps.executeUpdate();
           
       }catch(Exception error){
           throw new DistrictRepositoryError("INSERÇÃO", error);
       }finally {
           DatabaseConnection.closeConnection(connection);
       }
    }

    @Override
    public void update(int id, District register) throws DistrictRepositoryError{
        String sql = "UPDATE bairros SET descricao = ? WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
           PreparedStatement ps = connection.prepareStatement(sql);
           
           ps.setString(1, register.getDescricao());
           ps.setInt(2, id);
           ps.executeUpdate();
           
       }catch(Exception error){
            throw new DistrictRepositoryError("ATUALIZAÇÃO", error);

       }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws DistrictRepositoryError{
        String sql = "DELETE FROM bairros WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
           PreparedStatement ps = connection.prepareStatement(sql);
          
           ps.setInt(1, id);
           ps.executeUpdate();
           
       }catch(Exception error){
           throw new DistrictRepositoryError("EXCLUSÃO", error);
       }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public District load(int id) throws DistrictRepositoryError{

        String sql = "SELECT b.id, b.descricao FROM bairros AS b WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            ResultSet result = connection.createStatement().executeQuery(sql);
           
           return new District(
                result.getString("descricao"), 
                result.getInt("id")
           );
           
       }catch(Exception error){
           throw new DistrictRepositoryError("CARREGAMENTO", error);
       }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<District> fetch() throws DistrictRepositoryError{
        ArrayList<District> districties = new ArrayList();

        String sql = "SELECT b.id, b.descricao FROM bairros AS b";

        Connection connection = DatabaseConnection.createConnection();
        
        try{
            ResultSet result = connection.createStatement().executeQuery(sql);
            
            while(result.next()){
                District district = new District(
                    result.getString("descricao"), 
                    result.getInt("id")
                );
                
                districties.add(district);
            }

        }catch(Exception error){
            throw new DistrictRepositoryError("LISTAGEM", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return districties;

    }

    @Override
    public int nextID() {
        return 0;
    }


}
