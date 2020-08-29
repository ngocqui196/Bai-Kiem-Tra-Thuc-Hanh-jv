package tamGiacExtentĐaGiac;

public class TamGiac extends DaGiac {
    public TamGiac() {
        this.soCanh = 3;
        this.a = new int[3];
    }

    public void nhapKichThuocCanhTamGiac() {
        do {
            System.out.println("Nhập số cạnh cho tam giác: ");
            for (int i = 0; i < this.soCanh; i++) {
                System.out.println("Cạnh thứ " + (i + 1) + ": ");
                this.a[i] = scanner.nextInt();
            }
        }while (a[0] + a[1] <= a[2] || a[2] + a[1] <= a[0] ||a[0] + a[2] <= a[1]);
    }

    @Override
    public void perimeter() {
        int p = 0;
        for (int i = 0; i < 3; i++) {
            p += this.a[i];
        }
        System.out.println(p);

    }

}
