import java.util.Scanner;

public class array06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of courses
        int numberOfCourses = 8;
        String[] courseNames = new String[numberOfCourses];
        double[] numericalGrades = new double[numberOfCourses];
        int[] sksValues = {2, 3, 3, 4, 2, 3, 1, 2}; // Credits for each course
        double[] gradeWeights = new double[numberOfCourses];

        // Input course names and grades
        courseNames[0] = "Pancasila";
        courseNames[1] = "Concept of Information Technology";
        courseNames[2] = "Critical Thinking and Problem Solving";
        courseNames[3] = "Basic Mathematics";
        courseNames[4] = "English";
        courseNames[5] = "Basic Programming";
        courseNames[6] = "Programming Lab";
        courseNames[7] = "Occupational Health and Safety";

        System.out.println("=========================");
        System.out.println("Semester IP calculation program");
        System.out.println("=========================");

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter numerical grade for course " + courseNames[i] + ": ");
            numericalGrades[i] = scanner.nextDouble();
            gradeWeights[i] = convertGradeToWeight(convertNumericalGradeToLetter(numericalGrades[i]));
        }

        double totalGrade = 0;
        int totalCredits = 0;

        System.out.println("=========================");
        System.out.println("Grade Conversion Results");
        System.out.println("=========================");
        System.out.printf("%-40s%-20s%-15s%-15s%n", "Course", "Numerical Grade", "Letter Grade", "Grade Weight");

        for (int i = 0; i < numberOfCourses; i++) {
            totalGrade += gradeWeights[i] * sksValues[i];
            totalCredits += sksValues[i];
            System.out.printf("%-40s%-20.2f%-15s%-15.2f%n", courseNames[i], numericalGrades[i], 
                              convertNumericalGradeToLetter(numericalGrades[i]), gradeWeights[i]);
        }

        double gpa = totalGrade / totalCredits;
        System.out.printf("GPA: %.2f\n", gpa);

        scanner.close();
    }

    private static String convertNumericalGradeToLetter(double numericalGrade) {
        if (numericalGrade > 80 && numericalGrade <= 100) return "A";
        else if (numericalGrade > 73 && numericalGrade <= 80) return "B+";
        else if (numericalGrade > 65 && numericalGrade <= 73) return "B";
        else if (numericalGrade > 60 && numericalGrade <= 65) return "C+";
        else if (numericalGrade > 50 && numericalGrade <= 60) return "C";
        else if (numericalGrade > 39 && numericalGrade <= 50) return "D";
        else return "E";
    }

    private static double convertGradeToWeight(String letterGrade) {
        switch (letterGrade) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }
}
