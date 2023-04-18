/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interface_dao;

import java.util.ArrayList;
import model.connguoi.KhachHang;

/**
 *
 * @author macbookk
 */
public interface KhachHangInterface {
    public ArrayList<KhachHang> getAllKhachHang();
    public ArrayList<KhachHang> getKhachHangTheoMa(String maKH);
    public KhachHang getKhachHangTheoSDT(String sdt);
    public boolean xoaKhachHang(String maKH);
    public boolean themKhachHang(KhachHang khachHang);
    public boolean capNhatKhachHang(String maKH, KhachHang khachHang);
}
