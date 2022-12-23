
package controllers.patterns;

import java.awt.event.ActionEvent;
import models.patterns.BaseModel;
import view.components.AbstractFormComponent;


public abstract class AbstractFormController<T extends AbstractFormComponent, M extends BaseModel>{
    protected final T form;
    protected M registerLoaded;
    private AbstractListController listController;

    public AbstractFormController(T form) {
        this.form = form;
        
        this.addListeners();
    }
    
    public void showComponent(M registerLoaded, AbstractListController listController){
        this.form.setVisible(true);
        
        if(registerLoaded != null)
            this.form.getjButtonChange().setEnabled(true);
        
        this.registerLoaded = registerLoaded;
        
        this.listController = listController;
        
        this.onShowComponent();
    }
    
    private void addListeners(){
        this.form.getjButtonNew().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form.activateButtons(true);
                
                onClickButtonNew();
            }
        });
        
        
        this.form.getjButtonWrite().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form.activateButtons(false);
                   
                onClickButtonWrite();
                
                resetStates();
            }
        });
        
        this.form.getjButtonChange().addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                form.activateButtons(true);
                
                onClickButtonChange();
            }
        });
        
        this.form.getjButtonOut().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.activateButtons(false);
                
                resetStates();
                
                form.dispose();
                
                listController.reloadList();
            }
        });
        
        
        this.form.getjButtonCancel().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.activateButtons(false);
                
                resetStates();
            }
        });
    }
    
    abstract protected void onShowComponent();
    
    abstract protected void resetStates();
    
    abstract protected void onClickButtonNew();
    
    abstract protected void onClickButtonChange();
    
    abstract protected void onClickButtonWrite();
    
    
    
}
