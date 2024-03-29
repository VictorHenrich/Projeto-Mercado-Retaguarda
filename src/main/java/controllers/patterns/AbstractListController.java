
package controllers.patterns;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import models.patterns.BaseModel;
import repositories.patterns.ICrudRepository;
import view.components.AbstractListComponent;


public abstract class AbstractListController<T extends AbstractListComponent, M extends BaseModel>{
    protected final T table;
    private final AbstractFormController formController;
    protected final ICrudRepository<M> repository;
    private ArrayList<M> registers;

    public AbstractListController(
        T table, 
        AbstractFormController formController,
        ICrudRepository<M> repository
    ) {
        this.table = table;
        this.formController = formController;
        this.repository = repository;
        this.registers = new ArrayList<M>();
        
        init();
    }
    

    protected ArrayList<M> getRegisters(){
        try{
            this.registers = (ArrayList<M>) this.repository.fetch();

            return this.registers;
        }catch(Exception error){
            JOptionPane.showMessageDialog(
                    this.formController.form,
                    "Falha ao carregar dados na tela!\n\nError: " + error.getMessage(),
                    "AVISO ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        return null;
    }

    protected abstract ArrayList<String[]> getRows();
    
    private void onClickButtonDelete(){
        try{
            int indexSelected = this.table.getjTableList().getSelectedRow();

            if(this.registers.size() == 0 && indexSelected < 0) return;

            M model = this.registers.get(this.table.getjTableList().getSelectedRow());

            this.repository.delete(model);

            this.reloadList();

        }catch(Exception error){
            JOptionPane.showMessageDialog(
                this.formController.form,
                "Falha ao excluir dado selecionado!\n\nError: " + error.getMessage(),
                "AVISO ERROR",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void onClickButtonUpdate(){
        int indexSelected = this.table.getjTableList().getSelectedRow();
        
        if(this.registers.size() == 0 && indexSelected < 0) return;
        
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
