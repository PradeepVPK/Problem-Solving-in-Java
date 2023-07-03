import java.util.Scanner;

public class _30_hex_dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int i = 0;
        int sum = 0;
        int l=n.length();
        while (l> 0) {
            int rem;
            char ch = n.charAt(l - 1);
            if (ch >= 65 && ch <= 70)
                rem = ch - 55;
            else if (ch >= 97 && ch <= 102)
                rem = ch - 87;
            else
                rem = ch - 48;
            sum += rem * Math.pow(16, i);
            i++;
            l--;
        }
        System.out.println(sum);
    }
}
