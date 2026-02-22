import java.util.Scanner;
class TypeCasting
{
	static double intToDouble(int a)
	{
		
		double b = a;
		return b;
	}
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("===== Type Conversion =====");
        System.out.println("1 → int → double");
        System.out.println("2 → double → int");
        System.out.println("3 → char → int");
        System.out.println("4 → int → char.");
        System.out.println("5 → Exit");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.print("Enter number: ");
			int a = sc.nextInt();
			double b = intToDouble(a);
			System.out.println(b);
			break;
		}
		}while(choice != 5);
	}
}