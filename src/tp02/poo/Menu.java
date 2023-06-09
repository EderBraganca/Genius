/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp02.poo;

/**
 *
 * @author mateu
 */
public class Menu extends javax.swing.JFrame {
    private ConfiguracaoJogo configJogo;
    /**
     * Creates new form menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UmJogador = new javax.swing.JButton();
        DoisJogadores = new javax.swing.JButton();
        ExitMenu = new javax.swing.JButton();
        ImagemMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genius");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("menu"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        UmJogador.setBackground(new java.awt.Color(255, 102, 102));
        UmJogador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UmJogador.setText("1 Jogador");
        UmJogador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UmJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UmJogadorMouseClicked(evt);
            }
        });
        UmJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(UmJogador);
        UmJogador.setBounds(240, 330, 300, 50);

        DoisJogadores.setBackground(new java.awt.Color(102, 102, 255));
        DoisJogadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DoisJogadores.setText("2 Jogadores");
        DoisJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoisJogadoresActionPerformed(evt);
            }
        });
        getContentPane().add(DoisJogadores);
        DoisJogadores.setBounds(240, 390, 300, 50);

        ExitMenu.setBackground(new java.awt.Color(255, 255, 102));
        ExitMenu.setText("Sair");
        ExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuActionPerformed(evt);
            }
        });
        getContentPane().add(ExitMenu);
        ExitMenu.setBounds(240, 500, 300, 50);

        ImagemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp02/poo/Logo.png"))); // NOI18N
        ImagemMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(ImagemMenu);
        ImagemMenu.setBounds(130, 20, 540, 470);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UmJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmJogadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UmJogadorMouseClicked

    private void ExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitMenuActionPerformed

    private void UmJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmJogadorActionPerformed
        this.setEnabled(false); // desativa funções da tela atual
        this.setVisible(false); // esconde a tela atual
        
        configJogo = new ConfiguracaoJogo(this);
        configJogo.setVisible(true);
    }//GEN-LAST:event_UmJogadorActionPerformed

    private void DoisJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoisJogadoresActionPerformed
        this.setEnabled(false); // desativa funções da tela atual
        this.setVisible(false); // esconde a tela atual
        
        new ConfiguracaoJogo2(this).setVisible(true);
    }//GEN-LAST:event_DoisJogadoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoisJogadores;
    private javax.swing.JButton ExitMenu;
    private javax.swing.JLabel ImagemMenu;
    private javax.swing.JButton UmJogador;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
