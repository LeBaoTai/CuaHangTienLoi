package Main;

import KhachHang.*;

import java.util.Scanner;

public class KhachHang {

    private static void thongTin() {
        System.out.println("Bạn có muốn để lại thông tin cho chúng tôi biết không ? ");
        System.out.println("                    1 : Có  ");
        System.out.println("                    2 : Không");
    }

    private static void mua() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+-----------------------------------+");
        System.out.println("|               Mua                 |");
        System.out.println("+-----------------------------------+");
        System.out.println("|  1. Chọn mua quầy tươi sống       |");
        System.out.println("|  2. Chọn mua quầy gia dụng        |");
        System.out.println("|  3. Chọn mua quầy nước uống       |");
        System.out.println("|  4. Chọn mua quầy khác            |");
        System.out.println("|  5. Thanh toán                    |");
        System.out.println("+-----------------------------------+");
    }

    private static void timKiem() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Tìm kiếm             |");
        System.out.println("+---------------------------------+");
    }

    private static String nhapTimKiem() {
        System.out.print("Nhập tên món hàng cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void khachHang() {
        int endKhachHang = 0;
        do {
            menu();
            switch (luaChon()) {
                case 1 -> {
                    int endMua = 0;
                    do {
                        mua();
                        switch (luaChon()) {
                            case 1 -> {
                                Mua tuoisong = new XuLy();
                                tuoisong.muaTuoiSong();
                            }
                            case 2 -> {
                                Mua raucu = new XuLy();
                                raucu.muaGiaDung();
                            }
                            case 3 -> {
                                Mua nuocuong = new XuLy();
                                nuocuong.muaNuocUong();
                            }
                            case 4 -> {
                                Mua khac = new XuLy();
                                khac.muaKhac();
                            }
                            // lựa chọn tào lao thì về menu chính
                            case 5 -> {
                                thongTin();
                                switch (luaChon()) {
                                    case 1 -> {
                                        HoaDon hoaDon = new HoaDon();
                                        hoaDon.ThongTinKhachHang();

                                        ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                                        chiTietHoaDon.xuatHoaDon();
                                    }
                                    case 2 -> {
                                        ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                                        chiTietHoaDon.xuatHoaDon();
                                        endMua = 1;
                                    }
                                    default -> {
                                        System.out.println("Không có lựa chọn này!");
                                    }
                                }
                            }
                        }
                    } while (endMua == 0);
                }
                case 2 -> {
                    GioHang xuLy = new XuLy();
                    xuLy.themVaoGioHang();
                }
                case 3 -> {
                    endKhachHang = 1;
                    Main.endCuaHang(endKhachHang);
                    System.out.println("Cảm ơn và hẹn gặp lại!");
                }
                default -> {
                    System.out.println("Không có lựa chọn này!");
                }
            }
        } while (endKhachHang == 0);
    }

    public void menu() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Khách hàng           |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Mua                       |");
        System.out.println("|    2. Giỏ hàng                  |");
        System.out.println("|    3. Rời cửa hàng              |");
        System.out.println("+---------------------------------+");
    }

    private int luaChon() {
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}