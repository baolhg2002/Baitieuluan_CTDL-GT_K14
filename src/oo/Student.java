package oo;

public class Student {

    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    //method - fuctions - behavior
    //constructor
    public Student(){
        //code xu ly
        this.name = "Bao";
        this.tuoi = 20;
        this.gioiTinh = false;
        this.khoa = "CNTT";
        this.diemTB = 5.5;
    }
    public Student(boolean gioiTinh, float tuoi, String name, String khoa, double diemTB){
        this.name = name;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        this.diemTB = diemTB;
    }

    void hoc(){
        System.out.println("Hoc ...");
    }
    
    void thi(){
        System.out.println("Thi ...");
    }

    void dangKyMonHoc(){
        System.out.println();
    }

}
