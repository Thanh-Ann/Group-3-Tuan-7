/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHT9;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
public abstract class TaiKhoan {
    protected String SoTaiKhoan;
    protected String ChuTaiKhoan;
    protected double SoDu;
    private String MatKhau;
    protected ArrayList<GiaoDich> lichSuGiaoDich;
    //constructor
    public TaiKhoan(String SoTaiKhoan, String ChuTaiKhoan, double SoDu, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.ChuTaiKhoan = ChuTaiKhoan;
        this.SoDu = SoDu;
        this.MatKhau = MatKhau;
        this.lichSuGiaoDich = new ArrayList<>();
    }
    //Cac phuong thuc
    public double GuiTien(double TienGui)
    {
        if(TienGui>0)
        {
            SoDu+=TienGui;
            lichSuGiaoDich.add(new GiaoDich("Gui tien", TienGui, "Nap tien vao tai khoan"));
            System.out.println("Nap tien thanh cong! So du hien tai la: "+SoDu);
        }
        else
            System.out.println("Vui long nhap lai!");
        return SoDu;
    }
    public void KtraSoDu()
    {
        System.out.println("So du hien tai la: "+SoDu);
    }
    public String DoiMatKhau(String MatKhau)
    {
        return this.MatKhau=MatKhau;
    }
    public void XemLichSuGiaoDich() {
        if (lichSuGiaoDich.isEmpty())
            System.out.println("Khong co lich su giao dich nao!");
        else
        {
            System.out.println("Lich su giao dich:");
            for (GiaoDich gd : lichSuGiaoDich)
                System.out.println(gd);
        }
            
    }
    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }    
    //abstract
    public abstract double RutTien(double TienRut);
    public abstract void InThongTin();
}
