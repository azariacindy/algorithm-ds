import java.util.Scanner;

public class looping06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your NIM: ");
        long nim = scanner.nextLong();

        // Get the last 2 digits of NIM
        int n = (int) (nim % 100);

        // If n < 10, add 10
        if (n < 10) {
            n += 10;
        }

        // Display the number series based on the rules
        System.out.println("Number Series Output:");
        displayNumberSeries(n);

        scanner.close();
    }

    // Function to display the number series
    public static void displayNumberSeries(int n) {
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println(); // Move to the next line after displaying the series
    }
}
