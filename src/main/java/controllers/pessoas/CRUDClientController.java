
package controllers.pessoas;

import controllers.builders.pessoa.ClientBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.pessoas.Client;
import repositories.pessoas.ClientRepository;




public class CRUDClientController implements InterfaceCrudController<ClientBuilder, Client>{
    private final ClientRepository repository;

    public CRUDClientController() {
        ArrayList<Client> clients = new ArrayList();
        this.repository = new ClientRepository(clients);
    }
    
    @Override
    public ClientBuilder newModelBuilder() {
        return new ClientBuilder();
    }

    @Override
    public void create(ClientBuilder register) {
        int id = this.repository.nextID();
        
        Client client = register.build(id);
        
        this.repository.create(client);
    }

    @Override
    public void update(int id, ClientBuilder register) {
        Client client = register.build(id);
        
        this.repository.update(id, client);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<Client> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Client load(int id) {
        return this.repository.load(id);
    }
   
    
}
