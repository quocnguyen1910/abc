import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//Sum n
        System.out.println("Nhập n : ");
        int n = sc.nextInt();

        int s2a = sum2a(n);
        System.out.format("Sum (2a) = %d\n", s2a);
//isSymmetricalNumber
        System.out.println("Input number to check: ");
        long nm = sc.nextLong();
        if (isSymmetricalNumber(nm)) {
            System.out.println("Number : " + nm + " is a palindrome");
        } else {
            System.out.println("Number : " + nm + " is not a palindrome");
        }


//is PrimeNumber
       System.out.println("Nhập n : ");
        n = sc.nextInt();
        if (isPrimeNumber(n)){
            System.out.format("%d là số nguyên tố. \n",n);
        }else {
            System.out.format("%d Không Phải số nguyên tố. \n",n);
        }
    }

    public static boolean isPrimeNumber(int n) {
        boolean ret = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;

    }

    public static boolean isSymmetricalNumber(long number) {
        long nm = number;
        long reverse = 0;
        while (nm != 0) {
            long remainder = nm % 10;
            reverse = reverse * 10 + remainder;
            nm = nm / 10;
            if (number == reverse) {
                return true;
            }
        }
        return false;
    }
    public static int sum2a(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;

        }
        return s;
    }
}



