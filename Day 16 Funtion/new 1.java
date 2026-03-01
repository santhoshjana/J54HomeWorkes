

class Function {

    static int Sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int evenCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int oddCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   
                count++;
            }
        }
        return count;
    }

    static int[] reverse(int arr[]) {
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];   
        }
		// for (int i = arr.length-1; i >=0 ; i--) {
        //    arr2[j] = arr[i]; 
		//	j++;
        

        return arr2;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int total = Sum(arr);
        System.out.println("Total of the Array : " + total);

        int even = evenCount(arr);
        System.out.println("Total count of even numbers : " + even);

        int odd = oddCount(arr);   
        System.out.println("Total count of odd numbers : " + odd);

        int[] rev = reverse(arr);
        System.out.print("Reversed Array : ");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
