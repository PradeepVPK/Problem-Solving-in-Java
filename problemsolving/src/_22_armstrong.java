import java.util.Scanner;

public class _22_armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dig=0,sum=0;
        int temp=n;
        int temp1=n;
        while(n>0){
            dig++;
            n=n/10;
        }
        while (temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem,dig);
            temp=temp/10;
        }
        if (temp1==sum){
            System.out.println("Armstrong");
        }
        else
            System.out.println("not armstrong");
    }
}
