package Codingproblems;

import java.util.Random;

public class randomoddoreven {

	public static void main(String[] args) {

		Random random = new Random();
		int number = random.nextInt(100);
		System.out.println("Random number " + number);
		if (number % 2 == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is odd");
		}
	}

}
