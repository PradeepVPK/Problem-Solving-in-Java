import java.util.Scanner;

public class _17_fibo_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a=-1,b=1,c=0;
        for (int i=0;i<=num;i++){
             c= a+b;
            a=b;b=c;
        }
        System.out.print(c+" ");
    }
}
