
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
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
public class item_master_showdata extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form item_master_showdata
     */
    public item_master_showdata() {
        initComponents();
         setLocationRelativeTo(null);
        Get_Data();
    }

    
     
     private void Get_Data(){
          con=Connect.ConnectDB();
         String sql="Select * from ITEM_MASTER";
         try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1_item_master_Showdata.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_item_master_Showdata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1_item_master_Showdata.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1_item_master_Showdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_item_master_ShowdataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_item_master_Showdata);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

        Txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1_item_master_ShowdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_item_master_ShowdataMouseClicked
        // TODO add your handling code here:
            
        try{
            con=Connect.ConnectDB();
            int row= jTable1_item_master_Showdata.getSelectedRow();
            String table_click= jTable1_item_master_Showdata.getModel().getValueAt(row, 0).toString();
            String sql="Select 	Item_no,ITEM_NAME from ITEM_MASTER where Item_no ='" + table_click + "  '";   
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                
                this.hide();
               
                Item_Master frm=new Item_Master();
                        frm.setVisible(true);
            
                        String add1=rs.getString("item_name");
                        frm.jTextField_item_name1.setText(add1);
                        
                        String add2=rs.getString("Item_no");
                         frm.jTextField_item_id.setText(add2);
                
             
                frm.jButtonSAVE.setEnabled(true);
                frm.jButton_Delete.setEnabled(true);
                frm.jButtonSAVE.setEnabled(false);

            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
        
    }//GEN-LAST:event_jTable1_item_master_ShowdataMouseClicked

    private void TxtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtsearchKeyReleased
        // TODO add your handling code here:
        if(Txtsearch.getText().length()>0)
        {
         try
                {
                      
                       String sql="select  ITEM_NAME from ITEM_MASTER where  ITEM_NAME  LIKE '%"+Txtsearch.getText()+"%'";
                             
                      pst=(PreparedStatement) con.prepareStatement(sql);
    
                     rs=pst.executeQuery();
                 jTable1_item_master_Showdata.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
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
        
        
        
        
    }//GEN-LAST:event_TxtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(item_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item_master_showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item_master_showdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txtsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1_item_master_Showdata;
    // End of variables declaration//GEN-END:variables
}
