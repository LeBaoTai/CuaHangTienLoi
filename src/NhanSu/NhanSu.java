package NhanSu;

import Main.ThongTin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class NhanSu extends ThongTin {
    public static List<BaoVe> baoveList = new ArrayList<>();
    public static List<LaoCong> laocongList = new ArrayList<>();
    public static List<NhanVien> nhanvienList = new ArrayList<>();
    static String formatTieuDe = "%s %.3s %s %-10s %s %-15s %s %-10s %s %-10s %s %-15s %s %-12s %s %-9s %s\n";
    static String formatOutput = "%s %3d %s %-10s %s %-15s %s %-10s %s %-10s %s %-15s %s %-12s %s %-9s %s\n";
    public String CCCD;
    public String GioiTinh;
    public String MaSo;
    public String DiaChi;
    public String SDT;
    public float Luong;

    public NhanSu(String Ten, String MaSo, String CCCD, String GioiTinh, String DiaChi, String SDT, float Luong) {
        super(Ten, MaSo);
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.MaSo = MaSo;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Luong = Luong;
    }

    public NhanSu() {

    }

    //Bảo Vệ
    public static void xuatBaoVe() {
        System.out.println("***Bảo Vệ***");
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.printf(formatTieuDe,
                "|", "STT", "|", "Họ và Tên", "|", "Mã số nhân viên", "|", "CCCD", "|", "Giới tính", "|", "Địa chỉ", "|", "SDT", "|", "Lương", "|");
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // chỉnh số thứ tự tăn dần
        int a = 1;
        for (BaoVe baoVe : baoveList) {
            String ten = baoVe.getTen();
            String maSo = baoVe.getMaSo();
            String cccd = baoVe.getCCCD();
            String gioTinh = baoVe.getGioiTinh();
            String diaChi = baoVe.getDiaChi();
            String sdt = baoVe.getSDT();
            float luong = baoVe.getLuong();

            System.out.printf(formatOutput,
                    "|", a, "|", ten, "|", maSo, "|", cccd, "|", gioTinh, "|", diaChi, "|", sdt, "|", luong, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //Lao Công
    public static void xuatLaoCong() {
        System.out.println("***Lao Công***");
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.printf(formatTieuDe,
                "|", "STT", "|", "Họ và Tên", "|", "Mã số nhân viên", "|", "CCCD", "|", "Giới tính", "|", "Địa chỉ", "|", "SDT", "|", "Lương", "|");
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // chỉnh số thứ tự tăn dần
        int a = 1;
        for (LaoCong laoCong : laocongList) {
            String ten = laoCong.getTen();
            String maSo = laoCong.getMaSo();
            String cccd = laoCong.getCCCD();
            String gioTinh = laoCong.getGioiTinh();
            String diaChi = laoCong.getDiaChi();
            String sdt = laoCong.getSDT();
            float luong = laoCong.getLuong();

            System.out.printf(formatOutput,
                    "|", a, "|", ten, "|", maSo, "|", cccd, "|", gioTinh, "|", diaChi, "|", sdt, "|", luong, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //Nhân Viên Bán Hàng
    public static void xuatNhanVien() {
        System.out.println("***Nhân Viên***");
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.printf(formatTieuDe,
                "|", "STT", "|", "Họ và Tên", "|", "Mã số nhân viên", "|", "CCCD", "|", "Giới tính", "|", "Địa chỉ", "|", "SDT", "|", "Lương", "|");
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // chỉnh số thứ tự tăn dần
        int a = 1;
        for (NhanVien nhanVien : nhanvienList) {
            String ten = nhanVien.getTen();
            String maSo = nhanVien.getMaSo();
            String cccd = nhanVien.getCCCD();
            String gioTinh = nhanVien.getGioiTinh();
            String diaChi = nhanVien.getDiaChi();
            String sdt = nhanVien.getSDT();
            float luong = nhanVien.getLuong();

            System.out.printf(formatOutput,
                    "|", a, "|", ten, "|", maSo, "|", cccd, "|", gioTinh, "|", diaChi, "|", sdt, "|", luong, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void outputFile(String URL) throws IOException {
        File file = new File(URL);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        outputStreamWriter.write("***Bảo Vệ***\n");
        for (BaoVe baoVe : baoveList) {
            outputStreamWriter.write(String.valueOf(baoVe));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Lao Công***\n");
        for (LaoCong laoCong : laocongList) {
            outputStreamWriter.write(String.valueOf(laoCong));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Nhân Viên***\n");
        for (NhanVien nhanVien : nhanvienList) {
            outputStreamWriter.write(String.valueOf(nhanVien));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }

    public String getCCCD() {
        return CCCD;
    }

    public void getCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public float getLuong() {
        return Luong;
    }

    public void getLuong(float Luong) {
        this.Luong = Luong;
    }

    public abstract void add();

    public abstract void del();

    public abstract void TimKiem();

    public abstract void SuaThongTin();

    public abstract void inputFile(String URL) throws IOException;
}