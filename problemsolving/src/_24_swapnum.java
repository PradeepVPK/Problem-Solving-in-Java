import java.util.Scanner;

public class _24_swapnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1);
        System.out.println(n2);
    }
}
