/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interface_dao;

import java.util.ArrayList;
import model.share.DiaChi;

/**
 *
 * @author macbookk
 */
public interface DiaChiInterface {
    public ArrayList<DiaChi> getAllDiaChi();
    public ArrayList<DiaChi> getDiaChiTheoMa(String maDiaChi);
    public boolean themDiaChi(DiaChi diaChi);
    public boolean xoaDiaChi(String maDiaChi);
    public boolean capNhatDiaChi(String maDiaChi, DiaChi diaChi);
}
