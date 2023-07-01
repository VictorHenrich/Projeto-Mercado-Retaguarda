
package repositories.people;
import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;
import models.people.Collaborator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CollaboratorRepository extends AbstractCrudRepository<Collaborator> {
    private final String collaboratorDefaultQuery =
            "SELECT c.*, e.cep AS endereco_cep, " +
            "e.logradouro AS endereco_logradouro, e.cidade_id, e.bairro_id, " +
            "ci.descricao AS cidade_descricao, b.descricao AS bairro_descricao " +
            "FROM colaboradores AS c " +
            "INNER JOIN enderecos AS e ON e.id = c.endereco_id " +
            "INNER JOIN cidades AS ci ON ci.id = e.cidade_id " +
            "INNER JOIN bairros AS b ON b.id = e.bairro_id ";

    private Collaborator handleCollaboratorResult(ResultSet result) throws Exception{
        City city = new City(
                result.getString("cidade_descricao"),
                result.getInt("cidade_id")
        );

        District district = new District(
                result.getString("bairro_descricao"),
                result.getInt("bairro_id")
        );

        Address address = new Address(
                result.getString("endereco_logradouro"),
                result.getString("endereco_cep"),
                city,
                district,
                result.getInt("endereco_id")
        );

        return new Collaborator(
                result.getString("login"),
                result.getString("senha"),
                result.getString("nome"),
                result.getString("fone1"),
                result.getString("fone2"),
                result.getString("endereco_complemento"),
                address,
                result.getString("email"),
                result.getString("observacao"),
                result.getString("status").charAt(0),
                result.getInt("id")
        );
    }

    @Override
    public Collaborator load(int id) throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.collaboratorDefaultQuery + "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleCollaboratorResult(result);

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Collaborator> fetch() throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Collaborator> collaborators = new ArrayList<Collaborator>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.collaboratorDefaultQuery);

            while(result.next()){
                collaborators.add(this.handleCollaboratorResult(result));
            }

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return collaborators;
    }
}
