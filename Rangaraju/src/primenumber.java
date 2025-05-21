import java.util.HashMap;
import java.util.Scanner;

public class primenumber {

	public static boolean isPrime(int n, int divisor) {
		if (n <= 1)
			return false; // Base case: numbers <=1 are not prime
		if (divisor == 1)
			return true; // Base case: reached 1, prime confirmed
		if (n % divisor == 0)
			return false; // If divisible, not prime

		return isPrime(n, divisor - 1); // Recursive step: Check next divisor
	}

	static HashMap<Integer, Boolean> primeCache = new HashMap<>();

	public static boolean isPrime2(int n, int divisor) {
		if (n <= 1)
			return false;
		if (divisor == 1)
			return true;
		if (primeCache.containsKey(n))
			return primeCache.get(n); // Use cache

		if (n % divisor == 0) {
			primeCache.put(n, false);
			return false;
		}

		boolean result = isPrime(n, divisor - 1);
		primeCache.put(n, result); // Store result in cache
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		if (isPrime(n, n / 2)) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}

		scanner.close();

	}

}