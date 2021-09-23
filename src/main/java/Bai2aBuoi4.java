import java.util.Scanner;

public class Bai2aBuoi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n : ");
        int n = sc.nextInt();

        int s2a = sum2a(n);
        System.out.format("Sum (2a) = %d\n", s2a);
    }
    public static int sum2a(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;

        }
        return s;
    }
}
