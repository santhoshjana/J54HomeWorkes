import java.util.Scanner;

class MaxMinSum 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array Length: ");
		int l = sc.nextInt();
		int arr[] = new int[l];
		int max = arr[0];
		
		
		//Store the value
		for(int i=0;i<arr.length;i++)
			
		{
			System.out.print("Enter arr[" + i + "] Value : ");
			arr[i] = sc.nextInt();
		}
		
		//Max value
		for(int j = 1;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max = arr[j];
			}
		}
		System.out.println("Maximum value of Array: " + max);
		
		//Min Value
		int min = arr[0];
		for(int k = 1;k<arr.length;k++)
		{
			if(arr[k]<min)
			{
				min = arr[k];
			}
		}
		System.out.println("minimum value of Array: " + min);
		//Sum of arr
		int sum = 0;
		for(int z = 0;z < arr.length;z++)
		{
				sum += arr[z];
			
		}
		System.out.println("Sum value of Array: " + sum);
	}
}