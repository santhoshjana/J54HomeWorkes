import java.util.*;

class ArrayMenuProgram {

    int[] arr;
    int n;
    boolean isSorted = false;

    Scanner sc = new Scanner(System.in);

    // 1. Accept array elements
    void acceptArray() {
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        isSorted = false;
        System.out.println("Array stored successfully.");
    }

    // 2. Display array
    void displayArray() {
        if (arr == null) {
            System.out.println("Array not created yet.");
            return;
        }

        System.out.print("Array elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 3. Bubble Sort
    void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        isSorted = true;
        System.out.println("Array sorted using Bubble Sort.");
    }

    // Selection Sort
    void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        isSorted = true;
        System.out.println("Array sorted using Selection Sort.");
    }

    // Merge Sort
    void mergeSort(int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(l, m);
            mergeSort(m + 1, r);

            merge(l, m, r);
        }
        isSorted = true;
    }

    void merge(int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Linear Search
    void linearSearch(int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Binary Search
    void binarySearch(int key) {

        if (!isSorted) {
            System.out.println("Array must be sorted before Binary Search.");
            return;
        }

        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            if (arr[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }

        System.out.println("Element not found.");
    }

    public static void main(String[] args) {

        ArrayMenuProgram obj = new ArrayMenuProgram();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n------ MAIN MENU ------");
            System.out.println("1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.acceptArray();
                    break;

                case 2:
                    obj.displayArray();
                    break;

                case 3:
                    System.out.println("Choose sorting method:");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Selection Sort");
                    System.out.println("3. Merge Sort");

                    int sortChoice = sc.nextInt();

                    if (sortChoice == 1)
                        obj.bubbleSort();
                    else if (sortChoice == 2)
                        obj.selectionSort();
                    else if (sortChoice == 3) {
                        obj.mergeSort(0, obj.n - 1);
                        System.out.println("Array sorted using Merge Sort.");
                    }
                    else
                        System.out.println("Invalid sorting option.");
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();

                    System.out.println("Choose searching method:");
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");

                    int searchChoice = sc.nextInt();

                    if (searchChoice == 1)
                        obj.linearSearch(key);
                    else if (searchChoice == 2)
                        obj.binarySearch(key);
                    else
                        System.out.println("Invalid searching option.");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}