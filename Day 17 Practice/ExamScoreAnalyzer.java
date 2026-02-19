import java.util.Scanner;

public class ExamScoreAnalyzer {

    static int addScore(int arr[], int count, int score) {
        if (count < arr.length) {
            arr[count] = score;
            count++;
            System.out.println("Score Added Successfully!");
        } else {
            System.out.println("Score list is full!");
        }
        return count;
    }

    static void displayScores(int arr[], int count) {
        if (count == 0) {
            System.out.println("No scores available.");
        } else {
            System.out.println("All Exam Scores:");
            for (int i = 0; i < count; i++) {
                System.out.println("Student " + (i + 1) + " : " + arr[i]);
            }
        }
    }

    static int countPass(int arr[], int count) {
        int pass = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] >= 40) {
                pass++;
            }
        }
        return pass;
    }

    static int countFail(int arr[], int count) {
        int fail = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] < 40) {
                fail++;
            }
        }
        return fail;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int scores[] = new int[100];   // Maximum 100 students
        int count = 0;
        int choice;

        do {
            System.out.println("\n==== Exam Score Analyzer ====");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter exam score: ");
                    int score = sc.nextInt();

                    if (score >= 0 && score <= 100) {
                        count = addScore(scores, count, score);
                    } else {
                        System.out.println("Invalid score! Enter between 0 and 100.");
                    }
                    break;

                case 2:
                    displayScores(scores, count);
                    break;

                case 3:
                    System.out.println("Total Pass Students: " + countPass(scores, count));
                    break;

                case 4:
                    System.out.println("Total Fail Students: " + countFail(scores, count));
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
