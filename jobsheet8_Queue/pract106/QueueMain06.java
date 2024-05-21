package pract106;
import java.util.Scanner;

public class QueueMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;

        System.out.print("Enter the Queue capacity: ");
        int n = sc.nextInt();

        Queue06 Q = new Queue06(n);
        do {
            Queue06.menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataIn = sc.nextInt();
                    Q.Enqueue(dataIn);
                    break;
                case 2:
                    int dataOut = Q.Dequeue();
                    if (dataOut != 0) {
                        System.out.println("Data yang dikeluarkan" + dataOut);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } 
        while (choose == 1 || choose == 2 || choose == 3 || choose == 4 || choose == 5);
    }
}
