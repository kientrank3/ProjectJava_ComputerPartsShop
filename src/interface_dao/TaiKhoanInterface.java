/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interface_dao;

import java.util.ArrayList;
import model.connguoi.TaiKhoan;

/**
 *
 * @author macbookk
 */
public interface TaiKhoanInterface {
    public ArrayList<TaiKhoan> getAllTaiKhoan();
    public ArrayList<TaiKhoan> getTaiKhoanTheoSoTK(String soTK);
    public boolean themTaiKhoan(TaiKhoan taiKhoan);
    public boolean xoaTaiKhoan(String soTK);
    public boolean capNhatTaiKhoan(String soTK, TaiKhoan taiKhoan);
}
