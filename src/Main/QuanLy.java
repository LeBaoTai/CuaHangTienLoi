package Main;

import KhoHang.KhoHang;
import NhanSu.BaoVe;
import NhanSu.LaoCong;
import NhanSu.NhanSu;
import NhanSu.NhanVien;
import Quay.QuayGiaDung;
import Quay.QuayKhac;
import Quay.QuayNuoc;
import Quay.QuayTuoiSong;

import java.io.IOException;
import java.util.Scanner;

public class QuanLy {

    private static void xoa() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Xoá                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Xoá Gia Dụng               |");
        System.out.println("|   2. Xoá Nước                   |");
        System.out.println("|   3. Xoá Tươi Sống              |");
        System.out.println("|   4. Xoá Khác                   |");
        System.out.println("|   5. Xoá Nhân Sự                |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void sua() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Sửa                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Sửa Gia Dụng               |");
        System.out.println("|   2. Sửa Nước                   |");
        System.out.println("|   3. Sửa Tươi Sống              |");
        System.out.println("|   4. Sửa Khác                   |");
        System.out.println("|   5. Sửa Nhân Sự                |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void nhanSu() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Nhân sự              |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Bảo Vệ                     |");
        System.out.println("|   2. Lao Công                   |");
        System.out.println("|   3. Nhân Viên                  |");
        System.out.println("|   4. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void thongTin() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|         Xuất Thông Tin          |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Xuất ra màn hình           |");
        System.out.println("|   2. Xuất ra file               |");
        System.out.println("|   3. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void danhSach() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|         Danh Sách               |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Hàng Hoá                   |");
        System.out.println("|   2. Nhân Viên                  |");
        System.out.println("|   3. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private static void timKiem() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Tìm Kiếm             |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Tìm kiếm Gia Dụng          |");
        System.out.println("|   2. Tìm kiếm Nước              |");
        System.out.println("|   3. Tìm kiếm Tươi Sống         |");
        System.out.println("|   4. Tìm kiếm Khác              |");
        System.out.println("|   5. Tìm kiếm Nhân Sự           |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    public void admin() throws IOException {
        int endAdmin = 0;
        do {
            menu();
            switch (luaChon()) {
                case 1 -> {
                    int endThem = 0;
                    do {
                        them();
                        switch (luaChon()) {
                            case 1 -> {
                                System.out.println("---------Thêm Gia Dụng---------");
                                KhoHang giaDung = new QuayGiaDung();
                                giaDung.add();
                            }
                            case 2 -> {
                                System.out.println("---------Thêm Nước---------");
                                KhoHang thucPham = new QuayNuoc();
                                thucPham.add();
                            }
                            case 3 -> {
                                System.out.println("---------Thêm Tươi Sống---------");
                                KhoHang tuoiSong = new QuayTuoiSong();
                                tuoiSong.add();
                            }
                            case 4 -> {
                                System.out.println("---------Thêm Khác---------");
                                KhoHang khac = new QuayKhac();
                                khac.add();
                            }
                            case 5 -> {
                                int endNhanSu = 0;
                                do {
                                    nhanSu();
                                    switch (luaChon()) {
                                        case 1 -> {
                                            NhanSu baoVe = new BaoVe();
                                            baoVe.add();
                                        }
                                        case 2 -> {
                                            NhanSu laoCong = new LaoCong();
                                            laoCong.add();
                                        }
                                        case 3 -> {
                                            NhanSu nhanVien = new NhanVien();
                                            nhanVien.add();
                                        }
                                        case 4 -> {
                                            endNhanSu = 1;
                                        }
                                        default -> {
                                            System.out.println("Không có lựa chọn này!");
                                        }
                                    }
                                } while (endNhanSu == 0);
                            }
                            case 6 -> {
                                endThem = 1;
                            }
                            default -> {
                                System.out.println("Không có lựa chọn này!");
                            }
                        }
                    } while (endThem == 0);
                }
                case 2 -> {
                    int endXoa = 0;
                    do {
                        xoa();
                        switch (luaChon()) {
                            case 1 -> {
                                KhoHang khoHang = new QuayGiaDung();
                                khoHang.del();
                            }
                            case 2 -> {
                                KhoHang khoHang = new QuayNuoc();
                                khoHang.del();
                            }
                            case 3 -> {
                                KhoHang khoHang = new QuayTuoiSong();
                                khoHang.del();
                            }
                            case 4 -> {
                                KhoHang khoHang = new QuayKhac();
                                khoHang.del();
                            }
                            case 5 -> {
                                int endNhanSu = 0;
                                do {
                                    nhanSu();
                                    switch (luaChon()) {
                                        case 1 -> {
                                            NhanSu baoVe = new BaoVe();
                                            baoVe.del();
                                        }
                                        case 2 -> {
                                            NhanSu baoVe = new LaoCong();
                                            baoVe.del();
                                        }
                                        case 3 -> {
                                            NhanSu baoVe = new NhanVien();
                                            baoVe.del();
                                        }
                                        case 4 -> {
                                            endNhanSu = 1;
                                        }
                                        default -> {
                                            System.out.println("Không có lựa chọn này!");
                                        }
                                    }
                                } while (endNhanSu == 0);
                            }
                            case 6 -> {
                                endXoa = 1;
                            }
                            default -> {
                                System.out.println("Không có lựa chọn này!");
                            }
                        }
                    } while (endXoa == 0);
                }
                case 3 -> {
                    int endSua = 0;
                    do {
                        sua();
                        switch (luaChon()) {
                            case 1 -> {
                                KhoHang.xuatGiaDung();
                                KhoHang khoHang = new QuayGiaDung();
                                khoHang.SuaThongTin();
                            }
                            case 2 -> {
                                KhoHang.xuatNuoc();
                                KhoHang khoHang = new QuayNuoc();
                                khoHang.SuaThongTin();
                            }
                            case 3 -> {
                                KhoHang.xuatTuoiSong();
                                KhoHang khoHang = new QuayTuoiSong();
                                khoHang.SuaThongTin();
                            }
                            case 4 -> {
                                KhoHang.xuatKhac();
                                KhoHang khoHang = new QuayKhac();
                                khoHang.SuaThongTin();
                            }
                            case 5 -> {
                                int endNhanSu = 0;
                                do {
                                    nhanSu();
                                    switch (luaChon()) {
                                        case 1 -> {
                                            NhanSu baoVe = new BaoVe();
                                            baoVe.del();
                                        }
                                        case 2 -> {
                                            NhanSu baoVe = new LaoCong();
                                            baoVe.del();
                                        }
                                        case 3 -> {
                                            NhanSu baoVe = new NhanVien();
                                            baoVe.del();
                                        }
                                        case 4 -> {
                                            endNhanSu = 1;
                                        }
                                        default -> {
                                            System.out.println("Không có lựa chọn này!");
                                        }
                                    }
                                } while (endNhanSu == 0);
                            }
                            case 6 -> {
                                endSua = 1;
                            }
                            default -> {
                                System.out.println("Không có lựa chọn này!");
                            }
                        }
                    } while (endSua == 0);
                }
                case 4 -> {
                    int endTimKiem = 0;
                    do {
                        timKiem();
                        switch (luaChon()) {
                            case 1 -> {
                                KhoHang khoHang = new QuayGiaDung();
                                khoHang.TimKiem();
                            }
                            case 2 -> {
                                KhoHang khoHang = new QuayNuoc();
                                khoHang.TimKiem();
                            }
                            case 3 -> {
                                KhoHang khoHang = new QuayTuoiSong();
                                khoHang.TimKiem();
                            }
                            case 4 -> {
                                KhoHang khoHang = new QuayKhac();
                                khoHang.TimKiem();
                            }
                            case 5 -> {
                                int endNhanSu = 0;
                                do {
                                    nhanSu();
                                    switch (luaChon()) {
                                        case 1 -> {
                                            NhanSu baoVe = new BaoVe();
                                            baoVe.TimKiem();
                                        }
                                        case 2 -> {
                                            NhanSu laoCong = new LaoCong();
                                            laoCong.TimKiem();
                                        }
                                        case 3 -> {
                                            NhanSu nhanVien = new NhanVien();
                                            nhanVien.TimKiem();
                                        }
                                        case 4 -> {
                                            endNhanSu = 1;
                                        }
                                        default -> {
                                            System.out.println("Không có lựa chọn này!");
                                        }
                                    }
                                } while (endNhanSu == 0);
                            }
                            case 6 -> {
                                endTimKiem = 1;
                            }
                            default -> {
                                System.out.println("Không có lựa chọn này!");
                            }
                        }
                    } while (endTimKiem == 0);
                }
                case 5 -> {
                    int endThongTin = 0;
                    do {
                        thongTin();
                        switch (luaChon()) {
                            case 1 -> {
                                danhSach();
                                switch (luaChon()) {
                                    case 1 -> {
                                        KhoHang.xuatGiaDung();
                                        KhoHang.xuatNuoc();
                                        KhoHang.xuatTuoiSong();
                                        KhoHang.xuatKhac();
                                    }
                                    case 2 -> {
                                        NhanSu.xuatBaoVe();
                                        NhanSu.xuatLaoCong();
                                        NhanSu.xuatNhanVien();
                                    }
                                    case 3 -> {

                                    }
                                    default -> {
                                        System.out.println("Không có lựa chọn này!");
                                    }
                                }
                            }
                            case 2 -> {
                                danhSach();
                                switch (luaChon()) {
                                    case 1 -> {
                                        KhoHang.outputFile("src/Database/output.txt");
                                    }
                                    case 2 -> {
                                        NhanSu.outputFile("src/Database/outputNhanVien.txt");
                                    }
                                    case 3 -> {

                                    }
                                    default -> {
                                        System.out.println("Không có lựa chọn này!");
                                    }
                                }
                                System.out.println("Đã xuất ra file thành công!");
                            }
                            case 3 -> {
                                endThongTin = 1;
                            }
                            default -> {
                                System.out.println("Không có lựa chọn này!");
                            }
                        }
                    } while (endThongTin == 0);
                }
                case 6 -> {
                    endAdmin = 1;
                    Main.endCuaHang(endAdmin);
                    System.out.println("Cảm ơn đã sử dụng phần mền!");
                }
                default -> {
                    System.out.println("Không có lựa chọn này!");
                }
            }
        } while (endAdmin == 0);
    }

    public void menu() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Quản lý              |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Thêm                      |");
        System.out.println("|    2. Xoá                       |");
        System.out.println("|    3. Sửa                       |");
        System.out.println("|    4. Tìm Kiếm                  |");
        System.out.println("|    5. Hiện Danh Sách Thông Tin  |");
        System.out.println("|    6. Thoát                     |");
        System.out.println("+---------------------------------+");
    }

    private void them() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Them                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Thêm Gia Dụng              |");
        System.out.println("|   2. Thêm Nước                  |");
        System.out.println("|   3. Thêm Tươi Sống             |");
        System.out.println("|   4. Thêm Khác                  |");
        System.out.println("|   5. Thêm Nhân Sự               |");
        System.out.println("|   6. Trở về                     |");
        System.out.println("+---------------------------------+");
    }

    private int luaChon() {
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}