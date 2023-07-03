import java.util.Scanner;

public class output_formattting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("==================");
        for (int i=0;i<3;i++){
            String a=in.next();
            int b=in.nextInt();
            System.out.format("%-15s%03d%n",a,b);
        }
        String a=in.nextLine();
        System.out.println("==================");

    }
}
