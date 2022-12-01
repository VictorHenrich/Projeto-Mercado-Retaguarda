
package view;

import controllers.pessoas.CRUDClientController;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComponent;
import models.pessoas.Client;
import view.utils.UtilsComponents;


public class ClientComponent extends javax.swing.JFrame {
    
    private Client newClient(){
        
        int id = this.controller.nextID();
        
        String name = jTextFieldName.getText();
        String cpf = jTextFieldCpf.getText();
        String rg = jTextFieldRg.getText();
        String fone1 = jTextFieldPhone1.getText();
        String fone2 = jTextFieldPhone2.getText();
        String email = jTextFieldEmail.getText();
        String obs = jTextAreaObs.getText();
        Date birthday = new Date();
        char gender = 'M';
        char status = 'A';
        
        return new Client(cpf, rg, birthday, gender, name, fone1, fone2, "", email, obs, status, id);
        
    }
    
    private void clearStates(){
        jTextFieldName.setText(null);
        jTextFieldCpf.setText(null);
        jTextFieldRg.setText(null);
        jTextFieldPhone1.setText(null);
        jTextFieldPhone2.setText(null);
        jTextFieldEmail.setText(null);
        jTextAreaObs.setText(null);
        
        this.activateButtons(false);
    }
    
    private void activeStates(){
        this.activateButtons(true);
        this.activateFields(true);
    }
    
    private void addClient(){
        
        Client client = this.newClient();
        
        this.controller.create(client);
    }
    
    private void changeClient(){
        if(this.clientLoaded == null) return;
        
        Client newClient = this.newClient();
        
        this.controller.update(clientLoaded.getId(), newClient);
    }
    
    private void activateButtons(boolean state){
        ArrayList<JComponent> buttons = new ArrayList();
        
        buttons.add(jButtonCancel);
        buttons.add(jButtonWrite);
        
        UtilsComponents.disabledComponents(buttons, state);
    }
    
    private void activateFields(boolean state){
        ArrayList<JComponent> fields = new ArrayList();
        
        fields.add(jTextFieldName);
        fields.add(jTextFieldCpf);
        fields.add(jTextFieldRg);
        fields.add(jTextFieldPhone1);
        fields.add(jTextFieldPhone2);
        fields.add(jTextFieldEmail);
        fields.add(jTextAreaObs);
        
        UtilsComponents.disabledComponents(fields, state);
    }
    

    public ClientComponent(
      CRUDClientController controller,
      Client clientLoaded
    ) {
        
       this.controller = controller;
       this.clientLoaded = clientLoaded;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonChange = new javax.swing.JButton();
        jButtonWrite = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonOut = new javax.swing.JButton();
        jPanelBody = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelPhone1 = new javax.swing.JLabel();
        jLabelPhone2 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelObs = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jTextFieldPhone2 = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldRg = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setText("Cliente");
        jPanelHeader.add(jLabelTitle);

        jPanelFooter.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNew.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNew.setForeground(new java.awt.Color(204, 204, 204));
        jButtonNew.setText("Novo");
        jButtonNew.setToolTipText("Novo");
        jButtonNew.setBorder(null);
        jButtonNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNew.setFocusPainted(false);
        jButtonNew.setFocusable(false);
        jButtonNew.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonNew);

        jButtonChange.setBackground(new java.awt.Color(102, 102, 102));
        jButtonChange.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonChange.setForeground(new java.awt.Color(204, 204, 204));
        jButtonChange.setText("Alterar");
        jButtonChange.setBorder(null);
        jButtonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChange.setEnabled(false);
        jButtonChange.setFocusPainted(false);
        jButtonChange.setFocusable(false);
        jButtonChange.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonChange);

        jButtonWrite.setBackground(new java.awt.Color(102, 102, 102));
        jButtonWrite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonWrite.setForeground(new java.awt.Color(204, 204, 204));
        jButtonWrite.setText("Gravar");
        jButtonWrite.setBorder(null);
        jButtonWrite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonWrite.setEnabled(false);
        jButtonWrite.setFocusPainted(false);
        jButtonWrite.setFocusable(false);
        jButtonWrite.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWriteActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonWrite);

        jButtonCancel.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(204, 204, 204));
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setBorder(null);
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.setEnabled(false);
        jButtonCancel.setFocusPainted(false);
        jButtonCancel.setFocusable(false);
        jButtonCancel.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonCancel);

        jButtonOut.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonOut.setForeground(new java.awt.Color(204, 204, 204));
        jButtonOut.setText("Sair");
        jButtonOut.setBorder(null);
        jButtonOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOut.setFocusPainted(false);
        jButtonOut.setFocusable(false);
        jButtonOut.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOutActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonOut);

        jPanelBody.setBackground(new java.awt.Color(80, 80, 80));

        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(190, 190, 190));
        jLabelName.setText("Nome:");

        jLabelPhone1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPhone1.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPhone1.setText("Fone1:");

        jLabelPhone2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPhone2.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPhone2.setText("Fone2:");

        jLabelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail.setText("Email:");

        jLabelObs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelObs.setForeground(new java.awt.Color(190, 190, 190));
        jLabelObs.setText("Observação:");

        jTextFieldName.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldName.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldName.setEnabled(false);
        jTextFieldName.setPreferredSize(new java.awt.Dimension(300, 30));

        jTextFieldPhone1.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldPhone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhone1.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPhone1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPhone1.setEnabled(false);
        jTextFieldPhone1.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldPhone2.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldPhone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhone2.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPhone2.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPhone2.setEnabled(false);
        jTextFieldPhone2.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldEmail.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldEmail.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(300, 30));

        jTextAreaObs.setBackground(new java.awt.Color(50, 50, 50));
        jTextAreaObs.setColumns(20);
        jTextAreaObs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaObs.setForeground(new java.awt.Color(190, 190, 190));
        jTextAreaObs.setRows(5);
        jTextAreaObs.setBorder(new javax.swing.border.MatteBorder(null));
        jTextAreaObs.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaObs);

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCpf.setText("CPF:");

        jLabelRg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelRg.setForeground(new java.awt.Color(190, 190, 190));
        jLabelRg.setText("RG:");

        jTextFieldCpf.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCpf.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCpf.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCpf.setEnabled(false);
        jTextFieldCpf.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldRg.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldRg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldRg.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldRg.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldRg.setEnabled(false);
        jTextFieldRg.setPreferredSize(new java.awt.Dimension(60, 30));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelObs)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addComponent(jLabelPhone1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPhone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelCpf))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRg))
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRg)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhone1)
                    .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhone2)
                    .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        this.activeStates();
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.clearStates();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOutActionPerformed
        this.clearStates();
        this.dispose();
    }//GEN-LAST:event_jButtonOutActionPerformed

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        this.activeStates();
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jButtonWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWriteActionPerformed
        if(this.clientLoaded != null)
            this.changeClient();
        
        else
            this.addClient();
        
        this.clearStates();
    }//GEN-LAST:event_jButtonWriteActionPerformed

    
    private CRUDClientController controller;
    private Client clientLoaded;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonWrite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelPhone1;
    private javax.swing.JLabel jLabelPhone2;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldPhone2;
    private javax.swing.JTextField jTextFieldRg;
    // End of variables declaration//GEN-END:variables
}
