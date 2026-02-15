import java.util.Scanner;

public class StoreAndPrint  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter " + i + " Value: ");
			arr[i] = sc.nextInt();
			
		}
		for(int i=0; i<n;i++)
		{
			System.out.println(" Index of " + i + " Value: " + arr[i]);
		}
		
	}
	
}