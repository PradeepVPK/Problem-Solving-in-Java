import java.util.Scanner;

public class _11_range_perfect { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    for (int k = 1; k <= num; k++) {
        int sum = 1;
        for (int i = 2; i <=k / 2; i++) {
            if (k % i == 0) {
                sum += i;
            }
        }
        if (sum == k)
            System.out.println(k);

    }
}
}
