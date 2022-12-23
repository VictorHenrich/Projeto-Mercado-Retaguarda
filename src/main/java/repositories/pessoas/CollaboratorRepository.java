
package repositories.pessoas;
import data.DatabaseData;
import repositories.patterns.BaseRepository;
import models.pessoas.Collaborator;

public class CollaboratorRepository extends BaseRepository<Collaborator>{
    
    public CollaboratorRepository() {
        super(DatabaseData.collaborators);
    }
    
}
