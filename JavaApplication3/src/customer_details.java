/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * customer_details.java
 *
 * Created on 23 Oct, 2019, 10:51:20 AM
 */

/**
 *
 * @author Mridul Jadon
 */
import java.sql.*;
import javax.swing.*;
public class customer_details extends javax.swing.JFrame {

    /** Creates new form customer_details */
    public customer_details() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18));
        jLabel1.setText("CUSTOMER DETAILS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(147, 15, 185, 24);

        jLabel3.setText("Customer ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(39, 100, 71, 16);

        jLabel4.setText("FIRST NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(38, 142, 72, 16);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(38, 161, 0, 0);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(38, 161, 0, 0);

        jLabel7.setText("Gender");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(38, 244, 41, 16);

        jLabel8.setText("Aadhar No.");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(38, 283, 64, 31);

        jLabel9.setText("Email ID");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(38, 335, 47, 16);

        jLabel10.setText("Phone No.");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(38, 372, 58, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(121, 97, 83, 22);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(121, 139, 105, 22);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(121, 287, 326, 22);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(121, 332, 208, 22);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(121, 372, 87, 22);

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(244, 96, 57, 25);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(145, 435, 90, 25);

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(1, 1, 63, 25);

        jLabel11.setText("LAST NAME");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(38, 190, 67, 16);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(121, 187, 105, 22);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MALE");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(121, 240, 59, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FEMALE");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(208, 240, 73, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("OTHERS");
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(299, 240, 77, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      Connection conn;
            Statement st;
            ResultSet rset;
                try{
                    Class.forName("java.sql.DriverManager");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/das autos","root","12345");
                    st=conn.createStatement();
                    String SQL ="SELECT * FROM customer_details WHERE CUSTOMER_ID = "+"'"+jTextField1.getText()+"'";
                    rset = st.executeQuery(SQL);
                    if(rset.next()){
                        jTextField2.setText(rset.getString("FIRST_NAME"));
                        jTextField3.setText(rset.getString("LAST_NAME"));
                        jTextField4.setText(rset.getString("AADHAR_NUMBER"));
                       String a=(rset.getString("GENDER"));
                        {
                       if(a.equals("MALE"))
                       {
                          jRadioButton1.setSelected(true);
                       }
 if(a.equals("FEMALE"))
 {
     jRadioButton2.setSelected(true);
 }
 if(a.equals("OTHERS"))
 {
     jRadioButton3.setSelected(true);
 }
                        }

                       jTextField5.setText(rset.getString("EMAIL_ID"));
                        jTextField6.setText(rset.getString("PHONE_NUMBER"));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"CUSTOMER NOT FOUND");
                    rset.close();
                    st.close();
                    conn.close();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }



           
            

}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        buttonGroup1.clearSelection();
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField3.setText("");
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new admin_lot().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
