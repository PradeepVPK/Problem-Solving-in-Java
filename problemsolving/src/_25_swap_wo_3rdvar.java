import java.util.Scanner;

public class _25_swap_wo_3rdvar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1);
        System.out.println(n2);
    }
}
