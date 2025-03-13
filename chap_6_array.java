import java.util.*;
public class chap_6_array {
    public static void main(String[] args) {
        //1
        Scanner s=new Scanner(System.in);
        // float[] arr=new float[5];
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=s.nextFloat();
        // }
        // float sum=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        // 5

        int[] arr=new int [5];
        System.out.println("Enter an array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Your an array:");
        for(int i:arr){
            System.out.println(i);
        }
        int i=0;
        while(i<arr.length/2)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            i++;
        }
        System.out.println("New array:");
        for(int x:arr){
            System.out.println(x);
        }

        s.close();
    }
}