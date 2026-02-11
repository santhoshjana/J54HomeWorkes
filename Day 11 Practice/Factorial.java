import java.util.Scanner;

public class Factorial  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number For Factorial: ");
        int n = sc.nextInt();
		int sum = 1;
       
        for (int i = n; i>=1; i--) {
			sum *= i;
           
        }
		System.out.println(sum);

        
    }
}
