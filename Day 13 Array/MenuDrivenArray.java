import java.util.Scanner;

class MenuDrivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size = 0;
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Count Even Numbers");
            System.out.println("4. Count Odd Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of elements: ");
                    size = sc.nextInt();
                    System.out.println("Enter elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty!");
                    } else {
                        System.out.println("Array elements are:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int evenCount = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            evenCount++;
                        }
                    }
                    System.out.println("Even numbers count = " + evenCount);
                    break;

                case 4:
                    int oddCount = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 != 0) {
                            oddCount++;
                        }
                    }
                    System.out.println("Odd numbers count = " + oddCount);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
