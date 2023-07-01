
package repositories.people;
import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;
import repositories.patterns.CrudRepository;
import models.people.Supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SupplierRepository extends AbstractCrudRepository<Supplier> {
    private final String supplierDefaultQuery = "SELECT f.*, e.cep AS endereco_cep, " +
            "e.logradouro AS endereco_logradouro, e.cidade_id, e.bairro_id, " +
            "ci.descricao AS cidade_descricao, b.descricao AS bairro_descricao " +
            "FROM fornecedores AS f " +
            "INNER JOIN enderecos AS e ON e.id = f.endereco_id " +
            "INNER JOIN cidades AS ci ON ci.id = e.cidade_id " +
            "INNER JOIN bairros AS b ON b.id = e.bairro_id ";

    private Supplier handleSupplierResult(ResultSet result) throws Exception{
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

        return new Supplier(
                result.getString("cnpj"),
                result.getString("ie"),
                result.getString("contato"),
                result.getString("razao_social"),
                result.getString("cpf"),
                result.getString("rg"),
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
    public Supplier load(int id) throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.supplierDefaultQuery + "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleSupplierResult(result);

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Supplier> fetch() throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Supplier> suppliers = new ArrayList<Supplier>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.supplierDefaultQuery);

            while(result.next()){
                suppliers.add(this.handleSupplierResult(result));
            }

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return suppliers;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
