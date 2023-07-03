import java.util.Scanner;

public class _10_perfect_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num)
            System.out.println("Perfect number");
        else
            System.out.println("non Perfect number");
    }
}
