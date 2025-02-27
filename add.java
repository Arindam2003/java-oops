import java.util.*;

public class add {  // Also, Java class names usually follow PascalCase
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println(z);   // This is cleaner and more common in Java
        sc.close();
    }
}
