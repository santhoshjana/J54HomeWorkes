import java.util.Scanner;

class BatteryStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery >= 80) {
            System.out.println("Battery Full");
        } else if (battery >= 30) {
            System.out.println("Battery Normal");
        } else {
            System.out.println("Low Battery – Charge Now");
        }
        sc.close();
    }
}
