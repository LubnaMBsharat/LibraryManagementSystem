/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_package;

import javax.swing.JFrame;

/**
 *
 * @author englu_2ecwi4v
 */
public class AddMember extends javax.swing.JFrame {
  addStudent adds = new addStudent();
  updateStudent updates =new updateStudent();
  addProf addp = new addProf();
  updateProf updatep = new updateProf();
  addLibrarian addl= new addLibrarian();
  updateLibrarian updatel = new updateLibrarian();
  /**
     * Creates new form AddMember
     */
    public AddMember() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sAdd = new javax.swing.JRadioButton();
        sUpdate = new javax.swing.JRadioButton();
        pAdd = new javax.swing.JRadioButton();
        pUpdate = new javax.swing.JRadioButton();
        lAdd = new javax.swing.JRadioButton();
        lUpdate = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Member");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("Proffesor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 230, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setText("librarian");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 230, 40));

        buttonGroup1.add(sAdd);
        sAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        sAdd.setText("Add");
        sAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sAddActionPerformed(evt);
            }
        });
        getContentPane().add(sAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 93, -1));

        buttonGroup1.add(sUpdate);
        sUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        sUpdate.setText("Update");
        sUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(sUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 93, -1));

        buttonGroup1.add(pAdd);
        pAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        pAdd.setText("Add");
        pAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAddActionPerformed(evt);
            }
        });
        getContentPane().add(pAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 93, -1));

        buttonGroup1.add(pUpdate);
        pUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        pUpdate.setText("Update");
        pUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(pUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 93, -1));

        buttonGroup1.add(lAdd);
        lAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lAdd.setText("Add");
        lAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lAddActionPerformed(evt);
            }
        });
        getContentPane().add(lAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 93, -1));

        buttonGroup1.add(lUpdate);
        lUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lUpdate.setText("Update");
        lUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(lUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 93, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/back (1).jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/return - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 900));

        setBounds(0, 0, 1380, 805);
    }// </editor-fold>//GEN-END:initComponents

    private void sAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sAddActionPerformed
        adds.setVisible(true);
        addl.setVisible(false);
        addp.setVisible(false);
        updates.setVisible(false);
        updatel.setVisible(false);
        updatep.setVisible(false);
      
    }//GEN-LAST:event_sAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sUpdateActionPerformed
       adds.setVisible(false);
        addl.setVisible(false);
        addp.setVisible(false);
        updates.setVisible(true);
        updatel.setVisible(false);
        updatep.setVisible(false);
      
    }//GEN-LAST:event_sUpdateActionPerformed

    private void pAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAddActionPerformed
       adds.setVisible(false);
        addl.setVisible(false);
        addp.setVisible(true);
        updates.setVisible(false);
        updatel.setVisible(false);
        updatep.setVisible(false);
      
         
    }//GEN-LAST:event_pAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lAddActionPerformed
         adds.setVisible(false);
        addl.setVisible(true);
        addp.setVisible(false);
        updates.setVisible(false);
        updatel.setVisible(false);
        updatep.setVisible(false);
         
       

    }//GEN-LAST:event_lAddActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Login.ho.setVisible(true);
        this.setVisible(false);
        adds.setVisible(false);
        addl.setVisible(false);
        addp.setVisible(false);
        updates.setVisible(false);
        updatel.setVisible(false);
        updatep.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void pUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pUpdateActionPerformed
       adds.setVisible(false);
        addl.setVisible(false);
        addp.setVisible(false);
        updates.setVisible(false);
        updatel.setVisible(false);
        updatep.setVisible(true);
    }//GEN-LAST:event_pUpdateActionPerformed

    private void lUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lUpdateActionPerformed
       adds.setVisible(false);
        addl.setVisible(false);
        addp.setVisible(false);
        updates.setVisible(false);
        updatel.setVisible(true);
        updatep.setVisible(false);
    }//GEN-LAST:event_lUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton lAdd;
    private javax.swing.JRadioButton lUpdate;
    private javax.swing.JRadioButton pAdd;
    private javax.swing.JRadioButton pUpdate;
    private javax.swing.JRadioButton sAdd;
    private javax.swing.JRadioButton sUpdate;
    // End of variables declaration//GEN-END:variables
}
