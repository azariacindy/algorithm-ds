package week5;

import java.util.Scanner;

public class faktorialMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("==================================================");
        System.out.println("\nMasukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        faktorial06[] fk = new faktorial06[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new faktorial06();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("\n==================================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        long startTimeBF = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }
        long endTimeBF = System.currentTimeMillis();
        long elapsedTimeBF = endTimeBF - startTimeBF;
        System.out.println("Waktu eksekusi Brute Force: " + elapsedTimeBF + " milliseconds");
        
        System.out.println("\n==================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        long startTimeDC = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
        long endTimeDC = System.currentTimeMillis();
        long elapsedTimeDC = endTimeDC - startTimeDC;
        System.out.println("Waktu eksekusi Divide and Conquer: " + elapsedTimeDC + " milliseconds");
        
        System.out.print("==================================================");        

        sc.close();
    }
}
