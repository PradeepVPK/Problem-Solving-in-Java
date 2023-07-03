import java.util.Scanner;

public class _8_mul_table {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for (int i=1;i<=20;i++){
        System.out.println(i+"x"+num+"="+(num*i));
    }
}
}
