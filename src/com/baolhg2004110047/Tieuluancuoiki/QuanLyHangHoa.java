package com.baolhg2004110047.Tieuluancuoiki;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class QuanLyHangHoa {
    NodeHangHoa head;
    NodeHangHoa tail;
    Scanner nhap = new Scanner(System.in);

    int kiemTra(int ma){
        NodeHangHoa current = head;
        while(current != null){
            if(current.maHang == ma)
                return 0;
            current = current.next;
        }
        return 1;
    }

    void them(String l, int mh, String thh, double gn, int sltk, String nnk){
        NodeHangHoa newSP = new NodeHangHoa();
        if (head == null){
            head = newSP;
            tail = newSP;
        } else{
            tail.next = newSP;
            tail = newSP;
        }
    }

    void themDau() throws ParseException{
        System.out.println("- Thêm hàng hóa vào đầu danh sách: ");
        NodeHangHoa newSP = new NodeHangHoa();
        newSP.nhapThongTin();
        do{
            if(kiemTra(newSP.maHang) == 0){
                System.out.println("- Mã hàng của sản phẩm mới trùng với mã hàng của một mã hàng trong kho: ");
                System.out.println("- Mời nhập lại mã mới: ");
                newSP.maHang = nhap.nextInt();
                kiemTra(newSP.maHang);
            }
        }
        while(kiemTra(newSP.maHang) == 0);
        newSP.next = head;
        head = newSP;
        System.out.println("- Thêm vào thành công.");
    }

    void themCuoi()throws ParseException{
        System.out.println("- Thêm hàng hóa vào cuối danh sách: ");
        NodeHangHoa newSP = new NodeHangHoa();
        newSP.nhapThongTin();
        do{
            if(kiemTra(newSP.maHang) == 0){
                System.out.println("- Mã hàng của sản phẩm mới trùng với mã hàng của một mã hàng trong kho: ");
                System.out.println("- Mời nhập lại mã mới: ");
                newSP.maHang = nhap.nextInt();
                kiemTra(newSP.maHang);
            }
        }
        while(kiemTra(newSP.maHang) == 0);
        newSP.next = tail;
        tail = newSP;
        System.out.println("- Thêm vào thành công.");
    }

NodeHangHoa tim(int maTim){
    NodeHangHoa tam = head;
    if (head.maHang == maTim){
        System.out.println("Thông tin hàng hóa cần tìm: ");
        head.inThongTin();
        return head;
    }
    while (tam != null){
        if (tam.next.maHang == maTim){
            System.out.println("Thông tin hàng hóa cần tìm:");
            tam.next.inThongTin();
            return tam;
        }
        tam = tam.next;
    }
    return null;
}

void themTruoc()throws ParseException{
    System.out.println("Thêm một hàng hóa vào trước hàng hóa tìm được");
    int ma;
    System.out.println("- Nhập mã của hàng hóa cần tìm: ");
    ma = nhap.nextInt();
    NodeHangHoa tam = tim(ma);
    System.out.println("- Thông tin hàng hóa muốn thêm: ");
    NodeHangHoa newSP = new NodeHangHoa();
    newSP.nhapThongTin();
    do{
        if(kiemTra(newSP.maHang) == 0){
            System.out.println("- Mã hàng của sản phẩm mới trùng với mã hàng của một mã hàng trong kho ");
            System.out.println("- Mời nhập lại mã mới: ");
            newSP.maHang = nhap.nextInt();
            kiemTra(newSP.maHang);
        }
    }while (kiemTra(newSP.maHang) == 0);
    if (tam == null){
        System.out.println("Không có hàng hóa trong kho.");
        return;
    }
    if (head.maHang == ma) {
        themDau();
        System.out.println("Thêm vào thành công");
        return;
    }
    newSP.next = tam.next;
    tam.next = newSP;
    System.out.println(" Thêm vào thành công");
}

void xoaDau(){
    head = head.next;
    System.out.println("Xóa thành công");
}

void xoaCuoi(){
    NodeHangHoa tam = head;
    while (tam != null){
        if (tam.next == tail){
            tail = tam;
            tail.next = null;
            System.out.println("Xóa thành công.");
        }
        tam = tam.next;
    }
}

void xoa(){
    System.out.println("Xóa hảng hóa ở vị trí bất kì: ");
    int ma;
    System.out.println("Nhập mã của hàng hóa cần tìm: ");
    ma = nhap.nextInt();
    NodeHangHoa tam = tim(ma);
    if (tam == null){
        System.out.println("Không có hàng hóa cần tìm trong kho.");
    }else if (head.maHang == ma){
        xoaDau();
    }else {
        tam.next = tam.next.next;
        System.out.println("Xóa thành công");
    }
}

void doiViTri(String tam1, int tam2, double tam3, Date tam4, NodeHangHoa current, NodeHangHoa index){
    tam1 = current.loai;
    current.loai = index.loai;
    index.loai = tam1;

    tam2 = current.maHang;
    current.maHang = index.maHang;
    index.maHang = tam2;

    tam1 = current.tenHangHoa;
    current.tenHangHoa = index.tenHangHoa;
    index.tenHangHoa = tam1;

    tam3 = current.giaNhap;
    current.giaNhap = index.giaNhap;
    index.giaNhap = tam3;

    tam2 = current.soLuongTonKho;
    current.soLuongTonKho = index.soLuongTonKho;
    index.soLuongTonKho = tam2;

    tam4 = current.ngayNhapKho;
    current.ngayNhapKho = index.ngayNhapKho;
    index.ngayNhapKho = tam4;
}

void tangDanTheoGia(){
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("Hàng hóa tăng dần theo giá:" );
    while (current != null){
        index = current.next;
        while (index != null){
            if (current.giaNhap > index.giaNhap){
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("Sắp xếp thành công");
}

void giamDanTheoGia(){
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("Hàng hóa giảm dần theo giá:" );
    while (current != null){
        index = current.next;
        while (index != null){
            if (current.giaNhap > index.giaNhap){
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("Sắp xếp thành công");
}

void tangTheoNgay(){
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("Hàng hóa tăng dần theo ngày:" );
    while (current != null){
        index = current.next;
        while (index != null){
            if ((current.ngayNhapKho).compareTo(index.ngayNhapKho) > 0){
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("Sắp xếp thành công");
}

void giamTheoNgay(){
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("Hàng hóa giảm dần theo ngày:" );
    while (current != null){
        index = current.next;
        while (index != null){
            if ((current.ngayNhapKho).compareTo(index.ngayNhapKho) < 0){
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("Sắp xếp thành công");
}

void xepTheoLoai(){
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    while (current != null){
        index = current.next;
        while (index != null){
            if ((current.loai).compareTo(index.loai) < 0){
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
}

void loaiVaNgayTang(){
   xepTheoLoai();
   NodeHangHoa current = head;
   NodeHangHoa index = null;
   String tam1 = null;
   int tam2 = 0;
   double tam3 = 0;
   Date tam4 = null;
   System.out.println("Sắp xếp hàng hóa theo loại và giá tăng dần: ");
   while (current != null){
       index = current.next;
       while (index != null && current.loai == index.loai){
           if((current.ngayNhapKho).compareTo(index.ngayNhapKho) > 0){
               doiViTri(tam1, tam2, tam3, tam4, current, index);
           }
           index = index.next;
       }
       current = current.next;
   }
   System.out.println("Sắp xếp thành công. ");
}

void loaiVaNgayGiam(){
    xepTheoLoai();
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("Sắp xếp hàng hóa theo loại và ngày giảm dần: ");
    while (current != null){
        index = current.next;
        while (index != null && current.loai == index.loai){
            if((current.ngayNhapKho).compareTo(index.ngayNhapKho) < 0){
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("Sắp xếp thành công. ");
}

void loaiVaGiaTang() {
    xepTheoLoai();
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("Sắp xếp hàng hoá theo loại và giá tăng dần: ");
    while (current != null) {
        index = current.next;
        while (index != null && current.loai == index.loai) {
            if (current.giaNhap > index.giaNhap) {
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("Sắp xếp thành công.");
}

void loaiVaGiaGiam() {
    xepTheoLoai();
    NodeHangHoa current = head;
    NodeHangHoa index = null;
    String tam1 = null;
    int tam2 = 0;
    double tam3 = 0;
    Date tam4 = null;
    System.out.println("- Sắp xếp hàng hoá theo loại và giá giảm dần: ");
    while (current != null) {
        index = current.next;
        while (index != null && current.loai == index.loai) {
            if (current.giaNhap < index.giaNhap) {
                doiViTri(tam1, tam2, tam3, tam4, current, index);
            }
            index = index.next;
        }
        current = current.next;
    }
    System.out.println("+ Sắp xếp thành công.");
}

void tongSL() {
    int tong = 0;
    NodeHangHoa current = head;
    while (current != null) {
        tong = tong + current.soLuongTonKho;
        current = current.next;
    }
    System.out.println("- Tổng số lượng hàng hoá trong kho là: " + tong);
}

void tongGT() {
    double tongGT = 0;
    NodeHangHoa current = head;
    while (current != null){
        tongGT = tongGT + current.giaNhap*current.soLuongTonKho;
        current = current.next;
    }
    System.out.println("Tổng giá trị của những hàng hóa trong kho là: %.1f đồng");
}

void soLuong() {
    xepTheoLoai();
    System.out.println("Số lượng từng loại hàng hóa: ");
    NodeHangHoa current = head;
    int soLuong = 0;
    while (current.next != null){
        while (current.loai == current.next.loai) {
            soLuong = soLuong + current.soLuongTonKho;
            current = current.next;
            if (current.next.next == null){
                System.out.printf("Tổng số lượng hàng hóa của %s là: %d\n", current.loai,(soLuong + current.soLuongTonKho + current.next.soLuongTonKho));
                return;
            }
        }
        System.out.printf("Tổng số hàng hóa của %s là: %d \n", current.loai,(soLuong + current.soLuongTonKho));
        soLuong = 0;
        current = current.next;
    }
}

void sua(NodeHangHoa hh) throws ParseException{
    System.out.println("sửa thông tin của hàng hóa: ");
    System.out.println("Giá nhập mới: ");
    hh.giaNhap = nhap.nextDouble();
    System.out.println("Số lượng tồn kho mới: ");
    hh.soLuongTonKho = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Ngày nhập mới: ");
    SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
    hh.ngayNhapKho = date.parse(nhap.nextLine());
}

void suaThongTin()throws ParseException{
    System.out.println("Tìm hàng hóa cần sửa thông tin ");
    int ma;
    System.out.println("Nhập mã của hàng hóa cần tìm: ");
    ma = nhap.nextInt();
    NodeHangHoa hh = tim(ma).next;
    if(head.maHang == ma){
        sua(head);
        System.out.println("Sửa thành công");
    }else {
        sua(hh);
        System.out.println("Sửa thành công");
    }
}

void timKiemTheoLoai() {
    System.out.println("Tìm kiếm hàng hoa theo loại ");
    System.out.println("Nhập loại hàng hóa: ");
    String l = nhap.nextLine();
    NodeHangHoa current = head;
    while(current != null){
        if(current.loai.equalsIgnoreCase(l)){
            current.inThongTin();
        }
        current = current.next;
    }
}

void timKiemTheoGia() { 
    System.out.println("Tìm kiếm hàng hóa theo khoảng giá.");
    System.out.println("Nhập khoảng giá thấp nhất: ");
    double min = nhap.nextDouble();
    System.out.println("Nhập khoảng giá cao nhất: ");
    double max = nhap.nextDouble();
    NodeHangHoa current = head;
    while(current != null){
        if(current.giaNhap >= min && current.giaNhap <= max){
            current.inThongTin();
        }
        current = current.next;
    }
}

void timKiemTheoNgay() throws ParseException {
    System.out.println("Tìm kiếm hàng hóa theo khoảng ngày.");
    System.out.println("Nhập khoảng thời gian đầu: ");
    SimpleDateFormat date = new SimpleDateFormat();
    Date md = date.parse(nhap.nextLine());
    System.out.println("Nhập khoảng thời gian cuối: ");
    Date kt = date.parse(nhap.nextLine());
    NodeHangHoa current = head;
    while(current != null){
        if(current.ngayNhapKho.compareTo(md) > 0 && current.ngayNhapKho.compareTo(kt) < 0){
            current.inThongTin();
        }
        current = current.next;
    }
}

void in() {
    NodeHangHoa current = head;
    while (current != null){
        current.inThongTin();
        current = current.next;
    }
}
}