
package repositories.produtos;
import data.DatabaseData;
import repositories.patterns.BaseRepository;
import models.produtos.Class;

public class ClassRepository extends BaseRepository<Class>{
    
    public ClassRepository() {
        super(DatabaseData.classes);
    }
    
}
