/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import bus.DiaChi_bus;
import java.util.Arrays;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import entity.share.DiaChi;

/**
 *
 * @author thanh
 */
public class Frame_InputDiaChi extends javax.swing.JFrame {

    /**
     * Creates new form Frame_InputDiaChi
     */
    private JPanel container;
    private DiaChi dc = null;

    public Frame_InputDiaChi(JPanel container, DiaChi dc) {
        this.dc = dc;
        initComponents();
        txt_duong.setText(dc.getDuong());
        txt_so.setText(dc.getSo());
        txt_quan.setText(dc.getQuan());
        txt_quocGia.setText(dc.getQuocGia());
        txt_tp.setText(dc.getThanhPho());

        this.container = container;

    }

    public Frame_InputDiaChi(JPanel container) {
        initComponents();
        this.container = container;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_container = new javax.swing.JPanel();
        b_1 = new javax.swing.JPanel();
        lbl_so = new javax.swing.JLabel();
        txt_so = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        lbl_duong = new javax.swing.JLabel();
        txt_duong = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 10));
        b_2 = new javax.swing.JPanel();
        lbl_quan = new javax.swing.JLabel();
        txt_quan = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        lbl_tp = new javax.swing.JLabel();
        txt_tp = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 10));
        b_3 = new javax.swing.JPanel();
        lbl_quocGia = new javax.swing.JLabel();
        txt_quocGia = new javax.swing.JTextField();
        pnl_footer = new javax.swing.JPanel();
        btn_commit = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(32767, 0));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(32767, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 32767));

        setTitle("Địa chỉ");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/location.png")).getImage());
        setPreferredSize(new java.awt.Dimension(500, 250));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnl_container.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnl_container.setPreferredSize(new java.awt.Dimension(20, 250));
        pnl_container.setLayout(new javax.swing.BoxLayout(pnl_container, javax.swing.BoxLayout.Y_AXIS));

        b_1.setPreferredSize(new java.awt.Dimension(0, 50));
        b_1.setLayout(new javax.swing.BoxLayout(b_1, javax.swing.BoxLayout.X_AXIS));

        lbl_so.setText("Số nhà:");
        lbl_so.setToolTipText("");
        lbl_so.setPreferredSize(new java.awt.Dimension(100, 0));
        b_1.add(lbl_so);

        txt_so.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_so.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_so.setMinimumSize(new java.awt.Dimension(70, 0));
        txt_so.setPreferredSize(new java.awt.Dimension(70, 30));
        b_1.add(txt_so);
        b_1.add(filler1);

        lbl_duong.setText("Đường:");
        lbl_duong.setToolTipText("");
        lbl_duong.setPreferredSize(new java.awt.Dimension(100, 0));
        b_1.add(lbl_duong);

        txt_duong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_duong.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_duong.setMinimumSize(new java.awt.Dimension(70, 0));
        txt_duong.setPreferredSize(new java.awt.Dimension(70, 30));
        txt_duong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_duongKeyPressed(evt);
            }
        });
        b_1.add(txt_duong);

        pnl_container.add(b_1);
        pnl_container.add(filler4);

        b_2.setPreferredSize(new java.awt.Dimension(0, 50));
        b_2.setLayout(new javax.swing.BoxLayout(b_2, javax.swing.BoxLayout.X_AXIS));

        lbl_quan.setText("Quận/Huyện:");
        lbl_quan.setToolTipText("");
        lbl_quan.setPreferredSize(new java.awt.Dimension(100, 0));
        b_2.add(lbl_quan);

        txt_quan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_quan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_quan.setMinimumSize(new java.awt.Dimension(70, 0));
        txt_quan.setPreferredSize(new java.awt.Dimension(70, 30));
        b_2.add(txt_quan);
        b_2.add(filler2);

        lbl_tp.setText("Tỉnh/Thành phố:");
        lbl_tp.setToolTipText("");
        lbl_tp.setPreferredSize(new java.awt.Dimension(100, 0));
        b_2.add(lbl_tp);

        txt_tp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_tp.setMinimumSize(new java.awt.Dimension(70, 0));
        txt_tp.setPreferredSize(new java.awt.Dimension(70, 30));
        txt_tp.requestFocus();
        b_2.add(txt_tp);

        pnl_container.add(b_2);
        pnl_container.add(filler3);

        b_3.setPreferredSize(new java.awt.Dimension(0, 50));
        b_3.setLayout(new javax.swing.BoxLayout(b_3, javax.swing.BoxLayout.X_AXIS));

        lbl_quocGia.setText("Quốc gia:");
        lbl_quocGia.setToolTipText("");
        lbl_quocGia.setPreferredSize(new java.awt.Dimension(100, 0));
        b_3.add(lbl_quocGia);

        txt_quocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_quocGia.setText("Việt Nam");
        txt_quocGia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_quocGia.setPreferredSize(new java.awt.Dimension(70, 70));
        b_3.add(txt_quocGia);

        pnl_container.add(b_3);

        getContentPane().add(pnl_container, java.awt.BorderLayout.CENTER);

        pnl_footer.setMinimumSize(new java.awt.Dimension(70, 23));
        pnl_footer.setPreferredSize(new java.awt.Dimension(70, 43));
        pnl_footer.setLayout(new java.awt.BorderLayout());

        btn_commit.setBackground(new java.awt.Color(65, 165, 238));
        btn_commit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_commit.setForeground(new java.awt.Color(255, 255, 255));
        btn_commit.setText("Xác nhận");
        btn_commit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_commit.setPreferredSize(new java.awt.Dimension(65, 43));
        btn_commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commitActionPerformed(evt);
            }
        });
        pnl_footer.add(btn_commit, java.awt.BorderLayout.CENTER);
        pnl_footer.add(filler5, java.awt.BorderLayout.LINE_END);
        pnl_footer.add(filler6, java.awt.BorderLayout.LINE_START);
        pnl_footer.add(filler7, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnl_footer, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commitActionPerformed
        validateAndSubmit();
    }//GEN-LAST:event_btn_commitActionPerformed

    private void txt_duongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duongKeyPressed
        if (evt.getKeyCode() == 10)
            validateAndSubmit();
    }//GEN-LAST:event_txt_duongKeyPressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (dc == null)
            reset();
    }//GEN-LAST:event_formComponentShown

    public void validateAndSubmit() {

        String so = txt_so.getText().trim();
        String duong = txt_duong.getText().trim();
        String quan = txt_quan.getText().trim();
        String tp = txt_tp.getText().trim();
        String qg = txt_quocGia.getText().trim();

        if (!Pattern.matches(".+", so)) {
            showMessageFocus("Số nhà không được rỗng", txt_so);
            return;
        }

        if (!Pattern.matches(".+", duong)) {
            showMessageFocus("Đường không được rỗng", txt_duong);
            return;
        }

        if (!Pattern.matches(".+", quan)) {
            showMessageFocus("Quận/Huyện không được rỗng", txt_quan);
            return;
        }

        if (!Pattern.matches(".+", tp)) {
            showMessageFocus("Tỉnh/Thành Phố không được rỗng", txt_tp);
            return;
        }

        if (!Pattern.matches(".+", qg)) {
            showMessageFocus("Quốc gia không được rỗng", txt_quocGia);
            return;
        }

        if (container instanceof Panel_BanHang) {
            ((Panel_BanHang)container).updateDiaChi(getDiaChi());
        }
        if (container instanceof Panel_QuanLyNhanVien) {
            ((Panel_QuanLyNhanVien)container).updateDiaChi(getDiaChi());
        }
        if (container instanceof Panel_QuanLyKhachHang) {
            ((Panel_QuanLyKhachHang)container).updateDiaChi(getDiaChi());
        }
        this.setVisible(false);
    }

    public void reset() {
        javax.swing.JTextField[] list = {txt_duong, txt_quan, txt_quocGia, txt_so, txt_tp};
        Arrays.stream(list).forEach(txt -> txt.setText(""));
        txt_quocGia.setText("Việt Nam");
        txt_so.requestFocus();
    }

    public void showMessageFocus(String msg, JTextField txt) {
        JOptionPane.showMessageDialog(this, msg);
        txt.selectAll();
        txt.requestFocus();
    }

    public DiaChi getDiaChi() {
        String so = txt_so.getText().trim();
        String duong = txt_duong.getText().trim();
        String quan = txt_quan.getText().trim();
        String tp = txt_tp.getText().trim();
        String qg = txt_quocGia.getText().trim();

        DiaChi dcm = new DiaChi(so, duong, quan, tp, qg, new DiaChi_bus().sinhMa());
        return dcm;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b_1;
    private javax.swing.JPanel b_2;
    private javax.swing.JPanel b_3;
    private javax.swing.JButton btn_commit;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel lbl_duong;
    private javax.swing.JLabel lbl_quan;
    private javax.swing.JLabel lbl_quocGia;
    private javax.swing.JLabel lbl_so;
    private javax.swing.JLabel lbl_tp;
    private javax.swing.JPanel pnl_container;
    private javax.swing.JPanel pnl_footer;
    private javax.swing.JTextField txt_duong;
    private javax.swing.JTextField txt_quan;
    private javax.swing.JTextField txt_quocGia;
    private javax.swing.JTextField txt_so;
    private javax.swing.JTextField txt_tp;
    // End of variables declaration//GEN-END:variables
}
