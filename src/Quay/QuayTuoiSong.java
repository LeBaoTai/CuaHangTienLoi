package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuayTuoiSong extends KhoHang {
    private static final String formatHangHoaTieuDe = "%s %.3s %s %-15s %s %-13s %s %-15s %s %-10s %s %-10s %s %-15s %s\n";
    private static final String formatHangHoaOutput = "%s %3d %s %-15s %s %-13s %s %-15s %s %-10s %s %-10d %s %-15.3f %s\n";
    public static int soLuong = 0;
    public static float giaCa = 0;

    public QuayTuoiSong(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }

    public QuayTuoiSong() {

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên sản phẩm: ");
        String Ten = sc.nextLine();
        System.out.print("Mã sản phẩm: ");
        String MaSo = sc.nextLine();
        System.out.print("Ngày nhập hàng: ");
        String NgayNhapHang = sc.nextLine();
        System.out.print("Xuất xứ: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.print("Số lượng nhập vào: ");
            try {
                soLuong = sc.nextInt();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (soLuong == 0);

        do {
            System.out.print("Giá dự định: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (giaCa == 0);
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        tuoisongList.add(tuoisong);
    }

    public void del() {
        KhoHang.xuatTuoiSong();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sản phẩm muốn xoá: ");
        String MaSo = sc.nextLine();
        QuayTuoiSong tuoisong = tuoisongList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (tuoisong == null) {
            System.out.println("Khong Ton Tai.");
        }
        tuoisongList.remove(tuoisong);
        System.out.println("Xac Nhan Xoa.");
    }

    @Override
    public void showThongTin() {
//        this.nuocList.forEach(o -> System.out.println(o.toString()));
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.printf(formatHangHoaTieuDe,
                "|", "STT", "|", "Ten San Pham", "|", "Ma San Pham", "|", "Ngay Nhap Hang", "|", "Xuat Su", "|", "So Luong", "|", "Gia Ca", "|");
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
            String xuatSu = tuoiSong.getXuatXu();
            int soLuong = tuoiSong.getSoLuong();
            float giaCa = tuoiSong.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", maSo, "|", ngayNhapHang, "|", xuatSu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public List<QuayTuoiSong> TimKiemTuoiSong(String MaSo) {
        return tuoisongList.stream().filter(o -> o.getMaSo().contains(MaSo)).collect(Collectors.toList());
    }

    @Override
    public void TimKiem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma san pham muon tim: ");
        String a = sc.nextLine();
        TimKiemTuoiSong(a).forEach(tuoiSong -> {
            System.out.println(tuoiSong.toString());
        });
    }

    public List<QuayTuoiSong> SuaThongTinQuayTuoiSong(int stt, QuayTuoiSong tuoisong) {
        tuoisongList.set(stt, tuoisong);
        return tuoisongList;
    }

    @Override
    public void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập STT muốn sửa thông tin: ");
        int a = sc.nextInt();
        System.out.print("Tên sản phẩm: ");
        sc.nextLine();
        String Ten = sc.nextLine();
        System.out.print("Mã sản phẩm: ");
        String MaSo = sc.nextLine();
        System.out.print("Ngày nhập hàng: ");
        String NgayNhapHang = sc.nextLine();
        System.out.print("Xuất xứ: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.print("Số lượng nhập vào: ");
            try {
                soLuong = sc.nextInt();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (soLuong == 0);

        do {
            System.out.print("Giá dự định: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (giaCa == 0);
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        SuaThongTinQuayTuoiSong(a - 1, tuoisong);
    }

    @Override
    public void inputFile(String URL) throws IOException {
        File file = new File(URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] row = line.split(",");
            String ten = row[0];
            String maSo = row[1];
            String ngayNhapHang = row[2];
            String xuatSu = row[3];
            int soLuong = Integer.parseInt(row[4]);
            float giaCa = Float.parseFloat(row[5]);

            QuayTuoiSong tuoiSong = new QuayTuoiSong(ten, maSo, ngayNhapHang, xuatSu, soLuong, giaCa);
            tuoisongList.add(tuoiSong);
        }
        reader.close();
    }

    @Override
    public String toString() {
        return ".Tên sản phẩm: " + Ten + " - "
                + "Mã sản phẩm: " + MaSo + " - "
                + "Xuất xứ: " + XuatXu + " - "
                + "Số lượng: " + SoLuong + " - "
                + "Giá cả: " + GiaCa;
    }
}
