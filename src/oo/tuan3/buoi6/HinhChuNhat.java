package oo.tuan3.buoi6;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuDai + this.chieuRong)*2;
    }
    public String toString(){
        String string = " Chieu Dai: " + this.chieuDai + " Chieu Rong: " +this.chieuRong;
        string += " Chu vi: " + this.tinhChuVi() + " Dien Tich: " + this.tinhDienTich();
        return string;
    }

}
