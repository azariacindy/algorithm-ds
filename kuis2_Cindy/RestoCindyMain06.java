package kuis2_Cindy;
import java.util.Scanner;

public class RestoCindyMain06 {
    public static void main(String[] args) {
        DoubleLinkedList06 dll = new DoubleLinkedList06();
        Scanner sc = new Scanner(System.in);
        int kodePesanan = 1;

        while (true) {
            System.out.println("=============================");
            System.out.println("            Menu             ");
            System.out.println("=============================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Delete Queue");
            System.out.println("4. Order Report (Order by Name)");
            System.out.println("5. Calculate Total Revenue");
            System.out.println("6. Exit");
            System.out.println("=============================");
            System.out.print("Select menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("Enter the buyer's data:");
                    System.out.println("=============================");
                    System.out.print("Customer's name: ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("No HP: ");
                    String noHp = sc.nextLine();
                    Pembeli06 pembeli = new Pembeli06(namaPembeli, noHp);
                    System.out.print("Order Name: ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Price: ");
                    int harga = sc.nextInt();
                    sc.nextLine();
                    Pesanan06 pesanan = new Pesanan06(kodePesanan++, namaPesanan, harga, pembeli);
                    dll.addLast(pesanan);
                    break;
                case 2:
                    dll.printAntrian();
                    break;
                case 3:
                    System.out.println("=============================");
                    System.out.print("Order Code to be deleted: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    try {
                        dll.removeByKodePesanan(kode);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    dll.laporanByNama();
                    break;
                case 5:
                    int totalPendapatan = dll.hitungTotalPendapatan();
                    System.out.println("Total Revenue: " + totalPendapatan);
                    break;
                case 6:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
