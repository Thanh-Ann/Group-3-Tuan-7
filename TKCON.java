/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHT9;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class TKCON {
    public static void main(String[] args) {
        int c, chk, chk1, chk2;
        double so;
        String MK, MK1, stk, mkhau, mkhauchk, ten;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ban chua co tai khoan ngan hang nao, hay tao 1 tai khoan bao gom tai khoan tiet kiem va tai khoan thanh toan!");
        System.out.println("Tao tai khoan tiet kiem");
        System.out.println("Ban hay nhap so dien thoai");
        stk=sc.nextLine();
        System.out.println("Ban hay nhap ten dang nhap");
        ten=sc.nextLine();
        System.out.println("Ban hay nhap mat khau");
        mkhau=sc.nextLine();
        do
        {
            System.out.println("Xac nhan lai mat khau");
            mkhauchk=sc.nextLine();
        }
        while(!mkhau.equals(mkhauchk));
        TaiKhoan TKTK=new TaiKhoanTietKiem(stk,ten,0,mkhau,0.05);
        System.out.println("Tao tai khoan thanh toan");
        System.out.println("Ban hay nhap so dien thoai");
        stk=sc.nextLine();
        System.out.println("Ban hay nhap ten dang nhap");
        ten=sc.nextLine();
        System.out.println("Ban hay nhap mat khau");
        mkhau=sc.nextLine();
        do
        {
            System.out.println("Xac nhan lai mat khau");
            mkhauchk=sc.nextLine();
        }
        while(!mkhau.equals(mkhauchk));
        TaiKhoan TKTT=new TaiKhoanThanhToan(stk,ten,0,mkhau,0.01,100);
        c=1;
        while(c==1)
        {
            System.out.println("Ban muon su dung tai khoan nao?");
            System.out.println("1. Tai khoan tiet kiem");
            System.out.println("2. Tai khoan thanh toan");
            System.out.println("0. Thoat!");
            chk=sc.nextInt();
            sc.nextLine();
            switch(chk)
            {
                case 1:
                {
                    while(TKTK==null)
                    {
                        System.out.println("Ban chua co tai khoan tiet kiem, hay tao tai khoan!");
                        System.out.println("Tao tai khoan tiet kiem");
                        System.out.println("Ban hay nhap so dien thoai");
                        stk=sc.nextLine();
                        System.out.println("Ban hay nhap ten dang nhap");
                        ten=sc.nextLine();
                        System.out.println("Ban hay nhap mat khau");
                        mkhau=sc.nextLine();
                        do
                        {
                            System.out.println("Xac nhan lai mat khau");
                            mkhauchk=sc.nextLine();
                        }
                        while(!mkhau.equals(mkhauchk));
                        TKTK=new TaiKhoanTietKiem(stk,ten,0,mkhau,0.05);
                    }
                    System.out.println("Ban hay nhap mat khau de dang nhap");
                    MK=sc.nextLine();
                    if(MK.equals(TKTK.getMatKhau()))
                    {
                        c=2;
                        while(c==2)
                        {
                            
                            System.out.println("Ban muon lam gi?");
                            System.out.println("1. Xem thong tin tai khoan");
                            System.out.println("2. Kiem tra so du");
                            System.out.println("3. Gui tien");
                            System.out.println("4. Rut tien");
                            System.out.println("5. Chuyen tien den tai thanh toan");
                            System.out.println("6. Xem lich su giao dich");
                            System.out.println("7. Doi mat khau");
                            System.out.println("8. Xoa tai khoan");
                            System.out.println("0. Thoat tai khoan");
                            chk1=sc.nextInt();
                            switch(chk1)
                            {
                                case 1:
                                {
                                    TKTK.InThongTin();
                                }break;
                                case 2:
                                {
                                    TKTK.KtraSoDu();
                                }break;
                                case 3:
                                {
                                    System.out.println("Ban muon gui bao nhieu?");
                                    so=sc.nextDouble();
                                    TKTK.GuiTien(so);
                                }break;
                                case 4:
                                {
                                    System.out.println("Ban muon rut bao nhieu?");
                                    so=sc.nextDouble();
                                    TKTK.RutTien(so);
                                }break;
                                case 5:
                                {
                                    System.out.println("Ban hay nhap so tien muon chuyen");
                                    so=sc.nextDouble();
                                    ((ChuyenTien) TKTK).chuyenTien(TKTT, so);
                                }break;
                                case 6:
                                {
                                    TKTK.XemLichSuGiaoDich();
                                }break;
                                case 7:
                                {
                                    System.out.println("Vui long nhap mat khau dang nhap!");
                                    do
                                    {                                        
                                        MK1=sc.nextLine();
                                    }
                                    while(!MK.equals(MK1));
                                    System.out.println("Ban hay nhap mat khau moi");
                                    mkhau=sc.nextLine();
                                    do
                                    {
                                        System.out.println("Xac nhan lai mat khau");
                                        mkhauchk=sc.nextLine();
                                    }
                                    while(!mkhau.equals(mkhauchk));
                                    TKTK.DoiMatKhau(mkhau);
                                    System.out.println("Da doi mat khau thanh cong!");
                                    c--;
                                }break;
                                case 8:
                                {
                                    if(TKTK.SoDu>0)
                                    {
                                        System.out.println("Vui long rut het tien truoc khi xoa!");
                                        break;
                                    }
                                    else                                    
                                    {
                                        TKTK=null;
                                        System.out.println("Da xoa tai khoan tiet kiem!");
                                        c--;
                                    }
                                }break;
                                case 0:
                                {
                                    System.out.println("Thoat tai khoan tiet kiem!");
                                    c--;
                                }break;
                            }
                        }
                    }
                    else
                        System.out.println("Sai mat khau! Vui long dang nhap lai");
                }break;
                case 2:
                {
                    while(TKTT==null)
                    {
                        System.out.println("Ban chua co tai khoan thanh toan, hay tao tai khoan!");
                        System.out.println("Tao tai khoan thanh toan");
                        System.out.println("Ban hay nhap so dien thoai");
                        stk=sc.nextLine();
                        System.out.println("Ban hay nhap ten dang nhap");
                        ten=sc.nextLine();
                        System.out.println("Ban hay nhap mat khau");
                        mkhau=sc.nextLine();
                        do
                        {
                            System.out.println("Xac nhan lai mat khau");
                            mkhauchk=sc.nextLine();
                        }
                        while(!mkhau.equals(mkhauchk));
                        TKTT=new TaiKhoanThanhToan(stk,ten,0,mkhau,0.01,100);
                    }
                    System.out.println("Ban hay nhap mat khau de dang nhap");
                    MK=sc.nextLine();
                    if(MK.equals(TKTT.getMatKhau()))
                    {
                        c=2;
                        while(c==2)
                        {
                            System.out.println("Ban muon lam gi?");
                            System.out.println("1. Xem thong tin tai khoan");
                            System.out.println("2. Kiem tra so du");
                            System.out.println("3. Gui tien");
                            System.out.println("4. Rut tien");
                            System.out.println("5. Chuyen tien den tai khoan tiet kiem");
                            System.out.println("6. Xem lich su giao dich");
                            System.out.println("7. Doi mat khau");
                            System.out.println("8. Xoa tai khoan");
                            System.out.println("0. Thoat tai khoan");
                            chk2=sc.nextInt();
                            switch(chk2)
                            {
                                case 1:
                                {
                                    TKTT.InThongTin();
                                }break;
                                case 2:
                                {
                                    TKTT.KtraSoDu();
                                }break;
                                case 3:
                                {
                                    System.out.println("Ban muon gui bao nhieu?");
                                    so=sc.nextDouble();
                                    TKTT.GuiTien(so);
                                }break;
                                case 4:
                                {
                                    System.out.println("Ban muon rut bao nhieu?");
                                    so=sc.nextDouble();
                                    TKTT.RutTien(so);
                                }break;
                                case 5:
                                {
                                    System.out.println("Ban hay nhap so tien muon chuyen");
                                    so=sc.nextDouble();
                                    ((ChuyenTien) TKTT).chuyenTien(TKTK, so);
                                }break;
                                case 6:
                                {
                                    TKTT.XemLichSuGiaoDich();
                                }break;
                                case 7:
                                {
                                    System.out.println("Vui long nhap mat khau dang nhap!");
                                    do
                                    {                                        
                                        MK1=sc.nextLine();
                                    }
                                    while(!MK.equals(MK1));
                                    System.out.println("Ban hay nhap mat khau moi");
                                    mkhau=sc.nextLine();
                                    do
                                    {
                                        System.out.println("Xac nhan lai mat khau");
                                        mkhauchk=sc.nextLine();
                                    }
                                    while(!mkhau.equals(mkhauchk));
                                    TKTT.DoiMatKhau(mkhau);
                                    System.out.println("Da doi mat khau thanh cong!");
                                    c--;
                                }break;
                                case 8:
                                {
                                    if(TKTT.SoDu>0)
                                    {
                                        System.out.println("Vui long rut het tien truoc khi xoa!");
                                        break;
                                    }
                                    else 
                                        if(TKTT.SoDu<0)
                                        {
                                            System.out.println("Vui long nap so du ve 0 truoc khi xoa!");
                                            break;
                                        }
                                        else
                                        {
                                            TKTT=null;
                                            System.out.println("Da xoa tai khoan thanh toan!");
                                            c--;
                                        }
                                }break;
                                case 0:
                                {
                                    System.out.println("Thoat tai khoan tiet kiem!");
                                    c--;
                                }break;
                            }
                        }
                    }
                    else
                        System.out.println("Sai mat khau! Vui long dang nhap lai");
                }break;
                case 0:
                {
                    System.out.println("Thoat chuong trinh!");
                    c--;
                }break;
            }
        }
    }
}
