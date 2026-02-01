import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        float area = length * breadth;
        float perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        sc.close();
    }
}
