import java.util.Scanner;

class MaxMinSumAvg 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array Length: ");
		int l = sc.nextInt();
		int arr[] = new int[l];
		
		//Store the value
		for(int i=0;i<arr.length;i++)
			
		{
			System.out.print("Enter arr[" + i + "] Value : ");
			arr[i] = sc.nextInt();
		}
		
		
		int choice;
		 do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Find Maximum element");
            System.out.println("2. Find Minimum element");
            System.out.println("3. Find Second Maximum element");
            System.out.println("4. Find Second Minimum element ");
            System.out.println("5. Reverse the array ");
            System.out.println("6. find the average ");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{
				case 1:
				int max = arr[0];
				for(int j = 1;j<arr.length;j++)
				{
					if(arr[j]>max)
					{
						max = arr[j];
					}
				}
				System.out.println("Maximum value of Array: " + max);
				break;
				case 2:
				int min = arr[0];
				for(int k = 1;k<arr.length;k++)
				{
					if(arr[k]<min)
					{
						min = arr[k];
					}
				}
				System.out.println("minimum value of Array: " + min);
				break;

				case 3:
				int first = arr[0];
				int second = arr[1];
				for (int i = 0; i < l; i++) 
				{
					if (arr[i] > first) 
					{
						second = first;
						first = arr[i];
					
					}
				}
				System.out.println("Scond Maximum value of Array: " + second);
					break;
				
				case 4:
				int firstmin = arr[0];
				int secondmin = arr[1];
				for (int i = 0; i < l; i++) 
				{
					if (arr[i] < firstmin) 
					{
						secondmin = firstmin;
						firstmin = arr[i];
					
					}
				}
				System.out.println("Scond Minimum value of Array: " + secondmin);
					break;
					
				case 5:
				 int start = 0, end = l - 1;
                    while (start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                    }

                    System.out.println("Array after reversing:");
				for(int i=0; i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				 System.out.println();
				 break;
				 case 6:
				 int sum = 0;
				 for(int i=0;i<arr.length;i++)
				 {
					 sum += arr[i];
				 }
				 double average = (double) sum / l;
                    System.out.println("Average = " + average);
                    
				 
				 break;
				  case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
				 
				 
			}
		 }while(choice != 6);
	}
}