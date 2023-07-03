import java.util.Scanner;

public class _7_sum_prime { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int sum=0;
    for (int i = 2; i < num; i++) {
        int count = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                count++;
            }

        }
        if (count == 1)
            sum+=i;


    }
    System.out.println(sum);
}
}
