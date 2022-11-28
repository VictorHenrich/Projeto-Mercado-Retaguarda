
package controllers.pessoas;

import controllers.patterns.AbstractCrudController;
import models.pessoas.Colaborador;
import repositories.patterns.BaseRepository;
import repositories.pessoas.ColaboradorRepository;


public class ColaboradorCrudController extends AbstractCrudController<Colaborador, ColaboradorRepository>{

    public ColaboradorCrudController(BaseRepository<Colaborador> repository) {
        super(repository);
    }
    
    
    
}
