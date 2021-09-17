import java.util.Scanner;

public abstract class Dien {
    protected int numberKV;


    public abstract long tongTien();

    public  void inputKV()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập KW bạn sử dụng: ");
        this.numberKV = scanner.nextInt();
    }


}
