import java.util.Scanner;

public class percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number:");
        int x = sc.nextInt();
        System.out.println("enter your number:");
        int num=sc.nextInt();
        double result=((double)num/x)*100;
        System.out.println(result);

        sc.close();
    }
}