package data;

public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong(String maNv, String name, double luong, double trachNhiem) {
        super(maNv, name, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return trachNhiem + luong;
    }

    @Override
    public void paint() {
        System.out.printf("|%-30s|%7s|%-20s|%10.0f|10.0f|%10.0f|%10.0f|\n",
                "Phòng ban: ", maNv, name, luong, getThuNhap(), getThueThuNhap());
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
