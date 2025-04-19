import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int first = -1;
        int second = 1;
        while (count < num) {
            int sum = first + second;
            System.out.println(sum+" ");
            first=second;
            second=sum;
            count++;
        }

        sc.close();
    }

}