/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tetris.app;

/**
 *
 * @author Bea⚝
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        setTitle("Tetris");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btgame = new javax.swing.JButton();
        btabout = new javax.swing.JButton();
        btrules = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        jPanel8.setLayout(new java.awt.GridLayout(1, 3));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel3);

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dancing Script OT", 0, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/resources/SHAPESTORM.png"))); // NOI18N
        jPanel10.add(jLabel1);

        jPanel8.add(jPanel10);

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel4);

        getContentPane().add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 3));

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1, 0, 20));

        btgame.setFont(new java.awt.Font("League Spartan Thin", 1, 48)); // NOI18N
        btgame.setForeground(new java.awt.Color(102, 204, 255));
        btgame.setText("Jogar");
        btgame.setBorder(null);
        btgame.setBorderPainted(false);
        btgame.setFocusPainted(false);
        btgame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btgame.setOpaque(false);
        btgame.setVerifyInputWhenFocusTarget(false);
        btgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgameActionPerformed(evt);
            }
        });
        jPanel2.add(btgame);

        btabout.setFont(new java.awt.Font("League Spartan Thin", 1, 48)); // NOI18N
        btabout.setForeground(new java.awt.Color(102, 204, 255));
        btabout.setText("Acerca de Nós");
        btabout.setBorder(null);
        btabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaboutActionPerformed(evt);
            }
        });
        jPanel2.add(btabout);

        btrules.setFont(new java.awt.Font("League Spartan Thin", 0, 48)); // NOI18N
        btrules.setForeground(new java.awt.Color(102, 204, 255));
        btrules.setText("Regras");
        btrules.setBorder(null);
        btrules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrulesActionPerformed(evt);
            }
        });
        jPanel2.add(btrules);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(3600, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);

        jPanel9.add(jPanel2);

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel6);

        getContentPane().add(jPanel9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btrulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrulesActionPerformed
        Rules r = new Rules();
        r.show();
        dispose();
    }//GEN-LAST:event_btrulesActionPerformed

    private void btaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaboutActionPerformed
        About a = new About();
        a.show();
        dispose();
    }//GEN-LAST:event_btaboutActionPerformed

    private void btgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgameActionPerformed
        Nivel n = new Nivel();
        n.show();
        dispose();
    }//GEN-LAST:event_btgameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btabout;
    private javax.swing.JButton btgame;
    private javax.swing.JButton btrules;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
