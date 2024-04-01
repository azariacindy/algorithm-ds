import java.util.Scanner;

public class persegiPanjangDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // masukkan panjang array
        System.out.print("Enter the number of rectangles: ");
        int jumlahPersegiPanjang = sc.nextInt();

        // declare dan inisiasi  array untuk menampung data Persegi Panjang
        persegiPanjang[] arrayOfPersegiPanjang = new persegiPanjang[jumlahPersegiPanjang];
        int panjang, lebar;

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Rectangle to-" + (i + 1));
            System.out.println("Enter length: ");
            panjang = sc.nextInt();
            System.out.println("Enter the width: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new persegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.print("Rectangle to-" + (i + 1) + ": ");
            arrayOfPersegiPanjang[i].cetakInfo();
        }

        sc.close();
    }
}
