import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What table You Want Enter a number: ");
        int n = sc.nextInt();

        System.out.println("It's Print upto 10 only");

        for (int i = 1; i <= 10; i++) {
			int mul = i*n;
           System.out.println(i +" x "+ n + " = "+ mul);
        }

        
    }
}
