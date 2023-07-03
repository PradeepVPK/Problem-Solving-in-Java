import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        if(a>=2 && a<=20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + "x" + i + "=" + a * i);
            }
        }
    }
}
