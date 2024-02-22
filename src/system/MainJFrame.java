/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import controller.ChuyenManHinhController;
import danhmuc.DanhMucBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI-VN
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        setTitle("HỆ THỐNG QUẢN LÝ NHÂN SỰ");
//        List<DanhMucBean> listDanhMuc = new ArrayList<>();
//        listDanhMuc.add(new DanhMucBean("TrangChinh", jpnCustomer, jlbCustomer));
//        //listDanhMuc.add(new DanhMucBean("HocVien", jpnHocVien, jlbHocVien));
//
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnCustomer, jlbCustomer);
//        controller.setEvent(listDanhMuc); 

        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("Customer", jpnCustomer, jlbCustomer));
        listDanhMuc.add(new DanhMucBean("ChucNang", jpnChucNang, jlbChucNang));
        listDanhMuc.add(new DanhMucBean("LichSu", jpnLichSu, jlbLichSu));
        listDanhMuc.add(new DanhMucBean("QuanLy", jpnQuanLy, jlbQuanLy));
    
        controller.setEvent(listDanhMuc);
    }


                 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnCustomer = new javax.swing.JPanel();
        jlbCustomer = new javax.swing.JLabel();
        jpnChucNang = new javax.swing.JPanel();
        jlbChucNang = new javax.swing.JLabel();
        jpnLichSu = new javax.swing.JPanel();
        jlbLichSu = new javax.swing.JLabel();
        jpnQuanLy = new javax.swing.JPanel();
        jlbQuanLy = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpnMenu.setBackground(new java.awt.Color(204, 102, 0));

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/277091031_525577549127369_6199653662294433407_n (2).png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN SỰ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnCustomer.setBackground(new java.awt.Color(255, 204, 204));

        jlbCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_person_black_24dp.png"))); // NOI18N
        jlbCustomer.setText("Quản Lý Nhân Viên");

        javax.swing.GroupLayout jpnCustomerLayout = new javax.swing.GroupLayout(jpnCustomer);
        jpnCustomer.setLayout(jpnCustomerLayout);
        jpnCustomerLayout.setHorizontalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnCustomerLayout.setVerticalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChucNang.setBackground(new java.awt.Color(255, 204, 204));

        jlbChucNang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbChucNang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_work_black_24dp.png"))); // NOI18N
        jlbChucNang.setText("Quản Lý Ca");

        javax.swing.GroupLayout jpnChucNangLayout = new javax.swing.GroupLayout(jpnChucNang);
        jpnChucNang.setLayout(jpnChucNangLayout);
        jpnChucNangLayout.setHorizontalGroup(
            jpnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnChucNangLayout.setVerticalGroup(
            jpnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnLichSu.setBackground(new java.awt.Color(255, 204, 204));

        jlbLichSu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbLichSu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_inventory_black_24dp.png"))); // NOI18N
        jlbLichSu.setText("Thống Kê");

        javax.swing.GroupLayout jpnLichSuLayout = new javax.swing.GroupLayout(jpnLichSu);
        jpnLichSu.setLayout(jpnLichSuLayout);
        jpnLichSuLayout.setHorizontalGroup(
            jpnLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLichSuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLichSuLayout.setVerticalGroup(
            jpnLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLichSuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLy.setBackground(new java.awt.Color(255, 204, 204));

        jlbQuanLy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_groups_black_24dp.png"))); // NOI18N
        jlbQuanLy.setText("Quản Lý Phòng Ban");

        javax.swing.GroupLayout jpnQuanLyLayout = new javax.swing.GroupLayout(jpnQuanLy);
        jpnQuanLy.setLayout(jpnQuanLyLayout);
        jpnQuanLyLayout.setHorizontalGroup(
            jpnQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyLayout.setVerticalGroup(
            jpnQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("0850080110@sv.hcmunre.edu.vn");

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jpnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbChucNang;
    private javax.swing.JLabel jlbCustomer;
    private javax.swing.JLabel jlbLichSu;
    private javax.swing.JLabel jlbQuanLy;
    private javax.swing.JPanel jpnChucNang;
    private javax.swing.JPanel jpnCustomer;
    private javax.swing.JPanel jpnLichSu;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQuanLy;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}