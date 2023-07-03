import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        if((n&1)==1){
            System.out.println("Weird");
        }
        else if (((n&1)==0) && n>=2 &&n<=5){
            System.out.println("Not Weird");
        }
        else if (((n&1)==0) && n>=6 &&n<=20){
            System.out.println("Weird");
        }
        else if (((n&1)==0) && n>20){
            System.out.println("Not Weird");
        }
    }
}
