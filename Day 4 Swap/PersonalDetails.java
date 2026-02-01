import java.util.Scanner;

class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        System.out.println("Name: " + name + " Age: " + age + " Height: " + height);

        sc.close();
    }
}
