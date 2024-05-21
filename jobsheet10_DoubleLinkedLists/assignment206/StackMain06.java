package assignment206;
import java.util.Scanner;

public class StackMain06 {
    public static void main(String[] args) {
        Stack06 stack = new Stack06();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====================================");
            System.out.println("          Library Data Book         ");
            System.out.println("====================================");
            System.out.println("1. Add new book");
            System.out.println("2. Get book from top");
            System.out.println("3. Peek book title from top");
            System.out.println("4. Info all books");
            System.out.println("5. Exit");
            System.out.println("====================================");
            System.out.print("Select menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("   Insert new book title   ");
                    System.out.println("---------------------------");
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    stack.push(title);
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println("Book on top has been removed");
                    System.out.println("----------------------------");
                    try {
                        String book = stack.pop();
                        System.out.println("Book from top: " + book);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("--------------------------");
                    System.out.println(" Peek book title from top ");
                    System.out.println("--------------------------");
                    try {
                        String book = stack.peek();
                        System.out.println("Book title from top: " + book);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("---------------------------");
                    System.out.println("       Info all books      ");
                    System.out.println("---------------------------");
                    stack.print();
                    break;
                case 5:
                    System.out.println("--------!Exiting!--------");
                    return;
                default:
                    System.out.println("------Invalid selection!------");
            }
        }
    }
}
