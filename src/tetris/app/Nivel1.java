/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tetris.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;
import tetris.lib.board.Difficulty;

/**
 *
 * @author Bea⚝
 */
public class Nivel1 extends javax.swing.JFrame {

    private boolean btEasySelected = false;
    private boolean btNormalSelected = false;
    private boolean btDifficultSelected = false;

    /**
     * Creates new form Nivel
     */

    public Nivel1() {
        initComponents();

        tgBtEasy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JToggleButton tBtn = (JToggleButton) e.getSource();
                if (tBtn.isSelected()) {
                    btEasySelected = true;
                }
            }
        });

        tgBtNormal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JToggleButton tBtn = (JToggleButton) e.getSource();
                if (tBtn.isSelected()) {
                    btNormalSelected = true;
                }
            }
        });

        tgBtDifficult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JToggleButton tBtn = (JToggleButton) e.getSource();
                if (tBtn.isSelected()) {
                    btDifficultSelected = true;
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tgBtEasy = new javax.swing.JToggleButton();
        tgBtNormal = new javax.swing.JToggleButton();
        tgBtDifficult = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spLines = new javax.swing.JSpinner();
        spColumns = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel13);

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setToolTipText("");
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        buttonGroup1.add(tgBtEasy);
        tgBtEasy.setFont(new java.awt.Font("League Spartan Thin", 1, 48)); // NOI18N
        tgBtEasy.setForeground(new java.awt.Color(102, 204, 255));
        tgBtEasy.setText("Fácil");
        tgBtEasy.setActionCommand("");
        tgBtEasy.setBorder(null);
        tgBtEasy.setBorderPainted(false);
        tgBtEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgBtEasyActionPerformed(evt);
            }
        });
        jPanel2.add(tgBtEasy);

        buttonGroup1.add(tgBtNormal);
        tgBtNormal.setFont(new java.awt.Font("League Spartan Thin", 1, 48)); // NOI18N
        tgBtNormal.setForeground(new java.awt.Color(102, 204, 255));
        tgBtNormal.setText("Médio");
        tgBtNormal.setActionCommand("");
        tgBtNormal.setBorder(null);
        tgBtNormal.setBorderPainted(false);
        tgBtNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgBtNormalActionPerformed(evt);
            }
        });
        jPanel2.add(tgBtNormal);

        buttonGroup1.add(tgBtDifficult);
        tgBtDifficult.setFont(new java.awt.Font("League Spartan Thin", 1, 48)); // NOI18N
        tgBtDifficult.setForeground(new java.awt.Color(102, 204, 255));
        tgBtDifficult.setText("Difícil");
        tgBtDifficult.setActionCommand("");
        tgBtDifficult.setBorder(null);
        tgBtDifficult.setBorderPainted(false);
        jPanel2.add(tgBtDifficult);

        jPanel1.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        jPanel5.add(jPanel1);

        jPanel7.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7);

        jPanel8.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11);

        jPanel9.setBackground(new java.awt.Color(102, 204, 255));
        jPanel9.setLayout(new java.awt.GridLayout(4, 0));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel14.setLayout(new java.awt.GridLayout(2, 2, 30, 0));

        jLabel1.setFont(new java.awt.Font("League Spartan Thin", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linhas");
        jPanel14.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("League Spartan Thin", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Colunas");
        jPanel14.add(jLabel2);

        spLines.setFont(new java.awt.Font("League Spartan Thin", 0, 18)); // NOI18N
        spLines.setModel(new javax.swing.SpinnerNumberModel(30, 1, null, 1));
        spLines.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spLines.setRequestFocusEnabled(false);
        jPanel14.add(spLines);

        spColumns.setFont(new java.awt.Font("League Spartan Thin", 0, 18)); // NOI18N
        spColumns.setModel(new javax.swing.SpinnerNumberModel(20, 1, null, 1));
        jPanel14.add(spColumns);

        jPanel9.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel15);

        jButton5.setFont(new java.awt.Font("League Spartan Thin", 1, 48)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 204, 255));
        jButton5.setText("Jogar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5);

        jPanel12.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12);

        jPanel6.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10);

        jPanel8.add(jPanel6);

        getContentPane().add(jPanel8);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // dimensões do tabuleiro
        int lines = (Integer) spLines.getValue();
        int cols = (Integer) spColumns.getValue();
        Difficulty dif = btDifficultSelected ? Difficulty.DIFFICULT
                : btNormalSelected ? Difficulty.NORMAL : Difficulty.EASY;

        dispose();
        GraphicsTetrisDialog1 g = new GraphicsTetrisDialog1(this, true,
                dif, lines, cols);
        g.show();
        
        //board.resize(lines, cols);

//        if (btEasySelected) {
//            GraphicsTetrisDialog1 g = new GraphicsTetrisDialog1(this, true,
//                    Difficulty.EASY, lines, cols);
//            g.show();
//            dispose();
//        } else if (btNormalSelected) {
//            GraphicsTetrisDialog1 g = new GraphicsTetrisDialog1(this, true,
//                    Difficulty.NORMAL, lines, cols);
//            g.show();
//            dispose();
//        } else if (btDifficultSelected) {
//            GraphicsTetrisDialog1 g = new GraphicsTetrisDialog1(this, true,
//                    Difficulty.DIFFICULT, lines, cols);
//            g.show();
//            dispose();
//        } else {
//            GraphicsTetrisDialog1 g = new GraphicsTetrisDialog1(this, true,
//                    Difficulty.EASY, lines, cols);
//            g.show();
//            dispose();
//        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tgBtNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgBtNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgBtNormalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void tgBtEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgBtEasyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgBtEasyActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nivel1.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel1.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel1.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel1.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner spColumns;
    private javax.swing.JSpinner spLines;
    private javax.swing.JToggleButton tgBtDifficult;
    private javax.swing.JToggleButton tgBtEasy;
    private javax.swing.JToggleButton tgBtNormal;
    // End of variables declaration//GEN-END:variables
}