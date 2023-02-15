import java.util.Scanner;

public class Recursion {
    static void fibo(int num1, int num2, int num3)
    {
        if (num1 > 0) {
     
            // Function call
            fibo(num1 - 1, num3, num2 + num3);
     
            // Print the result
            System.out.print(num2 + " ");
        }
    }
     
    // Driver Code
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        fibo(number, 0, 1);
    }
}