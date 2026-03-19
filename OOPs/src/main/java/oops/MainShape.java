
package oops;

import java.util.Scanner;

public class MainShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Area Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    Shape c = new Circle(radius);
                    c.calculateArea();
                    break;

                case 2:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    Shape s = new Square(side);
                    s.calculateArea();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
