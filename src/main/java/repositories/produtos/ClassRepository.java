
package repositories.produtos;
import database.DatabaseConnection;
import repositories.patterns.CrudRepository;
import models.produtos.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClassRepository implements CrudRepository<Class>{

    @Override
    public void create(Class register) {
        try{

            String sql = "INSERT INTO classes (id, descricao) values(DEFAULT, ?)";

            Connection connection = DatabaseConnection.createConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.executeUpdate();

            System.out.println("Classe cadastrada com sucesso!");


        }catch (Exception error){
            System.out.println("Falha ao cadastrar classe!\n" + error.getMessage());
        }
    }

    @Override
    public void update(int id, Class register) {
        try{
            String sql = "UPDATE classes SET descricao = ?";

            Connection connection = DatabaseConnection.createConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.executeUpdate();

            System.out.println("Classe alterada com sucesso!");

        }catch (Exception error){
            System.out.println("Falha ao alterar classe!\n" + error.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try{

        }
    }

    @Override
    public Class load(int id) {
        return null;
    }

    @Override
    public Iterable<Class> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
