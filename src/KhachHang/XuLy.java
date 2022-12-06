package KhachHang;

import KhoHang.KhoHang;
import Quay.QuayGiaDung;
import Quay.QuayKhac;
import Quay.QuayNuoc;
import Quay.QuayTuoiSong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XuLy implements Mua, GioHang {
    static final String formatTieuDe = "%s %.3s %s %-15s %s %-13s %s %-15s %s %-10s %s %-10s %s %-15s %s\n";
    static final String formatOutput = "%s %3d %s %-15s %s %-13s %s %-15s %s %-10s %s %-10d %s %-15.3f %s\n";
    static double tongGia;
    static List<XuLy> ListGioHang = new ArrayList<XuLy>(); // lưu giỏ hàng
    static List<XuLy> ListHoaDon = new ArrayList<XuLy>(); // lưu những hàng đã mua để in ra hóa đơn
    public String name;
    public String id;
    public String NgayNhap;
    public String XuatXu;
    public int Sl;
    public float Gia;

    public XuLy() {
    }

    public XuLy(String name, String id, String ngayNhap, String xuatXu, int sl, float gia) {
        this.name = name;
        this.id = id;
        NgayNhap = ngayNhap;
        XuatXu = xuatXu;
        Sl = sl;
        Gia = gia;
    }

    /* ---------------------------------------------------------------------------------------------------------------------------------------*/
    // METHOD MUA BÁN
    public void muaTuoiSong() {
        Scanner sc = new Scanner(System.in);
        QuayTuoiSong quayTuoiSongxem = new QuayTuoiSong();
        KhoHang.xuatTuoiSong();
        float giaChung;
        int sl = 0;
        System.out.println("------------Mua Hàng---------------");

        System.out.print("Nhập ID loại tươi sống cần mua : ");
        id = sc.nextLine();

        try {
            System.out.print("Nhập số lượng mua: ");
            sl = sc.nextInt();
            sc.nextLine();
        } catch (Exception nhap) {
            System.out.println("Giá trị không hợp lệ ! Hãy nhập lại");
        }

        for (QuayTuoiSong quayTuoiSong : KhoHang.tuoisongList) {
            if (quayTuoiSong.getMaSo().equals(id)) {
                if (quayTuoiSong.getSoLuong() < sl) {
                    System.out.println("LƯU Ý : Số lượng không đủ để cung cấp !");
                    break;
                } else {
                    System.out.println("Đã mua thành công !");
                    quayTuoiSong.setSoLuong(quayTuoiSong.getSoLuong() - sl);
                    giaChung = quayTuoiSong.getGiaCa() * sl;
                    XuLy hoaDon1 = new XuLy(quayTuoiSong.getTen(), quayTuoiSong.getMaSo(), quayTuoiSong.getNgayNhapHang(), quayTuoiSong.getXuatXu(), sl, giaChung);
                    XuLy.ListHoaDon.add(hoaDon1);
                    tongGia = tongGia + giaChung;
                }
            }
        }
    }

    public void muaGiaDung() {
        Scanner sc = new Scanner(System.in);

        QuayGiaDung quayGiaDungXem = new QuayGiaDung();
        KhoHang.xuatGiaDung();
        float giaChung;
        int sl = 0;
        System.out.println("------------Mua Hàng---------------");

        System.out.print("Nhập ID loại gia dụng cần mua : ");
        String id = sc.nextLine();

        try {
            System.out.print("Nhập số lượng mua: ");
            sl = sc.nextInt();
            sc.nextLine();
        } catch (Exception nhap) {
            System.out.println("Giá trị không hợp lệ ! Hãy nhập lại");
        }

        for (QuayGiaDung quayGiaDung : KhoHang.giadungList) {
            if (quayGiaDung.getMaSo().equals(id)) {
                if (quayGiaDung.getSoLuong() < sl) {
                    System.out.println("LƯU Ý : Số lượng không đủ để cung cấp !");
                    break;
                } else {
                    System.out.println("Đã mua thành công !");
                    quayGiaDung.setSoLuong(quayGiaDung.getSoLuong() - sl);
                    giaChung = quayGiaDung.getGiaCa() * sl;
                    XuLy hoaDon2 = new XuLy(quayGiaDung.getTen(), quayGiaDung.getMaSo(), quayGiaDung.NgayNhapHang, quayGiaDung.XuatXu, sl, giaChung);
                    XuLy.ListHoaDon.add(hoaDon2);
                    tongGia = tongGia + giaChung;
                }
            }
        }
    }

    public void muaNuocUong() {
        Scanner sc = new Scanner(System.in);

        QuayNuoc quayNuocUongxem = new QuayNuoc();
        KhoHang.xuatNuoc();
        float giaChung;
        int sl = 0;
        System.out.println("------------Mua Hàng---------------");

        System.out.print("Nhập ID loại nước uống cần mua : ");
        String id = sc.nextLine();

        try {
            System.out.print("Nhập số lượng mua: ");
            sl = sc.nextInt();
            sc.nextLine();
        } catch (Exception nhap) {
            System.out.println("Giá trị không hợp lệ ! Hãy nhập lại");
        }

        for (QuayNuoc quayNuocUong : KhoHang.nuocList) {
            if (quayNuocUong.getMaSo().equals(id)) {
                if (quayNuocUong.getSoLuong() < sl) {
                    System.out.println("LƯU Ý : Số lượng không đủ để cung cấp !");
                    break;
                } else {
                    System.out.println("Đã mua thành công !");
                    quayNuocUong.setSoLuong(quayNuocUong.getSoLuong() - sl);
                    giaChung = quayNuocUong.getGiaCa() * sl;
                    XuLy hoaDon3 = new XuLy(quayNuocUong.getTen(), quayNuocUong.getMaSo(), quayNuocUong.NgayNhapHang, quayNuocUong.XuatXu, sl, giaChung);
                    XuLy.ListHoaDon.add(hoaDon3);
                    tongGia = tongGia + giaChung;
                }
            }
        }
    }

    public void muaKhac() {
        Scanner sc = new Scanner(System.in);

        QuayKhac quayKhacxem = new QuayKhac();
        KhoHang.xuatKhac();
        float giaChung;
        int sl = 0;
        System.out.println("------------Mua Hàng---------------");

        System.out.print("Nhập ID loại hàng cần mua : ");
        String id = sc.nextLine();

        try {
            System.out.print("Nhập số lượng mua: ");
            sl = sc.nextInt();
            sc.nextLine();
        } catch (Exception nhap) {
            System.out.println("Giá trị không hợp lệ ! Hãy nhập lại");
        }

        for (QuayKhac quayKhac : KhoHang.quaykhacList) {
            if (quayKhac.getMaSo().equals(id)) {
                if (quayKhac.getSoLuong() < sl) {
                    System.out.println("LƯU Ý : Số lượng không đủ để cung cấp !");
                    break;
                } else {
                    System.out.println("Đã mua thành công !");
                    quayKhac.setSoLuong(quayKhac.getSoLuong() - sl);
                    giaChung = quayKhac.getGiaCa() * sl;
                    XuLy hoaDon4 = new XuLy(quayKhac.getTen(), quayKhac.getMaSo(), quayKhac.NgayNhapHang, quayKhac.getXuatXu(), sl, giaChung);
                    XuLy.ListHoaDon.add(hoaDon4);
                    tongGia = tongGia + giaChung;
                }
            }
        }
    }

    /* ---------------------------------------------------------------------------------------------------------------------------------------*/
    // METHOD GIỎ HÀNG
    public void themVaoGioHang() {
        Scanner sc = new Scanner(System.in);
        int whilegiohang = 0;
        do {
            menuGioHang();
            int luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {

                case 1 -> {

                    KhoHang.xuatTuoiSong();

                    System.out.print("Nhập ID tươi sống cần thêm vào giỏ : ");
                    String ID1 = sc.nextLine();
                    int sl1 = 0;
                    try {
                        System.out.print("Nhập số lượng mua: ");
                        sl1 = sc.nextInt();
                    } catch (Exception e) {
                        sc.nextLine();
                        System.out.println("Nhập không hợp lệ ! ");
                    }

                    for (QuayTuoiSong quayTuoiSong : KhoHang.tuoisongList) {
                        if (quayTuoiSong.getMaSo().equals(ID1)) {
                            while (sl1 > quayTuoiSong.getSoLuong()) {
                                System.out.println("Số lượng không hợp lệ, hãy nhập lại !");
                                System.out.print("Nhập số lượng thêm vào giỏ : ");
                                sl1 = sc.nextInt();
                            }
                            XuLy xuLy1 = new XuLy(quayTuoiSong.getTen(), ID1, quayTuoiSong.NgayNhapHang, quayTuoiSong.getXuatXu(), sl1, quayTuoiSong.getGiaCa());
                            ListGioHang.add(xuLy1);
                        }
                    }
                }
                case 2 -> {
                    KhoHang.xuatGiaDung();
                    System.out.print("Nhập ID loại gia dụng cần thêm vào giỏ : ");
                    String ID2 = sc.nextLine();

                    int sl2 = 0;
                    try {
                        System.out.print("Nhập số lượng mua: ");
                        sl2 = sc.nextInt();
                    } catch (Exception e) {
                        sc.nextLine();
                        System.out.println("Nhập không hợp lệ ! ");
                    }

                    for (QuayGiaDung quayGiaDung : KhoHang.giadungList) {
                        if (quayGiaDung.getMaSo().equals(ID2)) {
                            while (sl2 > quayGiaDung.getSoLuong()) {
                                System.out.println("Số lượng không hợp lệ, hãy nhập lại !");
                                System.out.print("Nhập số lượng thêm vào giỏ : ");
                                sl2 = sc.nextInt();
                            }
                            XuLy xuLy2 = new XuLy(quayGiaDung.getTen(), ID2, quayGiaDung.NgayNhapHang, quayGiaDung.getXuatXu(), sl2, quayGiaDung.getGiaCa());
                            ListGioHang.add(xuLy2);
                        }
                    }
                }
                case 3 -> {
                    KhoHang.xuatNuoc();
                    System.out.print("Nhập ID loại nước cần thêm vào giỏ : ");
                    String ID3 = sc.nextLine();

                    int sl3 = 0;
                    try {
                        System.out.print("Nhập số lượng mua: ");
                        sl3 = sc.nextInt();
                    } catch (Exception e) {
                        sc.nextLine();
                        System.out.println("Nhập không hợp lệ ! ");
                    }

                    for (QuayNuoc quayNuocUong : KhoHang.nuocList) {
                        if (quayNuocUong.getMaSo().equals(ID3)) {
                            while (sl3 > quayNuocUong.getSoLuong()) {
                                System.out.println("Số lượng không hợp lệ, hãy nhập lại !");
                                System.out.print("Nhập số lượng thêm vào giỏ : ");
                                sl3 = sc.nextInt();
                            }
                            XuLy xuLy3 = new XuLy(quayNuocUong.getTen(), ID3, quayNuocUong.NgayNhapHang, quayNuocUong.getXuatXu(), sl3, quayNuocUong.getGiaCa());
                            ListGioHang.add(xuLy3);
                        }
                    }
                }
                case 4 -> {
                    KhoHang.xuatKhac();
                    System.out.print("Nhập ID loại khác cần thêm vào giỏ : ");
                    String ID4 = sc.nextLine();

                    int sl4 = 0;
                    try {
                        System.out.print("Nhập số lượng mua: ");
                        sl4 = sc.nextInt();
                    } catch (Exception e) {
                        sc.nextLine();
                        System.out.println("Nhập không hợp lệ ! ");
                    }

                    for (QuayKhac quayKhac : KhoHang.quaykhacList) {
                        if (quayKhac.getMaSo().equals(ID4)) {
                            while (sl4 > quayKhac.getSoLuong()) {
                                System.out.println("Số lượng không hợp lệ, hãy nhập lại ! ");
                                System.out.print("Nhập số lượng thêm vào giỏ : ");
                                sl4 = sc.nextInt();
                            }
                            XuLy xuLy4 = new XuLy(quayKhac.getTen(), ID4, quayKhac.NgayNhapHang, quayKhac.getXuatXu(), sl4, quayKhac.getGiaCa());
                            ListGioHang.add(xuLy4);
                        }
                    }
                }
                case 5 -> {
                    if (ListGioHang.size() != 0) {
                        System.out.println("Giỏ hàng hiện tại gồm : ");
                        System.out.print("+");
                        for (int i = 0; i < 101; i++) {
                            System.out.print("-");
                        }
                        System.out.println("+");
                        System.out.printf(formatTieuDe,
                                "|", "STT", "|", "Tên Sản Phẩm", "|", "Mã Sản Phẩm", "|", "Ngày Nhập Hàng", "|", "Xuất Xứ", "|", "Số Lượng", "|", "Giá Cả", "|");
                        System.out.print("+");
                        for (int i = 0; i < 101; i++) {
                            System.out.print("-");
                        }
                        System.out.println("+");
                        int a = 0;
                        for (XuLy giohang : ListGioHang) {
                            String name = giohang.getName();
                            String id = giohang.getId();
                            String ngayNhap = giohang.getNgayNhap();
                            String xuatXu = giohang.getXuatXu();
                            int sl = giohang.getSl();
                            float gia = giohang.getGia();

                            System.out.printf(formatOutput
                                    , "|", a, "|", name, "|", id, "|", ngayNhap, "|", xuatXu, "|", sl, "|", gia, "|");
                            a++;
                        }
                        System.out.print("+");
                        for (int i = 0; i < 101; i++) {
                            System.out.print("-");
                        }
                        System.out.println("+");
                    } else
                        System.out.println("Giỏ hàng của bạn đang trống. Hãy kham khảo các mặt hàng ưa thích và thêm vào giỏ !");
                }
                case 6 -> {
                    whilegiohang = 1;
                }
            }

        } while (whilegiohang == 0);
    }


    public void ThongTinKhachHang() {

    }

    private void menuGioHang() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+----------------------------------------------------+");
        System.out.println("|                  Thêm vào giỏ hàng                 |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|  1. Thêm loại hàng ở quẩy tươi sống vào giỏ hàng   |");
        System.out.println("|  2. Thêm loại hàng ở quẩy gia dụng vào giỏ hàng    |");
        System.out.println("|  3. Thêm loại hàng ở quẩy nước uống vào giỏ hàng   |");
        System.out.println("|  4. Thêm loại hàng ở quẩy khác vào giỏ hàng        |");
        System.out.println("|  5. Xem giỏ hàng hiện tại                          |");
        System.out.println("|  6. Thoát                                          |");
        System.out.println("+----------------------------------------------------+");
        System.out.print("Nhập lựa chọn: ");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public float getGia() {
        return Gia;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public int getSl() {
        return Sl;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    //xuất hàng hóa mua
    @Override
    public String toString() {
        return "|        " + name + "    " + id + "    " + NgayNhap + "    " + XuatXu + "    " + Sl + "      " + Gia + "        |";
    }
}