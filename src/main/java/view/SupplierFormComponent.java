
package view;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import view.components.AbstractFormPersonComponent;


public class SupplierFormComponent extends AbstractFormPersonComponent {
    
    
    public SupplierFormComponent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTextFieldSocialReason = new javax.swing.JTextField();
        jTextFieldCnpj = new javax.swing.JTextField();
        jTextFieldPhone2 = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelStreet = new javax.swing.JLabel();
        jTextFieldStreet = new javax.swing.JTextField();
        jLabelCity = new javax.swing.JLabel();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jLabelDistrict = new javax.swing.JLabel();
        jComboBoxDistrict = new javax.swing.JComboBox<>();
        jPanelContainerStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelSocialReason = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jTextFieldContact = new javax.swing.JTextField();
        jLabelIE = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelContact = new javax.swing.JLabel();
        jTextFieldIe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setText("Colaborador");
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

        jTextFieldSocialReason.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldSocialReason.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldSocialReason.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldSocialReason.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldSocialReason.setEnabled(false);
        jTextFieldSocialReason.setPreferredSize(new java.awt.Dimension(0, 30));

        jTextFieldCnpj.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCnpj.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCnpj.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCnpj.setEnabled(false);
        jTextFieldCnpj.setPreferredSize(new java.awt.Dimension(50, 30));

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

        jLabelCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCep.setText("CEP:");

        jTextFieldCep.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCep.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCep.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCep.setEnabled(false);
        jTextFieldCep.setPreferredSize(new java.awt.Dimension(0, 30));

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
        jLabelDistrict.setText("Bairro:");

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

        jLabelSocialReason.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSocialReason.setForeground(new java.awt.Color(190, 190, 190));
        jLabelSocialReason.setText("Razão Social:");

        jTextFieldName.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldName.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldName.setEnabled(false);
        jTextFieldName.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCpf.setText("CPF:");

        jLabelCnpj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCnpj.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCnpj.setText("CNPJ:");

        jTextFieldContact.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldContact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldContact.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldContact.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldContact.setEnabled(false);
        jTextFieldContact.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabelIE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelIE.setForeground(new java.awt.Color(190, 190, 190));
        jLabelIE.setText("IE:");

        jTextFieldCpf.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCpf.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCpf.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCpf.setEnabled(false);
        jTextFieldCpf.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabelContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelContact.setForeground(new java.awt.Color(190, 190, 190));
        jLabelContact.setText("Contato:");

        jTextFieldIe.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldIe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldIe.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldIe.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldIe.setEnabled(false);
        jTextFieldIe.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPhone1)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelName))
                                .addGap(52, 52, 52)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGap(262, 262, 262)
                                        .addComponent(jLabelPhone2)
                                        .addGap(19, 19, 19)
                                        .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSocialReason)
                                    .addComponent(jLabelCpf)
                                    .addComponent(jLabelIE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldIe, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelContact)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelCnpj)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldSocialReason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(49, 49, 49))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelObs)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelCity)
                                                .addComponent(jLabelCep))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextFieldCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxCity, 0, 220, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelStreet)
                                                .addComponent(jLabelDistrict)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                                            .addGap(110, 110, 110)
                                            ))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addGap(18, 18, 18))
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxDistrict, 0, 304, Short.MAX_VALUE)
                                            .addComponent(jTextFieldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jLabelSocialReason)
                    .addComponent(jTextFieldSocialReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCnpj)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIE)
                    .addComponent(jTextFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContact)
                    .addComponent(jTextFieldIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhone1)
                    .addComponent(jLabelPhone2)
                    .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
                .addGap(46, 46, 46)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStreet)
                    .addComponent(jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDistrict)
                    .addComponent(jComboBoxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    public JLabel getjLabelCnpj() {
        return jLabelCnpj;
    }

    public JLabel getjLabelContact() {
        return jLabelContact;
    }

    public JLabel getjLabelCpf() {
        return jLabelCpf;
    }

    public JLabel getjLabelIE() {
        return jLabelIE;
    }

    public JLabel getjLabelSocialReason() {
        return jLabelSocialReason;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextField getjTextFieldCnpj() {
        return jTextFieldCnpj;
    }

    public JTextField getjTextFieldContact() {
        return jTextFieldContact;
    }

    public JTextField getjTextFieldCpf() {
        return jTextFieldCpf;
    }

    public JTextField getjTextFieldIe() {
        return jTextFieldIe;
    }

    public JTextField getjTextFieldSocialReason() {
        return jTextFieldSocialReason;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelIE;
    private javax.swing.JLabel jLabelSocialReason;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldContact;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldIe;
    private javax.swing.JTextField jTextFieldSocialReason;
    // End of variables declaration//GEN-END:variables
}
