package KhoHang;

import Main.ThongTin;
import Quay.QuayGiaDung;
import Quay.QuayKhac;
import Quay.QuayNuoc;
import Quay.QuayTuoiSong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class KhoHang extends ThongTin {
    private static final String formatHangHoaTieuDe = "%s %.3s %s %-15s %s %-13s %s %-15s %s %-10s %s %-10s %s %-15s %s\n";
    private static final String formatHangHoaOutput = "%s %3d %s %-15s %s %-13s %s %-15s %s %-10s %s %-10d %s %-15.3f %s\n";
    public static List<QuayKhac> quaykhacList = new ArrayList<>();
    public static List<QuayGiaDung> giadungList = new ArrayList<>();
    public static List<QuayNuoc> nuocList = new ArrayList<>();
    public static List<QuayTuoiSong> tuoisongList = new ArrayList<>();
    public String NgayNhapHang;
    public String XuatXu;
    public int SoLuong;
    public float GiaCa; //giá muốn bán


    public KhoHang(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo);
        this.NgayNhapHang = NgayNhapHang;
        this.XuatXu = XuatXu;
        this.SoLuong = SoLuong;
        this.GiaCa = GiaCa;
    }

    public KhoHang() {

    }

    // Quay gia dung
    public static void xuatGiaDung() {
        System.out.println("***Quầy Gia Dụng***");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.printf(formatHangHoaTieuDe,
                "|", "STT", "|", "Tên Sản Phẩm", "|", "Mã Sản Phẩm", "|", "Ngày Nhập Hàng", "|", "Xuất Xứ", "|", "Số Lượng", "|", "Giá Cả", "|");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        int a = 1;
        for (QuayGiaDung giaDung : giadungList) {
            String ten = giaDung.getTen();
            String maSo = giaDung.getMaSo();
            String ngayNhapHang = giaDung.getNgayNhapHang();
            String xuatXu = giaDung.getXuatXu();
            int soLuong = giaDung.getSoLuong();
            float giaCa = giaDung.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", maSo, "|", ngayNhapHang, "|", xuatXu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    // Quay thuc pham
    public static void xuatNuoc() {
        System.out.println("***Quầy Nước***");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.printf(formatHangHoaTieuDe,
                "|", "STT", "|", "Tên Sản Phẩm", "|", "Mã Sản Phẩm", "|", "Ngày Nhập Hàng", "|", "Xuất Xứ", "|", "Số Lượng", "|", "Giá Cả", "|");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        int a = 1;
        for (QuayNuoc nuoc : nuocList) {
            String ten = nuoc.getTen();
            String maSo = nuoc.getMaSo();
            String ngayNhapHang = nuoc.getNgayNhapHang();
            String xuatXu = nuoc.getXuatXu();
            int soLuong = nuoc.getSoLuong();
            float giaCa = nuoc.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", maSo, "|", ngayNhapHang, "|", xuatXu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //Quay tuoi song
    public static void xuatTuoiSong() {
        System.out.println("***Quầy Tươi Sống***");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.printf(formatHangHoaTieuDe,
                "|", "STT", "|", "Tên Sản Phẩm", "|", "Mã Sản Phẩm", "|", "Ngày Nhập Hàng", "|", "Xuất Xứ", "|", "Số Lượng", "|", "Giá Cả", "|");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        int a = 1;
        for (QuayTuoiSong tuoiSong : tuoisongList) {
            String ten = tuoiSong.getTen();
            String maSo = tuoiSong.getMaSo();
            String ngayNhapHang = tuoiSong.getNgayNhapHang();
            String xuatXu = tuoiSong.getXuatXu();
            int soLuong = tuoiSong.getSoLuong();
            float giaCa = tuoiSong.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", maSo, "|", ngayNhapHang, "|", xuatXu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //Quay khac
    public static void xuatKhac() {
        System.out.println("***Quầy Khác***");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.printf(formatHangHoaTieuDe,
                "|", "STT", "|", "Tên Sản Phẩm", "|", "Mã Sản Phẩm", "|", "Ngày Nhập Hàng", "|", "Xuất Xứ", "|", "Số Lượng", "|", "Giá Cả", "|");
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        int a = 1;
        for (QuayKhac khac : quaykhacList) {
            String ten = khac.getTen();
            String maSo = khac.getMaSo();
            String ngayNhapHang = khac.getNgayNhapHang();
            String xuatXu = khac.getXuatXu();
            int soLuong = khac.getSoLuong();
            float giaCa = khac.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", maSo, "|", ngayNhapHang, "|", xuatXu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //out put ra file
    public static void outputFile(String URL) throws IOException {
        File file = new File(URL);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        //in quay tuoi song
        int a = 1;
        outputStreamWriter.write("***Quầy Tươi Sống***\n");
        for (QuayTuoiSong tuoiSong : tuoisongList) {
            outputStreamWriter.write(a + " ");
            outputStreamWriter.write(String.valueOf(tuoiSong));
            outputStreamWriter.write("\n");
            a++;
        }

        a = 1;
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Quầy Gia Dụng***\n");
        for (QuayGiaDung giaDung : giadungList) {
            outputStreamWriter.write(a + " ");
            outputStreamWriter.write(String.valueOf(giaDung));
            outputStreamWriter.write("\n");
            a++;
        }

        a = 1;
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Quầy Nước***\n");
        for (QuayNuoc nuoc : nuocList) {
            outputStreamWriter.write(a + " ");
            outputStreamWriter.write(String.valueOf(nuoc));
            outputStreamWriter.write("\n");
            a++;
        }

        a = 1;
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Quầy Khác***\n");
        for (QuayKhac khac : quaykhacList) {
            outputStreamWriter.write(a + " ");
            outputStreamWriter.write(String.valueOf(khac));
            outputStreamWriter.write("\n");
            a++;
        }
        outputStreamWriter.flush();
    }

    public String getNgayNhapHang() {
        return NgayNhapHang;
    }

    public void setNgayNhapHang(String NgayNhapHang) {
        this.NgayNhapHang = NgayNhapHang;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaCa() {
        return GiaCa;
    }

    public void setGiaCa(float GiaCa) {
        this.GiaCa = GiaCa;
    }

    public abstract void add();

    public abstract void del();

    public abstract void showThongTin();

    public abstract void TimKiem();

    public abstract void SuaThongTin();

    public abstract void inputFile(String URL) throws IOException;
}