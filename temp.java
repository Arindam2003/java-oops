import java.util.*;

public class temp{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter ferenhite:");
        float f=sc.nextFloat();
        float c=((f-32)/9)*5;
        System.out.printf("%f",c);
        sc.close();
    }
}