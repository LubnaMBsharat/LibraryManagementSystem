/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_package;

import com.sbix.jnotify.NPosition;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

/**
 *
 * @author 2021
 */
public class issuer extends javax.swing.JFrame {

    /**
     * Creates new form returnframe
     */
    public issuer() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trid = new javax.swing.JTextField();
        tprofid = new javax.swing.JTextField();
        tssn = new javax.swing.JTextField();
        tperiod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tdate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/return.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Room");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/back (1).jpg"))); // NOI18N
        jButton1.setMinimumSize(new java.awt.Dimension(80, 59));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/ssaavvee.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 240, 50));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Room ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Professor ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Professor SSN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Period");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        trid.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        trid.setMinimumSize(new java.awt.Dimension(7, 24));
        trid.setPreferredSize(new java.awt.Dimension(7, 24));
        trid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tridActionPerformed(evt);
            }
        });
        getContentPane().add(trid, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 320, 40));

        tprofid.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tprofid.setMinimumSize(new java.awt.Dimension(7, 24));
        getContentPane().add(tprofid, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 320, 40));

        tssn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tssn.setMinimumSize(new java.awt.Dimension(7, 24));
        getContentPane().add(tssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 320, 40));

        tperiod.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tperiod.setMinimumSize(new java.awt.Dimension(7, 24));
        getContentPane().add(tperiod, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 320, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel7.setText("ISSUE A ROOM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 320, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/issue room.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 520, 210, 180));

        tdate.setDateFormatString("dd/MM/yyyy");
        tdate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 320, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_package/return.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        setBounds(0, 0, 1380, 806);
    }// </editor-fold>//GEN-END:initComponents

    private void tridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tridActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Login.ho.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");      
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url,user,password, rid,pid,ssn,date,period;
            
            url= "jdbc:oracle:thin:@localhost:1521:xe";
            user="c##library";
            password="123456789";
           
            rid=trid.getText();
            pid=tprofid.getText();
            ssn=tssn.getText();
            date=df.format(tdate.getDate());
            period = tperiod.getText();
          
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt=con.createStatement();   
            
            String sqlstr="insert into issue_room values ("+ rid +","+ ssn+ ","+pid+",TO_DATE('"+date+"', 'DD/MM/YYYY'),"+period+")";
          //  String sqlstr1="insert into person values ("+ ssn +",'"+ fname+ "','"+mname+"','"+lname+"','"+country+"','"+city+"','"+street+"',"+"TO_DATE('"+bd+"', 'DD/MM/YYYY'),'"+gender+"')";
            stmt.execute(sqlstr);
            
            con.setAutoCommit(false);
            con.commit();
            con.close();
            new NoticeWindow( NoticeType.DEFAULT_NOTIFICATION,"Done!",NoticeWindow.LONG_DELAY, NPosition.BOTTOM_RIGHT);
            //JOptionPane.showMessageDialog(null, "Done");
         
        } catch (SQLException ex) {
          new NoticeWindow( NoticeType.DEFAULT_NOTIFICATION,"An error occurred! "+ex.getMessage(),NoticeWindow.LONG_DELAY, NPosition.BOTTOM_RIGHT);
       //   JOptionPane.showMessageDialog(null, ex.getMessage());
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(issuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issuer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JTextField tperiod;
    private javax.swing.JTextField tprofid;
    private javax.swing.JTextField trid;
    private javax.swing.JTextField tssn;
    // End of variables declaration//GEN-END:variables
}