 import java.util.*;
 public class StudentMain{
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        int choice;

        do {

            System.out.println("\n1. Add student details");
            System.out.println("2. Update student name");
            System.out.println("3. Display student details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    obj.addStudent(name, roll);
                    break;

                case 2:
                    System.out.print("Enter new name: ");
                    String newName = sc.next();
                    obj.updateName(newName);
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}