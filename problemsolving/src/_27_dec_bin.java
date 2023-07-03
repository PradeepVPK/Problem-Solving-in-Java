import java.util.Scanner;

public class _27_dec_bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String bin="";
        while (n>0){
            int rem=n%2;
            bin=rem+bin;
            n=n/2;
        }
        System.out.println(bin);
    }
}
