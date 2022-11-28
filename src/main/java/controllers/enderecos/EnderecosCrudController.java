
package controllers.enderecos;

import models.enderecos.Endereco;
import controllers.patterns.AbstractCrudController;
import java.util.ArrayList;
import repositories.enderecos.EnderecoRepository;
import repositories.patterns.BaseRepository;


public class EnderecosCrudController extends AbstractCrudController<Endereco, EnderecoRepository>{
    
    public EnderecosCrudController(BaseRepository<Endereco> repository) {
        super(repository);
    }
    

}
