
package repositories.products;
import database.DatabaseConnection;
import repositories.exceptions.ClassRepositoryError;
import repositories.patterns.CrudRepository;
import models.products.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClassRepository implements CrudRepository<Class>{

    private String classesDefaultQuery = "SELECT * FROM classes ";

    @Override
    public void create(Class register) throws ClassRepositoryError {

        String sql = "INSERT INTO classes (id, descricao) values(DEFAULT, ?)";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.executeUpdate();

        }catch (Exception error){
            throw new ClassRepositoryError("INSERÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void update(int id, Class register) throws ClassRepositoryError{
        String sql = "UPDATE classes SET descricao = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.executeUpdate();

        }catch (Exception error){
            throw new ClassRepositoryError("ATUALIZAÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws ClassRepositoryError{
        String sql = "DELETE FROM classes WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new ClassRepositoryError("EXCLUSÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Class load(int id) throws ClassRepositoryError{
        String sql = this.classesDefaultQuery + "WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return new Class(
                result.getString("descricao"),
                result.getInt("id")
            );

        }catch(Exception error){
            throw new ClassRepositoryError("CARREGAMENTO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Class> fetch() throws ClassRepositoryError{

        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Class> classes = new ArrayList<Class>();

        try{
            ResultSet result = connection
                                    .createStatement()
                                    .executeQuery(this.classesDefaultQuery);

            while(result.next()){
                Class class_ = new Class(
                    result.getString("descricao"),
                    result.getInt("id")
                );

                classes.add(class_);
            }

        }catch(Exception error){
            throw new ClassRepositoryError("LISTAGEM", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

        return classes;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
