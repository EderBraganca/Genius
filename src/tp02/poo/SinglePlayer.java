/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp02.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;


public class SinglePlayer extends javax.swing.JFrame {
    private Menu menu;
    private int dificuldade, nivelJogo, nivelUsuario;
    private String nome;
    Random random = new Random();
    List<Integer> listNumber = new ArrayList<>();
    private Resultado resultado;
    
  
    public SinglePlayer() {
        initComponents();
    }

    public SinglePlayer(Menu menu, int dificuldade, String nome){
        initComponents();      
        
        desativaBotoes();
        
        ActionListener clique_botao_G = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoVerde();                
            }
        };
        ActionListener clique_botao_R = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoVermelho();                
            }
        };
        ActionListener clique_botao_Y = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAmarelo();                
            }
        };
        ActionListener clique_botao_B = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAzul();                
            }
        };
        
        Green.addActionListener(clique_botao_G);
        Red.addActionListener(clique_botao_R);
        Yellow.addActionListener(clique_botao_Y);
        Blue.addActionListener(clique_botao_B);      
        
        this.menu = menu;
        this.dificuldade = dificuldade;
        this.nome = nome;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panicos = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Red = new javax.swing.JButton();
        Green = new javax.swing.JButton();
        Blue = new javax.swing.JButton();
        Yellow = new javax.swing.JButton();
        Exitplays = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();
        round = new java.awt.Label();
        PanicButton = new javax.swing.JLabel();

        Panicos.setMinimumSize(new java.awt.Dimension(800, 600));
        Panicos.setResizable(false);
        Panicos.getContentPane().setLayout(null);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panicos.getContentPane().add(jButton1);
        jButton1.setBounds(50, 530, 70, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp02/poo/pincher-4449345_1280.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        Panicos.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 600);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genius");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        Red.setBackground(new java.awt.Color(255, 0, 51));
        Red.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Red.setText("W");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });
        Red.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RedKeyPressed(evt);
            }
        });
        jPanel1.add(Red);
        Red.setBounds(84, 72, 300, 200);

        Green.setBackground(new java.awt.Color(0, 204, 51));
        Green.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Green.setText("E");
        Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenActionPerformed(evt);
            }
        });
        Green.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GreenKeyPressed(evt);
            }
        });
        jPanel1.add(Green);
        Green.setBounds(402, 72, 300, 200);

        Blue.setBackground(new java.awt.Color(0, 102, 255));
        Blue.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Blue.setText("S");
        Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueActionPerformed(evt);
            }
        });
        Blue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BlueKeyPressed(evt);
            }
        });
        jPanel1.add(Blue);
        Blue.setBounds(84, 284, 300, 200);

        Yellow.setBackground(new java.awt.Color(255, 255, 0));
        Yellow.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Yellow.setText("D");
        Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowActionPerformed(evt);
            }
        });
        Yellow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YellowKeyPressed(evt);
            }
        });
        jPanel1.add(Yellow);
        Yellow.setBounds(402, 284, 300, 200);

        Exitplays.setText("Sair");
        Exitplays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitplaysActionPerformed(evt);
            }
        });
        Exitplays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExitplaysKeyPressed(evt);
            }
        });
        jPanel1.add(Exitplays);
        Exitplays.setBounds(606, 502, 98, 44);

        StartButton.setText("Começar");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton);
        StartButton.setBounds(468, 502, 98, 44);

        round.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        round.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(round);
        round.setBounds(84, 513, 147, 33);

        PanicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanicButtonMouseEntered(evt);
            }
        });
        jPanel1.add(PanicButton);
        PanicButton.setBounds(720, 510, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 816, 608);
    }// </editor-fold>//GEN-END:initComponents

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        switch (verificaJogada(3)) {
            case 1 -> nivelUsuario++;               //Caso tenha acertado, porém não tenha acabado a sequência
            case 2 -> exibirSequencia();            //Caso tenha acertado e tenha acabado a sequência
            case 3 -> finaliza(1);                  //Caso tenha acertado e tenha acabado o jogo
            default -> finaliza(0);                 //Caso tenha errado
        }
    }//GEN-LAST:event_RedActionPerformed

    private void YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowActionPerformed
        switch (verificaJogada(4)) {
            case 1 -> nivelUsuario++;               //Caso tenha acertado, porém não tenha acabado a sequência
            case 2 -> exibirSequencia();            //Caso tenha acertado e tenha acabado a sequência
            case 3 -> finaliza(1);                  //Caso tenha acertado e tenha acabado o jogo
            default -> finaliza(0);                 //Caso tenha errado
        }
    }//GEN-LAST:event_YellowActionPerformed

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueActionPerformed
        switch (verificaJogada(2)) {
            case 1 -> nivelUsuario++;               //Caso tenha acertado, porém não tenha acabado a sequência
            case 2 -> exibirSequencia();            //Caso tenha acertado e tenha acabado a sequência
            case 3 -> finaliza(1);                  //Caso tenha acertado e tenha acabado o jogo
            default -> finaliza(0);                 //Caso tenha errado
        }
    }//GEN-LAST:event_BlueActionPerformed

    private void ExitplaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitplaysActionPerformed
        this.setEnabled(false);
        this.setVisible(false);
        
        menu.setEnabled(true);
        menu.setVisible(true);
    }//GEN-LAST:event_ExitplaysActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenActionPerformed
        switch (verificaJogada(1)) {
            case 1 -> nivelUsuario++;//Caso tenha acertado, porém não tenha acabado a sequência
            case 2 -> exibirSequencia();//Caso tenha acertado e tenha acabado a sequência
            case 3 -> finaliza(1);//Caso tenha acertado e tenha acabado o jogo
            default -> finaliza(0);//Caso tenha errado
        }
    }//GEN-LAST:event_GreenActionPerformed
    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        ativaBotoes();
        StartButton.setVisible(false);
        jogarMachine();
    }//GEN-LAST:event_StartButtonActionPerformed

    private void RedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RedKeyPressed
        this.playWithKey(evt); 
    }//GEN-LAST:event_RedKeyPressed

    private void YellowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YellowKeyPressed
        this.playWithKey(evt); 
    }//GEN-LAST:event_YellowKeyPressed

    private void BlueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BlueKeyPressed
        this.playWithKey(evt); 
    }//GEN-LAST:event_BlueKeyPressed

    private void GreenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GreenKeyPressed
        this.playWithKey(evt); 
    }//GEN-LAST:event_GreenKeyPressed

    private void ExitplaysKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExitplaysKeyPressed
        this.playWithKey(evt); 
    }//GEN-LAST:event_ExitplaysKeyPressed

    private void PanicButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanicButtonMouseEntered
        jPanel1.setVisible(false);
        Panicos.setVisible(true);
    }//GEN-LAST:event_PanicButtonMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(true);
        Panicos.setVisible(false);
        if(!listNumber.isEmpty())
            exibirSequencia();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinglePlayer().setVisible(true);  
            }
        });
    }
    
    public void finaliza(int i){
        this.setEnabled(false);
        this.setVisible(false);
        
        menu.setEnabled(true);
        menu.setVisible(true);
        resultado = new Resultado(nome, i);
    }
    
    public void jogarMachine(){//Função responsavel pelo inicio do jogo
        listNumber.clear();
        nivelJogo = 0;         //Iniciando as variaveis como para iniciar o jogo
        nivelUsuario = 0;
        switch(dificuldade){
                case 1 -> gerarVetor(8);
                case 2 -> gerarVetor(14);
                case 3 -> gerarVetor(20);
                case 4 -> gerarVetor(31);
                case 5 -> gerarVetor(5);//Foi utilizado o 5 para modo infinito para gerar blocos de 5 em 5 infinitamente e poupar tempo
            }
        exibirSequencia();
    }
    
    private void exibirSequencia(){//Função responsavel por exibir a sequencia produzida pela máquina
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                
                sleepTime(500);
                desativaBotoes();         //Função para não permitir que o jogador interrompa a sequencia da maquina
                while(i <= nivelJogo){
                    sleepTime(500);
                    switch(listNumber.get(i)){
                        case 1 -> acaoVerde();
                        case 2 -> acaoAzul();
                        case 3 -> acaoVermelho();
                        case 4 -> acaoAmarelo();
                    }
                    i++;
                }
                ativaBotoes();               
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
    
    private void gerarVetor(int i){//Função para gerar sequencia de valores para as cores
        for(int j = 0; j < i; j++){
            int n = random.nextInt(4);
            listNumber.add(n + 1); //Adiciona no fim da lista o valor desejado entre 1 e 4
        }
    }
    
    private int verificaJogada(int valor){
        //compara se os valores são iguais
        if(listNumber.get(nivelUsuario) != valor){
            return 0;
        }
        //caso tenha concluído o nivel
        if(nivelUsuario == nivelJogo){
            nivelJogo++;
            if(nivelJogo == listNumber.size() && dificuldade == 5){
                gerarVetor(5);//Gera + 5 posições sempre que a dificuldade é 5 e chega no fim da sequencia
            }else if(nivelJogo == listNumber.size()){
                return 3;
            }
            nivelUsuario = 0;
            return 2;
        }
        
        return 1;
    }
    
    private void playWithKey(java.awt.event.KeyEvent evt)//Função responsável pela utilização do teclado
    {
        char keyPressed = evt.getKeyChar();
        
        switch (verificaJogada(getColorFromKey(keyPressed))) {
            case 1 -> nivelUsuario++;
            case 2 -> exibirSequencia();
            case 3 -> finaliza(1);
            default -> finaliza(0);
        }
    }
    
    private int getColorFromKey(char key){//Função de conversão das teclas em valores
        if(key == 'w' || key == 'W'){ //vermelho
           acaoVermelho();
           return 3;
        }
        
        if(key == 'e' || key == 'E'){ //verde
            acaoVerde();
            return 1;
        }
        
        if(key == 's' || key == 'S'){ //azul
            acaoAzul();
            return 2;
        }
        
        if(key == 'd' || key == 'D'){ //amarelo
            acaoAmarelo();
            return 4;
        }
        return -1;
        
    }
    
    private void sleepTime(int temp) {//Função responsável por pausar o tempo
        try{
            Thread.sleep(temp);
        } catch (InterruptedException xs) {
            Logger.getLogger(SinglePlayer.class.getName()).log(Level.SEVERE, null, xs);
        } 
    }
    
    private void acaoVerde(){   //Função responsável pela ação da cor verde
        //implementar as açoes do botão 
        //Audio
        //Luz
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i < 256; i += 1) {
                    Green.setBackground(new Color(i, 255 - i, 255 - 1));
                    repaint();
                    sleepTime(1);
                }
                Green.setBackground(Color.green);
            }
        };
        playPiano(65);
        Thread t = new Thread(r);
        t.start();
    }
    
    private void acaoAzul(){//Função responsável pela ação da cor Azul
        Runnable r = new Runnable() {
            @Override
            public void run() {            
                for(int i = 1; i < 256; i += 1) {
                    Blue.setBackground(new Color(i, 255 - i, 255 - 1));
                    repaint();
                    sleepTime(1);
                }
                Blue.setBackground(Color.blue);
            }
        };
        playPiano(70);
        Thread t = new Thread(r);
        t.start();
        //implementar as açoes do botão 
        //Audio
        //Luz
    }
    
    private void acaoVermelho(){//Função responsável pela ação da cor Vermelha
        Runnable r = new Runnable() {
            @Override
            public void run() {               
                for(int i = 1; i < 256; i += 1) {
                    Red.setBackground(new Color(i, 255 - i, 255 - 1));
                    repaint();
                    sleepTime(1);                  
                }
                Red.setBackground(Color.red);
            }
        };
        playPiano(60);
        Thread t = new Thread(r);
        t.start();
        
        //implementar as açoes do botão 
        //Audio
        //Luz
    }
    
    private void acaoAmarelo(){//Função responsável pela ação da Amarela
        Runnable r = new Runnable() {
            @Override
            public void run() {             
                for(int i = 1; i < 256; i += 1) {
                    Yellow.setBackground(new Color(i, 255 - i, 255 - 1));
                    repaint();
                    sleepTime(1);
                }
                Yellow.setBackground(Color.yellow);
            }
        };
        playPiano(80);
        Thread t = new Thread(r);
        t.start();
        
        //implementar as açoes do botão 
        //Audio
        //Luz
    }
    
    private void desativaBotoes(){//Função responsável pela desativação dos botões
        Green.setEnabled(false);
        Red.setEnabled(false);
        Yellow.setEnabled(false);
        Blue.setEnabled(false);
    }
    
    private void ativaBotoes(){//Função responsável pela Ativação dos botões
        Green.setEnabled(true);
        Red.setEnabled(true);
        Yellow.setEnabled(true);
        Blue.setEnabled(true);
    }
    
    public void playPiano(int note){
        if(note < 1){
            note = 1;
        }
        else if(note > 100){
            note = 100;
        }

        // Try block to check for exceptions
        try {
            // Getting a sequencer and open it
            Sequencer player = MidiSystem.getSequencer();
            player.open();
 
            // Making 1a new Sequence
            Sequence seq = new Sequence(Sequence.PPQ, 128);
 
            // Creating a new track
            javax.sound.midi.Track track = seq.createTrack();
 
            // Making a Message
            ShortMessage a = new ShortMessage();
 
            // Put the Instruction in the Message
            a.setMessage(144, 1, note, 100);
 
            // Make a new MidiEvent
            MidiEvent noteOn = new MidiEvent(a, 2);
 
            // Add MidiEvent to the Track
            track.add(noteOn);
 
            // Giving sequence to Sequencer
            player.setSequence(seq);
 
            // Start the Sequencer using start() method
            player.start();
        }
 
        // Catch block to handle exceptions
        catch (Exception ex) {
            // Display the exception on console
            // along with line number
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blue;
    private javax.swing.JButton Exitplays;
    private javax.swing.JButton Green;
    private javax.swing.JLabel PanicButton;
    private javax.swing.JFrame Panicos;
    private javax.swing.JButton Red;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton Yellow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label round;
    // End of variables declaration//GEN-END:variables
}
