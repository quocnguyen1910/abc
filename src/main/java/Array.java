import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.format("Sum = %d\n", sumElements(arr));
        sortArrayAsc(arr);
        printArray(arr);


//        for (int i : sotunhien) {
//            System.out.format("%d, ", i);
//        }
//        for (int i = sotunhien.length - 1; i >= 0; i--) {
//            System.out.format("%d, ", sotunhien[i]);
//        }
        //putin

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d", arr[i]);

        }
        System.out.println();
    }
    // Ham Sum
    public static int sumElements(int[] arr){
        int ret = 0;
        for (int ele : arr){
            ret += ele;

        }
        return ret;
    }
// sap xep (quick sort) - interchangeSort
    public static void sortArrayAsc(int[] arr){{
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }

            }
        }


    }
    }

}