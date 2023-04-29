
package controllers.lists.people;

import controllers.forms.people.ClientFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.people.Client;
import repositories.people.ClientRepository;
import view.lists.ClientListComponent;


public class ClientListController extends AbstractListController<ClientListComponent, Client>{

    public ClientListController() {
        super(
            new ClientListComponent(), 
            new ClientFormController(), 
            new ClientRepository()
        );
    }

    @Override
    protected ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(Client client: this.getRegisters()){
            String[] row = {
                "" + client.getId(),
                client.getNome(),
                client.getCpf(),
                client.getRg(),
                client.getDataNascimento() == null ? "" : client.getDataNascimento().toString(),
                "" + client.getSexo()
            };

            
            rows.add(row);
        }
        
        return rows;
    }
    
}
