import java.util.Scanner;

class LanguageSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (1–4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Tamil");
                break;
            case 2:
                System.out.println("English");
                break;
            case 3:
                System.out.println("Hindi");
                break;
            case 4:
                System.out.println("Malayalam");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
