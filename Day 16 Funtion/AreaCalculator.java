import java.util.Scanner;

public class AreaCalculator {

    
    public static int rectangleArea(int length, int breadth) {
        return length * breadth;
    }

    
    public static double circleArea(double radius) {
        return 3.14 * radius * radius;
    }

    
    public static double squareArea(double side) {
        return side * side;
    }

    
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== AREA CALCULATOR =====");
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Circle");
            System.out.println("3. Area of Square");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter length: ");
                    int length = sc.nextInt();
                    System.out.print("Enter breadth: ");
                    int breadth = sc.nextInt();

                    int rectArea = rectangleArea(length, breadth);
                    System.out.println("Area of Rectangle = " + rectArea);
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    double cirArea = circleArea(radius);
                    System.out.println("Area of Circle = " + cirArea);
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();

                    double sqArea = squareArea(side);
                    System.out.println("Area of Square = " + sqArea);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();

                    double triArea = triangleArea(base, height);
                    System.out.println("Area of Triangle = " + triArea);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
