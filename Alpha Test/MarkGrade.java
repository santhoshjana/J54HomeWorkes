

import java.util.Scanner;

public class MarkGrade {

    
 int mark1, mark2, mark3;
   int total;
   double percentage;

    void inputMarks(int marka,int markb, int markc) 
	{
        mark1=marka;
        mark2=markb;
        mark3=markc;
		
    }

    
   void calculateTotal() {
        total = mark1 + mark2 + mark3;
        System.out.println("Total Marks: " + total);
    }

    
    void calculatePercentage() {
        percentage = total / 3.0;
        System.out.println("Percentage: " + percentage + "%");
    }

    
  void displayResult() {
        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    
   void displayGrade() {
        if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: U");
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		MarkGrade mc = new MarkGrade();

        System.out.print("Enter marks for Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = sc.nextInt();
       
	   mc.inputMarks(mark1,mark2,mark3);
        
        int choice;

        do {
            System.out.println("\n===== RESULT MENU =====");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mc.calculateTotal();
                    break;
                case 2:
                    mc.calculatePercentage();
                    break;
                case 3:
                    mc.displayResult();
                    break;
                case 4:
                    mc.displayGrade();
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        
    }
}