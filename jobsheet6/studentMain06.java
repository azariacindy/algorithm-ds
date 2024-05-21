package jobsheet6;

import java.util.Scanner;

public class studentMain06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int amountStudent = s.nextInt();

        searchStudent06 data = new searchStudent06(amountStudent);

        System.out.println("----------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-----------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            s.nextLine(); 
            System.out.print("Name\t: ");
            String name = s.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            students06 std = new students06(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("----------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Search student by NIM: ");
        int searchNIM = s.nextInt();

        System.out.println("Using Binary Search");
        int positionNIM = data.findBinarySearchByNIM(searchNIM);
        data.showPositionByNIM(searchNIM, positionNIM);

        s.nextLine(); 
        System.out.println("Search student by Name: ");
        String searchName = s.nextLine();

        System.out.println("Using Sequential Search");
        int positionName = data.findSeqSearchByName(searchName);
        data.showPositionByName(searchName, positionName);
    }
}
