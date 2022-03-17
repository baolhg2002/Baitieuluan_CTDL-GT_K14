package BaiThiGiuaKy;

public class GiaoDichNha extends GiaoDich{
    private String LoaiNha, DiaChi;

    public GiaoDichNha(){
        super();
        this.LoaiNha = "";
        this.DiaChi = "";
    }   
    
    public GiaoDichNha(int ma, String ngay, double dgia, double dtich, double ttien, String lnha, String dchi){
        super(ma, ngay, dgia, dtich, ttien);
        this.LoaiNha = lnha;
        this.DiaChi = dchi;
    }

    public String getLoaiNha(){
        return LoaiNha;
    }
    public void setLoaiNha(String loaiNha){
        LoaiNha = loaiNha;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public void setDiaChi(String diaChi){
        DiaChi = diaChi;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Loai Nha: ");
        LoaiNha = in.next();
        System.out.println("Dia Chi: ");
        DiaChi = in.next();
    }

    public double TTien(){
        if (LoaiNha == caocap){
            return this.ThanhTien = this.DienTich * this.DonGia;
        }
        else if (LoaiNha == thuong){
            return this.ThanhTien = this.DienTich * this.DonGia * 90/100 ; 
        }

        public String toString(){
            return "GiaoDichNha: " + super.toString() + ", LoaiNha: " + LoaiNha + ", Dia Chi: " + DiaChi + ", ThanhTien: " + ThanhTien + "]";
        }

 
}
