import java.util.Scanner;

public class Factorial {

    // Approach 1: Iterative method (using loop)
    public static int factorialUsingLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;  // Multiply result with i at each step
        }
        return result;
    }

    // Approach 2: Recursive method
    public static int factorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! = 1
        } else {
            return n * factorialUsingRecursion(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();  // Read the input number
        
        // Calculate factorial using the loop
        int factorialLoop = factorialUsingLoop(n);
        System.out.println("Factorial using loop: " + factorialLoop);

        // Calculate factorial using recursion
        int factorialRecursion = factorialUsingRecursion(n);
        System.out.println("Factorial using recursion: " + factorialRecursion);

        
        scanner.close();
    }
}
