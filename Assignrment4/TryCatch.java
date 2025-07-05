import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        try {
            int c = a/b ;
            System.out.println("Result: " + c);
          
        } catch (ArithmeticException e) {
            System.out.println("Error : DIVISION BY ZERO");
        }
        finally {
            System.out.println("This is the finally block");
        }
    } 
}
