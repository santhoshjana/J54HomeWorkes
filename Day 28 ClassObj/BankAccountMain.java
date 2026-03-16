import java.util.*;
class BankAccountMain
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount();
		

        int choice;

        do {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double deposit = sc.nextDouble();
                    obj.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double withdraw = sc.nextDouble();
                    obj.withdraw(withdraw);
                    break;

                case 3:
                    obj.displayBalance();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}