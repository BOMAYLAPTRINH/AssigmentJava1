
package data;


public abstract class NhanVien {
    protected String maNv;
    protected String name;
    protected double luong;

    public NhanVien(String maNv, String name, double luong) {
        this.maNv = maNv;
        this.name = name;
        this.luong = luong;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public abstract double getThueThuNhap();


    public abstract void paint();


}
