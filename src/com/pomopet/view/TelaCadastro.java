package com.pomopet.view;

import com.pomopet.data.User;
import com.pomopet.data.GerenciadorUsuario;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
    }

private boolean isDataValida(String dataStr) {
    // Verifica se a data está vazia ->
    if (dataStr.contains("_") || dataStr.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, 
            "A data de nascimento deve ser preenchida completamente.", 
            "Erro de Data", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    try {
    // Verifica se a data de nascimento não é menor que a data atual ->
        LocalDate dataNascimento = LocalDate.parse(dataStr, formatter);
        if (dataNascimento.isAfter(LocalDate.now())) {
            JOptionPane.showMessageDialog(this, 
                "A data de nascimento não pode ser futura.", 
                "Erro de Data", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
    // Verifica se a Pessoa possui a idade mínima ->
        long anos = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
        if (anos < 10) {
            JOptionPane.showMessageDialog(this, 
                "Você deve ter pelo menos 10 anos para se cadastrar.", 
                "Erro de Data", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
        
    } catch (DateTimeParseException e) {
        // Verifica se a data é valida ->
        JOptionPane.showMessageDialog(this, 
            "A data digitada é inválida. Verifique o mês e o dia.", 
            "Erro de Data", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrGender = new javax.swing.ButtonGroup();
        Header = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        FormBox = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Form = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmacaoEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        pfConfirmacaoSenha = new javax.swing.JPasswordField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        RadioSection = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        rbNaoBinario = new javax.swing.JRadioButton();
        rbPrefiroNaoDizer = new javax.swing.JRadioButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Buttons = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        btnVoltar = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Footer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 675));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMaximumSize(new java.awt.Dimension(32767, 50));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(240, 255, 240));
        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(211, 211, 211));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("POMO PET");
        Header.add(jLabel10, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        Main.setBackground(new java.awt.Color(176, 224, 230));
        Main.setLayout(new javax.swing.BoxLayout(Main, javax.swing.BoxLayout.Y_AXIS));
        Main.add(filler2);

        FormBox.setBackground(new java.awt.Color(240, 255, 240));
        FormBox.setMaximumSize(new java.awt.Dimension(450, 400));
        FormBox.setMinimumSize(new java.awt.Dimension(450, 420));
        FormBox.setPreferredSize(new java.awt.Dimension(450, 400));
        FormBox.setLayout(new javax.swing.BoxLayout(FormBox, javax.swing.BoxLayout.Y_AXIS));
        FormBox.add(filler4);

        jPanel1.setBackground(new java.awt.Color(240, 255, 240));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setBackground(new java.awt.Color(240, 255, 240));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Por favor preencha com seus Dados");
        jPanel1.add(jLabel1);

        FormBox.add(jPanel1);
        FormBox.add(filler7);

        Form.setBackground(new java.awt.Color(240, 255, 240));
        Form.setMaximumSize(new java.awt.Dimension(420, 250));
        Form.setPreferredSize(new java.awt.Dimension(420, 250));
        Form.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel3.setText("Usuário:");
        Form.add(jLabel3);

        txtUsuario.setMaximumSize(new java.awt.Dimension(150, 20));
        txtUsuario.setMinimumSize(new java.awt.Dimension(150, 20));
        txtUsuario.setPreferredSize(new java.awt.Dimension(150, 20));
        Form.add(txtUsuario);

        jLabel4.setText("Email:");
        Form.add(jLabel4);

        txtEmail.setMaximumSize(new java.awt.Dimension(150, 20));
        txtEmail.setMinimumSize(new java.awt.Dimension(150, 20));
        txtEmail.setPreferredSize(new java.awt.Dimension(150, 20));
        Form.add(txtEmail);

        jLabel5.setText("Confirmação Email:");
        Form.add(jLabel5);

        txtConfirmacaoEmail.setMaximumSize(new java.awt.Dimension(150, 20));
        txtConfirmacaoEmail.setMinimumSize(new java.awt.Dimension(150, 20));
        txtConfirmacaoEmail.setPreferredSize(new java.awt.Dimension(150, 20));
        txtConfirmacaoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmacaoEmailActionPerformed(evt);
            }
        });
        Form.add(txtConfirmacaoEmail);

        jLabel6.setText("Data de Nascimento:");
        Form.add(jLabel6);

        txtDataNascimento.setActionCommand("<Not Set>");
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });
        Form.add(txtDataNascimento);
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_'); // Define o caractere de preenchimento
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mask));
        } catch (java.text.ParseException ex){
            ex.printStackTrace();         
        }

        jLabel7.setText("Senha:");
        Form.add(jLabel7);
        Form.add(pfSenha);

        jLabel8.setText("Confirmação Senha:");
        Form.add(jLabel8);
        Form.add(pfConfirmacaoSenha);

        FormBox.add(Form);
        FormBox.add(filler6);

        RadioSection.setBackground(new java.awt.Color(240, 255, 240));
        RadioSection.setLayout(new javax.swing.BoxLayout(RadioSection, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setText("Gênero: ");
        RadioSection.add(jLabel9);

        bgrGender.add(rbMasculino);
        rbMasculino.setText("Masculino");
        RadioSection.add(rbMasculino);

        bgrGender.add(rbFeminino);
        rbFeminino.setText("Feminino");
        RadioSection.add(rbFeminino);

        bgrGender.add(rbNaoBinario);
        rbNaoBinario.setText("Não Binário");
        RadioSection.add(rbNaoBinario);

        bgrGender.add(rbPrefiroNaoDizer);
        rbPrefiroNaoDizer.setText("Prefiro não dizer");
        rbPrefiroNaoDizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrefiroNaoDizerActionPerformed(evt);
            }
        });
        RadioSection.add(rbPrefiroNaoDizer);

        FormBox.add(RadioSection);
        FormBox.add(filler5);

        Buttons.setBackground(new java.awt.Color(240, 255, 240));
        Buttons.setLayout(new javax.swing.BoxLayout(Buttons, javax.swing.BoxLayout.X_AXIS));

        btnCadastro.setBackground(new java.awt.Color(255, 140, 0));
        btnCadastro.setText("Concluir Cadastro");
        btnCadastro.setMaximumSize(new java.awt.Dimension(125, 40));
        btnCadastro.setMinimumSize(new java.awt.Dimension(125, 40));
        btnCadastro.setPreferredSize(new java.awt.Dimension(125, 40));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        Buttons.add(btnCadastro);
        Buttons.add(filler8);

        btnVoltar.setBackground(new java.awt.Color(255, 140, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(72, 40));
        btnVoltar.setMinimumSize(new java.awt.Dimension(72, 40));
        btnVoltar.setPreferredSize(new java.awt.Dimension(72, 40));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        Buttons.add(btnVoltar);

        FormBox.add(Buttons);
        FormBox.add(filler3);

        Main.add(FormBox);
        Main.add(filler1);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setMaximumSize(new java.awt.Dimension(32767, 50));
        Footer.setPreferredSize(new java.awt.Dimension(1280, 50));
        Footer.setLayout(new java.awt.BorderLayout());

        jLabel2.setForeground(new java.awt.Color(211, 211, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Desenvolvido por...");
        Footer.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

    //Coleta dos dados ->
    
        String usuario = txtUsuario.getText().trim();
        String email = txtEmail.getText().trim();
        String confirmacaoEmail = txtConfirmacaoEmail.getText().trim();
        String senha = new String(pfSenha.getPassword()); // JPasswordField usa getPassword()
        String confirmacaoSenha = new String(pfConfirmacaoSenha.getPassword());
        String dataNascimento = txtDataNascimento.getText().trim();
        String genero = "";
        if (rbMasculino.isSelected()) {
            genero = "Masculino";
        } else if (rbFeminino.isSelected()) {
            genero = "Feminino";
        } else if (rbNaoBinario.isSelected()) {
            genero = "Não Binário";
        } else if (rbPrefiroNaoDizer.isSelected()) {
            genero = "Prefiro não dizer";
        }

        // Validações dos dados ->
        
        if (!isDataValida(dataNascimento)) {
            return; 
        }
        
        if (usuario.isEmpty() || email.isEmpty() || senha.isEmpty() || dataNascimento.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.equals(confirmacaoEmail)) {
            JOptionPane.showMessageDialog(this, "O Email e a Confirmação de Email não coincidem.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!senha.equals(confirmacaoSenha)) {
            JOptionPane.showMessageDialog(this, "A Senha e a Confirmação de Senha não coincidem.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

    //Instancia o Objeto e faz o Cadastro ->
    
        User novoUsuario = new User(usuario, email, senha, dataNascimento, genero);
        GerenciadorUsuario.getInstance().setUsuarioLogado(novoUsuario);
        JOptionPane.showMessageDialog(this, "Cadastro concluído com sucesso! Bem-vindo(a) " + novoUsuario.getName() + "!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Usuário cadastrado: " + GerenciadorUsuario.getInstance().getUsuarioLogado().getName());
        
    //Retorna para a tela de login ->
    
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtConfirmacaoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmacaoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmacaoEmailActionPerformed

    private void rbPrefiroNaoDizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrefiroNaoDizerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPrefiroNaoDizerActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //Retorna para a tela de login ->
    
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnVoltarActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Form;
    private javax.swing.JPanel FormBox;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel RadioSection;
    private javax.swing.ButtonGroup bgrGender;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfConfirmacaoSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbNaoBinario;
    private javax.swing.JRadioButton rbPrefiroNaoDizer;
    private javax.swing.JTextField txtConfirmacaoEmail;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
