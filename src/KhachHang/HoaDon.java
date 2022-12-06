package KhachHang;

import java.util.Random;
import java.util.Scanner;

public class HoaDon {
    static final String formatOutput = "%s %10s %-15s %3s %-13s %3s %-15s %3s %-10s %3s %21s\n";
    public String TenKhach;
    public int IdKhach;
    public String Sdt;
    public String DiaChi;

    public HoaDon() {

    }

    public HoaDon(String tenKhach, int idKhach, String sdt, String diaChi) {
        TenKhach = tenKhach;
        IdKhach = idKhach;
        Sdt = sdt;
        DiaChi = diaChi;
    }

    public String getTenKhach() {
        return TenKhach;
    }

    public void setTenKhach(String tenKhach) {
        TenKhach = tenKhach;
    }

    public int getIdKhach() {
        return IdKhach;
    }

    public void setIdKhach(int idKhach) {
        IdKhach = idKhach;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void ThongTinKhachHang() {
        Scanner sc = new Scanner(System.in);
        Random ramdom = new Random();

        System.out.print("Nhập tên : ");
        String ten = sc.nextLine();

        int value = ramdom.nextInt(100) + 1;
        System.out.println("Id đơn hàng  : " + value);

        System.out.print("Nhập SDT : ");
        String sdt = sc.nextLine();

        System.out.print("Nhập địa chỉ : ");
        String diachi = sc.nextLine();

        System.out.print("+");
        for (int i = 0; i < 105; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.printf(formatOutput,
                "|", "", ten, "", value, "", diachi, "", sdt, "", "|");
    }

    @Override
    public String toString() {
        return "Thông tin|" + "Tên : " + TenKhach + " | ID : " + IdKhach + "| Sdt : " + Sdt + "| DiaChi : " + DiaChi + " |";
    }
}