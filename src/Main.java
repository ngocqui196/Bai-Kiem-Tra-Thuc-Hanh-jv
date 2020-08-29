import quanLyKhachThuePhong.KhachSan;
import quanLyKhachThuePhong.Nguoi;
import tamGiacExtentĐaGiac.TamGiac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        TamGiac hinh3Giac = new TamGiac();
//        hinh3Giac.nhapKichThuocCanhTamGiac();
//        hinh3Giac.perimeter();


        List<Nguoi> nguois = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Xin mời ban nhập: ");
            System.out.println("1. Quản lý khách hàng: ");
            System.out.println("2. Quản lý phòng trọ: ");
            System.out.println("3. Thoát");
            int choise = Integer.parseInt(sc.nextLine());

            switch (choise) {
                case 1:
                    System.out.println("1. Thêm một Khách hàng:");
                    System.out.println("2. Hiển thị danh sách khách hàng: ");
                    System.out.println("3. Xóa một Khách hàng:");
                    int choise1 = Integer.parseInt(sc.nextLine());
                    switch (choise1) {
                        case 1:
                            System.out.println("Id Khách hàng:");
                            int iDNguoi = Integer.parseInt(sc.nextLine());
                            System.out.println("Tên khách hàng: ");
                            String nameNguoi = sc.nextLine();
                            System.out.println("Ngày sinh khách khàng: ");
                            String birthDayNguoi = sc.nextLine();
                            System.out.println("Số chứng minh thư: ");
                            int soCMT = Integer.parseInt(sc.nextLine());
                            System.out.println("Mã Id phòng: ");
                            int iDPhong = Integer.parseInt(sc.nextLine());
                            Nguoi nguoi = new Nguoi(iDNguoi,nameNguoi,birthDayNguoi,soCMT);
                            nguois.add(nguoi);
                            System.out.println(nguois);
                            break;
                        case 2:
                            System.out.println(nguois.toString());
                            break;
                        case 3:
                            System.out.println("Nhập tên khách hàng bạn muốn xóa: ");
                            String removeName = sc.nextLine();
                            for (Nguoi man: nguois) {
                                if (man.getFullName() == removeName);

                            }
                    }
                case 2:
                    System.out.println("1. Đặt thêm phòng:");
                    System.out.println("2. Hiển thị danh sách phòng");
                    int choise2 = Integer.parseInt(sc.nextLine());
                    switch (choise2) {
                        case 1:
                            System.out.println("Số ngày bạn muốn trọ:");
                            int soNgayTro = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập loại phòng trọ:");
                            int loaiPhongTro = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập giá phòng trọ");
                            double giaTien = Double.parseDouble(sc.nextLine());

                            KhachSan khachSan = new KhachSan(soNgayTro,giaTien,nguois);
                    }
                    break;
                case 5:
                    System.exit(-1);
                break;
            }
        }while(true);




    }
}
