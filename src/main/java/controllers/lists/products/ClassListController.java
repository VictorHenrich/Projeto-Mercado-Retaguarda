
package controllers.lists.products;

import controllers.forms.products.ClassFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.products.Class;
import repositories.products.ClassRepository;
import view.lists.ClassListComponent;


public class ClassListController extends AbstractListController<ClassListComponent, Class>{

    public ClassListController() {
        super(
            new ClassListComponent(),
            new ClassFormController(),
            new ClassRepository()
        );
    }

    @Override
    protected ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(Class class_: this.getRegisters()){
            String[] row = {"" + class_.getId(), class_.getDescricao()};
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
