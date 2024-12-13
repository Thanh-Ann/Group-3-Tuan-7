/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHT9;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanTietKiem extends TaiKhoan implements ChuyenTien{
    private double LaiSuat;
    //constructor
    public TaiKhoanTietKiem(String SoTaiKhoan, String ChuTaiKhoan, double SoDu, String MatKhau, double LaiSuat) {
        super(SoTaiKhoan, ChuTaiKhoan, SoDu, MatKhau);
        this.LaiSuat=LaiSuat;
    }
    //abstract
    @Override
    public double RutTien(double TienRut) {
        if(TienRut<=0)
            System.out.println("So tien rut khong hop le!");
        else 
            if(TienRut<=SoDu)
            {
                SoDu-=TienRut;
                lichSuGiaoDich.add(new GiaoDich("Rut tien", TienRut, "Rut tien tu tai khoan tiet kiem"));
                System.out.println("Rut tien thanh cong! So du hien tai la "+SoDu);
            }
            else 
                System.out.println("So du khong du!");
        return SoDu;
    }

    @Override
    public void InThongTin() {
        System.out.println("Thong tin tai khoan\nLoai tai khoan: Tai khoan tiet kiem\nLai suat hang nam: "+LaiSuat*100+"%\nSo du: "+SoDu+"");
    }
     @Override
    public double chuyenTien(TaiKhoan TKDich, double SoTien) {
        if (SoTien <= SoDu) {
            TKDich.SoDu+=SoTien;
            this.SoDu-=SoTien;
            lichSuGiaoDich.add(new GiaoDich("Chuyen tien", SoTien, "Chuyen tien den tai khoan thanh toan"));
            System.out.println("Chuyen tien thanh cong! So du hien tai la "+SoDu);
        } else {
            System.out.println("So du khong du!");
        }
        return SoDu;
    }
}

