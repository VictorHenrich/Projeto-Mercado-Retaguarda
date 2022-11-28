
package controllers.produtos;
import models.produtos.Classe;
import controllers.patterns.AbstractCrudController;
import repositories.patterns.BaseRepository;
import repositories.produtos.ClasseRepository;

public class ClasseCrudController extends AbstractCrudController<Classe, ClasseRepository>{

    public ClasseCrudController(BaseRepository<Classe> repository) {
        super(repository);
    }
    
    
}
