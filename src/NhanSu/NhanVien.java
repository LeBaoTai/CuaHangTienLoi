package NhanSu;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NhanVien extends NhanSu {
    public static int stt = 1;
    public static float luong = 0;

    public NhanVien(String Ten, String MaSo, String CCCD, String GioiTinh, String DiaChi, String SDT, float Luong) {
        super(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        stt += 1;
    }

    public NhanVien() {

    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên nhân viên: ");
        String Ten = sc.nextLine();
        System.out.print("Mã nhân viên: ");
        String MaSo = sc.nextLine();
        System.out.print("Căn cước công dân: ");
        String CCCD = sc.nextLine();
        System.out.print("Giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.print("Số điện thoại: ");
        String SDT = sc.nextLine();
        do {
            System.out.print("Lương: ");
            try {
                luong = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (luong == 0);
        NhanVien nhanvien = new NhanVien(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, luong);
        nhanvienList.add(nhanvien);
    }

    @Override
    public void del() {
        NhanSu.xuatNhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã Nhân Viên Muốn Sa Thải: ");
        String MaSo = sc.nextLine();
        NhanVien nhanVien = nhanvienList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (nhanVien == null) {
            System.out.println("Nhân Viên Không Tồn Tại!!!!!");
        }
        nhanvienList.remove(nhanVien);
        System.out.println("Xác Nhận Sa Thải Nhân Viên.");
    }

    public List<NhanVien> SuaThongTinNhanVien(int stt, NhanVien nhanVien) {
        nhanvienList.set(stt, nhanVien);
        return nhanvienList;
    }

    @Override
    public void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn sửa: ");
        int a = sc.nextInt();
        System.out.print("Tên nhân viên: ");
        sc.nextLine();
        String Ten = sc.nextLine();
        System.out.print("Mã nhân viên: ");
        String MaSo = sc.nextLine();
        System.out.print("Căn cước công dân: ");
        String CCCD = sc.nextLine();
        System.out.print("Giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.print("Số điện thoại: ");
        String SDT = sc.nextLine();
        do {
            System.out.print("Lương: ");
            try {
                luong = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (luong == 0);
        NhanVien nhanVien = new NhanVien(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, luong);
        SuaThongTinNhanVien(a - 1, nhanVien);
    }

    public List<NhanVien> TimKiemNhanVien(String MaSo) {
        return nhanvienList.stream().filter(o -> o.getMaSo().contains(MaSo)).collect(Collectors.toList());
    }

    @Override
    public void TimKiem() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã nhân viên muốn tìm: ");
        String a = sc.nextLine();
        TimKiemNhanVien(a).forEach(nhanVien -> {
            System.out.println(nhanVien.toString());
        });
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

            String Ten = row[0];
            String MaSo = row[1];
            String CCCD = row[2];
            String GioiTinh = row[3];
            String DiaChi = row[4];
            String SDT = row[5];
            float Luong = Float.parseFloat(row[6]);
            NhanVien nhanVien = new NhanVien(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
            nhanvienList.add(nhanVien);
        }
        reader.close();
    }

    @Override
    public String toString() {
        return stt + ".Họ Tên: " + Ten + " - "
                + "Mã số nhân viên: " + MaSo + " - "
                + "CCCD: " + CCCD + " - "
                + "Giới Tính: " + GioiTinh + " - "
                + "Địa Chỉ: " + DiaChi + " - "
                + "Số điện thoại: " + SDT + " - "
                + "Lương = " + Luong * 8 * 30; //Set mỗi ngày làm 8 giờ và lương tính 1 tháng 30 ngày.
    }
}