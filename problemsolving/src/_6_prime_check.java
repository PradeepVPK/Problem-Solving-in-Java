import java.util.Scanner;

public class _6_prime_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        if (n==1)
            System.out.println("Prime startd from 2");
        else {
            for (int i = 2; i < n; i++)
                if (n % i == 0) {
                    count++;
                }

            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("NOt Prime");
            }
        }
    }
}
