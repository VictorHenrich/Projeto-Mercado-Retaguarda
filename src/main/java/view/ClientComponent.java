
package view;

import controllers.builders.pessoa.ClientBuilder;
import controllers.pessoas.CRUDClientController;
import java.util.ArrayList;
import javax.swing.JComponent;
import models.pessoas.Client;
import models.pessoas.Sex;
import view.utils.UtilsComponents;



public class ClientComponent extends javax.swing.JFrame {
    
    private ClientBuilder newClient(){
        
        Sex sex = this.sexes.get(this.jComboSex.getSelectedIndex());
        
        return (ClientBuilder) this
                    .controller
                    .newModelBuilder()
                    .setCpf(jTextFieldCpf.getText())
                    .setRg(jTextFieldRg.getText())
                    .setDataNascimento(null)
                    .setSexo(sex.getInitials())
                    .setTelefones(jTextFieldPhone1.getText(), jTextFieldPhone2.getText())
                    .setStatus('A')
                    .setEmail(jTextFieldEmail.getText())
                    .setObservacao(jTextAreaObs.getText())
                    .setComplementoEndereco(jTextFieldAddAddress.getText());
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
    
    private void loadStates(){
        
        for(Sex s: this.sexes)
            jComboSex.addItem(s.getDescription());
    }
    
    private void addClient(){
        
        ClientBuilder client = this.newClient();
        
        this.controller.create(client);
    }
    
    private void changeClient(){
        if(this.clientLoaded == null) return;
        
        ClientBuilder newClient = this.newClient();
        
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
        fields.add(jTextFieldAddAddress);
        fields.add(jComboSex);
        
        UtilsComponents.disabledComponents(fields, state);
    }
    

    public ClientComponent(
      CRUDClientController controller,
      Client clientLoaded
    ) {
        
        ArrayList<Sex> sexes = new ArrayList();
        
        sexes.add(new Sex("Masculino", 'M'));
        sexes.add(new Sex("Feminino", 'F'));
        
        this.sexes = sexes;
        this.controller = controller;
        this.clientLoaded = clientLoaded;
        
        initComponents();
        loadStates();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelObs = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPhone1 = new javax.swing.JLabel();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jLabelPhone2 = new javax.swing.JLabel();
        jTextFieldPhone2 = new javax.swing.JTextField();
        jTextFieldRg = new javax.swing.JTextField();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelEmail1 = new javax.swing.JLabel();
        jTextFieldAddAddress = new javax.swing.JTextField();
        jLabelEmail2 = new javax.swing.JLabel();
        jComboSex = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAddAddress1 = new javax.swing.JTextField();
        jLabelEmail3 = new javax.swing.JLabel();
        jTextFieldAddAddress2 = new javax.swing.JTextField();
        jLabelEmail4 = new javax.swing.JLabel();
        jLabelEmail5 = new javax.swing.JLabel();
        jTextFieldAddAddress3 = new javax.swing.JTextField();
        jTextFieldAddAddress4 = new javax.swing.JTextField();
        jLabelEmail6 = new javax.swing.JLabel();

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

        jPanelContainer.setBackground(new java.awt.Color(102, 102, 102));

        jTextAreaObs.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaObs.setColumns(20);
        jTextAreaObs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaObs.setForeground(new java.awt.Color(190, 190, 190));
        jTextAreaObs.setRows(5);
        jTextAreaObs.setBorder(new javax.swing.border.MatteBorder(null));
        jTextAreaObs.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaObs);

        jLabelObs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelObs.setForeground(new java.awt.Color(190, 190, 190));
        jLabelObs.setText("Observação:");

        jTextFieldEmail.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldEmail.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail.setText("Email:");

        jLabelPhone1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPhone1.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPhone1.setText("Fone1:");

        jTextFieldPhone1.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPhone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhone1.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPhone1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPhone1.setEnabled(false);
        jTextFieldPhone1.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabelPhone2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPhone2.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPhone2.setText("Fone2:");

        jTextFieldPhone2.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPhone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhone2.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldPhone2.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldPhone2.setEnabled(false);
        jTextFieldPhone2.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldRg.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldRg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldRg.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldRg.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldRg.setEnabled(false);
        jTextFieldRg.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabelRg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelRg.setForeground(new java.awt.Color(190, 190, 190));
        jLabelRg.setText("RG:");

        jTextFieldCpf.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCpf.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCpf.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCpf.setEnabled(false);
        jTextFieldCpf.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCpf.setText("CPF:");

        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(190, 190, 190));
        jLabelName.setText("Nome:");

