
import java.util.Scanner;

public class employeeIddelcre 
{
	int arr[] = new int[100];
	int count = 0;
	void addEmpID(int id)
	{
		arr[count] = id;
	}
	void delEmpId(int id)
	{
		int index = 1;
		for(int i=0;i<count;i++)
		{
			if(arr[i] == id)
			{
				index = i;
			}
		}
		if(index == 1)
		{
			System.out.println("EMP id not found!");
		}
		else
		{
			 for(int i = index; i < count - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        count--;
                        System.out.println("Employee ID removed.");
			
		}
	}
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		employeeIddelcre obj = new employeeIddelcre();
		do 
		{	System.out.println("1.Add employee ID");
			System.out.println("2. Remove employee ID");
			System.out.println("3.Display employee IDs");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
				case 1:
				{
					System.out.print("Enter EMP Id: ");
					int id = sc.nextInt();
					
					obj.addEmpID(id);
					obj.count++;
					break;
				}
				case 2:
				{
					System.out.print("Enter employee ID to remove: ");
					int id = sc.nextInt();
					obj.delEmpId(id);
					break;
				}
				case 3:
				{
					for(int i=0;i<obj.count;i++)
					{
						System.out.print(obj.arr[i]+" ");
					}
					
					break;
				}
				case 4:
					System.out.println("Exiting....");
			}
		}while(choice !=4);
	}
}
