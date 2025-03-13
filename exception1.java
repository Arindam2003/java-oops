public class exception1 {
    public static void main(String[] args) {
        try {
            int size = -5;
            int[] arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative Array Size Exception: " + e.getMessage());
        }
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        System.out.println("Exceptions.");
    }
}
