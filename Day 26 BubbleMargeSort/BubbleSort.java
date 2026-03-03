import java.util.*;
class BubbleSort
{
	int[] storeArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
		
		int[] arr = new int[n];

			System.out.println("Enter elements:");
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
			}	
			sort(arr);
		return arr;
	}
	void sort(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of Passes: " + (n-1));
	}
	public static void main(String[] args)
	{
		
		
		BubbleSort obj = new BubbleSort();
		int[] arr =  obj.storeArray();
	
		
		
		System.out.println(Arrays.toString(arr) + "-----Before sort-----");
		
		
        
		
	}
}