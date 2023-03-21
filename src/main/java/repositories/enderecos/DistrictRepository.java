
package repositories.enderecos;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.enderecos.District;
import repositories.patterns.CrudRepository;


public class DistrictRepository implements CrudRepository<District>{

    @Override
    public void create(District register) {
       try{
           
           String sql = "INSERT INTO bairros (id, descricao) VALUES(DEFAULT, ?)";
           
           Connection connection = DatabaseConnection.createConnection();
           
           PreparedStatement ps = connection.prepareStatement(sql);
           
           ps.setString(1, register.getDescricao());
           ps.executeUpdate();
           
           DatabaseConnection.closeConnection(connection);
           
           System.out.println("Bairro cadastrado com sucesso!");
           
       }catch(Exception error){
           System.out.println("Falha ao cadastrar bairro!\n" + error.getMessage());
       }
    }

    @Override
    public void update(int id, District register) {
        try{
           
           String sql = "UPDATE bairros SET descricao = ? WHERE id = ?";
           
           Connection connection = DatabaseConnection.createConnection();
           
           PreparedStatement ps = connection.prepareStatement(sql);
           
           ps.setString(1, register.getDescricao());
           ps.setInt(2, id);
           ps.executeUpdate();
           
           DatabaseConnection.closeConnection(connection);
           
           System.out.println("Bairro atualizado com sucesso!");
           
       }catch(Exception error){
           System.out.println("Falha ao atualizado bairro!\n" + error.getMessage());
       }
    }

    @Override
    public void delete(int id) {
        try{
           
           String sql = "DELETE FROM bairros WHERE id = ?";
           
           Connection connection = DatabaseConnection.createConnection();
           
           PreparedStatement ps = connection.prepareStatement(sql);
          
           ps.setInt(1, id);
           ps.executeUpdate();
           
           DatabaseConnection.closeConnection(connection);
           
           System.out.println("Bairro excluido com sucesso!");
           
       }catch(Exception error){
           System.out.println("Falha ao excluido bairro!\n" + error.getMessage());
       }
    }

    @Override
    public District load(int id) {
        try{
           
           String sql = "SELECT b.id, b.descricao FROM bairros AS b WHERE id = ?";
           
           Connection connection = DatabaseConnection.createConnection();
           
            ResultSet result = connection.createStatement().executeQuery(sql);
           
           DatabaseConnection.closeConnection(connection);
           
           System.out.println("Bairro excluido com sucesso!");
           
           return new District(
                result.getString("descricao"), 
                result.getInt("id")
           );
           
       }catch(Exception error){
           System.out.println("Falha ao excluido bairro!\n" + error.getMessage());
       }
        
        return null;
    }

    @Override
    public Iterable<District> fetch() {
        ArrayList<District> districties = new ArrayList();
        
        try{
            String sql = "SELECT b.id, b.descricao FROM bairros AS b";
            
            Connection connection = DatabaseConnection.createConnection();
            
            ResultSet result = connection.createStatement().executeQuery(sql);
            
            while(result.next()){
                District district = new District(
                    result.getString("descricao"), 
                    result.getInt("id")
                );
                
                districties.add(district);
            }
            
        }catch(Exception error){
            System.out.println("Falha ao listar bairros!\n" + error.getMessage());
        }
        
        return districties;
    }

    @Override
    public int nextID() {
        return 0;
    }


}
