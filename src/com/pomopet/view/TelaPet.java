package com.pomopet.view;

import com.pomopet.data.Pet;
import com.pomopet.data.GerenciadorUsuario;
import java.awt.Image;
import javax.swing.ImageIcon;

public class TelaPet extends javax.swing.JFrame {

    public TelaPet() {
        initComponents();
        atualizarExibicaoPet();
    }    

// Método de Atualização Imagem ->
    public void atualizarExibicaoPet() {
        // 1. Busca o Pet do usuário logado
        Pet pet = GerenciadorUsuario.getInstance().getUsuarioLogado().getStudentPet();
        
        if (pet == null) {
            // Se o Pet for null (usuário ainda não escolheu)
            lblStatusPet.setText("Nenhum Pet Escolhido.");
            lblImagemPet.setIcon(null);
            barraXp.setValue(0);
            lblTextoXp.setText("XP: N/A");
            return;
        }
        
        // 2. Define o Status (Nome e XP/Level)
        lblStatusPet.setText(pet.getName() + " - XP Total: " + pet.getXp());
        
        // --- Cálculo e Atualização da Barra de Progresso ---
        
        // Para usar a barra, vamos definir os marcos de XP (200, 500, etc.)
        int xpTotal = pet.getXp();
        int xpMarcoAtual = 0;
        int xpProximoMarco = 0;

        if (xpTotal < 200) {
            xpMarcoAtual = 0;
            xpProximoMarco = 200;
        } else if (xpTotal < 500) {
            xpMarcoAtual = 200;
            xpProximoMarco = 500;
        } else {
            // Se o XP for 500 ou mais, você precisará de mais marcos, ou a barra enche
            xpMarcoAtual = 500;
            xpProximoMarco = 999999999;
        }

        // Calcula o progresso dentro do nível atual: (XP Total - XP do Marco Atual)
        int xpNoNivelAtual = xpTotal - xpMarcoAtual;
        int xpNecessarioParaProxMarco = xpProximoMarco - xpMarcoAtual;
        
        // Define o máximo da barra (o XP necessário para o próximo marco)
        barraXp.setMaximum(xpNecessarioParaProxMarco);
        // Define o valor atual da barra
        barraXp.setValue(xpNoNivelAtual);
        
        // Atualiza o texto da barra
        lblTextoXp.setText("Próxima Evolução: " + xpNoNivelAtual + " / " + xpNecessarioParaProxMarco + " XP");
        
        // 3. Atualiza a Imagem do Pet (Usando o caminho do Pet)
        try {
            // O caminho da imagem deve ser acessível a partir da execução do projeto
            String caminhoImagem = "src/com/pomopet/resources/" + pet.getImage(); 
            // O atributo pet.getImage() contém o nome do arquivo (ex: "lumiLevel1.png")
            
            ImageIcon icon = new ImageIcon(caminhoImagem);
            
            // Redimensiona a imagem para caber no JLabel (Ajuste os valores)
            Image img = icon.getImage().getScaledInstance(
                    lblImagemPet.getWidth(), 
                    lblImagemPet.getHeight(), 
                    Image.SCALE_SMOOTH
            );
            lblImagemPet.setIcon(new ImageIcon(img));
            
        } catch (Exception e) {
            lblImagemPet.setText("Imagem não encontrada!");
            System.err.println("Erro ao carregar imagem: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        NomePet = new javax.swing.JPanel();
        lblStatusPet = new javax.swing.JLabel();
        ImageBox = new javax.swing.JPanel();
        lblImagemPet = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        ProgressBox = new javax.swing.JPanel();
        barraXp = new javax.swing.JProgressBar();
        lblTextoXp = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Footer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(176, 224, 230));
        setMinimumSize(new java.awt.Dimension(900, 675));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMaximumSize(new java.awt.Dimension(2440, 50));
        Header.setMinimumSize(new java.awt.Dimension(1280, 50));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));
        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        pnlPrincipal.setBackground(new java.awt.Color(176, 224, 230));
        pnlPrincipal.setToolTipText("");
        pnlPrincipal.setAutoscrolls(true);
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.Y_AXIS));

        NomePet.setBackground(new java.awt.Color(176, 224, 230));

        lblStatusPet.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblStatusPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusPet.setText("Sejam Bem Vindos Ao ");
        lblStatusPet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        NomePet.add(lblStatusPet);

        pnlPrincipal.add(NomePet);

        ImageBox.setBackground(new java.awt.Color(176, 224, 230));
        ImageBox.setMaximumSize(new java.awt.Dimension(2440, 250));
        ImageBox.setMinimumSize(new java.awt.Dimension(200, 250));
        ImageBox.setOpaque(false);
        ImageBox.setPreferredSize(new java.awt.Dimension(200, 250));

        lblImagemPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pomopet/resources/logopomopet.png"))); // NOI18N
        lblImagemPet.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 30, 15));
        lblImagemPet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImageBox.add(lblImagemPet);
        ImageBox.add(filler6);

        pnlPrincipal.add(ImageBox);
        pnlPrincipal.add(filler5);

        ProgressBox.setBackground(new java.awt.Color(176, 224, 230));
        ProgressBox.setMaximumSize(new java.awt.Dimension(2440, 300));
        ProgressBox.setMinimumSize(new java.awt.Dimension(350, 300));
        ProgressBox.setPreferredSize(new java.awt.Dimension(350, 300));
        ProgressBox.add(barraXp);

        lblTextoXp.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTextoXp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoXp.setText("Sejam Bem Vindos Ao ");
        lblTextoXp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        ProgressBox.add(lblTextoXp);

        pnlPrincipal.add(ProgressBox);
        pnlPrincipal.add(filler4);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(1280, 50));
        Footer.setPreferredSize(new java.awt.Dimension(1280, 50));
        Footer.setLayout(new java.awt.BorderLayout());

        jLabel5.setForeground(new java.awt.Color(211, 211, 211));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Desenvolvido Por ...");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Footer.add(jLabel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel ImageBox;
    private javax.swing.JPanel NomePet;
    private javax.swing.JPanel ProgressBox;
    private javax.swing.JProgressBar barraXp;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImagemPet;
    private javax.swing.JLabel lblStatusPet;
    private javax.swing.JLabel lblTextoXp;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
