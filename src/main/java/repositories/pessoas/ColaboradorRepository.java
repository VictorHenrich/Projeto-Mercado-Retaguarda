
package repositories.pessoas;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.pessoas.Colaborador;

public class ColaboradorRepository extends BaseRepository<Colaborador>{
    
    public ColaboradorRepository(ArrayList<Colaborador> data) {
        super(data);
    }
    
}
