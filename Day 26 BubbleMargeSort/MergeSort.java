import java.util.*;

class MergeSort {

    int[] storeArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Recursive Divide
    int[] divide(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return conquer(left, right);
    }

    // Merge
    int[] conquer(int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        int[] newArray = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                newArray[k++] = left[i++];
            } else {
                newArray[k++] = right[j++];
            }
        }

        while (i < left.length) {
            newArray[k++] = left[i++];
        }

        while (j < right.length) {
            newArray[k++] = right[j++];
        }

        return newArray;
    }

    public static void main(String[] args) {

        MergeSort obj = new MergeSort();

        int[] arr = obj.storeArray();

        int[] sorted = obj.divide(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(sorted));

        int middle = sorted[sorted.length / 2];

        System.out.println("Middle Element: " + middle);
    }
}