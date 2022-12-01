
package controllers.pessoas;

import controllers.patterns.AbstractCrudController;
import models.pessoas.Client;
import repositories.patterns.BaseRepository;
import repositories.pessoas.ClientRepository;


public class CRUDClientController extends AbstractCrudController<Client, ClientRepository>{

    public CRUDClientController(BaseRepository<Client> repository) {
        super(repository);
    }
   
    
   
    
}
