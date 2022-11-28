
package repositories.produtos;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.produtos.Classe;

public class ClasseRepository extends BaseRepository<Classe>{
    
    public ClasseRepository(ArrayList<Classe> data) {
        super(data);
    }
    
}
