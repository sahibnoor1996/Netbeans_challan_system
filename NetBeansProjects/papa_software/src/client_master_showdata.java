
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahibnoorsingh
 */
public class client_master_showdata extends javax.swing.JFrame {
Connection con=null;
        ResultSet rs=null;
        PreparedStatement pst=null; 
    private Object resultset;
    /**
     * Creates new form client_master_showdata
     */
        
        public client_master_showdata() {
        initComponents();
        setLocationRelativeTo(null);
          con= Connect.ConnectDB();
            Get_Data();
      setLocationRelativeTo(null);
    }
        
 private void Get_Data(){
         String sql="Select NAME, ADDRESS,CITY,PHONE,PINCODE,ADD_DATE,REMARKS from client_master";
         try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1_client_master_showdata.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e)
         {
            JOptionPane.showMessageDialog(null, e);
          
}       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_client_master_showdata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1_client_master_showdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1_client_master_showdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_client_master_showdataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_client_master_showdata);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jLabel1.setText("By Name");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

@SuppressWarnings("empty-statement")
    private void jTable1_client_master_showdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_client_master_showdataMouseClicked
        // TODO add your handling code here:
    
        try{
            con=Connect.ConnectDB();
            int row= jTable1_client_master_showdata.getSelectedRow();
            String table_click= jTable1_client_master_showdata.getModel().getValueAt(row, 0).toString();
            String sql="Select * from client_master  =" + table_click + "";   
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                this.hide();
                CLIENT_MASTER frm = new CLIENT_MASTER();
                frm.setVisible(true);
                
            
              
                
             
                
                String add2=rs.getString("NAME");
                frm.jTextFieldNAME.setText(add2);
                
                
             
                
                String add3=rs.getString("ADDRESS");
                frm.jTextArea_ADDRESS.setText(add3);
                
                String add5=rs.getString("CITY");
                frm.jTextField_city.setText(add5);
                
                String add6=rs.getString("PHONE");
                frm.jTextField_phone.setText(add6);
                
                String add7=rs.getString("PINCODE");
                frm.jTextField_pincode.setText(add7);
                
             
      
                frm.add_date.setDate(rs.getDate("ADD_DATE"));  /// getting exception from here
               
               
              
               
               
                String add11=rs.getString("REMARKS");
                frm.jTextArea_remarks.setText(add11);
                
               
     
              
        
                
                
                
                frm.jButton_Update.setEnabled(true);
                frm.Delete.setEnabled(true);
                frm.jButtonsave.setEnabled(false);
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
        

        
        
    }//GEN-LAST:event_jTable1_client_master_showdataMouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
         if(txtsearch.getText().length()>0)
        {
         try
                {
                      
                       String sql="Select * from client_master where NAME  LIKE '%"+txtsearch.getText()+"%'";
                             
                      pst=(PreparedStatement) con.prepareStatement(sql);
    
                     rs=pst.executeQuery();
                 jTable1_client_master_showdata.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(rootPane, e);
                }
    
        }
        else
        {
        Get_Data();
        }
        
        
    }//GEN-LAST:event_txtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(client_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client_master_showdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1_client_master_showdata;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
