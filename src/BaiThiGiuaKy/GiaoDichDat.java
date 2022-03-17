package BaiThiGiuaKy;

public class GiaoDichDat extends GiaoDich {
    private String LoaiDat;

    public GiaoDichDat(){
        super();
        this.LoaiDat = "A";
    }
    
    public GiaoDichDat(int ma, String ngay, double dgia, double dtich, double ttien, String ldat){
        super(ma, ngay, dgia, dtich, ttien);
        this.LoaiDat = ldat;
    }

    public String getLoaiDat(){
        return LoaiDat;
    }
    public void setLoaiDat(String loaiDat){
        LoaiDat = loaiDat;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Loai Dat: ");
        LoaiDat = in.next();
    }

    public double TTien(){
        if (LoaiDat == A){
            return this.ThanhTien = this.DienTich * this.DonGia * 1.5;
        }
        else if (LoaiDat == B, C){
            return this.ThanhTien = this.DienTich * this.DonGia; 
        }

        public String toString(){
            return "GiaoDichDat: " + super.toString() + ", LoaiDat: " + LoaiDat + ", ThanhTien: " + ThanhTien + "]";
        }
}
