
package view.forms;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import view.components.AbstractFormPersonComponent;
import models.enderecos.City;
import models.enderecos.District;
import models.enderecos.Address;


public class CollaboratorFormComponent extends AbstractFormPersonComponent {
    
    
    public CollaboratorFormComponent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jPanelHeader = new javax.swing.JPanel();
        this.jLabelTitle = new javax.swing.JLabel();
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
        jLabelUser = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldNameCep = new javax.swing.JTextField();
        jLabelStreet = new javax.swing.JLabel();
        jTextFieldStreet = new javax.swing.JTextField();
        jLabelCity = new javax.swing.JLabel();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jLabelDistrict = new javax.swing.JLabel();
        jComboBoxDistrict = new javax.swing.JComboBox<>();
        jPanelContainerStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Colaborador");
        this.jPanelHeader.add(this.jLabelTitle);

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
        jTextFieldName.setPreferredSize(new java.awt.Dimension(0, 30));

        jTextFieldPhone1.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldPhone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhone1.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPhone1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPhone1.setEnabled(false);
        jTextFieldPhone1.setPreferredSize(new java.awt.Dimension(50, 30));

        jTextFieldPhone2.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldPhone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhone2.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPhone2.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPhone2.setEnabled(false);
        jTextFieldPhone2.setPreferredSize(new java.awt.Dimension(50, 30));

        jTextFieldEmail.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldEmail.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(0, 30));

        jTextAreaObs.setBackground(new java.awt.Color(50, 50, 50));
        jTextAreaObs.setColumns(20);
        jTextAreaObs.setForeground(new java.awt.Color(190, 190, 190));
        jTextAreaObs.setRows(5);
        jTextAreaObs.setBorder(new javax.swing.border.MatteBorder(null));
        jTextAreaObs.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaObs);

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

        jLabelCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCep.setText("CEP:");

        jTextFieldNameCep.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldNameCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNameCep.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldNameCep.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldNameCep.setEnabled(false);
        jTextFieldNameCep.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabelStreet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelStreet.setForeground(new java.awt.Color(190, 190, 190));
        jLabelStreet.setText("Logradouro:");

        jTextFieldStreet.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldStreet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldStreet.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldStreet.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldStreet.setEnabled(false);
        jTextFieldStreet.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabelCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCity.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCity.setText("Cidade:");

        jComboBoxCity.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxCity.setEnabled(false);
        jComboBoxCity.setPreferredSize(new java.awt.Dimension(72, 30));

        jLabelDistrict.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDistrict.setForeground(new java.awt.Color(190, 190, 190));
        jLabelDistrict.setText("Bairro");

        jComboBoxDistrict.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxDistrict.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxDistrict.setEnabled(false);
        jComboBoxDistrict.setPreferredSize(new java.awt.Dimension(72, 30));

        jPanelContainerStatus.setBackground(new java.awt.Color(0, 0, 0));

        jLabelStatus.setBackground(new java.awt.Color(0, 0, 0));
        jLabelStatus.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(0, 204, 153));
        jLabelStatus.setText("STATUS");
        jPanelContainerStatus.add(jLabelStatus);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
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
                                        .addComponent(jLabelCity)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelCep)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextFieldNameCep, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelStreet)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jLabelDistrict)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelObs)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPhone1)
                                        .addComponent(jLabelEmail)
                                        .addComponent(jLabelUser)
                                        .addComponent(jLabelName))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelPassword)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelPhone2)
                                            .addGap(19, 19, 19)
                                            .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jTextFieldNameCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStreet)
                    .addComponent(jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDistrict)
                    .addComponent(jComboBoxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonWrite;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxDistrict;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelDistrict;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone1;
    private javax.swing.JLabel jLabelPhone2;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel this.jLabelTitle;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelContainerStatus;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel this.jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameCep;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldPhone2;
    private javax.swing.JTextField jTextFieldStreet;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
