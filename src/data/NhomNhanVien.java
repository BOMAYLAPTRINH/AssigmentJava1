 package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.DoChoi;

public class NhomNhanVien {

    private ArrayList<NhanVien> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addHanhChinh() {
        String id, name;
        double luong;
        int pos;
        do {

            id = DoChoi.getID("Nhập id hành chính  ",
                    "ID hành chính bắn đầu bằng HCXXXXX(X là 1 con số)!", "^[H|h][C|c]\\d{5}$");
            pos = timKiemNhanVienID(id);
            if (pos >= 0) {
                System.out.println("ID đã tồn tại!,"
                        + "vui lòng nhập lại!");
            }
        } while (pos != -1);

        System.out.print("Nhập tên nhân viên hành chính: ");
        name = sc.nextLine();
        System.out.print("NHập lương: ");
        luong = Double.parseDouble(sc.nextLine());
        list.add(new HanhChinh(id, name, luong));
        System.out.println("Đã thêm 1 nhân viên hành chính thành công!");
    }
    public void addTiepThi() {
        String id, name;
        double luong;
        double doanhSo;
        double hueHong;
        int pos;
        do {

            id = DoChoi.getID("Nhập id tiếp thị  ",
                    "ID hành chính bắn đầu bằng TTXXXXX(X là 1 con số)!", "^[T|t][T|t]\\d{5}$");
            pos = timKiemNhanVienID(id);
            if (pos >= 0) {
                System.out.println("ID đã tồn tại!,"
                        + "vui lòng nhập lại!");
            }
        } while (pos != -1);

        System.out.print("Nhập tên nhân viên tiếp thị: ");
        name = sc.nextLine();
        System.out.print("NHập lương: ");
        luong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập lương doanh số tiêps thị: ");
        doanhSo = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập lương huế hồng: ");
        hueHong = Double.parseDouble(sc.nextLine());
        list.add(new TiepThi(name, name, luong, doanhSo, hueHong));
        System.out.println("Đã thêm 1 nhân viên tiếp thị thành công!");
    }
    public void addTruongPhong() {
        String id, name;
        double luong;
        double trachNhiem;
        int pos;
        do {

            id = DoChoi.getID("Nhập id trưởng phòng:  ",
                    "ID hành chính bắn đầu bằng TPXXXXX(X là 1 con số)!", "^[T|t][P|p]\\d{5}$");
            pos = timKiemNhanVienID(id);
            if (pos >= 0) {
                System.out.println("ID đã tồn tại!,"
                        + "vui lòng nhập lại!");
            }
        } while (pos != -1);

        System.out.print("Nhập tên trưởng phòng: ");
        name = sc.nextLine();
        System.out.print("NHập lương: ");
        luong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập lương trách nhiệm : ");
        trachNhiem = Double.parseDouble(sc.nextLine());
        list.add(new TruongPhong(name, name, luong, trachNhiem));
        System.out.println("Đã thêm 1 trưởng phòng thành công!");
    }
    public void addNhanVien() {
        int chon;
        System.out.println("1:Add hành chính");
        System.out.println("2:Add tiếp thị");
        System.out.println("3:Add trưởng phòng");
        chon = DoChoi.getAnInteger("nhập lựa chọn:", "nhập đúng định dạng!");
        
        while(true) {
                 try {
            if(chon == 1){
                addHanhChinh();
                return;
            }       
             if (chon == 2){
                 addTiepThi();
                 return;
             }
             if(chon == 3){
                 addTruongPhong();
                 return;
             }
        } catch (Exception e) {
            System.err.println("Nhập đúng định dạng!");
        }
        
        }
       
            
    }

