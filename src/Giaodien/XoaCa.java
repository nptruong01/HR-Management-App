/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;
import Connect.MySQLConnection;
import com.mysql.jdbc.CallableStatement;
import java.util.Calendar;
import java.util.Date;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-VN
 */
public class XoaCa extends javax.swing.JFrame {

    /**
     * Creates new form AddCa
     */
    MySQLConnection connection = new MySQLConnection();
    DefaultTableModel tableModel;
    public XoaCa() {
        initComponents();
//        tableModel = (DefaultTableModel)Table_Del.getModel();
        ShowTC_TTCL();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Delete = new javax.swing.JTable();
        TC_Del = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("XÓA CA LÀM");

        Table_Delete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Table_Delete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CL", "Mã Chức Vụ", "Mã Nhân Viên", "Họ Và Tên", "Ngày làm", "Buổi", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_DeleteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Delete);
        if (Table_Delete.getColumnModel().getColumnCount() > 0) {
            Table_Delete.getColumnModel().getColumn(3).setResizable(false);
            Table_Delete.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        TC_Del.setBackground(new java.awt.Color(204, 204, 255));
        TC_Del.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TC_Del.setText("Xóa");
        TC_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC_DelActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(345, 345, 345)
                                .addComponent(Exit)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TC_Del, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(481, 481, 481))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(TC_Del)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TC_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC_DelActionPerformed
        DefaultTableModel model = (DefaultTableModel) Table_Delete.getModel();
        int selectedIndex = Table_Delete.getSelectedRow();
        
//        DefaultTableModel tableModel = (DefaultTableModel) Table_Delete.getModel();
//        Connection conn = connection.ConnectMySQL();
//        try {
//            String macl = tableModel.getValueAt(Table_Delete.getSelectedRow(), 0).toString();
//            int a = JOptionPane.showConfirmDialog(rootPane, "Bạn Có Chắc xóa ca làm này chứ ?");
//            if (a == JOptionPane.YES_OPTION) {
//                CallableStatement cStmt = (CallableStatement) conn.prepareCall("DELETE FROM `calam` WHERE ma_calam=?");
//                cStmt.setString(1, macl);
//                ResultSet rs = cStmt.executeQuery();
////                reset();
//                ShowTC_TTCL();
//            }
//        } catch (Exception e) {
//        }
        
        try {
            Connection con1;
            PreparedStatement insert;
            
            String id = (String) Table_Delete.getValueAt(selectedIndex, 0);
            
            //int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());

            int dialogResult = JOptionPane.showConfirmDialog (rootPane, "Bạn Có Chắc xóa ca làm này chứ ?","Cảnh Báo",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                // Saving code here

                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/doan_dbms","root","");
                insert = con1.prepareStatement("DELETE FROM `calam` WHERE ma_calam=?");

                insert.setString(1,id);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Xóa ca thành công");

                ShowTC_TTCL();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XoaCa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XoaCa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ShowTC_TTCL();
    }//GEN-LAST:event_TC_DelActionPerformed

    private void Table_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_DeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_DeleteMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed
    private void ShowTC_TTCL(){
    DefaultTableModel tableModel= (DefaultTableModel)Table_Delete.getModel();
        tableModel.setRowCount(0);
        Connection conn = connection.ConnectMySQL();
        ResultSet rs = null;
        try {
            CallableStatement cStmt = (CallableStatement) conn.prepareCall("SELECT cl.ma_calam,nv.ma_cv, nv.ma_nv, nv.ten_nv, cl.ngaylam,cl.buoi,cl.ghichu FROM nhanvien AS nv JOIN calam AS cl ON nv.ma_nv = cl.ma_nv");
            rs = cStmt.executeQuery();
            while(rs.next()){
                String macl = rs.getString("ma_calam");
                String manv = rs.getString("ma_nv");
                String macv = rs.getString("ma_cv");
                String tennv = rs.getString("ten_nv");
                String dateNS = rs.getString("ngaylam");
                String NS[] = dateNS.split("-");
                String ngaylam = NS[2]+"/"+NS[1]+"/"+NS[0];
                String buoi = rs.getString("buoi");
                String ghichu = rs.getString("ghichu");
                //String ngaysinh = dateNS.getDay()+"/"+dateNS.getMonth()+""+dateNS.getYear();
                tableModel.addRow(new String[]{macl, macv, manv, tennv, ngaylam, buoi, ghichu});
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(XoaCa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaCa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaCa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaCa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoaCa().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton TC_Del;
    private javax.swing.JTable Table_Delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
