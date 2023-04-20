/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interface_dao.DonNhapHangInterface;
import java.util.ArrayList;
import model.kho.DonNhapHang;
import java.sql.*;
import java.time.LocalDate;
import model.connguoi.NhaCungCap;
import model.connguoi.NhanVien;
import model.kho.ChiTietDonNhap;
import model.kho.KhoHang;
import model.share.ConnectDB;

/**
 *
 * @author thanh
 */
public class DonNhapHang_dao implements DonNhapHangInterface {

    @Override
    public ArrayList<DonNhapHang> getAllDonNhapHang() {
        ArrayList<DonNhapHang> result = new ArrayList<>();

        try {
            Statement st = ConnectDB.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT maDonNhap, ngayNhap, maKho, maNhaCungCap, ghiChu, tongTien, daNhan, maNhanVien FROM DonNhapHang;");

            while (rs.next()) {
                String maDonNhap = rs.getString("maDonNhap");
                String maNhanVien = rs.getString("maNhanVien");
                LocalDate ngayNhap = rs.getDate("ngayNhap").toLocalDate();
                String maKho = rs.getString("maKho");
                String maNhaCungCap = rs.getString("maNhaCungCap");
                String ghiChu = rs.getString("ghiChu");
                double tongTien = rs.getDouble("tongTien");
                boolean daNhan = rs.getBoolean("daNhan");

                ArrayList<ChiTietDonNhap> list = new ChiTietDonNhap_dao().getAllChiTietCuaDonNhap(maDonNhap);

                result.add(new DonNhapHang(maDonNhap, ngayNhap, ghiChu, daNhan, new KhoHang(maKho), list, new NhaCungCap(maKho), new NhanVien(maNhanVien)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<DonNhapHang> getDonNhapHangTheoMa(String maDon) {
        ArrayList<DonNhapHang> result = new ArrayList<>();

        try {
            PreparedStatement st = ConnectDB.conn.prepareStatement("SELECT maDonNhap, ngayNhap, maKho, maNhaCungCap, ghiChu, tongTien, daNhan, maNhanVien FROM DonNhapHang where maDonNhap = ?");
            st.setString(1, maDon);
            ResultSet rs = st.executeQuery();
            String maDonNhap = rs.getString("maDonNhap");
            String maNhanVien = rs.getString("maNhanVien");
            LocalDate ngayNhap = rs.getDate("ngayNhap").toLocalDate();
            String maKho = rs.getString("maKho");
            String maNhaCungCap = rs.getString("maNhaCungCap");
            String ghiChu = rs.getString("ghiChu");
            double tongTien = rs.getDouble("tongTien");
            boolean daNhan = rs.getBoolean("daNhan");

            ArrayList<ChiTietDonNhap> list = new ChiTietDonNhap_dao().getAllChiTietCuaDonNhap(maDonNhap);

            result.add(new DonNhapHang(maDonNhap, ngayNhap, ghiChu, daNhan, new KhoHang(maKho), list, new NhaCungCap(maKho), new NhanVien(maNhanVien)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean xoaDonNhapHang(String maDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean themDonNhapHang(DonNhapHang donNhap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean capNhatDonNhapHang(String maDon, DonNhapHang donNhap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaLonNhat() {
        String s = "DNH0001";

        try {
            Statement st = ConnectDB.conn.createStatement();
            ResultSet rs = st.executeQuery("select top 1 maDonNhap from DonNhapHang order by maDonNhap desc");
            rs.next();
            s = rs.getString("maDonNhap");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }

}
