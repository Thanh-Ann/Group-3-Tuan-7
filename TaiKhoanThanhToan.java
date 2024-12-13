/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHT9;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanThanhToan extends TaiKhoan implements ChuyenTien {
    private double PhiGiaoDich;
    private double HanMucThuChi;
    //constructor
    public TaiKhoanThanhToan(String SoTaiKhoan, String ChuTaiKhoan, double SoDu, String MatKhau, double PhiGiaoDich, double HanMucThuChi) {
        super(SoTaiKhoan, ChuTaiKhoan, SoDu, MatKhau);
        this.PhiGiaoDich=PhiGiaoDich;
        this.HanMucThuChi=HanMucThuChi;
    }
    //abstract
    @Override
    public double RutTien(double TienRut) {
        if(TienRut<=0)
            System.out.println("So tien rut khong hop le!");
        else
            if (TienRut<=SoDu+HanMucThuChi)
            {
                SoDu-=TienRut;
                lichSuGiaoDich.add(new GiaoDich("Rut tien", TienRut, "Rut tien tu tai khoan thanh toan"));
                System.out.println("Rut tien thanh cong! So du hien tai la: "+SoDu);
            }
            else
                System.out.println("So du khong du!");
        return SoDu;            
    }

    @Override
    public void InThongTin() {
        if (SoDu<0)
        {
            System.out.println("Canh bao! So du dang am, vui long nap them tien vao tai khoan");
            System.out.println("Thong tin tai khoan\nLoai tai khoan: Tai khoan thanh toan\nHan muc thu chi: "+HanMucThuChi+"\nPhi giao dich: "+PhiGiaoDich*100+"%\nSo du: "+SoDu+"");
        }
        else
            System.out.println("Thong tin tai khoan\nLoai tai khoan: Tai khoan thanh toan\nHan muc thu chi: "+HanMucThuChi+"\nPhi giao dich: "+PhiGiaoDich*100+"%\nSo du: "+SoDu+"");
    }
    @Override
    public double chuyenTien(TaiKhoan TKDich, double SoTien) {
        if (SoTien <= SoDu) {
            TKDich.SoDu+=SoTien;
            this.SoDu-=SoTien;
            lichSuGiaoDich.add(new GiaoDich("Chuyen tien", SoTien, "Chuyen tien den tai khoan tiet kiem"));
            System.out.println("Chuyen tien thanh cong! So du hien tai la "+SoDu);
        } else {
            System.out.println("So du khong du!");
        }
        return SoDu;
    }
}


