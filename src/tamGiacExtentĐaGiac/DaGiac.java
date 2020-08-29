package tamGiacExtentĐaGiac;

import java.util.Arrays;
import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected int[] a;
    Scanner scanner = new Scanner(System.in);

    public DaGiac() {}

    public DaGiac(int soCanh, int[] kichThuocCanh,Scanner scanner) {
        this.soCanh = soCanh;
        this.a = kichThuocCanh;
        this.scanner = scanner;
    }







    public void nhapKichThuocCanh() {
        do {
            System.out.println("Nhập số cạnh: ");
            this.soCanh = scanner.nextInt();
        }while (this.soCanh <= 2);
        for (int i = 0; i < this.soCanh; i++) {
            System.out.println("Nhập cạnh thứ " + (i + 1) + " :");
            this.a[i]= scanner.nextInt();
        }
    }

    protected void perimeter() {

    }

    @Override
    public String toString() {
        return "tamGiácExtentĐaGiác.DaGiac{" +
                "soCanh=" + soCanh +
                ", kichThuocCanh=" + Arrays.toString(a) +
                '}';
    }
}
