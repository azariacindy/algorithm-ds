import java.util.Scanner;

public class assignment106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array for license plate codes
        String[] codes = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        // Array for city names corresponding to the license plate codes
        String[][] cities = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"}
        };

        // Ask for input from the user
        System.out.println("Enter the license plate code:");
        String codeInput = scanner.nextLine();

        // Find and display the city name
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equalsIgnoreCase(codeInput)) {
                System.out.println("City for license plate code " + codeInput + " is:");
                for (int j = 0; j < cities[i].length; j++) {
                    System.out.println(cities[i][j]);
                }
                break; // Exit the loop after finding the code
            }
        }

        scanner.close();
    }
}
