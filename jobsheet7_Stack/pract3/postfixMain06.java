package pract3;
import java.util.Scanner;

public class postfixMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.println("Insert mathematical expression (infinix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postfix06 post = new postfix06(total);
        P = post.convert(Q);
        System.out.println("Postfix : " + P);
    }
}
