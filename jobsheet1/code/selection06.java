import java.util.Scanner;

public class selection06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the assignment score: ");
        int assignmentScore = scanner.nextInt();

        System.out.print("Enter the quiz score: ");
        int quizScore = scanner.nextInt();

        System.out.print("Enter the midterm exam score: ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter the final exam score: ");
        int finalScore = scanner.nextInt();

        // Check the validity of the scores
        if (isValidScore(assignmentScore) && isValidScore(quizScore) && isValidScore(midtermScore) && isValidScore(finalScore)) {
            // Calculate the final score
            double finalGrade = calculateFinalGrade(assignmentScore, quizScore, midtermScore, finalScore);

            // Convert the grade and determine PASS/NOT PASS
            String gradeConversion = convertGrade(finalGrade);
            String passStatus = determinePassStatus(finalGrade);

            // Output the result
            System.out.println("==========================");
            System.out.println("\nStudent's Grade Analysis");
            System.out.println("Final Grade: " + finalGrade);
            System.out.println("Grade Conversion: " + gradeConversion);
            System.out.println("==========================");
            System.out.println(passStatus);
        } else {
            System.out.println("Invalid scores. Ensure that scores are within the range of 0-100.");
        }

        scanner.close();
    }

    // Function to check the validity of scores (0-100)
    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    // Function to calculate the final grade
    public static double calculateFinalGrade(int assignment, int quiz, int midterm, int finalExam) {
        return 0.2 * assignment + 0.2 * quiz + 0.3 * midterm + 0.4 * finalExam;
    }

    // Function to convert the grade
    public static String convertGrade(double finalGrade) {
        if (finalGrade > 80 && finalGrade <= 100) {
            return "A (Excellent!)";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            return "B+ (Very Good!)";
        } else if (finalGrade > 65 && finalGrade <= 73) {
            return "B (Good)";
        } else if (finalGrade > 60 && finalGrade <= 65) {
            return "C+ (More than Enough)";
        } else if (finalGrade > 50 && finalGrade <= 60) {
            return "C (Fair)";
        } else if (finalGrade > 39 && finalGrade <= 50) {
            return "D (Less)";
        } else if (finalGrade <= 39) {
            return "E (Fail!)";
        } else {
            return "Grade not included in the given qualification.";
        }
    }

    // Function to determine PASS/NOT PASS status
    public static String determinePassStatus(double finalGrade) {
        // Define the passing threshold (adjust as needed)
        double passingThreshold = 51;

        if (finalGrade >= passingThreshold) {
            return "Congratulations you passed!";
        } else {
            return "Sorry, you didn't pass.";
        }
    }
}
