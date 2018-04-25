/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning_sql_server;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Query_Sql extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DefaultTableModel Model;
   ConnectSQL Conn= new ConnectSQL();
   public void Query_dis(String s)throws SQLException
   {
       Conn.Connectdata();
       Conn.Querydata(s);
            String id="";
            String name="";
            String sex="";
            String num="";
            String hometow="";
            String iddepart="";
            String idacademic="";
            Date date;
            String salary="";
            while(Conn.getRs().next())
            {
                id=Conn.getRs().getString(1);
                name= Conn.getRs().getString(2);
                sex=Conn.getRs().getString(9);
                num=Conn.getRs().getString(5);
                hometow= Conn.getRs().getString(4);
                iddepart=Conn.getRs().getString(6);
                idacademic=Conn.getRs().getString(7);
                date=Conn.getRs().getDate(3);
                salary=Conn.getRs().getString(8);
                
                Model.addRow(new Object[]{id,name,date.toString(),sex,hometow,num,iddepart,idacademic,salary});
            }
       
   }
    public void Display() 
    {
        
            
            String stquery="Select* From NhanVien";
            try {
            Query_dis(stquery);
        } catch (SQLException e) {
        }
      
    }
    public Query_Sql() {
        initComponents();
        Model = (DefaultTableModel) jtbresul.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtid = new javax.swing.JTextField();
        jtname = new javax.swing.JTextField();
        jtdate = new javax.swing.JTextField();
        jtnumphone = new javax.swing.JTextField();
        jtsalary = new javax.swing.JTextField();
        jtiddment = new javax.swing.JTextField();
        jthomet = new javax.swing.JTextField();
        cbmale = new javax.swing.JCheckBox();
        cbfemale = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        btquery1 = new javax.swing.JButton();
        btquery2 = new javax.swing.JButton();
        btquery3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtidacademi1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbresul = new javax.swing.JTable();
        jcbtype = new javax.swing.JComboBox<>();
        Arrangement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Sex");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Date of Birth ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Num Phone");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ID Academic Level");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ID Department");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Home Town");

        jtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdateActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbmale);
        cbmale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbmale.setText("Male");

        buttonGroup1.add(cbfemale);
        cbfemale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbfemale.setText("Female");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Employee Data Query On SQL Server");

        btquery1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btquery1.setText("      Delete      ");
        btquery1.setFocusable(false);
        btquery1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btquery1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btquery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btquery1ActionPerformed(evt);
            }
        });

        btquery2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btquery2.setText("Display Data");
        btquery2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btquery2ActionPerformed(evt);
            }
        });

        btquery3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btquery3.setText("      Add     ");
        btquery3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btquery3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("ID Salary Basic");

        jtbresul.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtbresul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Date of Birth ", "Sex", "Home Town", "Num Phone", "ID Department", "ID Academic Level ", "Salay Basic "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbresul.setToolTipText("");
        jScrollPane1.setViewportView(jtbresul);

        jcbtype.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date of Birth", "ID(A-Z)", "Name(A-Z)" }));
        jcbtype.setToolTipText("");
        jcbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtypeActionPerformed(evt);
            }
        });

        Arrangement.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Arrangement.setText("Arrangment");
        Arrangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrangementActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Information Personel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(400, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btquery3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Arrangement, javax.swing.GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btquery1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btquery2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(jtname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtdate, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtnumphone)
                                            .addComponent(jtiddment)
                                            .addComponent(jthomet)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtidacademi1)
                                            .addComponent(jtsalary))))))
                        .addGap(554, 554, 554))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jthomet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtnumphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtiddment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtidacademi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbmale)
                            .addComponent(cbfemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btquery1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(btquery3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Arrangement, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btquery2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btquery2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btquery2ActionPerformed
        int s=Model.getRowCount();
        if(s!=0)
        {
            Model.setNumRows(0);        }
        else
        {
                Display();
        }
    }//GEN-LAST:event_btquery2ActionPerformed

    private void btquery3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btquery3ActionPerformed
        PreparedStatement Pr; 
        String id=jtid.getText();
            String name=jtname.getText();
            int sexnam=0;
            int sexnu=0;
            if(cbfemale.isSelected())
            {
                sexnam=1;
            }
            else
            {
                sexnu=1;
            }
            String num=jtnumphone.getText();
            String hometow=jthomet.getText();
            String iddepart=jtiddment.getText();
            String idacademic=jtidacademi1.getText();
            String salary= jtsalary.getText();
            Date ngay=null;
            try {
            ngay=Date.valueOf(jtdate.getText());
        } catch (Exception e) {
        }
            
            String sq="Insert Into NhanVien(MaNV,HoTen,NgaySinh,QueQuan,SDT,MaPB,MaTDHV,MaLuong,GioiTinh) Values(?,?,?,?,?,?,?,?,?)";
        try {
            Conn.Connectdata();
            Pr= Conn.getCon().prepareStatement(sq);
            Pr.setString(1,id);
            Pr.setString(2,name);
            Pr.setDate(3, ngay);
            Pr.setByte(9,(byte)(sexnam+sexnu));
            Pr.setString(5,num);
            Pr.setString(6,iddepart);
            Pr.setString(7,idacademic);
            Pr.setString(8,salary);
            Pr.setString(4,hometow);
            Pr.executeUpdate();
            JOptionPane.showInternalMessageDialog(rootPane, "Đã Thêm Dữ Liệu");
        } catch (SQLException ex) {
            Logger.getLogger(Query_Sql.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ko the them du lieu he thong bi loi");
        }
          
    }//GEN-LAST:event_btquery3ActionPerformed

    private void btquery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btquery1ActionPerformed
        int sum= jtbresul.getRowCount();
        int index= jtbresul.getSelectedRow();
        String id=(String) Model.getValueAt(index,0);
        JOptionPane.showMessageDialog(rootPane,"Do you want delete :"+id);
        for(int i=0;i<sum;i++)
        {
            if(i==index)
            {
                Model.removeRow(i);
            }
        }
        try {
            Conn.Connectdata();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s="Delete From NhanVien Where MaNV='"+id+"'";
        try {
            Statement stmt= Conn.getCon().createStatement();
            stmt.execute(s);
            JOptionPane.showMessageDialog(rootPane,"Deleted "+id);
        } catch (SQLException ex) {
            Logger.getLogger(Query_Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btquery1ActionPerformed

    private void jcbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtypeActionPerformed
        
    }//GEN-LAST:event_jcbtypeActionPerformed

    private void ArrangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrangementActionPerformed
      
            switch (jcbtype.getSelectedIndex()) {
                case 0:
                    {
                        String s="Select * From NhanVien Order by NgaySinh ASC";
                        try {
                            if(Model.getRowCount()!=0)
                            {
                                Model.setNumRows(0);
                            }
                            else
                            {
                                Query_dis(s);
                            }
                        } catch (SQLException e) {
                        }              break;
                    }
                case 1:
                    {
                        String s="Select * From NhanVien Order By MaNV ASC";
                        try {
                            if(Model.getRowCount()!=0)
                            {
                                Model.setNumRows(0);
                            }
                            else
                            {
                                Query_dis(s);
                            }
                        } catch (SQLException e) {
                        }           break;
                    }
                case 2:
                    {
                        String s="Select * From NhanVien\n" +
                                "Order By HoTen ASC";
                        try {
                            if(Model.getRowCount()!=0)
                            {
                                Model.setNumRows(0);
                            }
                            else
                            {
                                Query_dis(s);
                            }
                        } catch (SQLException e) {
                        }           break;
                    }
                default:
                    break;
            }
    }//GEN-LAST:event_ArrangementActionPerformed

    private void jtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdateActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(Query_Sql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Query_Sql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Query_Sql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Query_Sql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Query_Sql().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arrangement;
    private javax.swing.JButton btquery1;
    private javax.swing.JButton btquery2;
    private javax.swing.JButton btquery3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbfemale;
    private javax.swing.JCheckBox cbmale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbtype;
    private javax.swing.JTable jtbresul;
    private javax.swing.JTextField jtdate;
    private javax.swing.JTextField jthomet;
    private javax.swing.JTextField jtid;
    private javax.swing.JTextField jtidacademi1;
    private javax.swing.JTextField jtiddment;
    private javax.swing.JTextField jtname;
    private javax.swing.JTextField jtnumphone;
    private javax.swing.JTextField jtsalary;
    // End of variables declaration//GEN-END:variables
}
