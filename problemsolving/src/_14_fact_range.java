import java.util.Scanner;

class fact_range {
    //reccursion
    static int factu(int n) {
        if (n == 0)
            return 1;
        else
            return n * factu(n - 1);
    }
}

public class _14_fact_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(fact_range.factu(i));
        }
    }

}
