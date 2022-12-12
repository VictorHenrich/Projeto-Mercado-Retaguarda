
package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import view.components.AbstractFormPersonComponent;


public class ClientFormComponent extends AbstractFormPersonComponent {
    
    
    public ClientFormComponent() {
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
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jTextFieldPhone2 = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldRg = new javax.swing.JTextField();
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
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jComboSex = new javax.swing.JComboBox<>();
        jLabelSex = new javax.swing.JLabel();
        jLabelDateBirth = new javax.swing.JLabel();
        jTextFieldDateBirth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTextFieldUser.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldUser.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldUser.setEnabled(false);
        jTextFieldUser.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabelRg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelRg.setForeground(new java.awt.Color(190, 190, 190));
        jLabelRg.setText("RG:");

        jTextFieldRg.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldRg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldRg.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldRg.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldRg.setEnabled(false);
        jTextFieldRg.setPreferredSize(new java.awt.Dimension(50, 30));

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

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCpf.setText("CPF:");

        jTextFieldCpf.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCpf.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCpf.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCpf.setEnabled(false);
        jTextFieldCpf.setPreferredSize(new java.awt.Dimension(50, 30));

        jComboSex.setBackground(new java.awt.Color(51, 51, 51));
        jComboSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboSex.setEnabled(false);
        jComboSex.setPreferredSize(new java.awt.Dimension(72, 30));

        jLabelSex.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSex.setForeground(new java.awt.Color(190, 190, 190));
        jLabelSex.setText("Sexo:");

        jLabelDateBirth.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDateBirth.setForeground(new java.awt.Color(190, 190, 190));
        jLabelDateBirth.setText("Data Nasc.:");

        jTextFieldDateBirth.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldDateBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDateBirth.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldDateBirth.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldDateBirth.setEnabled(false);
        jTextFieldDateBirth.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(644, 644, 644)
                        .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabelName)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelPhone1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPhone2)
                        .addGap(19, 19, 19)
                        .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabelEmail)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelObs))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCep)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabelSex)
                            .addComponent(jLabelCity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabelDistrict)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelStreet)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jComboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabelDateBirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDateBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRg)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPhone1))
                    .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelPhone2)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCpf))
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelRg)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateBirth)
                    .addComponent(jTextFieldDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSex))
                .addGap(71, 71, 71)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCep)
                        .addComponent(jLabelStreet))
                    .addComponent(jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCity))
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDistrict)))
                .addGap(30, 30, 30)
                .addComponent(jLabelObs)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboSex;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JPanel jPanelContainerStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDateBirth;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JTextField jTextFieldCpf;
    // End of variables declaration//GEN-END:variables
}
