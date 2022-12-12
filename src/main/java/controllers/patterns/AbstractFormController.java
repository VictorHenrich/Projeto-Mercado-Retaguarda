
package controllers.patterns;

import java.awt.event.ActionEvent;
import models.patterns.BaseModel;
import view.components.AbstractFormComponent;


public abstract class AbstractFormController<T extends AbstractFormComponent, M extends BaseModel>{
    protected final T form;
    protected M registerLoaded;

    public AbstractFormController(T form) {
        this.form = form;
        
        this.addListeners();
        this.initStates();
        
        this.form.setVisible(true);
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
                   
                if(registerLoaded != null)
                    onClickButtonUpdate();
                else
                    onClickButtonCreate();
                
                resetStates();
            }
        });
        
        this.form.getjButtonChange().addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                form.activateButtons(true);
                
                onClickButtonCreate();
            }
        });
        
        this.form.getjButtonOut().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.activateButtons(false);
                
                resetStates();
                
                form.dispose();
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
    
    abstract protected void initStates();
    
    abstract protected void resetStates();
    
    abstract protected void onClickButtonNew();
    
    abstract protected void onClickButtonCreate();
    
    abstract protected void onClickButtonUpdate();
    
}
