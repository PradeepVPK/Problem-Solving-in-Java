import java.util.Scanner;

public class _12_palindrome {
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
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }

    }
}