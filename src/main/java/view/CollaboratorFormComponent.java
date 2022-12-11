
package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import view.components.AbstractFormPersonComponent;


public class CollaboratorFormComponent extends AbstractFormPersonComponent {
    
    
    public CollaboratorFormComponent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jPanelHeader = new javax.swing.JPanel();
        this.jLabelTitle = new javax.swing.JLabel();
        this.jPanelFooter = new javax.swing.JPanel();
        this.jButtonNew = new javax.swing.JButton();
        this.jButtonChange = new javax.swing.JButton();
        this.jButtonWrite = new javax.swing.JButton();
        this.jButtonCancel = new javax.swing.JButton();
        this.jButtonOut = new javax.swing.JButton();
        this.jPanelBody = new javax.swing.JPanel();
        this.jLabelName = new javax.swing.JLabel();
        this.jLabelPhone1 = new javax.swing.JLabel();
        this.jLabelPhone2 = new javax.swing.JLabel();
        this.jLabelEmail = new javax.swing.JLabel();
        this.jLabelObs = new javax.swing.JLabel();
        this.jTextFieldName = new javax.swing.JTextField();
        this.jTextFieldPhone1 = new javax.swing.JTextField();
        this.jTextFieldPhone2 = new javax.swing.JTextField();
        this.jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        this.jTextAreaObs = new javax.swing.JTextArea();
        jLabelUser = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        this.jLabelCep = new javax.swing.JLabel();
        this.jTextFieldCep = new javax.swing.JTextField();
        this.jLabelStreet = new javax.swing.JLabel();
        this.jTextFieldStreet = new javax.swing.JTextField();
        this.jLabelCity = new javax.swing.JLabel();
        this.jComboBoxCity = new javax.swing.JComboBox<>();
        this.jLabelDistrict = new javax.swing.JLabel();
        this.jComboBoxDistrict = new javax.swing.JComboBox<>();
        jPanelContainerStatus = new javax.swing.JPanel();
        this.jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Colaborador");
        this.jPanelHeader.add(this.jLabelTitle);

