
package controllers.enderecos;

import controllers.patterns.AbstractCrudController;
import java.util.ArrayList;
import models.enderecos.Cidade;
import repositories.enderecos.CidadeRepository;
import repositories.patterns.BaseRepository;


public class CidadeCrudController extends  AbstractCrudController<Cidade, CidadeRepository>{
    
    public CidadeCrudController(BaseRepository<Cidade> repository) {
        super(repository);
    }
    
    
}
