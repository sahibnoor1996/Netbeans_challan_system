


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.value;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahibnoorsingh
 */
public class NEW_CHALLAN_REDESIGNED extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
static int i=1;
    /**
     * Creates new form NEW_CHALLAN_REDESIGNED
     */
    public NEW_CHALLAN_REDESIGNED() {
        initComponents();
         fillcombo();
         fillcombo_item();
         setLocationRelativeTo(null);
         reset();
         add_more_items.setEnabled(false);
         jDateChooser_item.setDate(new Date());
         AutoCompleteDecorator.decorate(jComboBox_PNAME);
         AutoCompleteDecorator.decorate(jComboBox_INAME);
    }

    
private void Get_Data()
    {
             con=Connect.ConnectDB();
          try{
              String sql;
              
        
                  sql= "select new_Challan_details.u_no as 'S NO.',new_Challan_details.item_name as 'Item Name',new_Challan_details.serial_no as 'Serial No',new_Challan_details.quantity as 'Quantity',new_Challan_details.price as 'Price',new_Challan_details.item_date as 'Item Date',new_Challan_details.Remarks as 'Remarks' from new_Challan_details,new_challan where new_challan.challan_no='" + jTextField_challan.getText() +"' AND   new_challan_details.challan_no='" +jTextField_challan.getText()+ "'  ";
                         
                  
                  rs= pst.executeQuery(sql);
                 jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                 }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
   
    

 private void reset_after_deleterow()
    {
        
     
        
        jComboBox_INAME.setSelectedIndex(0);
        jTextField_SERIAL_NO.setText("");
        jTextField_QUANTITY.setText("");
        jTextField_PRICE.setText("");
        jDateChooser_item.setDate(null);
        jTextField_ivalue.setText("");
        
    }

    private void fill()
        {
              
           
            jTextField_ivalue.setText(Integer.toString(i));
            i++;
            
              
         
        }
        
        
        
        
    private void fillcombo()
{
     try{
      
   con=Connect.ConnectDB();
   
   
       String sql= "select NAME FROM client_master ";
      pst=con.prepareStatement(sql);
      rs=pst.executeQuery();
      while(rs.next()){
          
          String add=rs.getString("NAME");
          jComboBox_PNAME.addItem(add);
         
       
                  
          
         }
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
     
}  
     
  
     
      
      
      
      
        private void fillcombo_item()
{
     try{
      
   con=Connect.ConnectDB();
   
   
       String sql= "select * FROM ITEM_MASTER ";
      pst=con.prepareStatement(sql);
      rs=pst.executeQuery();
      while(rs.next()){
          
          String add=rs.getString("ITEM_NAME");
          jComboBox_INAME.addItem(add);
                        }
        
     }
     
     catch(HeadlessException | SQLException ex)
     {
           JOptionPane.showMessageDialog(this,ex); 
           
     
      }
}
        
        
        
          private void reset() 
    {
    
    jComboBox_PNAME.setSelectedIndex(0); 
    jTextFieldPARTY_CITY.setText("");
    jTextField_address.setText("");
    jComboBox_INAME.setSelectedIndex(0);
    jTextField_SERIAL_NO.setText("");
    jTextField_QUANTITY.setText("");
    jTextField_PRICE.setText("");
    jDateChooser_challan.setDate(new Date());
    
  
    jTextField_challan.setText("");

    jTable1.setModel(new DefaultTableModel());
   jButton_additem.setEnabled(true);
   add_more_items.setEnabled(false);
   jTextField_ivalue.setText("");
    
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
        jLabel2 = new javax.swing.JLabel();
        jTextField_challan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPARTY_CITY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_SERIAL_NO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_QUANTITY = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_PRICE = new javax.swing.JTextField();
        add_more_items = new javax.swing.JButton();
        jComboBox_INAME = new javax.swing.JComboBox();
        jButton_additem = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser_item = new com.toedter.calendar.JDateChooser();
        jLabel_item_shortcut = new javax.swing.JLabel();
        jTextField_ivalue = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_new = new javax.swing.JButton();
        jButton_show_challans = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jComboBox_PNAME = new javax.swing.JComboBox();
        jButton_new1 = new javax.swing.JButton();
        jDateChooser_challan = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_remarks = new javax.swing.JTextArea();
        jButton_Delete = new javax.swing.JButton();
        delete_row = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Challan No.");

        jTextField_challan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_challan.setEnabled(false);
        jTextField_challan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_challanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Party Name");

        jTextField_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_address.setEnabled(false);
        jTextField_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_addressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText(" City");

        jTextFieldPARTY_CITY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPARTY_CITY.setEnabled(false);
        jTextFieldPARTY_CITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPARTY_CITYActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Item Name");

        jLabel6.setText("Serial No");

        jLabel9.setText("Quantity");

        jTextField_QUANTITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_QUANTITYActionPerformed(evt);
            }
        });

        jLabel10.setText("Price");

        add_more_items.setText("Add More Items");
        add_more_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_more_itemsMouseClicked(evt);
            }
        });

        jComboBox_INAME.setEditable(true);
        jComboBox_INAME.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Select-------" }));
        jComboBox_INAME.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_INAMEItemStateChanged(evt);
            }
        });
        jComboBox_INAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox_INAMEKeyReleased(evt);
            }
        });

        jButton_additem.setText("Add Item");
        jButton_additem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_additemMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Item Date");

        jLabel_item_shortcut.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_item_shortcut.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_item_shortcut.setText("....");
        jLabel_item_shortcut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_item_shortcut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_item_shortcut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_item_shortcutMouseClicked(evt);
            }
        });

        jLabel14.setText("S.no");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_ivalue, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jComboBox_INAME, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_item_shortcut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField_SERIAL_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField_QUANTITY, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46)))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jDateChooser_item, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton_additem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add_more_items, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_more_items)
                        .addComponent(jButton_additem))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_SERIAL_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_QUANTITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_item_shortcut, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_INAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_ivalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Challan System");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_new.setText("New Challan");
        jButton_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_newMouseClicked(evt);
            }
        });

        jButton_show_challans.setText("Show Challans");
        jButton_show_challans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_show_challansMouseClicked(evt);
            }
        });

        jButton_update.setText("Edit Data");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jComboBox_PNAME.setEditable(true);
        jComboBox_PNAME.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------Select-------" }));
        jComboBox_PNAME.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_PNAMEItemStateChanged(evt);
            }
        });
        jComboBox_PNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox_PNAMEKeyReleased(evt);
            }
        });

        jButton_new1.setText("PRINT");
        jButton_new1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_new1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Challan Date");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Remarks");

        jTextArea_remarks.setColumns(20);
        jTextArea_remarks.setRows(5);
        jScrollPane2.setViewportView(jTextArea_remarks);

        jButton_Delete.setText("Delete Challan");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        delete_row.setText("Delete Row");
        delete_row.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_rowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_challan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_challan, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_PNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPARTY_CITY, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton_new)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_show_challans)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_new1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton_Delete)
                        .addGap(18, 18, 18)
                        .addComponent(delete_row)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_challan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPARTY_CITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jComboBox_PNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_challan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_new)
                    .addComponent(jButton_show_challans)
                    .addComponent(jButton_update)
                    .addComponent(jButton_new1)
                    .addComponent(jButton_Delete)
                    .addComponent(delete_row))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("DCADS MARKETING PVT LTD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_addressActionPerformed

    private void jTextFieldPARTY_CITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPARTY_CITYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPARTY_CITYActionPerformed

    private void jComboBox_PNAMEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_PNAMEItemStateChanged
        // TODO add your handling code here:
         try {
       
            
        String NameVal = jComboBox_PNAME.getSelectedItem().toString(); 
        rs = pst.executeQuery("select ADDRESS,CITY from client_master where NAME='"+NameVal+"'");
               rs.next();
                
                
               
        String address=rs.getString("ADDRESS");
        jTextField_address.setText(address);
         
        String city=rs.getString("CITY");
        jTextFieldPARTY_CITY.setText(city);
                     
                     
                     // con.close();
 //con=re.getCon();

        } 
         catch (SQLException ex) {
  
           ex.printStackTrace();
                
         }
                                      
        
        
        
    }//GEN-LAST:event_jComboBox_PNAMEItemStateChanged

    private void jComboBox_PNAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_PNAMEKeyReleased
        // TODO add your handling code here:
        
  


        
    }//GEN-LAST:event_jComboBox_PNAMEKeyReleased

    private void jComboBox_INAMEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_INAMEItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_INAMEItemStateChanged

    private void jComboBox_INAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_INAMEKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_INAMEKeyReleased

    private void jButton_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_newMouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton_newMouseClicked

    private void jButton_new1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_new1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_new1MouseClicked

    private void jButton_additemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_additemMouseClicked
        // TODO add your handling code here:
         try
         {
            con=Connect.ConnectDB();
             
            
            
           PreparedStatement ps=con.prepareStatement("INSERT INTO new_challan(Party_Name,party_city,Address,challan_date)"
                    +"values(?,?,?,?)");
        
                          

                
                ps.setString(1, (String) jComboBox_PNAME.getSelectedItem());
                
                ps.setString(2, jTextFieldPARTY_CITY.getText());
                   
               
                
                ps.setString(3, jTextField_address.getText());
                
            SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                     String addDate=dateFormat.format(jDateChooser_challan.getDate());
                     ps.setString(4, addDate);
                   
             
                     
                     
                         
                          
                          ps.executeUpdate();
                          fill();
              
               //  PreparedStatement ps1=con.prepareStatement("select @challan_no= SCOPE_IDENTITY()");


            String sql1= "SELECT MAX(challan_no) from new_challan";
            pst=con.prepareStatement(sql1);
            rs=  pst.executeQuery();
            boolean next = rs.next();
      
            String add=rs.getString(1);
                      
            jTextField_challan.setText(add);  
            
            
            
               
               
    /*  String sql= "SELECT LAST_INSERT_ID() INTO new_challan ";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
       
              String add=rs.getString("challan_no");
                      
              jTextField_challan.setText(add);  
              System.out.println(add);
             
            }
            
      */ 
    
           
         
                PreparedStatement pst=con.prepareStatement("INSERT INTO new_challan_details(challan_no,u_no,Item_name,Serial_no,Quantity,Price,item_date,Remarks)"
                    +"values(?,?,?,?,?,?,?,?)");
          
                      
                 
                     pst.setString(1,jTextField_challan.getText());
                     pst.setString(2,jTextField_ivalue.getText());
                     pst.setString(3, (String) jComboBox_INAME.getSelectedItem());
               
                     pst.setString(4, jTextField_SERIAL_NO.getText());
                     pst.setString(5 , jTextField_QUANTITY.getText());
              
                     pst.setString(6,jTextField_PRICE.getText());
                      
                        
                     SimpleDateFormat  dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
                      String addDate1=dateFormat1.format(jDateChooser_item.getDate());
                     pst.setString(7, addDate1);
                          
                     pst.setString(8,jTextArea_remarks.getText());
                     
                        pst.executeUpdate();
                     
               
                      
                      
               
             Get_Data();

             fill();
             
             JOptionPane.showMessageDialog(null,"Item Added Successfully");
            
             jButton_additem.setEnabled(false);
             add_more_items.setEnabled(true);
            //     Get_Data();
            
           
         //     JOptionPane.showMessageDialog(this,"Successfully added","Item",JOptionPane.INFORMATION_MESSAGE);
           
         
         } 
        
         
       
         
        
     
              

                 
          
                        
            
            
            
        //    pst=con.prepareStatement(sql);
          //  pst.execute();
         
            
           
        
                   
                 
              catch(HeadlessException | SQLException ex)
                 {
                         JOptionPane.showMessageDialog(this,ex);
                 }
         
         
        
    }//GEN-LAST:event_jButton_additemMouseClicked

    private void add_more_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_more_itemsMouseClicked
        // TODO add your handling code here:
        try{
            
              String sql1= "SELECT MAX(challan_no) from new_challan";
            pst=con.prepareStatement(sql1);
            rs=  pst.executeQuery();
            boolean next = rs.next();
      
            String add=rs.getString(1);
                      
            jTextField_challan.setText(add);  
           // System.out.println(add);
            
            
            
            
        PreparedStatement pst=con.prepareStatement("INSERT INTO new_challan_details(challan_no,u_no,Item_name,Serial_no,Quantity,Price,item_date)"
                    +"values(?,?,?,?,?,?,?)");
          
                      
                 
                     pst.setString(1,jTextField_challan.getText());
                     pst.setString(2,jTextField_ivalue.getText());
                     pst.setString(3, (String) jComboBox_INAME.getSelectedItem());
               
                     pst.setString(4, jTextField_SERIAL_NO.getText());
                     pst.setString(5 , jTextField_QUANTITY.getText());
              
                     pst.setString(6,jTextField_PRICE.getText());
                            
                     SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                     String addDate=dateFormat.format(jDateChooser_item.getDate());
                     pst.setString(7, addDate);
                  
                     
           
        
                     
                          
                          
                          pst.executeUpdate();
                     
                     
         
                      
             
fill();
               
            
            jButton_additem.setEnabled(false);
             add_more_items.setEnabled(true);
               
             
             Get_Data();
            
            
        //    pst=con.prepareStatement(sql);
          //  pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully added","Item",JOptionPane.INFORMATION_MESSAGE);
            
           
        }
                   
                 
              catch(HeadlessException | SQLException ex)
                 {
                         JOptionPane.showMessageDialog(this,ex);
                 }
                                             
        
        
        
        
        
    }//GEN-LAST:event_add_more_itemsMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    /*  try{
      con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
            String sql= "select Item_name,Serial_no,Quantity,Price,item_date from new_challan_details where item_name ='" +table_click  + "'  ";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next())
            
            {
                String add1=rs.getString("Item_name");
                jComboBox_INAME.setSelectedItem(add1);
                
                String add2=rs.getString("Serial_no");
                jTextField_SERIAL_NO.setText(add2);
                
                String add3=rs.getString("Quantity");
                jTextField_QUANTITY.setText(add3);
                
                String add4=rs.getString("Price");
                jTextField_PRICE.setText(add4);
                
               java.sql.Date add5=rs.getDate("item_date");
               jDateChooser_item.setDate(add5);
             
                       
             
            }
      }
