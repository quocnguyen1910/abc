import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int n;

//        do {
//            System.out.println("nhập n(0<n<9) : ");
//             n = scanner.nextInt();
//        }while (n < 0 || n > 9);
//        System.out.format("n = %d\n", n);


//        // do while
//        int i = 0;
//        do {
//            System.out.println("Do...While in Java");
//            i++;
//        }while (i<5);

        // Vòng lặp While
        // 2 kiểu while tương đương nhau
//        int i = 1;
//        while (true){
//            System.out.println("Loop í Java");
//            i++;
//            if (i ==5){
//                break;
//            }
//        }

//        while (i <= 5) {
//            System.out.println("Lopp in Java");
//            i++;
//        }
        // Vòng lặp for
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Loop in Java");
//            if (i == 5){
//                break;
//            }
//            System.out.println(i + "");
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop in Java");
            if (i == 5){
                continue;
            }
            System.out.println(i + "");
        }
        }


    //kiểu hàm
    public static int sum(int a, int b) {
        int s;
        s = a + b;
        return s;
    }

    public static void isPrintNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");

        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            default:
                System.out.println("Không sử lý được");
                break;
        }
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }


}
