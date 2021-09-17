import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin loại điện sử dụng.");
        System.out.println("Nhập 1: điện sinh hoạt giá lẻ.");
        System.out.println("Nhập 2: điện sinh hoạt giá sỉ.");
        System.out.println("Nhập 3: điện kinh doanh cao áp.");
        System.out.println("Nhập 4: điện kinh doanh trung áp.");
        System.out.println("Nhập 5: điện kinh doanh thấp áp.");
        System.out.print("Vui lòng nhập: ");
        int type = scanner.nextInt();

        Dien typeDien;
        switch (type) {
            case 1: {
                typeDien = new DienSinhHoat(EnumDienSinhHoat.GIA_LE);
                break;
            }
            case 2: {
                typeDien = new DienSinhHoat(EnumDienSinhHoat.GIA_SI);
                break;
            }
            case 3: {
                typeDien = new DienKinhDoanh(EnumDienKinhDoanh.CAO_AP);
                break;
            }
            case 4: {
                typeDien = new DienKinhDoanh(EnumDienKinhDoanh.TRUNG_AP);
                break;
            }
            case 5: {
                typeDien = new DienKinhDoanh(EnumDienKinhDoanh.THAP_AP);
                break;
            }
        default: {
            System.out.println("Không hợp lệ");
            return;
        }
    }

    // Nhap so KW su dung
        typeDien.inputKV();

    // Ting tong tien
    long tongTien = typeDien.tongTien();
        System.out.println("Tổng tiền phải trả là: "+tongTien);

}
}

