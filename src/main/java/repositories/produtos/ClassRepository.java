
package repositories.produtos;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.produtos.Class;

public class ClassRepository extends BaseRepository<Class>{
    
    public ClassRepository(ArrayList<Class> data) {
        super(data);
    }
    
}
