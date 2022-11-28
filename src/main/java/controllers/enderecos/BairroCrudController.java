
package controllers.enderecos;

import controllers.patterns.AbstractCrudController;
import java.util.ArrayList;
import models.enderecos.Bairro;
import repositories.enderecos.BairroRepository;
import repositories.patterns.BaseRepository;


public class BairroCrudController extends AbstractCrudController<Bairro, BairroRepository>{
    
    public BairroCrudController(BaseRepository<Bairro> repository) {
        super(repository);
    }
}
