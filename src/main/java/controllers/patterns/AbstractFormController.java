
package controllers.patterns;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import models.patterns.BaseModel;
import view.components.AbstractFormComponent;


public abstract class AbstractFormController<T extends AbstractFormComponent, M extends BaseModel>{
    protected final T form;
    protected final ArrayList<M> registers;
    protected M registerLoaded;

    public AbstractFormController(T form) {
        this.form = form;
        this.registers = new ArrayList();
        
        this.addListeners();
        this.form.setVisible(true);
        
        this.resetStates();
    }
    
    private void addListeners(){
        this.form.getjButtonNew().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form.activateButtons(true);
                
                initStates();
            }
        });
        
        
        this.form.getjButtonWrite().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form.activateButtons(false);
                   
                if(registerLoaded != null)
                    update();
                else
                    create();
                
                resetStates();
            }
        });
        
        this.form.getjButtonChange().addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                form.activateButtons(true);
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
    
    abstract protected void resetStates();
    
    abstract protected void initStates();
    
    abstract protected void create();
    
    abstract protected void update();
   
    
}
