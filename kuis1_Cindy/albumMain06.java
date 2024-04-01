package kuis1_Cindy;

import java.util.Scanner;

public class albumMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        album06[] albumArray = new album06[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for album " + (i + 1));

            System.out.print("Album Title: ");
            String judul = sc.nextLine();

            System.out.print("Singer: ");
            String penyanyi = sc.nextLine();

            System.out.print("Quantity: ");
            int jumlah = sc.nextInt();

            System.out.print("Price: ");
            int harga = sc.nextInt();

            albumArray[i] = new album06(judul, penyanyi, jumlah, harga);

            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nDetails for album " + (i + 1));
            albumArray[i].printAlbum06();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nTotal sales for album " + (i + 1) + ": Rp." + albumArray[i].hitungPenjualan06());
        }

        album06 kurangPopuler = album06.cariAlbumKurangPopuler06(albumArray);
        System.out.println("\nAlbum dengan penjualan terkecil (kurang populer):");
        kurangPopuler.printAlbum06();
        System.out.println("Total Sales: Rp." + kurangPopuler.hitungPenjualan06());

        album06.daftarAlbum06(albumArray);

        sc.close();
    }
}
