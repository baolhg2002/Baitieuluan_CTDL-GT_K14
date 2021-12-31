package com.baolhg2004110047.Tieuluancuoiki;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class NodeHangHoa {
    String loai;
    int maHang;
    String tenHangHoa;
    double giaNhap;
    int soLuongTonKho;
    Date ngayNhapKho;
    NodeHangHoa next;
    static Scanner nhap = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");

    NodeHangHoa(){}

    NodeHangHoa(String l, int mh, String thh, double gn, int sltk, Date nnk){
        loai = l;
        maHang = mh;
        tenHangHoa = thh;
        giaNhap = gn;
        soLuongTonKho = sltk;
        ngayNhapKho = nnk;
        try{
            ngayNhapKho = date.parse(nnk);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
}

public void inThongTin(){
    System.out.println("===================================");
    System.out.println("Loại: " +loai);
    System.out.println("Mã hàng: " +maHang);
    System.out.println("Tên hàng hóa: " +tenHangHoa);
    System.out.println("Giá bán: %.1f đồng \n " +giaNhap);
    System.out.println("Số Lượng Tồn Kho: " +soLuongTonKho);
    System.out.println("Ngày Nhập Kho: " +date.format(ngayNhapKho));
    System.out.println("===================================");
}    
public void nhapThongTin() throws ParseException{
    System.out.println("===================================");
    System.out.println("- Nhập loại hàng hóa: ");
    loai = nhap.nextLine();
    System.out.println("- Nhập mã hàng: ");
    maHang = nhap.nextInt();
    System.out.println("- Nhập tên hàng hóa: ");
    tenHangHoa = nhap.nextLine();
    System.out.println("- Nhập giá bán: ");
    giaNhap = nhap.nextDouble();
    System.out.println("- Nhập số lượng tồn kho: ");
    soLuongTonKho = nhap.nextInt();
    nhap.nextLine();
    System.out.println("- Nhập ngày nhập kho: ");
    ngayNhapKho = date.parse(nhap.nextLine());
    }
}