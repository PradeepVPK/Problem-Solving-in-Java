import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class _3_sum_n {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++)
           sum+=i;
        System.out.println(sum);
    }

}
