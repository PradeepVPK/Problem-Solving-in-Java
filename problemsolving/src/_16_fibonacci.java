import java.util.Scanner;

public class _16_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a=-1,b=1;
        for (int i=0;i<num;i++){
            int c= a+b;
            System.out.print(c+" ");
            a=b;b=c;
        }
    }
}
