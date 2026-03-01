import java.util.Scanner;
class BinarySearch
{
	int binarySearch(int[] arr,int n,int target)
	{
		int start = 0;
		int end =  n-1;
			while(start <= end)
			{
				int mid = (start + end) / 2;
				if(arr[mid] == target)
				{
					return mid;
				}
				else if(arr[mid]<target)
				{
					start = mid + 1;
				}
				else
				{
					end = mid - 1;
				}
			}
			return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+i+" Elament: ");
			arr[i] = sc.nextInt();
		}
		 System.out.print("Enter target element: ");
        int target = sc.nextInt();
		
		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(arr,n,target);
		System.out.println("Index: " + index);
		
	}
}