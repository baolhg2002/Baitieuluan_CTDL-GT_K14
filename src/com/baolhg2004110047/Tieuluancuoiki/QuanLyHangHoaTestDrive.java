package com.baolhg2004110047.Tieuluancuoiki;

import java.text.ParseException;
import java.util.Scanner;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        QuanLyHangHoa quanLyHangHoa = new QuanLyHangHoa();
        Scanner nhap = new Scanner(System.in);
        int chon;
        quanLyHangHoa.them("Sanh Su", 1, "Đĩa", 12000, 18000, "07-04-2020");
        quanLyHangHoa.them("Dien May", 2, "TV", 90000000, 800, "25-12-2021");
        quanLyHangHoa.them("Thuc Pham", 3, "Snack", 7000, 31000, "18-03-2021");
        quanLyHangHoa.them("Thuc Pham", 4, "Bánh tráng", 6000, 18000, "10-06-2020");
        quanLyHangHoa.them("Sanh Su", 5, "Tô", 40000, 15000, "01-05-2020");
        quanLyHangHoa.them("Sanh Su", 6, "Chén", 15000, 27800, "31-07-2020");
        quanLyHangHoa.them("Thuc Pham", 7, "Rau củ", 25000, 6000, "10-01-2021");
        quanLyHangHoa.them("Dien May", 8, "Máy lạnh", 250000, 700, "06-02-2019");
        quanLyHangHoa.them("Thuc Pham", 9, "Ngũ cốc", 25000, 6000, "13-06-2021");
        quanLyHangHoa.them("Thuc Pham", 10, "Miliket", 2500, 40000, "23-04-2020");
        quanLyHangHoa.them("Sanh Su", 11, "Bình cắm hoa", 75000, 5600, "23-04-2021");
        quanLyHangHoa.them("Thuc Pham", 12, "Kẹo cây", 1500, 60000, "28-05-2020");
        quanLyHangHoa.them("Dien May", 13, "Quạt máy", 1500000, 4500, "15-06-2021");
        quanLyHangHoa.them("Sanh Su", 14, "Đĩa nhỏ", 10000, 12000, "21-03-2021");
        quanLyHangHoa.them("Dien May", 15, "Tủ lạnh", 9600000, 250, "10-05-2020");
        quanLyHangHoa.them("Sanh Su", 16, "Chén nhỏ", 7000, 13000, "20-09-2021");
        quanLyHangHoa.them("Thuc Pham", 17, "Nồi Cơm Điện", 2800000, 2200, "25-12-2019");
        quanLyHangHoa.them("Dien May", 18, "Máy lọc nước", 2500000, 140, "15-12-2020");
        quanLyHangHoa.them("Thuc Pham", 19, "Cánh gà", 24000, 15000, "01-08-2020");
        quanLyHangHoa.them("Thuc Pham", 20, "Sườn heo", 30000, 3500, "11-08-2021");
        do{
            System.out.println("===================MENU===================");
            System.out.println(">>1: Thêm hàng hoá mới vào đầu danh sách kho.");
            System.out.println(">>2: Thêm hàng hoá mới vào cuối danh sách kho.");
            System.out.println(">>3: Thêm hàng hoá mới vào trước một hàng hoá tìm được.");
            System.out.println(">>4: Xoá hàng hoá ở đầu danh sách.");
            System.out.println(">>5: Xoá hàng hoá ở cuối danh sách.");
            System.out.println(">>6: Xoá hàng hoá ở một vị trí bất kì.");
            System.out.println(">>7: Sửa thông tin của hàng hoá trong kho.");
            System.out.println(">>8: Tìm kiếm hàng hoá theo loại.");
            System.out.println(">>9: Tìm kiếm hàng hoá theo khoảng giá.");
            System.out.println(">>10: Tìm kiếm hàng hoá theo khoang thời gian nhập hàng.");
            System.out.println(">>11: Sắp xếp hàng hoá tăng dần theo giá.");
            System.out.println(">>12: Sắp xếp hàng hoá giảm dần theo giá.");
            System.out.println(">>13: Sắp xếp hàng hoá tăng dần theo ngày.");
            System.out.println(">>14: Sắp xếp hàng hoá giảm dần theo ngày.");
            System.out.println(">>15: Sắp xếp hàng hoá theo loại.");
            System.out.println(">>16: Sắp xếp hàng hoá theo loại và tăng dần theo ngày nhập.");
            System.out.println(">>17: Sắp xếp hàng hoá theo loại và giảm dần theo ngày nhập.");
            System.out.println(">>18: Sắp xếp hàng hoá theo loại và tăng dần theo giá.");
            System.out.println(">>19: Sắp xếp hàng hoá theo loại và giảm dần theo giá.");
            System.out.println(">>20: Thống kê tổng số lượng hàng hoá trong kho.");
            System.out.println(">>21: Thống kê tổng giá trị của hàng hoá trong kho.");
            System.out.println(">>22: Thống kê số lượng hàng hoá của từng loại hàng.");
            System.out.println(">>23: In danh sách hàng hoá trong kho.");
            System.out.println(">>24: Kết thúc.");
            System.out.println("==========================================");
            System.out.print("- Nhập vào sự lựa chọn(1 -> 24): ");
            chon = nhap.nextInt();
            switch(chon){
                case 1:
                    quanLyHangHoa.themDau();
                    break;
                case 2:
                    quanLyHangHoa.themCuoi();
                    break;
                case 3: 
                    quanLyHangHoa.themTruoc();
                    break;
                case 4:
                    quanLyHangHoa.xoaDau();
                    break;
                case 5:
                    quanLyHangHoa.xoaCuoi();
                    break;
                case 6:
                    quanLyHangHoa.xoa();
                    break;
                case 7:
                    quanLyHangHoa.suaThongTin();
                    break;
                case 8:
                    quanLyHangHoa.timKiemTheoLoai();
                    break;
                case 9:
                    quanLyHangHoa.timKiemTheoGia();
                    break;
                case 10:
                    quanLyHangHoa.timKiemTheoNgay();
                    break;
                case 11:
                    quanLyHangHoa.tangDanTheoGia();
                    break;
                case 12:
                    quanLyHangHoa.giamDanTheoGia();
                    break;
                case 13:
                    quanLyHangHoa.tangTheoNgay();
                    break;
                case 14:
                    quanLyHangHoa.giamTheoNgay();
                    break;
                case 15:
                    System.out.println("- Sắp xếp hàng hoá theo loại hàng: ");
                    quanLyHangHoa.xepTheoLoai();
                    System.out.println("+ Sắp xếp thành công.");
                    break;
                case 16:
                    quanLyHangHoa.loaiVaNgayTang();
                    break;
                case 17:
                    quanLyHangHoa.loaiVaNgayGiam();
                    break;
                case 18:
                    quanLyHangHoa.loaiVaGiaTang();
                    break;
                case 19: 
                    quanLyHangHoa.loaiVaGiaGiam();
                    break;
                case 20:
                    quanLyHangHoa.tongSL();
                    break;
                case 21:
                    quanLyHangHoa.tongGT();
                    break;
                case 22:
                    quanLyHangHoa.soLuong();
                    break;
                case 23:
                    quanLyHangHoa.in();
                    break;
                case 24:
                    System.out.println("- KẾT THÚC!!!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
            }
            System.out.print("- Quay lại MENU chính(1:yes/0:no): ");
            chon = nhap.nextInt(); 
        }while(chon == 1);
        nhap.close();
    }
    
}
        