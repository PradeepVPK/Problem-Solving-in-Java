import java.util.Scanner;

public class _18_range_stromg_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        for (int num = 1; num <= range; num++) {
            int temp = num;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact *= i;
                }
                sum += fact;
                num = num / 10;
            }


            if (temp == sum)
                System.out.println(temp);
        }
    }
}