        jTextFieldName.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldName.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldName.setEnabled(false);
        jTextFieldName.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelEmail1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail1.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail1.setText("Comp. Endereço:");

        jTextFieldAddAddress.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldAddAddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldAddAddress.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldAddAddress.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldAddAddress.setEnabled(false);
        jTextFieldAddAddress.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelEmail2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail2.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail2.setText("Sexo:");

        jComboSex.setBackground(new java.awt.Color(51, 51, 51));
        jComboSex.setBorder(new javax.swing.border.MatteBorder(null));
        jComboSex.setPreferredSize(new java.awt.Dimension(72, 30));
        jComboSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSexActionPerformed(evt);
            }
        });

        jTextFieldAddAddress1.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldAddAddress1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldAddAddress1.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldAddAddress1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldAddAddress1.setEnabled(false);
        jTextFieldAddAddress1.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelEmail3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail3.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail3.setText("CEP:");

        jTextFieldAddAddress2.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldAddAddress2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldAddAddress2.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldAddAddress2.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldAddAddress2.setEnabled(false);
        jTextFieldAddAddress2.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelEmail4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail4.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail4.setText("Cidade:");

        jLabelEmail5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail5.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail5.setText("Logradouro:");

        jTextFieldAddAddress3.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldAddAddress3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldAddAddress3.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldAddAddress3.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldAddAddress3.setEnabled(false);
        jTextFieldAddAddress3.setPreferredSize(new java.awt.Dimension(300, 30));

        jTextFieldAddAddress4.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldAddAddress4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldAddAddress4.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldAddAddress4.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldAddAddress4.setEnabled(false);
        jTextFieldAddAddress4.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelEmail6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEmail6.setForeground(new java.awt.Color(190, 190, 190));
        jLabelEmail6.setText("Bairro");

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addComponent(jLabelEmail6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAddAddress4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jLabelEmail3)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldAddAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelEmail4)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldAddAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addComponent(jLabel2)
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jLabelEmail5)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldAddAddress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jLabelName)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jLabelEmail)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelObs)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelContainerLayout.createSequentialGroup()
                                    .addComponent(jLabelPhone1)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelPhone2))
                                .addGroup(jPanelContainerLayout.createSequentialGroup()
                                    .addComponent(jLabelCpf)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelRg)))
                            .addGap(12, 12, 12)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jLabelEmail1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldAddAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jLabelEmail2)
                            .addGap(18, 18, 18)
                            .addComponent(jComboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(148, 258, Short.MAX_VALUE))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabelRg))))
                .addGap(24, 24, 24)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhone1)
                    .addComponent(jTextFieldPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhone2)
                    .addComponent(jTextFieldPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelEmail))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail3)
                    .addComponent(jTextFieldAddAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail4))
                .addGap(30, 30, 30)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail5))
                .addGap(47, 47, 47)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail1))
                .addGap(37, 37, 37)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail2)
                    .addComponent(jComboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabelObs)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jScrollPane2.setViewportView(jPanelContainer);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jComboSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSexActionPerformed

    
    private final CRUDClientController controller;
    private final Client clientLoaded;
    private final ArrayList<Sex> sexes;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonWrite;
    private javax.swing.JComboBox<String> jComboSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelEmail2;
    private javax.swing.JLabel jLabelEmail3;
    private javax.swing.JLabel jLabelEmail4;
    private javax.swing.JLabel jLabelEmail5;
    private javax.swing.JLabel jLabelEmail6;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelPhone1;
    private javax.swing.JLabel jLabelPhone2;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldAddAddress;
    private javax.swing.JTextField jTextFieldAddAddress1;
    private javax.swing.JTextField jTextFieldAddAddress2;
    private javax.swing.JTextField jTextFieldAddAddress3;
    private javax.swing.JTextField jTextFieldAddAddress4;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldPhone2;
    private javax.swing.JTextField jTextFieldRg;
    // End of variables declaration//GEN-END:variables
}
