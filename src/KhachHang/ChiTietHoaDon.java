package KhachHang;

import java.util.Date;

public class ChiTietHoaDon extends XuLy {
    static final String formatOutput = "%s %10s %-15s %3s %-13s %3s %-15s %3s %-10d %3s %-15.3f %3s %s\n";
    Date date = new Date();

    // Xuất list hóa đơn + giá tổng
    public void xuatHoaDon() {
        System.out.print("+");
        for (int i = 0; i < 105; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (XuLy HOADON : XuLy.ListHoaDon) {
            if (HOADON != null) {
                String ten = HOADON.getName();
                String id = HOADON.getId();
                String xuatXu = HOADON.getXuatXu();
                int sl = HOADON.getSl();
                float gia = HOADON.getGia();

                System.out.printf(formatOutput,
                        "|", "", ten, "", id, "", xuatXu, "", sl, "", gia, "", "|");
            }
        }
        System.out.print("+");
        for (int i = 0; i < 105; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|                             Tổng tiền  : " + XuLy.tongGia + "    " + date.toString());
        for (int i = 0; i < 23; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("+");
        for (int i = 0; i < 105; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}