*/
    
    
    try
   {
       
          con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            
            
              String add0= jTable1.getModel().getValueAt(row, 0).toString();
             jTextField_ivalue.setText(add0);
            
            String add= jTable1.getModel().getValueAt(row, 1).toString();
            jComboBox_INAME.setSelectedItem(add);
            
            String add1= jTable1.getModel().getValueAt(row, 2).toString();
            jTextField_SERIAL_NO.setText(add1);  
            
            String add2= jTable1.getModel().getValueAt(row, 3).toString();
            jTextField_QUANTITY.setText(add2);
            
            String add3= jTable1.getModel().getValueAt(row, 4).toString();
            jTextField_PRICE.setText(add3);
            
            
            
            
            
          //  String add4=jTable1.getModel().getValueAt(row,4).toString();
            
           // String add4= jTable1.getModel().getValueAt(row, 4).toString()
           
          //  SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd");
           // String addDate=dateFormat.format(jDateChooser_item.getDate());
            
            
           
           /*
                     SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                     String addDate=dateFormat.format((Date) jTable1.getModel().getValueAt(row, 4));
                     
                     jDateChooser_item.setDate(addDate);
                      
            */          
           
 
      //  jDateChooser_item.setDate((java.util.Date) jTable1.getValueAt(jTable1.getSelectedRow(),4));
      
      
        // SimpleDateFormat  DateFormat=new SimpleDateFormat(yyyy-MM-dd");
         
         //  java.lang.String d1=  (String) jTable1.getModel().getValueAt(row,4);
           
       /*   String add4= jTable1.getModel().getValueAt(row, 4).toString();
          
            jDateChooser_item.setDate((java.util.Date); 
         
         
         
         jDateChooser_item.setDate((java.util.Date) jTable1.getValueAt(row,4));
    
   */
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
     
       
       Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row,4));
       jDateChooser_item.setDate(date);
            
            
              

     
       
      
       
            
            String add5= jTable1.getModel().getValueAt(row, 5).toString();
            jTextArea_remarks.setText(add5);
         
       
       
       
   }
    
    
    
    
    
       catch(Exception ex)
       {
           // JOptionPane.showMessageDialog(this,ex);
       }
         
      
      
               /* java.sql.Date add4=rs.getDate(jTable1.getModel().getValueAt(row, 4).toString());
               jDateChooser_item.setDate(add4);
                
                      java.sql.Date add5=rs.getDate(jTable1.getModel().getValueAt(row, 5).toString());
               jDateChooser_challan.setDate(add5);
               */
                
                
         /*    SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                   String addDate=dateFormat.format(jTable1.getModel().getValueAt(row, 4).toString());
                    jDateChooser_item.setText(addDate);
            
             
             */
  
        
        
   
        
        
        
         
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_challanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_challanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_challanActionPerformed

    private void jButton_show_challansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_show_challansMouseClicked
        // TODO add your handling code here:
        
        show_Challans obj1=new show_Challans();
        this.hide();
        obj1.setVisible(true);
    }//GEN-LAST:event_jButton_show_challansMouseClicked

    private void jLabel_item_shortcutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_item_shortcutMouseClicked
        // TODO add your handling code here
       this.hide();
       Item_Master_challan_redesigned obj1=new Item_Master_challan_redesigned();
        obj1.setVisible(true);
    }//GEN-LAST:event_jLabel_item_shortcutMouseClicked

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        // TODO add your handling code here:
        try{
                con=Connect.ConnectDB();

            
                String UpdateQuery = null;
                PreparedStatement ps = null;
        

                    UpdateQuery= "update new_challan INNER JOIN new_challan_details ON new_challan.challan_no = new_challan_details.challan_no "
                            + "set new_challan.party_name=?  , "
                            + "new_challan_details.u_no=? ,"
                            + "new_challan.party_city=? ,"
                            + "new_challan.address=?,"
                            + "new_challan.challan_date=?,"
                            + "new_challan_details.item_name= ?,"
                            + "new_challan_details.Serial_no=?,"
                            + "new_challan_details.Quantity= ?,"
                            + "new_challan_details.Price=?,"
                            + "new_challan_details.item_date=?,"
                            + "new_challan_details.Remarks=? "
                            + "WHERE new_challan.challan_no=? AND  new_challan_details.u_no=?";  
                    
                    ps=con.prepareStatement(UpdateQuery);
                  
                
                
                    ps.setString(1, (java.lang.String) jComboBox_PNAME.getSelectedItem());
                    
                    
               ps.setString(2,jTextField_ivalue.getText());
                ps.setString(3, jTextFieldPARTY_CITY.getText());
                
                ps.setString(4,jTextField_address.getText());
               
            
        
                
                SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                String addDate=dateFormat.format(jDateChooser_challan.getDate());
                ps.setString(5,addDate);
                    
                    
   
                    
                ps.setString(6, (java.lang.String) jComboBox_INAME.getSelectedItem());
                
                ps.setString(7, jTextField_SERIAL_NO.getText());
                ps.setString(8,jTextField_QUANTITY.getText());
                ps.setString(9,jTextField_PRICE.getText());
                    
                
              SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy-MM-dd");
              String addDate2=dateFormat.format(jDateChooser_item.getDate());
              ps.setString(10,addDate2);
              
              
              ps.setString(11,jTextArea_remarks.getText());
              
              ps.setString(12,jTextField_challan.getText());   
              
              ps.setString(13,jTextField_ivalue.getText());
     
            
              ps.executeUpdate();
                    
                       
                    //JOptionPane.showMessageDialog(rootPane, "Update Query: "+ps.toString());
                    
                    Get_Data();
               
                    JOptionPane.showMessageDialog(null,"Edited Successfully");
 
                      
                } 
        catch (SQLException ex) {
                    Logger.getLogger(NEW_CHALLAN_REDESIGNED.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jTextField_QUANTITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_QUANTITYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_QUANTITYActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        
        try{
           
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
                String sql= "delete from new_challan where challan_no = " + jTextField_challan.getText()+ " ";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
                Get_Data();
             }
        
           
        catch(HeadlessException | SQLException ex)
            {
            JOptionPane.showMessageDialog(this,ex);
            }                                            
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void delete_rowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_rowMouseClicked
        // TODO add your handling code here:
        
        try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
              
                String sql= "delete from new_challan_details where challan_no = " + jTextField_challan.getText()+ " AND new_challan_details.u_no="+ jTextField_ivalue.getText() +"";
                pst=con.prepareStatement(sql);
                pst.execute();
              /*   int row = jTable1.getSelectedRows()[0];// returns row position(Here mtt is  name of table)\
               model=(DefaultTableModel)jTable1.getModel();
                   model.removeRow(row);  
                 for(int index=row ;index<model.getRowCount();index++)
                 {
                model.setValueAt(index+1, index, 0); //setValueAt(data,row,column)
                   }
              */  
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                //reset();
                Get_Data();
                reset_after_deleterow();
                Get_Data();
                     
                     
                     
                     
                    //  set @rank = 0;
//   select id, @rank:=@rank+1 from tbl order by id
                     
  
            
            
            
            
            
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }                                            
        
        
    }//GEN-LAST:event_delete_rowMouseClicked

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
            java.util.logging.Logger.getLogger(NEW_CHALLAN_REDESIGNED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEW_CHALLAN_REDESIGNED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEW_CHALLAN_REDESIGNED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEW_CHALLAN_REDESIGNED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEW_CHALLAN_REDESIGNED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_more_items;
    private javax.swing.JButton delete_row;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_additem;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_new1;
    private javax.swing.JButton jButton_show_challans;
    private javax.swing.JButton jButton_update;
    public javax.swing.JComboBox jComboBox_INAME;
    public javax.swing.JComboBox jComboBox_PNAME;
    com.toedter.calendar.JDateChooser jDateChooser_challan;
    com.toedter.calendar.JDateChooser jDateChooser_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_item_shortcut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTable jTable1;
    public javax.swing.JTextArea jTextArea_remarks;
    public javax.swing.JTextField jTextFieldPARTY_CITY;
    javax.swing.JTextField jTextField_PRICE;
    javax.swing.JTextField jTextField_QUANTITY;
    javax.swing.JTextField jTextField_SERIAL_NO;
    javax.swing.JTextField jTextField_address;
    javax.swing.JTextField jTextField_challan;
    private javax.swing.JTextField jTextField_ivalue;
    // End of variables declaration//GEN-END:variables

    private String String(Date d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
