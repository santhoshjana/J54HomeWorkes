import java.util.Scanner;

class SpotifyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SPOTIFY MUSIC APP =====");
        System.out.println("Select Music Director:");
        System.out.println("1. A R Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Yuvan Shankar Raja");
        System.out.print("Enter your choice: ");

        int director = sc.nextInt();

        switch (director) {

            case 1:
                System.out.println("You selected: A R Rahman");
                System.out.println("Select Music Type:");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Enter music type: ");
                int type1 = sc.nextInt();

                if (type1 == 1) {
                    System.out.println("Melody Songs:");
                    System.out.println("1. Munbe Vaa");
                    System.out.println("2. Pachai Nirame");
                    System.out.print("Select song: ");
                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Munbe Vaa");
                    else if (song == 2)
                        System.out.println("Now Playing : Pachai Nirame");
                    else
                        System.out.println("Invalid Song Selection");

                } else if (type1 == 2) {
                    System.out.println("Folk Songs:");
                    System.out.println("1. Udhungada Sangu");
                    System.out.println("2. Naane Varugiren");
                    System.out.print("Select song: ");
                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Udhungada Sangu");
                    else if (song == 2)
                        System.out.println("Now Playing : Naane Varugiren");
                    else
                        System.out.println("Invalid Song Selection");

                } else {
                    System.out.println("Invalid Music Type");
                }
                break;

            case 2:
                System.out.println("You selected: Anirudh");
                System.out.println("Select Music Type:");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Enter music type: ");
                int type2 = sc.nextInt();

                if (type2 == 1) {
                    System.out.println("Melody Songs:");
                    System.out.println("1. Why This Kolaveri");
                    System.out.println("2. Nee Partha");
                    System.out.print("Select song: ");
                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Why This Kolaveri");
                    else if (song == 2)
                        System.out.println("Now Playing : Nee Partha");
                    else
                        System.out.println("Invalid Song Selection");

                } else if (type2 == 2) {
                    System.out.println("Folk Songs:");
                    System.out.println("1. Dippam Dappam");
                    System.out.println("2. Jalabulajangu");
                    System.out.print("Select song: ");
                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Dippam Dappam");
                    else if (song == 2)
                        System.out.println("Now Playing : Jalabulajangu");
                    else
                        System.out.println("Invalid Song Selection");

                } else {
                    System.out.println("Invalid Music Type");
                }
                break;

            case 3:
                System.out.println("You selected: Yuvan Shankar Raja");
                System.out.println("Select Music Type:");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Enter music type: ");
                int type3 = sc.nextInt();

                if (type3 == 1) {
                    System.out.println("Melody Songs:");
                    System.out.println("1. Oru Naalil");
                    System.out.println("2. Kadhal Valarthen");
                    System.out.print("Select song: ");
                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Oru Naalil");
                    else if (song == 2)
                        System.out.println("Now Playing : Kadhal Valarthen");
                    else
                        System.out.println("Invalid Song Selection");

                } else if (type3 == 2) {
                    System.out.println("Folk Songs:");
                    System.out.println("1. Machi Open The Bottle");
                    System.out.println("2. Vaadi Pulla Vaadi");
                    System.out.print("Select song: ");
                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Machi Open The Bottle");
                    else if (song == 2)
                        System.out.println("Now Playing : Vaadi Pulla Vaadi");
                    else
                        System.out.println("Invalid Song Selection");

                } else {
                    System.out.println("Invalid Music Type");
                }
                break;

            default:
                System.out.println("Invalid Music Director");
        }

        sc.close();
    }
}
