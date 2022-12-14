
package controllers.patterns;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.patterns.BaseModel;
import repositories.patterns.BaseRepository;
import view.components.AbstractListComponent;


public abstract class AbstractListController<T extends AbstractListComponent, M extends BaseModel>{
    protected final T table;
    private final AbstractFormController formController;
    protected final BaseRepository<M> repository;
    protected final ArrayList<M> registers;

    public AbstractListController(
        T table, 
        AbstractFormController formController, 
        BaseRepository<M> repository
    ) {
        this.table = table;
        this.formController = formController;
        this.repository = repository;
        this.registers = (ArrayList<M>) this.repository.fetch();
        
        init();
    }
    
    
    protected abstract ArrayList<String[]> getRows();
    
    private void onClickButtonDelete(){
        if(this.registers.size() <= 0) return;
        
        M model = this.registers.get(this.table.getjTableList().getSelectedRow());
        
        this.repository.delete(model.getId());
        
        this.reloadList();
    }
    
    private void onClickButtonUpdate(){
        M model = this.registers.get(this.table.getjTableList().getSelectedRow());
        
        this.formController.showComponent(model, this);
    }
    
    private void onClickButtonCreate(){
        this.formController.showComponent(null, this);
    }
    
    public void reloadList(){
        DefaultTableModel table = (DefaultTableModel) this.table.getjTableList().getModel();
        
        if(table.getRowCount() > 0)
            table.setRowCount(0);
        
        for(String[] s: this.getRows())
            table.addRow(s);
    }
    
    public void showComponent(boolean visible){
        this.table.setVisible(true);
        
        this.reloadList();
    }
    
    private void init(){
        this.table.getjButtonDelete().addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickButtonDelete();
            }
        });
        
        this.table.getjButtonUpdate().addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickButtonUpdate();
            }
        });
        
        this.table.getjButtonCreate().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               onClickButtonCreate();
            }
        });
        
        
        this.table.getjButtonOut().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table.dispose();
            }
        });
    }
}
