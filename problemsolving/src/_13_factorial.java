import java.util.Scanner;
class facto{
    //reccursion
    static int factu(int n){
        if (n==0)
            return 1;
        else
            return n*factu(n-1);
    }
}
public class _13_factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact=1;
        //looping
        for (int i=1;i<=num;i++)
            fact*=i;
        System.out.println(fact);
        System.out.println(facto.factu(num));

    }
}
