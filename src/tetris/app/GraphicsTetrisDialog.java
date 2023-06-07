/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tetris.app;

import java.awt.event.KeyEvent;

/**
 *
 * @author IPT
 */
public class GraphicsTetrisDialog extends javax.swing.JDialog {

    /**
     * Creates new form TextTetrisDialog
     */
    public GraphicsTetrisDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btSkipPiece = new javax.swing.JButton();
        btLeft = new javax.swing.JButton();
        btDown = new javax.swing.JButton();
        btRight = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spLines = new javax.swing.JSpinner();
        spColumns = new javax.swing.JSpinner();
        btCreateGame = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btRotate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btMoveLeft = new javax.swing.JButton();
        btDown = new javax.swing.JButton();
        btMoveRight = new javax.swing.JButton();
        board = new tetris.lib.board.TetrisGame();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout());

        btSkipPiece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/resources/right.png"))); // NOI18N
        btSkipPiece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSkipPieceActionPerformed(evt);
            }
        });
        jPanel3.add(btSkipPiece);

        btLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/resources/left.png"))); // NOI18N
        btLeft.addActionListener(new java.awt.event.ActionListener() {
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 40, 20));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9);

        jPanel5.setLayout(new java.awt.GridLayout(3, 0, 0, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 30, 20));

        jLabel1.setFont(new java.awt.Font("Dancing Script OT", 0, 24)); // NOI18N
        jLabel1.setText("Linhas");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Dancing Script OT", 0, 24)); // NOI18N
        jLabel2.setText("Colunas");
        jPanel2.add(jLabel2);

        spLines.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spLines.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spLines.setRequestFocusEnabled(false);
        jPanel2.add(spLines);

        spColumns.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spColumns.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(spColumns);

        jPanel5.add(jPanel2);

        btCreateGame.setFont(new java.awt.Font("Dancing Script OT", 0, 24)); // NOI18N
        btCreateGame.setText("Criar Tabuleiro");
        btCreateGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateGameActionPerformed(evt);
            }
        });
        jPanel5.add(btCreateGame);

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        btRotate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/recursos/up.png"))); // NOI18N
        btRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRotateActionPerformed(evt);
            }
        });
        btRotate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btRotateKeyTyped(evt);
            }
        });
        jPanel1.add(btRotate);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        btMoveLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/recursos/left.png"))); // NOI18N
        btMoveLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveLeftActionPerformed(evt);
            }
        });
        jPanel1.add(btMoveLeft);

        btDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/recursos/down.png"))); // NOI18N
        btDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDownActionPerformed(evt);
            }
        });
        jPanel1.add(btDown);

        btMoveRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/recursos/right.png"))); // NOI18N
        btMoveRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveRightActionPerformed(evt);
            }
        });
        jPanel1.add(btMoveRight);

        jPanel5.add(jPanel1);

        jPanel6.add(jPanel5);

        board.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boardKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel6.add(board);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8);

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpActionPerformed
        tetrisGame1.rotate();

    }//GEN-LAST:event_btUpActionPerformed

    private void btLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeftActionPerformed
        tetrisGame1.moveLeft();

    }//GEN-LAST:event_btLeftActionPerformed

    private void btDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDownActionPerformed
        tetrisGame1.fallDown();

    }//GEN-LAST:event_btDownActionPerformed

    private void btRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRightActionPerformed
        tetrisGame1.moveRight();
    private void btMoveLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveLeftActionPerformed
        board.moveLeft();
    }//GEN-LAST:event_btMoveLeftActionPerformed

    private void btMoveRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveRightActionPerformed
        board.moveRight();
    }//GEN-LAST:event_btMoveRightActionPerformed

    private void btDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDownActionPerformed
        board.moveDown();
    }//GEN-LAST:event_btDownActionPerformed

    private void btRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRotateActionPerformed
        board.rotate();
    }//GEN-LAST:event_btRotateActionPerformed

    private void btRotateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btRotateKeyTyped

    }//GEN-LAST:event_btRotateKeyTyped

    private void btCreateGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateGameActionPerformed
        // dimensões do tabuleiro
        int lines = (Integer) spLines.getValue();
        int cols = (Integer) spColumns.getValue();
        board.resize(lines, cols);
    }//GEN-LAST:event_btCreateGameActionPerformed

    private void boardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boardKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                board.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                board.moveRight();
                break;
            case KeyEvent.VK_DOWN:
                board.fallDown();
                break;
            case KeyEvent.VK_UP:
                board.rotate();
                break;
            case KeyEvent.VK_SPACE:
                tetrisGame1.skipPiece();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_boardKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btSkipPieceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSkipPieceActionPerformed
        tetrisGame1.skipPiece();
    }//GEN-LAST:event_btSkipPieceActionPerformed

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
            java.util.logging.Logger.getLogger(GraphicsTetrisDialog.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsTetrisDialog.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsTetrisDialog.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsTetrisDialog.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GraphicsTetrisDialog dialog = new GraphicsTetrisDialog(
                        new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tetris.lib.board.TetrisGame board;
    private javax.swing.JButton btCreateGame;
    private javax.swing.JButton btDown;
    private javax.swing.JButton btLeft;
    private javax.swing.JButton btRight;
    private javax.swing.JButton btSkipPiece;
    private javax.swing.JButton btUp;
    private javax.swing.JButton btMoveLeft;
    private javax.swing.JButton btMoveRight;
    private javax.swing.JButton btRotate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner spColumns;
    private javax.swing.JSpinner spLines;
    protected tetris.lib.board.TetrisGame tetrisGame1;
    // End of variables declaration//GEN-END:variables
}
