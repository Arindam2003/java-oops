public class exception {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println(result);  
        }
        catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            // This block will always execute
            System.out.println("final block");
        }

        System.out.println("Program end");
    }
}

