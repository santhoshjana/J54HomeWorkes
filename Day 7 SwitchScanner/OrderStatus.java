import java.util.Scanner;

class OrderStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order status code (P/S/D/C): ");
        char status = sc.next().charAt(0);

        switch (status) {
            case 'P':
                System.out.println("Order Placed");
                break;
            case 'S':
                System.out.println("Shipped");
                break;
            case 'D':
                System.out.println("Delivered");
                break;
            case 'C':
                System.out.println("Cancelled");
                break;
            default:
                System.out.println("Invalid Status Code");
        }
        sc.close();
    }
}
