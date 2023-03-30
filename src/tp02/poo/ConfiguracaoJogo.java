package tp02.poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author mateu
 */
public class ConfiguracaoJogo extends javax.swing.JFrame {
    private Menu menu;
    private int dificuldade = 0;
    private String nome;
    private SinglePlayer singlePlayer;
    /**
     * Creates new form configuracaoJogo
     */
    public ConfiguracaoJogo() {
        initComponents();
    }
    
    public ConfiguracaoJogo(Menu menu){
        this();
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeJogador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dificuldade1 = new javax.swing.JRadioButton();
        dificuldade2 = new javax.swing.JRadioButton();
        dificuldade3 = new javax.swing.JRadioButton();
        dificuldade4 = new javax.swing.JRadioButton();
        dificuldade5 = new javax.swing.JRadioButton();
        iniciaJogoConfigJogo = new javax.swing.JButton();
        voltarConfigJogo = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel3)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel3)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Digite seu nome");

        nomeJogador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeJogador.setToolTipText("");
        nomeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJogadorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Escolha o nível de dificuldade:");

        buttonGroup1.add(dificuldade1);
        dificuldade1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dificuldade1.setText("Dificuldade 1");
        dificuldade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldade1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(dificuldade2);
        dificuldade2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dificuldade2.setText("Dificuldade 2");
        dificuldade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldade2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(dificuldade3);
        dificuldade3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dificuldade3.setText("Dificuldade 3");
        dificuldade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldade3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(dificuldade4);
        dificuldade4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dificuldade4.setText("Dificuldade 4");
        dificuldade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldade4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(dificuldade5);
        dificuldade5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dificuldade5.setText("Dificuldade 5");
        dificuldade5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldade5ActionPerformed(evt);
            }
        });

        iniciaJogoConfigJogo.setText("Iniciar o jogo");
        iniciaJogoConfigJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciaJogoConfigJogoActionPerformed(evt);
            }
        });

        voltarConfigJogo.setText("Voltar");
        voltarConfigJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarConfigJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(307, 307, 307))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(dificuldade1)
                .addGap(51, 51, 51)
                .addComponent(dificuldade2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(dificuldade3)
                .addGap(63, 63, 63)
                .addComponent(dificuldade4)
                .addGap(60, 60, 60)
                .addComponent(dificuldade5)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarConfigJogo)
                        .addGap(94, 94, 94)
                        .addComponent(iniciaJogoConfigJogo)
                        .addGap(249, 249, 249))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldade1)
                    .addComponent(dificuldade2)
                    .addComponent(dificuldade3)
                    .addComponent(dificuldade4)
                    .addComponent(dificuldade5))
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciaJogoConfigJogo)
                    .addComponent(voltarConfigJogo))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dificuldade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldade1ActionPerformed
        setDificuldade(1);
    }//GEN-LAST:event_dificuldade1ActionPerformed

    private void dificuldade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldade2ActionPerformed
        setDificuldade(2);
    }//GEN-LAST:event_dificuldade2ActionPerformed
  
    private void voltarConfigJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarConfigJogoActionPerformed
        this.setEnabled(false);
        this.setVisible(false);
        
        menu.setEnabled(true);
        menu.setVisible(true);
    }//GEN-LAST:event_voltarConfigJogoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void iniciaJogoConfigJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciaJogoConfigJogoActionPerformed
        nome = nomeJogador.getText();
        if(this.dificuldade == 0)
            return;
        if(nome == null)
            return;
        
        this.setEnabled(false);
        this.setVisible(false);
        
        singlePlayer = new SinglePlayer(menu, this.dificuldade, nome);
        singlePlayer.setVisible(true);
        singlePlayer.setEnabled(true);
    }//GEN-LAST:event_iniciaJogoConfigJogoActionPerformed

    private void dificuldade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldade3ActionPerformed
        setDificuldade(3);
    }//GEN-LAST:event_dificuldade3ActionPerformed

    private void dificuldade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldade4ActionPerformed
        setDificuldade(4);
    }//GEN-LAST:event_dificuldade4ActionPerformed

    private void dificuldade5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldade5ActionPerformed
        setDificuldade(5);
    }//GEN-LAST:event_dificuldade5ActionPerformed

    private void nomeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJogadorActionPerformed
        
    }//GEN-LAST:event_nomeJogadorActionPerformed

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
            java.util.logging.Logger.getLogger(ConfiguracaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracaoJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dificuldade1;
    private javax.swing.JRadioButton dificuldade2;
    private javax.swing.JRadioButton dificuldade3;
    private javax.swing.JRadioButton dificuldade4;
    private javax.swing.JRadioButton dificuldade5;
    private javax.swing.JButton iniciaJogoConfigJogo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeJogador;
    private javax.swing.JButton voltarConfigJogo;
    // End of variables declaration//GEN-END:variables
}
