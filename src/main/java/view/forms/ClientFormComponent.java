
package view.forms;

import javax.swing.JComboBox;
import javax.swing.JLabel;
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
        this.jTextFieldRg = new javax.swing.JTextField();
        this.jLabelRg = new javax.swing.JLabel();
        this.jTextFieldRg = new javax.swing.JTextField();
        this.jLabelCep = new javax.swing.JLabel();
        this.jTextFieldCep = new javax.swing.JTextField();
        this.jLabelStreet = new javax.swing.JLabel();
        this.jTextFieldStreet = new javax.swing.JTextField();
        this.jLabelCity = new javax.swing.JLabel();
        this.jComboBoxCity = new javax.swing.JComboBox<>();
        this.jLabelDistrict = new javax.swing.JLabel();
        this.jComboBoxDistrict = new javax.swing.JComboBox<>();
        this.jPanelContainerStatus = new javax.swing.JPanel();
        this.jLabelStatus = new javax.swing.JLabel();
        this.jLabelCpf = new javax.swing.JLabel();
        this.jTextFieldCpf = new javax.swing.JTextField();
        this.jComboBoxSex = new javax.swing.JComboBox<>();
        this.jLabelSex = new javax.swing.JLabel();
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

        this.jTextFieldName.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldName.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldName.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldName.setEnabled(false);
        this.jTextFieldName.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jTextFieldPhone1.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldPhone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldPhone1.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldPhone1.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldPhone1.setEnabled(false);
        this.jTextFieldPhone1.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jTextFieldPhone2.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldPhone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldPhone2.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldPhone2.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldPhone2.setEnabled(false);
        this.jTextFieldPhone2.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jTextFieldEmail.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldEmail.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldEmail.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldEmail.setEnabled(false);
        this.jTextFieldEmail.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jTextAreaObs.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextAreaObs.setEnabled(false);
        this.jScrollPane1.setViewportView(this.jTextAreaObs);

        this.jTextFieldRg.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldRg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldRg.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldRg.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldRg.setEnabled(false);
        this.jTextFieldRg.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jLabelRg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelRg.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelRg.setText("RG:");

        this.jTextFieldRg.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldRg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldRg.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldRg.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldRg.setEnabled(false);
        this.jTextFieldRg.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jLabelCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCep.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCep.setText("CEP:");

        this.jTextFieldCep.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldCep.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldCep.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldCep.setEnabled(false);
        this.jTextFieldCep.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jLabelStreet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelStreet.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelStreet.setText("Logradouro:");

        this.jTextFieldStreet.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldStreet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldStreet.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldStreet.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldStreet.setEnabled(false);
        this.jTextFieldStreet.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jLabelCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCity.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCity.setText("Cidade:");

        this.jComboBoxCity.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxCity.setForeground(new java.awt.Color(204, 204, 204));
        this.jComboBoxCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxCity.setEnabled(false);
        this.jComboBoxCity.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jLabelDistrict.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelDistrict.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelDistrict.setText("Bairro:");

        this.jComboBoxDistrict.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxDistrict.setForeground(new java.awt.Color(204, 204, 204));
        this.jComboBoxDistrict.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxDistrict.setEnabled(false);
        this.jComboBoxDistrict.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jPanelContainerStatus.setBackground(new java.awt.Color(0, 0, 0));

        this.jLabelStatus.setBackground(new java.awt.Color(0, 0, 0));
        this.jLabelStatus.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelStatus.setForeground(new java.awt.Color(0, 204, 153));
        this.jLabelStatus.setText("STATUS");
        this.jPanelContainerStatus.add(this.jLabelStatus);

        this.jLabelCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelCpf.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelCpf.setText("CPF:");

        this.jTextFieldCpf.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldCpf.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldCpf.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldCpf.setEnabled(false);
        this.jTextFieldCpf.setPreferredSize(new java.awt.Dimension(50, 30));

        this.jComboBoxSex.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxSex.setForeground(new java.awt.Color(204, 204, 204));
        this.jComboBoxSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxSex.setEnabled(false);
        this.jComboBoxSex.setPreferredSize(new java.awt.Dimension(100, 30));

        this.jLabelSex.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelSex.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelSex.setText("Sexo:");

        this.jLabelDateBirth.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelDateBirth.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelDateBirth.setText("Data Nasc.:");

        this.jTextFieldDateBirth.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldDateBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jTextFieldDateBirth.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldDateBirth.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldDateBirth.setEnabled(false);
        this.jTextFieldDateBirth.setPreferredSize(new java.awt.Dimension(100, 30));

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
                            .addComponent(this.jLabelCpf)
                            .addComponent(this.jLabelSex)
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
                                .addComponent(this.jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(this.jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(this.jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(this.jLabelRg)
                                .addGap(18, 18, 18)
                                .addComponent(this.jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(this.jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.jLabelCpf))
                    .addComponent(this.jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(this.jLabelRg)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelDateBirth)
                    .addComponent(this.jTextFieldDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jComboBoxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelSex))
                .addGap(71, 71, 71)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        this.jTextFieldName.getAccessibleContext().setAccessibleName("");
        this.jTextFieldPhone1.getAccessibleContext().setAccessibleName("");
        this.jTextFieldPhone2.getAccessibleContext().setAccessibleName("");
        this.jTextFieldEmail.getAccessibleContext().setAccessibleName("");
        this.jTextFieldRg.getAccessibleContext().setAccessibleName("");
        this.jTextFieldRg.getAccessibleContext().setAccessibleName("");
        this.jTextFieldCep.getAccessibleContext().setAccessibleName("");
        this.jTextFieldStreet.getAccessibleContext().setAccessibleName("");
        this.jComboBoxCity.getAccessibleContext().setAccessibleName("");
        this.jComboBoxDistrict.getAccessibleContext().setAccessibleName("");
        this.jComboBoxSex.getAccessibleContext().setAccessibleName("");
        this.jTextFieldDateBirth.getAccessibleContext().setAccessibleName("");

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
        return this.jComboBoxSex;
    }

    public JLabel getjLabelSex() {
        return this.jLabelSex;
    }

    public JLabel getjLabelRg() {
        return this.jLabelRg;
    }

    public JLabel getjLabelCpf() {
        return this.jLabelCpf;
    }

    public JLabel getjLabelDateBirth() {
        return this.jLabelDateBirth;
    }

    public JScrollPane getjScrollPane1() {
        return this.jScrollPane1;
    }

    public JTextField getjTextFieldDateBirth() {
        return this.jTextFieldDateBirth;
    }

    public JTextField getjTextFieldRg() {
        return this.jTextFieldRg;
    }

    public JTextField getjTextFieldCpf() {
        return this.jTextFieldCpf;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSex;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelDateBirth;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDateBirth;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldCpf;
    // End of variables declaration//GEN-END:variables
}
