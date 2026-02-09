
import java.util.Scanner;
class BankATM {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Magizhchi Garment Shop!");
	System.out.println("1.Man");
	System.out.println("2.Woman");
	System.out.println("3.Kids");
	System.out.print("Enter Your Choice:");
	int selc = sc.nextInt();
	switch(selc) {
	case 1:
		System.out.println("You are selected Man");
		System.out.println("1. Shirt");
		System.out.println("2.Pant ");
		System.out.println("3.T-Shirt");
		System.out.print("Enter Your Choice:");
		int opt = sc.nextInt();
		if(opt == 1) {
			System.out.println("Shirt-3500");
		}
		else if(opt == 2) {
			System.out.println("Pant-1500");
		}
		else if(opt == 3) {
			System.out.println("T-Shirt-500");
		}
		else {
			System.out.println("Invalid Value: " + opt);
		}
		break;
		
	case 2:
		System.out.println("You are selected Woman");
		System.out.println("1. Saree");
		System.out.println("2.Churidar ");
		System.out.println("3.Kurti");
		System.out.print("Enter Your Choice:");
		int opt2 = sc.nextInt();
		if(opt2 == 1) {
			System.out.println("Saree-3500");
		}
		else if(opt2 == 2) {
			System.out.println("Churidar-1500");
		}
		else if(opt2 == 3) {
			System.out.println("Kurti-500");
		}
		else {
			System.out.println("Invalid Value: " + opt2);
		}
		break;
	case 3:
	{
		System.out.println("You are selected Kids");
		System.out.println("1. Frock");
		System.out.println("2.Shorts ");
		System.out.println("3.Night Ware");
		System.out.print("Enter Your Choice:");
		int opt3 = sc.nextInt();
		if(opt3 == 1) {
			System.out.println("Frock-500");
		}
		else if(opt3 == 2) {
			System.out.println("Shorts-100");
		}
		else if(opt3 == 3) {
			System.out.println("Night Ware-400");
		}
		else {
			System.out.println("Invalid Value: " + opt3);
		}
		break;
	}
		default:
			System.out.println("Invalid Value: " + selc);
	}
	
	}
}
