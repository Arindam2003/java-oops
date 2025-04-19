import java.util.*;


public class sum_avg {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5]; 
        int sum=0;
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }

        System.out.println(sum);
    }   
}
