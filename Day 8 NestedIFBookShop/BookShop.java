import java.util.Scanner;

class BookShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Magizhchi BOOK SHOP MENU =====");
        System.out.println("1. Academic Books");
        System.out.println("2. Story Books");
        System.out.println("3. Magazines");
        System.out.println("4. Competitive Exam Books");
        System.out.println("5. Comics");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Academic Books:");
            System.out.println("1. Maths – Rs.200");
            System.out.println("2. Science – Rs.250");
            System.out.print("Enter option: ");
            int opt = sc.nextInt();

            if (opt == 1)
                System.out.println("Maths – Rs.200");
            else if (opt == 2)
                System.out.println("Science – Rs.250");
            else
                System.out.println("Invalid Option");

        } else if (choice == 2) {
            System.out.println("Story Books:");
            System.out.println("1. Adventure Story – Rs.150");
            System.out.println("2. Moral Story – Rs.120");
            System.out.print("Enter option: ");
            int opt = sc.nextInt();

            if (opt == 1)
                System.out.println("Adventure Story – Rs.150");
            else if (opt == 2)
                System.out.println("Moral Story – Rs.120");
            else
                System.out.println("Invalid Option");

        } else if (choice == 3) {
            System.out.println("Magazines:");
            System.out.println("1. Weekly Magazine – Rs.50");
            System.out.println("2. Monthly Magazine – Rs.120");
            System.out.print("Enter option: ");
            int opt = sc.nextInt();

            if (opt == 1)
                System.out.println("Weekly Magazine – Rs.50");
            else if (opt == 2)
                System.out.println("Monthly Magazine – Rs.120");
            else
                System.out.println("Invalid Option");

        } else if (choice == 4) {
            System.out.println("Competitive Exam Books:");
            System.out.println("1. Banking Exam Book – Rs.400");
            System.out.println("2. SSC Exam Book – Rs.350");
            System.out.print("Enter option: ");
            int opt = sc.nextInt();

            if (opt == 1)
                System.out.println("Banking Exam Book – Rs.400");
            else if (opt == 2)
                System.out.println("SSC Exam Book – Rs.350");
            else
                System.out.println("Invalid Option");

        } else if (choice == 5) {
            System.out.println("Comics:");
            System.out.println("1. Kids Comics – Rs.80");
            System.out.println("2. Superhero Comics – Rs.120");
            System.out.print("Enter option: ");
            int opt = sc.nextInt();

            if (opt == 1)
                System.out.println("Kids Comics – Rs.80");
            else if (opt == 2)
                System.out.println("Superhero Comics – Rs.120");
            else
                System.out.println("Invalid Option");

        } else {
            System.out.println("Invalid Main Choice");
        }

        sc.close();
    }
}
