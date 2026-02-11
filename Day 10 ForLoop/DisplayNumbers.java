import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= n);

        sc.close();
    }
}
