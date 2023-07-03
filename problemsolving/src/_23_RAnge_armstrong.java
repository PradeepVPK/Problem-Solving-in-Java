import java.util.Scanner;

public class _23_RAnge_armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        for(int n=1;n<=range;n++){
            int dig=0,sum=0;
            int temp=n;
            int temp1=n;
            while(n>0){
                dig++;
                n=n/10;
            }
            while (temp>0){
                int rem=temp%10;
                sum+=Math.pow(rem,dig);
                temp=temp/10;
            }
            if (temp1==sum){
                System.out.println("armstromg");
            }


        }
    }
}
