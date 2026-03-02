public class SwapExample {

    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20};  // storing a and b in array

        swap(numbers);

        System.out.println("a = " + numbers[0] + " b = " + numbers[1]);
    }
}