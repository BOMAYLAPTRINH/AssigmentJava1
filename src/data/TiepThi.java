package data;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hueHong;

    public TiepThi(String maNv, String name, double luong, double doanhSo, double hueHong) {
        super(maNv, name, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo + hueHong;
    }

    @Override
    public void paint() {
        System.out.printf("|%-30s|%7s|%-20s|%10.0f|%10.0f|%10.0f|\n",
                "Nhân viên tiếp thị: ", maNv, name, luong, getThuNhap(), getThueThuNhap());
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
