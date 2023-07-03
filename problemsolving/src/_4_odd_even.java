import java.util.Scanner;

public class _4_odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if ((num&1) ==1)
            System.out.println("Odd Number");
        else
            System.out.println("even Number");
    }
}
