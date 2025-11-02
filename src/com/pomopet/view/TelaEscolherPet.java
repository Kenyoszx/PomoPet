package com.pomopet.view;

import com.pomopet.data.Pet;
import com.pomopet.data.Lumi;
import com.pomopet.data.Sabine;
import com.pomopet.data.Yami;
import com.pomopet.data.GerenciadorUsuario;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.pomopet.data.User;

public class TelaEscolherPet extends javax.swing.JFrame {
    
    private String especieSelecionada = null;
    private Pet petSelecionado = null;
    
    
    public TelaEscolherPet() {
        initComponents();
        
        btnChoose.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnLumi = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnSabine = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnYami = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Footer = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnChoose = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        btnBack = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMinimumSize(new java.awt.Dimension(500, 50));
        Header.setPreferredSize(new java.awt.Dimension(500, 50));
        Header.setLayout(new java.awt.BorderLayout());

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Escolha qual PET você quer");
        Titulo.setToolTipText("");
        Titulo.setAlignmentX(0.5F);
        Header.add(Titulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Main.setBackground(new java.awt.Color(240, 255, 240));
        Main.setLayout(new javax.swing.BoxLayout(Main, javax.swing.BoxLayout.X_AXIS));
        Main.add(filler7);

        btnLumi.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnLumi.setText("Lumi");
        btnLumi.setAlignmentX(0.5F);
        btnLumi.setMaximumSize(new java.awt.Dimension(100, 100));
        btnLumi.setMinimumSize(new java.awt.Dimension(100, 100));
        btnLumi.setPreferredSize(new java.awt.Dimension(100, 100));
        btnLumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLumiActionPerformed(evt);
            }
        });
        Main.add(btnLumi);
        Main.add(filler9);

        btnSabine.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSabine.setText("Sabine");
        btnSabine.setAlignmentX(0.5F);
        btnSabine.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSabine.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSabine.setPreferredSize(new java.awt.Dimension(100, 100));
        btnSabine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSabineActionPerformed(evt);
            }
        });
        Main.add(btnSabine);
        Main.add(filler10);

        btnYami.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnYami.setText("Yami");
        btnYami.setAlignmentX(0.5F);
        btnYami.setMaximumSize(new java.awt.Dimension(100, 100));
        btnYami.setMinimumSize(new java.awt.Dimension(100, 100));
        btnYami.setPreferredSize(new java.awt.Dimension(100, 100));
        btnYami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYamiActionPerformed(evt);
            }
        });
        Main.add(btnYami);
        Main.add(filler8);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(500, 50));
        Footer.setPreferredSize(new java.awt.Dimension(500, 50));
        Footer.setLayout(new javax.swing.BoxLayout(Footer, javax.swing.BoxLayout.LINE_AXIS));
        Footer.add(filler1);

        btnChoose.setText("Escolher");
        btnChoose.setMaximumSize(new java.awt.Dimension(100, 30));
        btnChoose.setMinimumSize(new java.awt.Dimension(100, 30));
        btnChoose.setPreferredSize(new java.awt.Dimension(100, 30));
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        Footer.add(btnChoose);
        Footer.add(filler6);
        Footer.add(filler3);

        btnBack.setText("Voltar");
        btnBack.setMaximumSize(new java.awt.Dimension(100, 30));
        btnBack.setMinimumSize(new java.awt.Dimension(100, 30));
        btnBack.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        Footer.add(btnBack);
        Footer.add(filler2);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void selecionarPet(String especie) {
        
        // 1. Cria a instância correta
        switch (especie) {
            case "Lumi":
                petSelecionado = new Lumi();
                break;
            case "Sabine":
                petSelecionado = new Sabine();
                break;
            case "Yami":
                petSelecionado = new Yami();
                break;
            default:
                petSelecionado = null;
        }
        
        especieSelecionada = especie;
        
        // 2. Atualiza o destaque visual (ALTAMENTE RECOMENDADO!)
        atualizarDestaqueVisual();
        
        // 3. Ativa o botão de confirmação
        btnChoose.setEnabled(true);
    }
    
    // Método para mudar visualmente qual botão foi clicado
    private void atualizarDestaqueVisual() {
        // Assume que você tem um BorderFactory para destaque (exemplo)
        // Seus botões estão no design como: btnLumi, btnSabine, btnYami
        
        // Limpa todas as bordas/cores
        btnLumi.setBorder(null);
        btnSabine.setBorder(null);
        btnYami.setBorder(null);
        
        // Aplica o destaque na seleção
        if (especieSelecionada != null) {
             // Exemplo de como aplicar uma borda ou cor de fundo na seleção
             // Você precisará importar java.awt.Color e javax.swing.border.Border
             // e talvez usar um JPanel ao invés de JButton se a imagem estiver no botão
             
             // Se os componentes forem JButtons:
             JButton botao = null;
             if (especieSelecionada.equals("Lumi")) botao = btnLumi;
             else if (especieSelecionada.equals("Sabine")) botao = btnSabine;
             else if (especieSelecionada.equals("Yami")) botao = btnYami;

             if (botao != null) {
                 botao.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.ORANGE, 3));
             }
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        if (petSelecionado != null) {
        
        // 1. Obtém o usuário logado
        User usuario = GerenciadorUsuario.getInstance().getUsuarioLogado();
        
        if (usuario != null) {
            // 2. Associa o Pet criado ao usuário
            usuario.setStudentPet(petSelecionado);
            
            JOptionPane.showMessageDialog(this, 
                "Seu Pet " + petSelecionado.getName() + " foi escolhido! Comece a estudar.", 
                "Escolha Finalizada", JOptionPane.INFORMATION_MESSAGE);

            // 3. Fecha esta tela e abre a TelaPet para exibição (ou a tela principal)
            this.dispose();
            
            TelaPet telaPet = new TelaPet();
            telaPet.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Erro: Não há usuário logado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Isso não deve acontecer se btnEscolher estiver desabilitado, mas é uma garantia
        JOptionPane.showMessageDialog(this, "Por favor, selecione um Pet.", "Atenção", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnLumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLumiActionPerformed
        selecionarPet("Lumi");
    }//GEN-LAST:event_btnLumiActionPerformed

    private void btnSabineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSabineActionPerformed
        selecionarPet("Sabine");
    }//GEN-LAST:event_btnSabineActionPerformed

    private void btnYamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYamiActionPerformed
        selecionarPet("Yami");
    }//GEN-LAST:event_btnYamiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnLumi;
    private javax.swing.JButton btnSabine;
    private javax.swing.JButton btnYami;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    // End of variables declaration//GEN-END:variables
}