        this.jPanelFooter.setBackground(new java.awt.Color(153, 153, 153));
        this.jPanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jButtonNew.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonNew.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonNew.setText("Novo");
        this.jButtonNew.setToolTipText("Novo");
        this.jButtonNew.setBorder(null);
        this.jButtonNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonNew.setFocusPainted(false);
        this.jButtonNew.setFocusable(false);
        this.jButtonNew.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonNew);

        this.jButtonChange.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonChange.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonChange.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonChange.setText("Alterar");
        this.jButtonChange.setBorder(null);
        this.jButtonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonChange.setEnabled(false);
        this.jButtonChange.setFocusPainted(false);
        this.jButtonChange.setFocusable(false);
        this.jButtonChange.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonChange);

        this.jButtonWrite.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonWrite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonWrite.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonWrite.setText("Gravar");
        this.jButtonWrite.setBorder(null);
        this.jButtonWrite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonWrite.setEnabled(false);
        this.jButtonWrite.setFocusPainted(false);
        this.jButtonWrite.setFocusable(false);
        this.jButtonWrite.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonWrite);

        this.jButtonCancel.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonCancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonCancel.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonCancel.setText("Cancelar");
        this.jButtonCancel.setBorder(null);
        this.jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonCancel.setEnabled(false);
        this.jButtonCancel.setFocusPainted(false);
        this.jButtonCancel.setFocusable(false);
        this.jButtonCancel.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonCancel);

        this.jButtonOut.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonOut.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonOut.setText("Sair");
        this.jButtonOut.setBorder(null);
        this.jButtonOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonOut.setFocusPainted(false);
        this.jButtonOut.setFocusable(false);
        this.jButtonOut.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonOut);

        this.jPanelBody.setBackground(new java.awt.Color(80, 80, 80));

        this.jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelName.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelName.setText("Nome:");

        this.jLabelPhone1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelPhone1.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelPhone1.setText("Fone1:");

        this.jLabelPhone2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelPhone2.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelPhone2.setText("Fone2:");

        this.jLabelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelEmail.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelEmail.setText("Email:");

        this.jLabelObs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelObs.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelObs.setText("Observação:");

        this.jTextFieldName.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldName.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldName.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldName.setEnabled(false);
        this.jTextFieldName.setPreferredSize(new java.awt.Dimension(0, 30));

        this.jTextFieldPhone1.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldPhone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldPhone1.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldPhone1.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldPhone1.setEnabled(false);
        this.jTextFieldPhone1.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jTextFieldPhone2.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldPhone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldPhone2.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldPhone2.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldPhone2.setEnabled(false);
        this.jTextFieldPhone2.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jTextFieldEmail.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldEmail.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldEmail.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldEmail.setEnabled(false);
        this.jTextFieldEmail.setPreferredSize(new java.awt.Dimension(0, 30));

        this.jTextAreaObs.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextAreaObs.setEnabled(false);
        jScrollPane1.setViewportView(this.jTextAreaObs);

        jLabelUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(190, 190, 190));
        jLabelUser.setText("Usuario:");

        jTextFieldUser.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldUser.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldUser.setEnabled(false);
        jTextFieldUser.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabelPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPassword.setText("Senha:");

        jTextFieldPassword.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPassword.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPassword.setEnabled(false);
        jTextFieldPassword.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jLabelCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCep.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCep.setText("CEP:");

        this.jTextFieldCep.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldCep.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldCep.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldCep.setEnabled(false);
        this.jTextFieldCep.setPreferredSize(new java.awt.Dimension(0, 30));

        this.jLabelStreet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelStreet.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelStreet.setText("Logradouro:");

        this.jTextFieldStreet.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldStreet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldStreet.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldStreet.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldStreet.setEnabled(false);
        this.jTextFieldStreet.setPreferredSize(new java.awt.Dimension(0, 30));

        this.jLabelCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCity.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCity.setText("Cidade:");

        this.jComboBoxCity.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxCity.setEnabled(false);
        this.jComboBoxCity.setPreferredSize(new java.awt.Dimension(72, 30));

        this.jLabelDistrict.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelDistrict.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelDistrict.setText("Bairro");

        this.jComboBoxDistrict.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxDistrict.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxDistrict.setEnabled(false);
        this.jComboBoxDistrict.setPreferredSize(new java.awt.Dimension(72, 30));

        jPanelContainerStatus.setBackground(new java.awt.Color(0, 0, 0));

        this.jLabelStatus.setBackground(new java.awt.Color(0, 0, 0));
        this.jLabelStatus.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelStatus.setForeground(new java.awt.Color(0, 204, 153));
        this.jLabelStatus.setText("STATUS");
        jPanelContainerStatus.add(this.jLabelStatus);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(this.jLabelCity)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(this.jLabelCep)
                                        .addGap(32, 32, 32)
                                        .addComponent(this.jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(this.jLabelStreet)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jTextFieldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(this.jLabelDistrict)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jComboBoxDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(this.jLabelObs)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(this.jLabelPhone1)
                                        .addComponent(this.jLabelEmail)
                                        .addComponent(jLabelUser)
                                        .addComponent(this.jLabelName))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelPassword)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(this.jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(this.jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addComponent(this.jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(this.jLabelPhone2)
                                            .addGap(19, 19, 19)
                                            .addComponent(this.jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(40, 40, 40))))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelName)
                    .addComponent(this.jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelPhone1)
                    .addComponent(this.jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelPhone2)
                    .addComponent(this.jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelEmail)
                    .addComponent(this.jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelCep)
                    .addComponent(this.jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelStreet)
                    .addComponent(this.jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelCity)
                    .addComponent(this.jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelDistrict)
                    .addComponent(this.jComboBoxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(this.jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getjLabelPassword() {
        return jLabelPassword;
    }

    public JLabel getjLabelUser() {
        return jLabelUser;
    }

    public JPanel getjPanelContainerStatus() {
        return jPanelContainerStatus;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextField getjTextFieldPassword() {
        return jTextFieldPassword;
    }

    public JTextField getjTextFieldUser() {
        return jTextFieldUser;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelContainerStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
