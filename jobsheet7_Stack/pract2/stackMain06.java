package pract2;
import java.util.Scanner;

public class stackMain06 {
    public static void main(String[] args) {
        book06 st = new book06(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Choose an operation:");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title : ");
                    String tt = sc.nextLine();

                    System.out.print("Author name : ");
                    String nm = sc.nextLine();

                    System.out.print("Published year : ");
                    int yr = sc.nextInt();

                    System.out.print("Page amount : ");
                    int pg = sc.nextInt();

                    System.out.print("Price : ");
                    int pr = sc.nextInt();

                    book06 bk = new book06(tt, nm, yr, pg, pr);
                    st.push(bk);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.print("Do you want to perform another operation? (y/n): ");
            choose = sc.next().charAt(0);
            sc.nextLine();
        } while (choose == 'y' || choose == 'Y');
        
        sc.close();
    }
}
