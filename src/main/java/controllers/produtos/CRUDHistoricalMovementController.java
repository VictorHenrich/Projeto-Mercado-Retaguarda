
package controllers.produtos;

import controllers.builders.produtos.HistoricalMovementBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.produtos.HistoricalMovement;
import repositories.produtos.HistoricalMovementRepository;


public class CRUDHistoricalMovementController implements InterfaceCrudController<HistoricalMovementBuilder, HistoricalMovement>{

    private final HistoricalMovementRepository repository;
    
    public CRUDHistoricalMovementController() {
        
        ArrayList<HistoricalMovement> historic = new ArrayList();
        
        this.repository = new HistoricalMovementRepository(historic);
    }

    @Override
    public HistoricalMovementBuilder newModelBuilder() {
        return new HistoricalMovementBuilder();
    }

    @Override
    public void create(HistoricalMovementBuilder register) {
        HistoricalMovement class_ = register.build(this.repository.nextID());
        
        this.repository.create(class_);
    }

    @Override
    public void update(int id, HistoricalMovementBuilder register) {
        HistoricalMovement class_ = register.build(id);
        
        this.repository.update(id, class_);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<HistoricalMovement> fetch() {
        return this.repository.fetch();
    }

    @Override
    public HistoricalMovement load(int id) {
        return this.repository.load(id);
    }
    
}
