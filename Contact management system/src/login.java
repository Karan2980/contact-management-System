/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author gloriamadhri
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    Connection conn;
    public login() {
        conn = DB.dbconnect();
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

        jPanel1 = new javax.swing.JPanel();
        LLogin = new javax.swing.JLabel();
        Tuser = new javax.swing.JTextField();
        Lpas = new javax.swing.JLabel();
        Luser = new javax.swing.JLabel();
        ppas = new javax.swing.JPasswordField();
        Blogin = new javax.swing.JButton();
        Bregister1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LLogin.setBackground(new java.awt.Color(50, 90, 146));
        LLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LLogin.setForeground(new java.awt.Color(50, 90, 146));
        LLogin.setText("LOGIN PAGE");
        jPanel1.add(LLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 58));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        Tuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TuserActionPerformed(evt);
            }
        });
        getContentPane().add(Tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 136, 129, 40));

        Lpas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Lpas.setText("PASSWORD");
        getContentPane().add(Lpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 35));

        Luser.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Luser.setText("USERNAME");
        getContentPane().add(Luser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 30));

        ppas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppasActionPerformed(evt);
            }
        });
        getContentPane().add(ppas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 130, 40));

        Blogin.setBackground(new java.awt.Color(50, 90, 146));
        Blogin.setText("Login");
        Blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloginActionPerformed(evt);
            }
        });
        getContentPane().add(Blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        Bregister1.setBackground(new java.awt.Color(50, 90, 146));
        Bregister1.setText("Register");
        Bregister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bregister1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bregister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TuserActionPerformed
        String user = Tuser.getText();
            
            
    }//GEN-LAST:event_TuserActionPerformed

    private void BloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloginActionPerformed
        try {
            // TODO add your handling code here:
            String user = Tuser.getText();
            String Pass = ppas.getText();
            String sql = "select * from regi where userid=? and pass=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, Pass);
            ResultSet rs = pst.executeQuery();
     
            if(Tuser.getText().isEmpty() && ppas.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "It is empty please enter the data");
            }
            else
            {
                if(rs.next()){
                JOptionPane.showMessageDialog(null, "username and password is matched");
                view1 v = new view1();
                v.setVisible(true);
                }
                else{
                    Tuser.setText("");
               ppas.setText("");
                JOptionPane.showMessageDialog(null, "username and password is not matched");
               
                
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_BloginActionPerformed

    private void ppasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppasActionPerformed
        // TODO add your handling code here:
         String Pass = ppas.getText();
    }//GEN-LAST:event_ppasActionPerformed

    private void Bregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bregister1ActionPerformed
        // TODO add your handling code here:
        Reg obj = new Reg();
        obj.setVisible(true);
    }//GEN-LAST:event_Bregister1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blogin;
    private javax.swing.JButton Bregister1;
    private javax.swing.JLabel LLogin;
    private javax.swing.JLabel Lpas;
    private javax.swing.JLabel Luser;
    private javax.swing.JTextField Tuser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField ppas;
    // End of variables declaration//GEN-END:variables
}
