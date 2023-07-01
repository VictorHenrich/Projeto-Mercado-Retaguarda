
package repositories.products;
import database.DatabaseConnection;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;
import models.products.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClassRepository extends AbstractCrudRepository<Class> {

    private String classesDefaultQuery = "SELECT * FROM classes ";

    @Override
    public Class load(int id) throws RepositoryError {
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
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Class> fetch() throws RepositoryError{

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
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

        return classes;
    }
}
