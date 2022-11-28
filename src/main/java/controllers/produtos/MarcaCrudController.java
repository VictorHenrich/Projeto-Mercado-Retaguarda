
package controllers.produtos;
import models.produtos.Marca;
import controllers.patterns.AbstractCrudController;
import repositories.patterns.BaseRepository;
import repositories.produtos.MarcaRepository;

public class MarcaCrudController extends AbstractCrudController<Marca, MarcaRepository>{

    public MarcaCrudController(BaseRepository<Marca> repository) {
        super(repository);
    }
    
    
}
