import java.util.Scanner;

public class _9_mul_tablesss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int j=1;j<=10;j++) {
            for (int i = 1; i <= num; i++) {
                System.out.print(num+ "x" + i + "=" + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
