
package controllers.pessoas;

import controllers.patterns.AbstractCrudController;
import models.pessoas.Cliente;
import repositories.patterns.BaseRepository;
import repositories.pessoas.ClienteRepository;


public class ClienteCrudController extends AbstractCrudController<Cliente, ClienteRepository>{

    public ClienteCrudController(BaseRepository<Cliente> repository) {
        super(repository);
    }
   
    
   
    
}
