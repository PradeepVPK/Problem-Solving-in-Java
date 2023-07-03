import java.util.Scanner;

public class _29_dec_oct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String oct="";
        while (n>0){
            int rem=n%8;
            oct=rem+oct;
            n=n/8;
        }
        System.out.println(oct);
    }
}
