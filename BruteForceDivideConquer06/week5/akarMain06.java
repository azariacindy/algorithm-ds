package week5;
import java.util.Scanner;

public class akarMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        akar06 akar = new akar06();

        System.out.println("==================================================");
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        
        System.out.println("==================================================");
        System.out.println("Akar (Brute Force): " + akar.akarBruteForce(bilangan));
        System.out.println("Akar (Divide and Conquer): " + akar.akarDivideConquer(bilangan));
        System.out.println("==================================================");
    }
}
