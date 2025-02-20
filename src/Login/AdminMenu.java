/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Candidate.*;
import Election.*;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author BlackDragon
 */

public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 - getHeight()/2);
        setTitle("Main Menu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add_elect_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AddCandidate = new javax.swing.JButton();
        AddSymbolBtn = new javax.swing.JButton();
        VoterListBtn = new javax.swing.JButton();
        AddVoterBtn = new javax.swing.JButton();
        PublishResultBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_elect_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Add_elect_btn.setText("Add Election");
        Add_elect_btn.setMaximumSize(new java.awt.Dimension(118, 27));
        Add_elect_btn.setMinimumSize(new java.awt.Dimension(118, 27));
        Add_elect_btn.setPreferredSize(new java.awt.Dimension(118, 27));
        Add_elect_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_elect_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Add_elect_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 42));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("Main Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 50));

        AddCandidate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddCandidate.setText("Add candidate");
        AddCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCandidateActionPerformed(evt);
            }
        });
        getContentPane().add(AddCandidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 130, 42));

        AddSymbolBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddSymbolBtn.setText("Add Symbol");
        AddSymbolBtn.setMaximumSize(new java.awt.Dimension(118, 27));
        AddSymbolBtn.setMinimumSize(new java.awt.Dimension(118, 27));
        AddSymbolBtn.setPreferredSize(new java.awt.Dimension(118, 27));
        AddSymbolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSymbolBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddSymbolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 40));

        VoterListBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VoterListBtn.setText("Voter List");
        VoterListBtn.setMaximumSize(new java.awt.Dimension(118, 27));
        VoterListBtn.setMinimumSize(new java.awt.Dimension(118, 27));
        VoterListBtn.setPreferredSize(new java.awt.Dimension(118, 27));
        VoterListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoterListBtnActionPerformed(evt);
            }
        });
        getContentPane().add(VoterListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 130, 40));

        AddVoterBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddVoterBtn.setText("Add Votar");
        AddVoterBtn.setMaximumSize(new java.awt.Dimension(118, 27));
        AddVoterBtn.setMinimumSize(new java.awt.Dimension(118, 27));
        AddVoterBtn.setPreferredSize(new java.awt.Dimension(118, 27));
        AddVoterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVoterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddVoterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 40));

        PublishResultBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PublishResultBtn.setText("Publish Result");
        PublishResultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublishResultBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PublishResultBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/gradient.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSymbolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSymbolBtnActionPerformed
        // TODO add your handling code here:
        AddSymbol ad_symbol = new AddSymbol();
        ad_symbol.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AddSymbolBtnActionPerformed

    private void Add_elect_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_elect_btnActionPerformed
        // TODO add your handling code here:
        AddElection add = new AddElection();
        add.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Add_elect_btnActionPerformed

    private void AddCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCandidateActionPerformed
        // TODO add your handling code here:
        AddCandidate addCdn = new AddCandidate();
        addCdn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AddCandidateActionPerformed

    private void VoterListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoterListBtnActionPerformed
        // TODO add your handling code here:
        Voterlist vt = new Voterlist();
        vt.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_VoterListBtnActionPerformed

    private void PublishResultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublishResultBtnActionPerformed
        // TODO add your handling code here:
        Result res = new Result();
        res.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_PublishResultBtnActionPerformed

    private void AddVoterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVoterBtnActionPerformed
        // TODO add your handling code here:
        AddVoter ad_voter = new AddVoter();
        ad_voter.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_AddVoterBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCandidate;
    private javax.swing.JButton AddSymbolBtn;
    private javax.swing.JButton AddVoterBtn;
    private javax.swing.JButton Add_elect_btn;
    private javax.swing.JButton PublishResultBtn;
    private javax.swing.JButton VoterListBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
