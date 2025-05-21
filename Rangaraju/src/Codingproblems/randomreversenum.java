package Codingproblems;

import java.util.Random;

public class randomreversenum {

	public static void main(String[] args) {

		Random random = new Random();
		int number = random.nextInt(1000);
		System.out.println("Random number " + number);
		
		int reversed = reverseNumber(number);
		System.out.println("Reversed number " + reversed);
		
		
	}
	
	public static int reverseNumber(int num) {
		int reversed = 0;
		while(num!=0) {
			int digit = num%10;
			reversed = reversed*10 +digit;
			num/=10;
		}
		return reversed;
	}

}
