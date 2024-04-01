package week5;
import java.util.Scanner;

public class pangkatMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();

        pangkat06[] png = new pangkat06[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat06(nilai, pangkat);
        }

        System.out.println("==================================================");
        System.out.println("Pilih Metode:");
        System.out.println("1. Pangkat dengan Brute Force");
        System.out.println("2. Pangkat dengan Divide and Conquer");
        System.out.print("Pilihan Anda: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        System.out.println("==================================================");

        sc.close();
    }
}
