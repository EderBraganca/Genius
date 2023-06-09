/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp02.poo;

/**
 *
 * @author mateu
 */
public class Resultado extends javax.swing.JFrame {
    private String player1, player2;
    /**
     * Creates new form Resultado
     */
    public Resultado() {
        initComponents();
    }
    
    public Resultado(String player, int state){
        initComponents();
        
        this.player1 = player;
        verificaEstado(state); 
    }

    public Resultado(String player1, String player2){
        initComponents();
        
        this.player1 = player1;
        this.player2 = player2;
        
        frameDraw();
    }
    
    private void verificaEstado(int state){
        if (state == 1)
            frameWin();
        else 
            frameLose();
    }
    
    public void frameWin(){
        user.setText(player1);
        jFrameWin.setEnabled(true);
        jFrameWin.setVisible(true);
    }
    
    public void frameLose(){
        user1.setText(player1);
        jFrameLose.setEnabled(true);
        jFrameLose.setVisible(true);
    }
    
    private void frameDraw(){
        user3.setText(player1);
        user4.setText(player2);
        
        jFrameDrawDualPlayer.setEnabled(true);
        jFrameDrawDualPlayer.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameWin = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        textWin = new javax.swing.JLabel();
        titleWin = new javax.swing.JLabel();
        jFrameLose = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        textLose = new javax.swing.JLabel();
        titleLose = new javax.swing.JLabel();
        jFrameDrawDualPlayer = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        user3 = new javax.swing.JLabel();
        textDraw = new javax.swing.JLabel();
        titleDraw = new javax.swing.JLabel();
        user4 = new javax.swing.JLabel();

        jFrameWin.setMinimumSize(new java.awt.Dimension(350, 300));
        jFrameWin.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(350, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 300));

        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textWin.setText("você venceu!");

        titleWin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleWin.setText("Parabéns !!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(textWin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleWin)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(titleWin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textWin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrameWinLayout = new javax.swing.GroupLayout(jFrameWin.getContentPane());
        jFrameWin.getContentPane().setLayout(jFrameWinLayout);
        jFrameWinLayout.setHorizontalGroup(
            jFrameWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameWinLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrameWinLayout.setVerticalGroup(
            jFrameWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jFrameLose.setMinimumSize(new java.awt.Dimension(350, 300));
        jFrameLose.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(350, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(350, 300));

        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textLose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLose.setText("você perdeu!");

        titleLose.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLose.setText("Tente novamente !!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(textLose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLose)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(titleLose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrameLoseLayout = new javax.swing.GroupLayout(jFrameLose.getContentPane());
        jFrameLose.getContentPane().setLayout(jFrameLoseLayout);
        jFrameLoseLayout.setHorizontalGroup(
            jFrameLoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameLoseLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrameLoseLayout.setVerticalGroup(
            jFrameLoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jFrameDrawDualPlayer.setMaximumSize(new java.awt.Dimension(350, 300));
        jFrameDrawDualPlayer.setMinimumSize(new java.awt.Dimension(350, 300));
        jFrameDrawDualPlayer.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(350, 300));
        jPanel4.setMinimumSize(new java.awt.Dimension(350, 300));

        user3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textDraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDraw.setText("vocês empataram!");

        titleDraw.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleDraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleDraw.setText("Empate !!!");

        user4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleDraw)
                    .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textDraw)
                        .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(titleDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrameDrawDualPlayerLayout = new javax.swing.GroupLayout(jFrameDrawDualPlayer.getContentPane());
        jFrameDrawDualPlayer.getContentPane().setLayout(jFrameDrawDualPlayerLayout);
        jFrameDrawDualPlayerLayout.setHorizontalGroup(
            jFrameDrawDualPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameDrawDualPlayerLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrameDrawDualPlayerLayout.setVerticalGroup(
            jFrameDrawDualPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrameDrawDualPlayer;
    private javax.swing.JFrame jFrameLose;
    private javax.swing.JFrame jFrameWin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel textDraw;
    private javax.swing.JLabel textLose;
    private javax.swing.JLabel textWin;
    private javax.swing.JLabel titleDraw;
    private javax.swing.JLabel titleLose;
    private javax.swing.JLabel titleWin;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    // End of variables declaration//GEN-END:variables
}
