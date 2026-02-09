import java.util.Scanner;

class SmartCityUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ SMART CITY UTILITY MENU ------");
        System.out.println("1. Electricity Bill");
        System.out.println("2. Water Bill");
        System.out.println("3. Internet Plan");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        
        if (choice == 1) {
            System.out.print("Enter number of units: ");
            int units = sc.nextInt();
            int bill;

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 300) {
                bill = units * 3;
            } else {
                bill = units * 5;
            }

            System.out.println("Electricity Bill = ₹" + bill);
        }

        
        else if (choice == 2) {
            System.out.println("House Type:");
            System.out.println("1. Apartment");
            System.out.println("2. Individual House");
            System.out.print("Enter house type: ");

            int houseType = sc.nextInt();

            if (houseType == 1) {
                System.out.println("Water Bill = ₹300");
            } else if (houseType == 2) {
                System.out.println("Water Bill = ₹500");
            } else {
                System.out.println("Invalid House Type");
            }
        }

        
        else if (choice == 3) {
            System.out.println("Internet Plans:");
            System.out.println("1. Basic Plan – ₹399");
            System.out.println("2. Standard Plan – ₹699");
            System.out.println("3. Premium Plan – ₹999");
            System.out.print("Enter plan choice: ");

            int plan = sc.nextInt();

            if (plan == 1) {
                System.out.println("You selected Basic Plan – ₹399");
            } else if (plan == 2) {
                System.out.println("You selected Standard Plan – ₹699");
            } else if (plan == 3) {
                System.out.println("You selected Premium Plan – ₹999");
            } else {
                System.out.println("Invalid Plan Choice");
            }
        }

        
        else if (choice == 4) {
            System.out.println("Thank you for using Smart City Utility System");
        }

        
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
