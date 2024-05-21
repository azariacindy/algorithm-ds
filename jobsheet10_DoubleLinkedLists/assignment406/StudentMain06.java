package assignment406;
import java.util.Scanner;

public class StudentMain06 {
    public static void main(String[] args) {
        StudentList06 studentList = new StudentList06();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("    Student Data Management System   ");
            System.out.println("=====================================");
            System.out.println("1. Add data from head");
            System.out.println("2. Add data from tail");
            System.out.println("3. Add data in specific index");
            System.out.println("4. Remove data from head");
            System.out.println("5. Remove data from tail");
            System.out.println("6. Remove data at specific index");
            System.out.println("7. Print");
            System.out.println("8. Search by NIM");
            System.out.println("9. Sort by GPA - DESC");
            System.out.println("10. Exit");
            System.out.println("=====================================");
            System.out.print("Select menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = sc.nextDouble();
                    Student06 student = new Student06(nim, name, gpa);
                    studentList.addFirst(student);
                    break;
                case 2:
                    System.out.print("Enter NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    gpa = sc.nextDouble();
                    student = new Student06(nim, name, gpa);
                    studentList.addLast(student);
                    break;
                case 3:
                    System.out.print("Enter index to insert data: ");
                    int indexToAdd = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    gpa = sc.nextDouble();
                    student = new Student06(nim, name, gpa);
                    studentList.addAtIndex(indexToAdd, student);
                    break;
                case 4:
                    studentList.removeFirst();
                    break;
                case 5:
                    studentList.removeLast();
                    break;
                case 6:
                    System.out.print("Enter index to remove data: ");
                    int indexToRemove = sc.nextInt();
                    studentList.removeAtIndex(indexToRemove);
                    break;
                case 7:
                    studentList.print();
                    break;
                case 8:
                    System.out.print("Enter NIM to search: ");
                    nim = sc.nextLine();
                    Student06 foundStudent = studentList.searchByNIM(nim);
                    if (foundStudent != null) {
                        System.out.println("Student found: NIM: " + foundStudent.nim + ", Name: " + foundStudent.name + ", GPA: " + foundStudent.gpa);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 9:
                    studentList.sortByGPA();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
