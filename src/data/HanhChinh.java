package data;

public class HanhChinh extends NhanVien {

    public HanhChinh(String maNv, String name, double luong) {
        super(maNv, name, luong);
    }

    @Override
    public void paint() {
        System.out.printf("|%-30s|%7s|%-20s|%10.0f|%10.0f|%10.0f|\n",
                "Nhân viên hành chính: ", maNv, name, luong, getThuNhap(),getThueThuNhap());
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }

    @Override
    public double getThueThuNhap() {
         if (getThuNhap() < 9000000) {
             return 0;
        }
        if (getThuNhap() < 15000000) {
           return getThuNhap() * 0.1;
        } else 
            return getThuNhap() * 0.12;
    }



}
