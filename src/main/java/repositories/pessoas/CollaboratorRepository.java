
package repositories.pessoas;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.pessoas.Collaborator;

public class CollaboratorRepository extends BaseRepository<Collaborator>{
    
    public CollaboratorRepository(ArrayList<Collaborator> data) {
        super(data);
    }
    
}
