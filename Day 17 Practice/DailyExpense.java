import java.util.Scanner;

class DailyExpenseTracker {

    static int addExpense(double arr[], int count, double amount) {
        if (count < arr.length) {
            arr[count] = amount;
            count++;
            System.out.println("Expense Added Successfully!");
        } else {
            System.out.println("Expense list is full!");
        }
        return count;
    }

    static void viewExpenses(double arr[], int count) {
        if (count == 0) {
            System.out.println("No expenses recorded.");
        } else {
            System.out.println("All Expenses:");
            for (int i = 0; i < count; i++) {
                System.out.println("Expense " + (i + 1) + " : " + arr[i]);
            }
        }
    }

    static double totalExpense(double arr[], int count) {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += arr[i];
        }
        return total;
    }

    static double highestExpense(double arr[], int count) {
        if (count == 0) {
            return 0;
        }

        double max = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double expenses[] = new double[100]; 
        int count = 0;
        int choice;

        do {
            System.out.println("\n==== Daily Expense Tracker ====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter expense amount: ");
                    double amount = sc.nextDouble();
                    count = addExpense(expenses, count, amount);
                    break;

                case 2:
                    viewExpenses(expenses, count);
                    break;

                case 3:
                    System.out.println("Total Expense: " + totalExpense(expenses, count));
                    break;

                case 4:
                    System.out.println("Highest Expense: " + highestExpense(expenses, count));
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
