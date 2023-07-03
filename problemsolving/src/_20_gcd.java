import java.util.Scanner;

class gcd {
    static void gcdfind(int a, int b) {
        /*
        static int gcd ( int m, int n){
            if (m < n) return gcd(n, m);
            if (n == 0) return m;               //reccursion
            return gcd(n, m % n);
        }*/
        int gcd = 1;
        if (a > b) {
            for (int i = 1; i <= a; i++) {
                if ((a % i) == 0 && (b % i) == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
        if (a < b) {
            for (int i = 1; i <= b; i++) {
                if ((a % i) == 0 && (b % i) == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
    }
}

public class _20_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2");
        int num2 = sc.nextInt();
        gcd.gcdfind(num1, num2);
    }
}
