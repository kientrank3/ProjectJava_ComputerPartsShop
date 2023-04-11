/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author macbookk
 */
public class Panel_QuanLyKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form Panel_QuanLyKhachHang
     */
    public Panel_QuanLyKhachHang() {
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

        pnl_ttKhachHang = new javax.swing.JPanel();
        pnl_maKH = new javax.swing.JPanel();
        lbl_maKH = new javax.swing.JLabel();
        txt_maKH = new javax.swing.JTextField();
        pnl_tenKH = new javax.swing.JPanel();
        lbl_tenKH = new javax.swing.JLabel();
        txt_tenKH = new javax.swing.JTextField();
        pnl_hangThanhVien = new javax.swing.JPanel();
        lbl_hangThanhVien = new javax.swing.JLabel();
        txt_hangThanhVien = new javax.swing.JTextField();
        pnl_soDT = new javax.swing.JPanel();
        lbl_soDT = new javax.swing.JLabel();
        txt_soDT = new javax.swing.JTextField();
        pnl_maSoThue = new javax.swing.JPanel();
        lbl_maSoThue = new javax.swing.JLabel();
        txt_maSoThue = new javax.swing.JTextField();
        pnl_dsKhachHang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dsKhachHang = new javax.swing.JTable();
        pnl_control = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_themKH = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_capNhatKH = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_xoaKH = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new java.awt.BorderLayout());

        pnl_ttKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin khách hàng"));
        pnl_ttKhachHang.setPreferredSize(new java.awt.Dimension(350, 300));
        pnl_ttKhachHang.setLayout(new javax.swing.BoxLayout(pnl_ttKhachHang, javax.swing.BoxLayout.Y_AXIS));

        lbl_maKH.setText("Mã khách hàng:");

        txt_maKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_maKHLayout = new javax.swing.GroupLayout(pnl_maKH);
        pnl_maKH.setLayout(pnl_maKHLayout);
        pnl_maKHLayout.setHorizontalGroup(
            pnl_maKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_maKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_maKHLayout.setVerticalGroup(
            pnl_maKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_maKHLayout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(pnl_maKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maKH)
                    .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pnl_ttKhachHang.add(pnl_maKH);

        lbl_tenKH.setText("Tên khách hàng: ");

        javax.swing.GroupLayout pnl_tenKHLayout = new javax.swing.GroupLayout(pnl_tenKH);
        pnl_tenKH.setLayout(pnl_tenKHLayout);
        pnl_tenKHLayout.setHorizontalGroup(
            pnl_tenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tenKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tenKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_tenKHLayout.setVerticalGroup(
            pnl_tenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tenKHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_tenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tenKH)
                    .addComponent(txt_tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pnl_ttKhachHang.add(pnl_tenKH);

        lbl_hangThanhVien.setText("Hạng thành viên: ");

        txt_hangThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hangThanhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_hangThanhVienLayout = new javax.swing.GroupLayout(pnl_hangThanhVien);
        pnl_hangThanhVien.setLayout(pnl_hangThanhVienLayout);
        pnl_hangThanhVienLayout.setHorizontalGroup(
            pnl_hangThanhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hangThanhVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_hangThanhVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hangThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_hangThanhVienLayout.setVerticalGroup(
            pnl_hangThanhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_hangThanhVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_hangThanhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hangThanhVien)
                    .addComponent(txt_hangThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pnl_ttKhachHang.add(pnl_hangThanhVien);

        lbl_soDT.setText("Số điện thoại");

        javax.swing.GroupLayout pnl_soDTLayout = new javax.swing.GroupLayout(pnl_soDT);
        pnl_soDT.setLayout(pnl_soDTLayout);
        pnl_soDTLayout.setHorizontalGroup(
            pnl_soDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_soDTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_soDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(txt_soDT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_soDTLayout.setVerticalGroup(
            pnl_soDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_soDTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_soDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_soDT)
                    .addComponent(txt_soDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pnl_ttKhachHang.add(pnl_soDT);

        lbl_maSoThue.setText("Mã số thuế: ");

        javax.swing.GroupLayout pnl_maSoThueLayout = new javax.swing.GroupLayout(pnl_maSoThue);
        pnl_maSoThue.setLayout(pnl_maSoThueLayout);
        pnl_maSoThueLayout.setHorizontalGroup(
            pnl_maSoThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_maSoThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_maSoThue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txt_maSoThue, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_maSoThueLayout.setVerticalGroup(
            pnl_maSoThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_maSoThueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_maSoThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maSoThue)
                    .addComponent(txt_maSoThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pnl_ttKhachHang.add(pnl_maSoThue);

        add(pnl_ttKhachHang, java.awt.BorderLayout.EAST);

        pnl_dsKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách khách hàng"));
        pnl_dsKhachHang.setPreferredSize(new java.awt.Dimension(600, 370));
        pnl_dsKhachHang.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tbl_dsKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_dsKhachHang);

        pnl_dsKhachHang.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(pnl_dsKhachHang, java.awt.BorderLayout.CENTER);

        pnl_control.setPreferredSize(new java.awt.Dimension(726, 70));
        pnl_control.setLayout(new javax.swing.BoxLayout(pnl_control, javax.swing.BoxLayout.LINE_AXIS));
        pnl_control.add(filler3);

        btn_themKH.setText("Thêm khách hàng");
        btn_themKH.setMaximumSize(new java.awt.Dimension(150, 50));
        btn_themKH.setPreferredSize(new java.awt.Dimension(150, 50));
        btn_themKH.setSize(new java.awt.Dimension(78, 50));
        pnl_control.add(btn_themKH);
        pnl_control.add(filler2);

        btn_capNhatKH.setText("Cập nhật thông tin");
        btn_capNhatKH.setMaximumSize(new java.awt.Dimension(150, 50));
        btn_capNhatKH.setPreferredSize(new java.awt.Dimension(150, 50));
        pnl_control.add(btn_capNhatKH);
        pnl_control.add(filler1);

        btn_xoaKH.setText("Xoá khách hàng");
        btn_xoaKH.setMaximumSize(new java.awt.Dimension(150, 50));
        btn_xoaKH.setPreferredSize(new java.awt.Dimension(150, 50));
        pnl_control.add(btn_xoaKH);
        pnl_control.add(filler4);

        add(pnl_control, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maKHActionPerformed

    private void txt_hangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hangThanhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hangThanhVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhatKH;
    private javax.swing.JButton btn_themKH;
    private javax.swing.JButton btn_xoaKH;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_hangThanhVien;
    private javax.swing.JLabel lbl_maKH;
    private javax.swing.JLabel lbl_maSoThue;
    private javax.swing.JLabel lbl_soDT;
    private javax.swing.JLabel lbl_tenKH;
    private javax.swing.JPanel pnl_control;
    private javax.swing.JPanel pnl_dsKhachHang;
    private javax.swing.JPanel pnl_hangThanhVien;
    private javax.swing.JPanel pnl_maKH;
    private javax.swing.JPanel pnl_maSoThue;
    private javax.swing.JPanel pnl_soDT;
    private javax.swing.JPanel pnl_tenKH;
    private javax.swing.JPanel pnl_ttKhachHang;
    private javax.swing.JTable tbl_dsKhachHang;
    private javax.swing.JTextField txt_hangThanhVien;
    private javax.swing.JTextField txt_maKH;
    private javax.swing.JTextField txt_maSoThue;
    private javax.swing.JTextField txt_soDT;
    private javax.swing.JTextField txt_tenKH;
    // End of variables declaration//GEN-END:variables
}
