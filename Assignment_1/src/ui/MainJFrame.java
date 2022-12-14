/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.User;

/**
 *
 * @author Brijesh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    User user;
    
    public MainJFrame() {
        user = new User();
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

        split_panel = new javax.swing.JSplitPane();
        jNavigate_panel = new javax.swing.JPanel();
        jAddBtn = new javax.swing.JButton();
        jViewBtn = new javax.swing.JButton();
        jWork_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAddBtn.setText("Create");
        jAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddBtnActionPerformed(evt);
            }
        });

        jViewBtn.setText("View");
        jViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jNavigate_panelLayout = new javax.swing.GroupLayout(jNavigate_panel);
        jNavigate_panel.setLayout(jNavigate_panelLayout);
        jNavigate_panelLayout.setHorizontalGroup(
            jNavigate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNavigate_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jNavigate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
        );
        jNavigate_panelLayout.setVerticalGroup(
            jNavigate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNavigate_panelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jAddBtn)
                .addGap(49, 49, 49)
                .addComponent(jViewBtn)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        split_panel.setLeftComponent(jNavigate_panel);

        javax.swing.GroupLayout jWork_panelLayout = new javax.swing.GroupLayout(jWork_panel);
        jWork_panel.setLayout(jWork_panelLayout);
        jWork_panelLayout.setHorizontalGroup(
            jWork_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jWork_panelLayout.setVerticalGroup(
            jWork_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        split_panel.setRightComponent(jWork_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(split_panel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(split_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddBtnActionPerformed
        // TODO add your handling code here:
        AddJPanel addJpanel = new AddJPanel(user);
        split_panel.setRightComponent(addJpanel);
    }//GEN-LAST:event_jAddBtnActionPerformed

    private void jViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewBtnActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewJpanel = new ViewJPanel(user);
        
        split_panel.setRightComponent(viewJpanel);
        
    }//GEN-LAST:event_jViewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddBtn;
    private javax.swing.JPanel jNavigate_panel;
    private javax.swing.JButton jViewBtn;
    private javax.swing.JPanel jWork_panel;
    private javax.swing.JSplitPane split_panel;
    // End of variables declaration//GEN-END:variables

    private static class AddJpanel {

        public AddJpanel() {
        }
    }
}
