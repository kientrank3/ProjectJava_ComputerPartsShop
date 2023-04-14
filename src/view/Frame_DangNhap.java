/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.connguoi.NhanVien;
import model.share.DiaChi;

/**
 *
 * @author thanh
 */
public class Frame_DangNhap extends javax.swing.JFrame {

    MainView main;

    /**
     * Creates new form Frame_DangNhap
     */
    public Frame_DangNhap(MainView main) {
        this.main = main;
        initComponents();
    }
    
    public void close() {
        this.setVisible(false);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_img = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        pnl_form = new javax.swing.JPanel();
        lbl_dangNhap = new javax.swing.JLabel();
        pnl_formInput = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 50));
        pnl_username = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        txt_username = new javax.swing.JTextField();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 20));
        pnl_password = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        txt_password = new javax.swing.JPasswordField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 50));
        pnl_control = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        pnl_img.setBackground(new java.awt.Color(255, 255, 255));
        pnl_img.setPreferredSize(new java.awt.Dimension(200, 0));
        pnl_img.setLayout(new java.awt.BorderLayout());

        lbl_img.setBackground(new java.awt.Color(153, 204, 255));
        lbl_img.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N
        lbl_img.setText("ComputerPartsShop");
        lbl_img.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_img.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnl_img.add(lbl_img, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnl_img, java.awt.BorderLayout.EAST);

        pnl_form.setBackground(new java.awt.Color(255, 255, 255));
        pnl_form.setPreferredSize(new java.awt.Dimension(340, 300));
        pnl_form.setLayout(new java.awt.BorderLayout());

        lbl_dangNhap.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_dangNhap.setForeground(new java.awt.Color(65, 165, 238));
        lbl_dangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dangNhap.setText("ĐĂNG NHẬP");
        lbl_dangNhap.setToolTipText("");
        lbl_dangNhap.setPreferredSize(new java.awt.Dimension(146, 60));
        pnl_form.add(lbl_dangNhap, java.awt.BorderLayout.PAGE_START);

        pnl_formInput.setBackground(new java.awt.Color(255, 255, 255));
        pnl_formInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnl_formInput.setLayout(new javax.swing.BoxLayout(pnl_formInput, javax.swing.BoxLayout.Y_AXIS));
        pnl_formInput.add(filler4);

        pnl_username.setBackground(new java.awt.Color(255, 255, 255));
        pnl_username.setPreferredSize(new java.awt.Dimension(0, 40));
        pnl_username.setLayout(new javax.swing.BoxLayout(pnl_username, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên đăng nhập:");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_username.add(jLabel1);
        pnl_username.add(filler1);

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_username.setText("QL001");
        txt_username.setToolTipText("");
        pnl_username.add(txt_username);

        pnl_formInput.add(pnl_username);
        pnl_formInput.add(filler5);

        pnl_password.setBackground(new java.awt.Color(255, 255, 255));
        pnl_password.setPreferredSize(new java.awt.Dimension(0, 40));
        pnl_password.setLayout(new javax.swing.BoxLayout(pnl_password, javax.swing.BoxLayout.X_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mật khẩu:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_password.add(jLabel2);
        pnl_password.add(filler6);

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_password.setText("123456");
        pnl_password.add(txt_password);

        pnl_formInput.add(pnl_password);
        pnl_formInput.add(filler2);

        pnl_control.setBackground(new java.awt.Color(255, 255, 255));
        pnl_control.setPreferredSize(new java.awt.Dimension(0, 100));
        pnl_control.setLayout(new java.awt.GridLayout(2, 0));

        btn_login.setBackground(new java.awt.Color(65, 165, 238));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Đăng nhập");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        pnl_control.add(btn_login);

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancel.setText("Hủy bỏ");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pnl_control.add(btn_cancel);

        pnl_formInput.add(pnl_control);

        pnl_form.add(pnl_formInput, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnl_form, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        close();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String username = txt_username.getText().trim();
        String password = new String(txt_password.getPassword());

        // Xu Li
//        Dang nhap
        DiaChi dc = new DiaChi("s", "ds", "dsf", "dsà", "dsf","dc0");
        try {
            NhanVien nhanVien = new NhanVien("000", "Quản lí", "Nguyễn Thanh Cảnh", "0123123123", "thanhocalDcanhit@gmail.com", LocalDate.of(2003, 1, 1), dc, false);
            main.login(nhanVien);
            close();
        } catch (Exception ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_login;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_dangNhap;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JPanel pnl_control;
    private javax.swing.JPanel pnl_form;
    private javax.swing.JPanel pnl_formInput;
    private javax.swing.JPanel pnl_img;
    private javax.swing.JPanel pnl_password;
    private javax.swing.JPanel pnl_username;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
