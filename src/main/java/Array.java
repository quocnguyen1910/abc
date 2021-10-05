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

        System.out.format("Sum = %d\n", sumElements(arr));

//        if (isAllEven(arr)) {
//            System.out.println("Mang chan");
//        } else
//            System.out.println("Mang ko chan");

        System.out.format("Max = %d\n", findMax(arr));
        System.out.format("Min = %d\n", findMin(arr));
        int maxIdx = findMaxIndex(arr);
        System.out.format("Max = %d, Index = %d\n", arr[maxIdx], maxIdx);

        int firstNegIdx = findFirstNegativeIndex(arr);
        if (firstNegIdx >= 0) {
            System.out.format("FirstNegative = %d, Index = %d\n", arr[firstNegIdx], firstNegIdx);
        }else System.out.println("khong co phan tu am");

        int lastPosIdx = findLastPositiveIndex(arr);
        if (lastPosIdx >= 0) {
            System.out.format("LastPositive = %d, Index = %d\n", arr[lastPosIdx], lastPosIdx);
        }else System.out.println("khong co phan tu duong");

        int minPosIdx = findMinPositiveIndex(arr);
        if (minPosIdx >= 0) {
            System.out.format("minPosIdx = %d, Index = %d\n", arr[minPosIdx], minPosIdx);
        }else System.out.println("khong co phan tu duong");

        int maxNegIdx = findMaxNegativeIndex(arr);
        if (maxNegIdx >= 0) {
            System.out.format("maxNegative = %d, Index = %d\n", arr[maxNegIdx], maxNegIdx);
        }else System.out.println("khong co phan tu duong");

//        sortArrayAsc(arr);
//        printArray(arr);

// Lap xuoi (Min -> Max)
//        for (int i : arr) {
//            System.out.format("%d, ", i);
//        }

//        // Lap nguoc (Max -> Min)
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
            ret[i] = (int) Math.floor(Math.random() * (max - min)) + min;

        }
        return ret;
    }

    // Ham kiem tra tinh chat dung sai (so le)
    public static boolean isAllEven(int[] arr) {
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

    // Max in Array
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

// tim so lon nhat va vi tri cua so do trong mang
    public static int findMaxIndex(int[] arr){
        int idx = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > arr[idx]){
                idx = i;
            }
        }

        return idx;
    }

// tim phan tu am dau tien
    public static int findFirstNegativeIndex(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                return i;
            }
        }

        return -1; // khong co pha \n tu am
    }
    // **tim so duong dau tien tu cuoi len
//    public static int findLastPositiveIndex(int[] arr){
//
//        for (int i = arr.length-1; i >=0 ; i--){
//            if (arr[i] > 0 ){
//                return i;
//            }
//        }
//        return -1;
//    }

    //** tim so duong dau tien tu cuoi len dung break **
    public static int findLastPositiveIndex(int[] arr){
        int idx = -1;

        for (int i = arr.length-1; i >=0 ; i--){
            if (arr[i] > 0 ){
                idx = i;
                break;
            }
        }
        return idx;
    }

// Tim so duong nho nhat trong mang
    public static int findMinPositiveIndex(int[] arr){
        int lastPosIdx = findLastPositiveIndex(arr);
        if (lastPosIdx < 0 ){
           return -1;
       }
        int minPosIdx = lastPosIdx;
        for (int i = 0; i< arr.length; i++){
           if (arr[i] > 0 && arr[i] < arr[minPosIdx]){
               minPosIdx = i;
           }
       }
        return minPosIdx;
    }

    public static int findMaxNegativeIndex(int[] arr){
        int maxNegIdx = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0 && (maxNegIdx == -1 || arr[i] > arr[maxNegIdx])){
                maxNegIdx = i;
            }
        }
        return maxNegIdx;
    }
    //Min in Array
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
