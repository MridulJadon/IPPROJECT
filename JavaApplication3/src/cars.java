/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cars.java
 *
 * Created on 22 Oct, 2019, 12:20:31 PM
 */

/**
 *
 * @author Mridul Jadon
 */
import java.sql.*;
import javax.swing.*;
public class cars extends javax.swing.JFrame {

    /** Creates new form cars */
    public cars() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/767x374_Jaguar-XKR_v2.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)));
        jPanel1.setLayout(null);

        jLabel1.setText("CAR DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(185, 14, 77, 16);

        jLabel2.setText("CAR NUMBER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 188, 76, 16);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(185, 49, 139, 22);

        jLabel3.setText("CAR ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(24, 61, 40, 16);

        jLabel4.setText("ENGINE CAPACITY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(24, 307, 104, 16);

        jLabel5.setText("TYPE OF CAR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(13, 95, 77, 16);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("SEDAN");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(185, 95, 67, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("SUV");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(353, 104, 53, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("MINI/MICRO");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(353, 138, 99, 25);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("BUSINESS CLASS");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(185, 138, 139, 25);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(185, 185, 139, 22);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(185, 220, 216, 22);

        jLabel6.setText("MILAGE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(57, 263, 43, 16);

        jLabel7.setText("YEAR OF MANUFACTURE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(24, 347, 142, 16);

        jLabel8.setText("STATUS");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 396, 48, 16);

        jLabel9.setText("CAR RENTAL RATE");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(24, 449, 108, 16);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(185, 260, 139, 22);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(185, 304, 139, 22);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(185, 347, 139, 22);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(185, 393, 139, 22);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(13, 1, 110, 25);

        jButton3.setText("FIND");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(360, 50, 100, 25);

        jLabel10.setText("CAR NAME");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(39, 223, 61, 16);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(185, 446, 139, 22);

        jLabel11.setText("QUANTITY");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(38, 486, 60, 16);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(185, 486, 139, 22);

        jLabel12.setText("PRICE");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(64, 534, 34, 16);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(185, 526, 139, 22);

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(199, 580, 120, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                new staff().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Connection conn;
            Statement st;
            ResultSet rset;
                try{
                    Class.forName("java.sql.DriverManager");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/das autos","root","12345");
                    st=conn.createStatement();
                    if(jRadioButton1.isSelected())
                    {
                        String SQL ="SELECT * FROM car_sedan WHERE CAR_ID = "+"'"+jTextField1.getText()+"'";
                    rset = st.executeQuery(SQL);
                    if(rset.next()){
                        jTextField2.setText(rset.getString("CAR_NO"));
                        jTextField3.setText(rset.getString("CAR_NAME"));
                        jTextField4.setText(rset.getString("MILAGE"));
                       jTextField5.setText(rset.getString("ENGINE_CAP"));
                        jTextField10.setText(rset.getString("PRICE"));
                         jTextField6.setText(rset.getString("YEAR_MNFCTRE"));
                          jTextField7.setText(rset.getString("STAT_US"));
                           jTextField8.setText(rset.getString("CAR_RENTAL_RATE"));
                            jTextField9.setText(rset.getString("QUANTITY"));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"CUSTOMER NOT FOUND");
                    rset.close();
                    st.close();
                    conn.close();
                }
 else if(jRadioButton2.isSelected())
                    {
                        String SQL ="SELECT * FROM car_suv WHERE CAR_ID = "+"'"+jTextField1.getText()+"'";
                    rset = st.executeQuery(SQL);
                    if(rset.next()){
                        jTextField2.setText(rset.getString("CAR_NO"));
                        jTextField3.setText(rset.getString("CAR_NAME"));
                        jTextField4.setText(rset.getString("MILAGE"));
                       jTextField5.setText(rset.getString("ENGINE_CAP"));
                        jTextField10.setText(rset.getString("PRICE"));
                         jTextField6.setText(rset.getString("YEAR_MNFCTRE"));
                          jTextField7.setText(rset.getString("STAT_US"));
                           jTextField8.setText(rset.getString("CAR_RENTAL_RATE"));
                            jTextField9.setText(rset.getString("QUANTITY"));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"CUSTOMER NOT FOUND");
                    rset.close();
                    st.close();
                    conn.close();

        }
 else if (jRadioButton3.isSelected())
                    {
                        String SQL ="SELECT * FROM car_micro WHERE CAR_ID = "+"'"+jTextField1.getText()+"'";
                    rset = st.executeQuery(SQL);
                    if(rset.next()){
                        jTextField2.setText(rset.getString("CAR_NO"));
                        jTextField3.setText(rset.getString("CAR_NAME"));
                        jTextField4.setText(rset.getString("MILAGE"));
                       jTextField5.setText(rset.getString("ENGINE_CAP"));
                        jTextField10.setText(rset.getString("PRICE"));
                         jTextField6.setText(rset.getString("YEAR_MNFCTRE"));
                          jTextField7.setText(rset.getString("STAT_US"));
                           jTextField8.setText(rset.getString("CAR_RENTAL_RATE"));
                            jTextField9.setText(rset.getString("QUANTITY"));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"CUSTOMER NOT FOUND");
                    rset.close();
                    st.close();
                    conn.close();
                }
 else if(jRadioButton4.isSelected()){
                        String SQL ="SELECT * FROM car_business_class WHERE CAR_ID = "+"'"+jTextField1.getText()+"'";
                    rset = st.executeQuery(SQL);
                    if(rset.next()){
                        jTextField2.setText(rset.getString("CAR_NO"));
                        jTextField3.setText(rset.getString("CAR_NAME"));
                        jTextField4.setText(rset.getString("MILAGE"));
                       jTextField5.setText(rset.getString("ENGINE_CAP"));
                        jTextField10.setText(rset.getString("PRICE"));
                         jTextField6.setText(rset.getString("YEAR_MNFCTRE"));
                          jTextField7.setText(rset.getString("STAT_US"));
                           jTextField8.setText(rset.getString("CAR_RENTAL_RATE"));
                            jTextField9.setText(rset.getString("QUANTITY"));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"CUSTOMER NOT FOUND");
                    rset.close();
                    st.close();
                    conn.close();
                }
        }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
