package week5;

import java.util.Scanner;

public class companyMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();

        company06[] perusahaan = new company06[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("==================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Nama perusahaan: ");
            String nama = sc.next();
            System.out.print("Jumlah bulan: ");
            int jumlahBulan = sc.nextInt();
            perusahaan[i] = new company06(nama, jumlahBulan);
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan perusahaan untuk bulan ke-" + (j + 1) + ": ");
                double keuntungan = sc.nextDouble();
                perusahaan[i].keuntungan[j] = keuntungan;
            }
        }

        System.out.println("==================================================");
        for (company06 p : perusahaan) {
            System.out.println("Total keuntungan perusahaan " + p.nama + " adalah: " + p.totalKeuntungan());
        }
        System.out.println("==================================================");
    }
}
