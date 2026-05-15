import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");

        // Number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        // Loop for subject marks input
        for (int i = 1; i <= subjects; i++) {
            int marks;

            while (true) {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }

            totalMarks += marks;
        }

        // Percentage calculation
        double percentage = (double) totalMarks / subjects;

        // Grade assignment
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Pass/Fail
        String result = (percentage >= 40) ? "PASS" : "FAIL";

        // Display results
        System.out.println("\n=== Final Result ===");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

        // Performance feedback
        if (grade == 'A') {
            System.out.println("Excellent Performance!");
        } else if (grade == 'B') {
            System.out.println("Very Good Job!");
        } else if (grade == 'C') {
            System.out.println("Good Effort!");
        } else if (grade == 'D') {
            System.out.println("Needs Improvement.");
        } else {
            System.out.println("Work Harder Next Time.");
        }

        sc.close();
    }
}