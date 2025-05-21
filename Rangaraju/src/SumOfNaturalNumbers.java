import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumFormula = (n * (n + 1)) / 2;
        System.out.println("Sum using the formula: " + sumFormula);
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;  // Add the current number to the sum
        }
        System.out.println("Sum using the loop: " + sumLoop);

       
        scanner.close();
    }
	}


