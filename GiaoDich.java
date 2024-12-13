/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHT9;

/**
 *
 * @author ADMIN
 */
import java.util.Date;

public class GiaoDich {
    private String LoaiGiaoDich;
    private double SoTien;
    private Date ThoiGian;
    private String NoiDung;

    // Constructor
    public GiaoDich(String loaiGiaoDich, double soTien, String noiDung) {
        this.LoaiGiaoDich = loaiGiaoDich;
        this.SoTien = soTien;
        this.ThoiGian = new Date();
        this.NoiDung = noiDung;
    }

    @Override
    public String toString() {
        return "Loai giao dich: " + LoaiGiaoDich + "\n" +
               "So tien: " + SoTien + "\n" +
               "Thoi gian: " + ThoiGian + "\n" +
               "Noi dung: " + NoiDung + "\n";
    }
}
