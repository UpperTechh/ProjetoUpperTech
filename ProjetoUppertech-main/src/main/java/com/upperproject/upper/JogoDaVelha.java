/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.upperproject.upper;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class JogoDaVelha extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCounter = 0;
    private int oCounter = 0;
    
    public JogoDaVelha() {
        initComponents();
        gameScore();
    }
    
    private void NOVOJOGO(){
        xCounter = 0;
        oCounter = 0;
        jlblJogadorX.setText(String.valueOf(xCounter));
        jlblJogadorO.setText(String.valueOf(oCounter));
        restart();
    }
    
    public void gameScore() {
        jlblJogadorX.setText(String.valueOf(xCounter));
        jlblJogadorO.setText(String.valueOf(oCounter));
    }
    
    private void chooseaPlayer() {
        
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else{
            startGame = "X";
        }
    }
    
    private void WinningGame() {
        
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        
        if ((b1 == ("X") && b2 == ("X") && b3 == ("X")) || (b1 == ("X") && b4 == ("X") && b7 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            restart();
            if(xCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador X Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            } else if ((b1 == ("O") && b2 == ("O") && b3 == ("O")) || (b1 == ("O") && b4 == ("O") && b7 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            restart();
            
            if(oCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador O Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            } else if ((b4 == ("X") && b5 == ("X") && b6 == ("X")) || (b2 == ("X") && b5 == ("X") && b8 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            restart();   
            
            if(xCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador X Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            } else if ((b4 == ("O") && b5 == ("O") && b6 == ("O")) || (b2 == ("O") && b5 == ("O") && b8 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            restart();
            
            if(oCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador O Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            } else if ((b7 == ("X") && b8 == ("X") && b9 == ("X")) || (b3 == ("X") && b6 == ("X") && b9 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            restart();
            
            if(xCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador X Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            } else if ((b7 == ("O") && b8 == ("O") && b9 == ("O")) || (b3 == ("O") && b6 == ("O") && b9 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            restart();
            
            if(oCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador O Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            }  else if ((b1 == ("X") && b5 == ("X") && b9 == ("X")) || (b3 == ("X") && b5 == ("X") && b7 == ("X")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador X Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xCounter++;
            gameScore();
            restart();
            
            if(xCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador X Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            } else if ((b1 == ("O") && b5 == ("O") && b9 == ("O")) || (b3 == ("O") && b5 == ("O") && b7 == ("O")) ) {
            
            JOptionPane.showMessageDialog(this, "Jogador O Vence", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            oCounter++;
            gameScore();
            restart();
            
            if(oCounter == 2){
                JOptionPane.showMessageDialog(this, "Jogador O Venceu!!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                NOVOJOGO();
            }
            }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlblJogadorO = new javax.swing.JLabel();
        jlblJogadorX = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1, 1));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 51));
        jButton11.setText("RESTART");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jogador O:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jogador X:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(59, 56, 56));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 270));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 51));
        jButton10.setText("NEW GAME");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));

        jPanel2.setBackground(new java.awt.Color(59, 56, 56));

        jlblJogadorO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jlblJogadorO.setForeground(new java.awt.Color(255, 255, 255));

        jlblJogadorX.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jlblJogadorX.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jlblJogadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jlblJogadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblJogadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblJogadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));

        jPanel3.setBackground(new java.awt.Color(59, 56, 56));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 30, 340));

        jPanel4.setBackground(new java.awt.Color(59, 56, 56));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 30, 340));

        jPanel5.setBackground(new java.awt.Color(59, 56, 56));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 280, 70));

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jMenuItem2.setText("Voltar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void restart(){
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton7.setForeground(Color.RED);
        
        } else {
            
            jButton7.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton1.setForeground(Color.RED);
        
        } else {
            
            jButton1.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton2.setForeground(Color.RED);
        
        } else {
            
            jButton2.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton3.setForeground(Color.RED);
        
        } else {
            
            jButton3.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton4.setForeground(Color.RED);
        
        } else {
            
            jButton4.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton5.setForeground(Color.RED);
        
        } else {
            
            jButton5.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton6.setForeground(Color.RED);
        
        } else {
            
            jButton6.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton8.setForeground(Color.RED);
        
        } else {
            
            jButton8.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            
            jButton9.setForeground(Color.RED);
        
        } else {
            
            jButton9.setForeground(Color.BLACK);
        }
        
        chooseaPlayer();
        WinningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Op telaOP = new Op();
        telaOP.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        NOVOJOGO();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        restart();
    }//GEN-LAST:event_jButton11ActionPerformed

    
    private JFrame frame;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jlblJogadorO;
    private javax.swing.JLabel jlblJogadorX;
    // End of variables declaration//GEN-END:variables
}
