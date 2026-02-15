import java.util.Scanner;

public class CountEvenAndOdd  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int even=0,odd=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter " + i + " Value: ");
			arr[i] = sc.nextInt();
			
		}
		for(int i=0; i<n;i++)
		{
			System.out.println(" Index of " + i + " Value: " + arr[i]);
			
					if(arr[i]%2==0)
					{
						even++;
					}
				
					else
					{
						odd++;
					}
					
		}
		System.out.println("Even Number Count: " + even);
		System.out.println("Odd Number Count: " + odd);
		
		
	}
	
}