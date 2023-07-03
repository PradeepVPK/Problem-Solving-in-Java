import java.util.Scanner;

public class _21_prime_palindrome {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int rem, rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            int i;
            for (i = 2; i < rev; i++) {
                if (rev % i == 0) {
                    System.out.println(" not a prime palindrome");
                }
            }
            if (rev == i)
                System.out.println(" prime palindrome");

            }
        else
            System.out.println(" not a prime palindrome");
        }

    }
