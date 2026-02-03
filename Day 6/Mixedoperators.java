class MixedOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;

        boolean result1 = (a + b) > c;
        boolean result2 = (a * b) < c || a == 10;
        boolean result3 = !(b > a);

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);
    }
}
