package pract206;

import java.util.Scanner;

public class NasabahMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;

        System.out.print("Enter the Queue capacity: ");
        int amount = sc.nextInt();
        Nasabah06 queue = new Nasabah06(amount);

        do {
            Nasabah06.menu();
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("-----------------------------");
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Name: ");
                    String nama = sc.nextLine();
                    System.out.print("Address: ");
                    String alamat = sc.nextLine();
                    System.out.print("Age: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah06 nb = new Nasabah06(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    queue.Enqueue(nb);
                    break;
                case 2:
                    Nasabah06 data = queue.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("The outgoing queue: " + data.norek + " " + data.nama + " " +
                                data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                default :
                System.out.println("Invalid input. Please enter a valid menu option.");
            }
        } while (choose == 0 || choose == 1 || choose == 2 || choose == 3 || choose == 4 || choose == 5);
    }
}
