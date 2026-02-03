class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("(a > b && a > 0) = " + (a > b && a > 0));
        System.out.println("(a > b || b > 10) = " + (a > b || b > 10));
        System.out.println("!(a > b) = " + !(a > b));
    }
}
