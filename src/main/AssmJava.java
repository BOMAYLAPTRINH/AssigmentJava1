
package main;

import data.NhomNhanVien;
import java.util.Scanner;
import util.DoChoi;


public class AssmJava {

    
    public static void main(String[] args) {
       
        NhomNhanVien nhanVien = new NhomNhanVien();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1:Thêm nhân viên ");
            System.out.println("2:Xuất thông tin nhân viên ");
            System.out.println("3:Tìm kiếm nhân viên theo id ");
            System.out.println("4:Xóa nhân viên theo id ");
            System.out.println("5:Cập nhật thông tin nhân viên ");
            System.out.println("6:Tìm kiếm nhân viên khoảng lương ");
            System.out.println("7:Sắp xếp nhân viên theo tên ");
            System.out.println("8:Sắp xếp nhân viên theo thu nhập ");
            System.out.println("9:Xuất 5 nhân viên thu nhập cao nhất ");
            System.out.println("0:Thoát chương trình");
            choice = DoChoi.getAnInteger("Nhập lựa chọn: ", 
                    "Nhập đúng định dạng");
            switch (choice) {
                case 1:
                    System.out.println("Bạn chuẩn bị thêm 1 nhân viên");
                    nhanVien.addNhanVien();
                    break;
                case 2:
                    System.out.println("In nhân viên ");
                    nhanVien.xuatNhanVien();
                    break;
                case 3:
                    System.out.println("Tìm kiếm theo id ");
                    nhanVien.timKiemMaNhanVien();
                    break;
                case 4:
                    System.out.println("Xóa nhân viên theo id ");
                    nhanVien.xoaNhanVien();
                    break;
                case 5:
                    System.out.println("Cập nhật thông tin nhân viên ");
                    nhanVien.capNhapNhanVien();
                    break;
                case 6:
                    System.out.println("Tìm nhân viên theo khoảng luong ");
                  nhanVien.timKiemNhanVienLuong();
                    break;
                case 7:
                    System.out.println("Sắp xếp nhân viên theo tên ");
                    nhanVien.inTheoTen();
                    break;
                case 8:
                    System.out.println("Sắp xếp nhân viên theo thu nhập ");
                    nhanVien.sortThuNhap();
                    break;
                case 9:
                    System.out.println("Xuất 5 nhân viên có thu nhập cao nhất");
                     nhanVien.top5ThuNhap();
                    break;
                default:
                    System.out.println("Vui lòng nhập lựa chọn từ (0...9)!");
            }
        } while (choice != 0);

    }
    
}
