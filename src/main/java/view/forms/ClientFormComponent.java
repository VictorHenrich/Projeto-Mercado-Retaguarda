
package view.forms;

import javax.swing.JComboBox;
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
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.jTextAreaObs = new javax.swing.JTextArea();
        this.jTextFieldUser = new javax.swing.JTextField();
        this.jLabelPassword = new javax.swing.JLabel();
        this.jTextFieldPassword = new javax.swing.JTextField();
        this.jLabelCep = new javax.swing.JLabel();
        this.jTextFieldNameCep = new javax.swing.JTextField();
        this.jLabelStreet = new javax.swing.JLabel();
        this.jTextFieldStreet = new javax.swing.JTextField();
        this.jLabelCity = new javax.swing.JLabel();
        this.jComboBoxCity = new javax.swing.JComboBox<>();
        this.jLabelDistrict = new javax.swing.JLabel();
        this.jComboBoxDistrict = new javax.swing.JComboBox<>();
        this.jPanelContainerStatus = new javax.swing.JPanel();
        this.jLabelStatus = new javax.swing.JLabel();
        this.jLabelUser1 = new javax.swing.JLabel();
        this.jTextFieldUser1 = new javax.swing.JTextField();
        this.jComboBoxSex = new javax.swing.JComboBox<>();
        this.jLabelCitySex = new javax.swing.JLabel();
        this.jLabelDateBirth = new javax.swing.JLabel();
        this.jTextFieldDateBirth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Cliente");
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
        this.jScrollPane1.setViewportView(this.jTextAreaObs);

        this.jTextFieldUser.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldUser.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldUser.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldUser.setEnabled(false);
        this.jTextFieldUser.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jLabelPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelPassword.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelPassword.setText("RG:");

        this.jTextFieldPassword.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldPassword.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldPassword.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldPassword.setEnabled(false);
        this.jTextFieldPassword.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jLabelCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCep.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCep.setText("CEP:");

        this.jTextFieldNameCep.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldNameCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldNameCep.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldNameCep.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldNameCep.setEnabled(false);
        this.jTextFieldNameCep.setPreferredSize(new java.awt.Dimension(0, 30));

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
        this.jLabelDistrict.setText("Bairro:");

        this.jComboBoxDistrict.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxDistrict.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxDistrict.setEnabled(false);
        this.jComboBoxDistrict.setPreferredSize(new java.awt.Dimension(72, 30));

        this.jPanelContainerStatus.setBackground(new java.awt.Color(0, 0, 0));

        this.jLabelStatus.setBackground(new java.awt.Color(0, 0, 0));
        this.jLabelStatus.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelStatus.setForeground(new java.awt.Color(0, 204, 153));
        this.jLabelStatus.setText("STATUS");
        this.jPanelContainerStatus.add(this.jLabelStatus);

        this.jLabelUser1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelUser1.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelUser1.setText("CPF:");

        this.jTextFieldUser1.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldUser1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldUser1.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldUser1.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldUser1.setEnabled(false);
        this.jTextFieldUser1.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jComboBoxSex.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxSex.setEnabled(false);
        this.jComboBoxSex.setPreferredSize(new java.awt.Dimension(72, 30));

        this.jLabelCitySex.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCitySex.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCitySex.setText("Sexo:");

        this.jLabelDateBirth.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelDateBirth.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelDateBirth.setText("Data Nasc.:");

        this.jTextFieldDateBirth.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldDateBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldDateBirth.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldDateBirth.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldDateBirth.setEnabled(false);
        this.jTextFieldDateBirth.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(644, 644, 644)
                        .addComponent(this.jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(this.jLabelName)
                        .addGap(18, 18, 18)
                        .addComponent(this.jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(this.jLabelPhone1)
                        .addGap(18, 18, 18)
                        .addComponent(this.jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(this.jLabelPhone2)
                        .addGap(19, 19, 19)
                        .addComponent(this.jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(this.jLabelEmail)
                        .addGap(18, 18, 18)
                        .addComponent(this.jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(this.jLabelObs))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(this.jLabelCep)
                            .addComponent(this.jLabelUser1)
                            .addComponent(this.jLabelCitySex)
                            .addComponent(this.jLabelCity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(this.jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(this.jLabelDistrict)
                                .addGap(18, 18, 18)
                                .addComponent(this.jComboBoxDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(this.jTextFieldNameCep, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(this.jLabelStreet)
                                .addGap(18, 18, 18)
                                .addComponent(this.jTextFieldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(this.jComboBoxSex, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(this.jLabelDateBirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(this.jTextFieldDateBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(this.jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(this.jTextFieldUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(this.jLabelPassword)
                                .addGap(18, 18, 18)
                                .addComponent(this.jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(this.jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelName))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.jLabelPhone1))
                    .addComponent(this.jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(this.jLabelPhone2)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(this.jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jTextFieldUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.jLabelUser1))
                    .addComponent(this.jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(this.jLabelPassword)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelDateBirth)
                    .addComponent(this.jTextFieldDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jComboBoxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelCitySex))
                .addGap(71, 71, 71)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jTextFieldNameCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.jLabelCep)
                        .addComponent(this.jLabelStreet))
                    .addComponent(this.jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.jLabelCity))
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jComboBoxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.jLabelDistrict)))
                .addGap(30, 30, 30)
                .addComponent(this.jLabelObs)
                .addGap(23, 23, 23)
                .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    public JComboBox<String> getjComboSex() {
        return jComboSex;
    }

    public JLabel getjLabelSex() {
        return jLabelSex;
    }

    public JLabel getjLabelRg() {
        return jLabelRg;
    }

    public JLabel getjLabelCpf() {
        return jLabelCpf;
    }

    public JLabel getjLabelDateBirth() {
        return this.jLabelDateBirth;
    }

    public JPanel getjPanelContainerStatus() {
        return this.jPanelContainerStatus;
    }

    public JScrollPane getjScrollPane1() {
        return this.jScrollPane1;
    }

    public JTextField getjTextFieldDateBirth() {
        return this.jTextFieldDateBirth;
    }

    public JTextField getjTextFieldRg() {
        return jTextFieldRg;
    }

    public JTextField getjTextFieldCpf() {
        return jTextFieldCpf;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonWrite;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxDistrict;
    private javax.swing.JComboBox<String> jComboBoxSex;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelCitySex;
    private javax.swing.JLabel jLabelDateBirth;
    private javax.swing.JLabel jLabelDistrict;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone1;
    private javax.swing.JLabel jLabelPhone2;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelContainerStatus;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldDateBirth;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameCep;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldPhone2;
    private javax.swing.JTextField jTextFieldStreet;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JTextField jTextFieldUser1;
    // End of variables declaration//GEN-END:variables
}
