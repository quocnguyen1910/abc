import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("n = ");
//        int n = sc.nextInt();


//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.format("a[%d] = ", i);
//            arr[i] = sc.nextInt();
//        }


        int[] arr = generateArray(20, -50, 50);
        printArray(arr);

//        System.out.format("Sum = %d\n", sumElements(arr));

        if (isAllEven(arr)){
            System.out.println("Mang chan");
        }else
            System.out.println("Mang ko chan");

//        sortArrayAsc(arr);
//        printArray(arr);


//        for (int i : arr) {
//            System.out.format("%d, ", i);
//        }
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.format("%d, ", arr[i]);
//        }


    }

    // Ham in
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);

        }
        System.out.println();
    }

    // Ham Sum
    public static int sumElements(int[] arr) {
        int ret = 0;
        for (int ele : arr) {
            ret += ele;

        }
        return ret;
    }

    // sap xep (quick sort) - interchangeSort
    public static void sortArrayAsc(int[] arr) {
        {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }

                }
            }
        }
    }
// Ham phat sinh ramdom so trong mang
    public static int[] generateArray(int n, int min, int max) {
        int[] ret = new int[n];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int)Math.floor(Math.random() * (max-min)) + min;

        }
        return  ret;
    }

    // Ham kiem tra tinh chat dung sai (so le)
    public static boolean isAllEven(int[] arr){
        boolean ret = false;
        for (int n : arr) {
            if (n % 2 != 0) {
                return false;
//                ret = false;
//                break;
            }
        }
        return true;
    }
}