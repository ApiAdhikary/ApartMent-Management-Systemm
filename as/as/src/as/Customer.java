/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;
import javax.swing.*;    
import java.awt.event.*;  
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.HashMap;
/**
 *
 * @author User
 */
public class Customer extends javax.swing.JFrame {
 Connection dbcon = null;
    PreparedStatement pst = null;
    /**
    JLabel JL_fname,JL_lname,JL_age,JL_id;
    JTextField JT_fname,JT_lname,JT_age,JT_id;
    JButton btn_search;

      public Work(){
          super("Search");
          JL_id = new JLabel("Enter ID:");
          JL_id.setBounds(20, 20, 200, 20);
          JT_id = new JTextField(20);
          JT_id.setBounds(130, 20, 150, 20);
          btn_search = new JButton("Search");
          btn_search.setBounds(300, 20, 80, 20);
          btn_search.addActionListener(this);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          setSize(500,200);
          
          JL_fname = new JLabel("Fname: ");
          JL_fname.setBounds(20, 50, 100, 20);
          JT_fname = new JTextField(20);
          JT_fname.setBounds(130, 50, 150, 20);
          JL_lname = new JLabel("Lname: ");
          JL_lname.setBounds(20, 80, 100, 20);
          JT_lname = new JTextField(20);
          JT_lname.setBounds(130, 80, 150, 20);
          JL_age = new JLabel("Age: ");
          JL_age.setBounds(20, 110, 100, 20);
          JT_age = new JTextField(20);
          JT_age.setBounds(130, 110, 150, 20);
          setLayout(null);
          add(btn_search);
          add(JL_fname);
          add(JT_fname);
          add(JL_lname);
          add(JT_lname);
          add(JL_age);
          add(JT_age);
          add(JL_id);
          add(JT_id);
    }
     */
    public Customer() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ams?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        customer_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer_1 c");
        customer_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customer_1Query.getResultList();
        customer_1Query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer_1 c");
        customer_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customer_1Query1.getResultList();
        customer_1Query2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer_1 c");
        customer_1List2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customer_1Query2.getResultList();
        customer_1Query3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer_1 c");
        customer_1List3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customer_1Query3.getResultList();
        customer_1Query4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer_1 c");
        customer_1List4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customer_1Query4.getResultList();
        customer_1Query5 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer_1 c");
        customer_1List5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customer_1Query5.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Deposit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        joindate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        show = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Customer Details");

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\download.png")); // NOI18N
        jButton5.setText("jButton5");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Log Out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jButton1)
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room No");

        Deposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Deposit.setForeground(new java.awt.Color(255, 255, 255));
        Deposit.setText("Deposit");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Join Date");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Room Type");

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, customer_1List5, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${price}"));
        columnBinding.setColumnName("Price");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${roomno}"));
        columnBinding.setColumnName("Roomno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${roomtype}"));
        columnBinding.setColumnName("Roomtype");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${joindate}"));
        columnBinding.setColumnName("Joindate");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(Deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(roomno)
                            .addComponent(phone)
                            .addComponent(price)
                            .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(roomtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(show, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(joindate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(657, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(52, 52, 52)
                .addComponent(jButton4)
                .addGap(256, 256, 256))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deposit)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(show)
                                    .addComponent(jButton2))
                                .addGap(9, 9, 9)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete))
                            .addComponent(joindate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        String n = name.getText();
        String phn = phone.getText();
        String addr = address.getText();
        String dp = price.getText();
        String jn = joindate.getText();
        String rm = roomno.getText();
        String ty =(String)roomtype.getSelectedItem();
       
            userCustomer(n,phn,addr,dp,jn,rm,ty);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Customer cs = new Customer();
        cs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Home hm = new Home();
       hm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    Login ln = new Login();
        ln.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try{
             // String qu = "UPDATE `room` SET `price`='"+name.getText()+"','"+phone.getText()+"','"+address.getText()+"','"+price.getText()+"',`type`='"+(String)type.getSelectedItem()+"',`avail`='"+(String)ro.getSelectedItem()+"' WHERE `roomno`=?";
       //  String qu = "UPDATE `customer` SET name=?,phone=?,address=?,price=?,joindate=?,roomno=?,roomtype=? WHERE `phone`=?";
          String qu = "UPDATE `customer` SET `name`='"+name.getText()+"',`phone`='"+phone.getText()+"',`address`='"+address.getText()+"',`price`='"+price.getText()+"',`joindate`='"+joindate.getText()+"',`roomno`='"+roomno.getText()+"',`roomtype`='"+(String)roomtype.getSelectedItem()+"' WHERE `phone`=? ";
       dbcon = DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "");
       pst = dbcon.prepareStatement(qu);
     //  pst.setString(1,name.getText());
        pst.setString(1,phone.getText());
      //   pst.setString(3,address.getText());
      //   pst.setString(4,price.getText());
        //  pst.setString(5,joindate.getText());
        // pst.setString(6,roomno.getText());
     // pst.setString(7,(String)roomtype.getSelectedItem());
          
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "Updated Successfully."); 
       
      }catch(SQLException  ex){
          
           JOptionPane.showMessageDialog(null, "ex");
      }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       try{ 
         String Qu = "DELETE FROM `customer` WHERE phone =?";
          dbcon = DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "");
         pst = dbcon.prepareStatement(Qu);
         pst.setString(1,phone.getText());
         pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "Deleted Successfully."); 
     }catch(SQLException  ex)
     {
          JOptionPane.showMessageDialog(null, "ex");
     }
    }//GEN-LAST:event_deleteActionPerformed
    public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/ams","root","");
           ps = con.prepareStatement("select * from customer where phone = ?");
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
       
   }
    
    //@Override
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
  
        Function f = new Function();
    ResultSet rs = null;
 
    String ln = "name";
    String ag = "address";
      String g = "price";
        String a = "joindate";
          String gg = "roomno";
          String ty = "roomtype";
          String phn = "phone";
    rs = f.find(phone.getText());
    try{
      if(rs.next()){
     
            name.setText(rs.getString("name"));
              phone.setText(rs.getString("phone"));
            address.setText(rs.getString("address"));
            price.setText(rs.getString("price"));
            joindate.setText(rs.getString("joindate"));
             roomno.setText(rs.getString("roomno"));
             roomtype.setSelectedItem(rs.getString("roomtype"));
      }  else{
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
        
        
    }//GEN-LAST:event_showActionPerformed
/*
 *  public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/test_db","root","");
           ps = con.prepareStatement("select * from users where id = ?");
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
       
   }
 * 
 */
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }
 private void userCustomer( String n, String phn, String addr, String dp, String jn, String rm, String ty) {
        Connection dbcon = DBConnection.connectDB();
        if(dbcon != null){
        try {
            PreparedStatement st = (PreparedStatement)    
                    dbcon.prepareStatement("INSERT INTO customer (name,phone,address,price,joindate,roomno,roomtype) VALUES(?,?,?,?,?,?,?)");
            
            
            
       
            st.setString(1, n);
            st.setString(2, phn);
            st.setString(3, addr);
            st.setString(4, dp);
            st.setString(5, jn);
            st.setString(6, rm);
            st.setString(7, ty);
            
            int rs = st.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Submited Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            
          
            name.setText("");
            phone.setText("");
            address.setText("");
            price.setText("");
            joindate.setText("");
             roomno.setText("");

            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }
        }else{
           System.out.println("The connection is not available");
        }
    }

    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Deposit;
    private javax.swing.JTextField address;
    private java.util.List<as.Customer_1> customer_1List;
    private java.util.List<as.Customer_1> customer_1List1;
    private java.util.List<as.Customer_1> customer_1List2;
    private java.util.List<as.Customer_1> customer_1List3;
    private java.util.List<as.Customer_1> customer_1List4;
    private java.util.List<as.Customer_1> customer_1List5;
    private javax.persistence.Query customer_1Query;
    private javax.persistence.Query customer_1Query1;
    private javax.persistence.Query customer_1Query2;
    private javax.persistence.Query customer_1Query3;
    private javax.persistence.Query customer_1Query4;
    private javax.persistence.Query customer_1Query5;
    private javax.swing.JButton delete;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField joindate;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField price;
    private javax.swing.JTextField roomno;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JButton show;
    private javax.swing.JButton update;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