    public void xuatNhanVien() {
        String header = String.format("|%-30s|%-7s|%-20s|%-10s|%-10s|%-10s|", "Danh sách phòng ban ", "ID", "Name", "Luong",
                "Thu nhập ", "Thuế ");
        System.out.println(header);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).paint();
        }
    }

    private int timKiemNhanVienID(String petID) {

        if (list.isEmpty())
        {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaNv().equalsIgnoreCase(petID)) {
                return i;
            }
        }

        return -1;
    }

    private NhanVien timKiemTheoID(String petID) {
        if (list.isEmpty())
        {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaNv().equalsIgnoreCase(petID)) {
                return list.get(i);
            }
        }

        return null;
    }

    public void timKiemMaNhanVien() {
        String id;
        NhanVien x;
        id = DoChoi.getString("Nhập id nhân viên: ", "Cần có id nhân viên");
        x = timKiemTheoID(id);
        System.out.println("===================================");
        if (x == null) {
            System.out.println("Kông có !!");
        } else {
            System.out.println("ID mà bạn cần tìm thành công!");
            String header = String.format("|%-30s|%-7s|%-20s|%-10s|%-10s|%-10s|", "Danh sách phòng ban ", "ID", "Name", "Luong",
                    "Thu nhập ", "Thuế ");
            System.out.println(header);
            x.paint();
        }

    }

    public void xoaNhanVien() {
        String id;
        int pos;
        id = DoChoi.getString("Nhập id nhân viên: ", "Cần có id nhân viên");
        pos = timKiemNhanVienID(id);
        if (pos == -1) {
            System.out.println("KHông có!");
        } else {
            list.remove(pos);
            System.out.println("Đã xóa thành công!!!");
        }

    }

    public void capNhapNhanVien() {
        String id;
        String tmpName;
        NhanVien x;
        id = DoChoi.getString("Nhập id nhân viên: ", "Cần có id nhân viên");
        x = timKiemTheoID(id);
        if (x == null) {
            System.out.println("Không có!!");
        } else {
            System.out.println("Đây là nhân viên trước khi cập nhật!!");
            x.paint();
            System.out.println("Nhập tên mới của nhân viên :");
            tmpName = DoChoi.getString("Nhập tên nhân viên mới: ", "Tên là bắt buộc!");
            x.setName(tmpName);
            System.out.println("Thông tin nhân viên đã được cập nhật thành công!");

        }

    }

    public NhanVien searchLuong(double luongMin, double luongMax) {
        if (list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLuong() >= luongMin && list.get(i).getLuong() <= luongMax) {
                return list.get(i);
            }
        }

        return null;
    }

    public void timKiemNhanVienLuong() {
        if (list.isEmpty()) {
            System.out.println("Rỗng!!");
            return;
        }
        double luongMin, luongMax;
        NhanVien x;
        System.out.print("Nhập khoảng lương thứ 1: ");
        luongMin = sc.nextDouble();
        System.out.print("Nhập khoảng luong thứ 2: ");
        luongMax = sc.nextDouble();
        x = searchLuong(luongMin, luongMax);
        System.out.println("------------------------------------");
        if (x == null) {
            System.out.println("Không có!!!");
        } else {
            System.out.println("Bạn đã tìm kiếm thành công  "
                    + ">>>>>>>>");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getLuong() >= luongMin && list.get(i).getLuong() <= luongMax) {
                    list.get(i).paint();
                }

            }

        }
    }
     public void inTheoTen() {
        if (list.isEmpty()) {
            System.out.println("Rỗng!!!");
            return;
        }
        Comparator nameBalance = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        Collections.sort(list, nameBalance);
        System.out.println("------------------------------------");
        System.out.println("Đâ là danh sách nhân viên >>>");
        String header = String.format("|%-30s|%-7s|%-20s|%-10s|%-10s|%-10s|", "Danh sách phòng ban ", "ID", "Name", "Luong",
                "Thu nhập ", "Thuế ");
        System.out.println(header);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).paint();
        }
    }
     public void top5ThuNhap() {
         if (list.isEmpty()) {
             System.out.println("Rỗng!!");
         }
         else {
             Collections.sort(list, new Comparator<NhanVien>() {
                 @Override
                 public int compare(NhanVien o1, NhanVien o2) {
                     return Double.compare(o2.getLuong(), o1.getLuong());
                 };
             });
           for (int i = 0; i < 5; i++) {
                 list.get(i).paint();
             }
         }
     }
     public void sortThuNhap() {
         if (list.isEmpty()) {
             System.out.println("Rỗng!!");
         }
         else{
             Collections.sort(list, new Comparator<NhanVien>() {
                 @Override
                 public int compare(NhanVien o1, NhanVien o2) {
                     return Double.compare(o2.getLuong(), o1.getLuong());
                 };
             });
           for (int i = 0; i < list.size(); i++) {
                 list.get(i).paint();
             }
         }
             
     }

    public static void main(String[] args) {
        NhomNhanVien xx = new NhomNhanVien();

        xx.addHanhChinh();

        System.out.println("ahihi: " + xx);
    }
}
