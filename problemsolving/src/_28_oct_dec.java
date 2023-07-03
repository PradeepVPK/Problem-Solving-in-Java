import java.util.Scanner;

public class _28_oct_dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0;
        int sum=0;
        while (n>0){

            int rem=n%10;
            sum+=rem*Math.pow(8,i);
            i++;
            n=n/10;
        }
        System.out.println(sum);
    }

}
