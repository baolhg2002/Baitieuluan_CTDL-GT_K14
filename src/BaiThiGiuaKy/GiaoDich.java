package BaiThiGiuaKy;
import java.util.Scanner;

public class GiaoDich {
    protected int MaGD;
    protected String NgayGD; 
    protected double DonGia, DienTich, ThanhTien;
    Scanner in = new Scanner(System.in);

    protected GiaoDich(){
        this.MaGD = 0;
        this.NgayGD = "";
        this.DonGia = 0;
        this.DienTich = 0;
    }

    protected GiaoDich(int ma, String ngay, double dgia, double dtich, double ttien){
        this.MaGD = ma;
        this.NgayGD = ngay;
        this.DonGia = dgia;
        this.DienTich = dtich;
        this.ThanhTien = ttien;
    }   

    protected int getMaGD(){
        return MaGD;
    }
    protected void setMaGD(int maGD){
        MaGD = maGD;
    }
    protected String getNgayGD(){
        return NgayGD;
    }
    protected void setNgayGD(String ngayGD){
        NgayGD = ngayGD;
    }
    protected double getDonGia(){
        return DonGia;
    }
    protected void setDonGia(double donGia){
        DonGia = donGia;
    }
    protected double getDienTich(){
        return DienTich;
    }
    protected void setDienTich(double dienTich){
        DienTich = dienTich;
    }
    protected double getThanhTien(){
        return DienTich;
    }
    protected void setThanhTien(double thanhTien){
        ThanhTien = thanhTien;
    }

    protected void nhap(){
        System.out.println("Ma Giao Dich: ");
        MaGD = in.nextInt();
        System.out.println("Ngay Giao Dich: ");
        NgayGD = in.nextLine();
        System.out.println("Don Gia: ");
        DonGia = in.nextDouble();
        System.out.println("Dien Tich: ");
        DienTich = in.nextDouble();
    }

    public String toString(){
        return " [MaGD=" + MaGD + ", NgayGD=" + NgayGD + ", DonGia=" + DonGia;
    }
   
   

}
