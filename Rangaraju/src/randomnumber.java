import java.util.Random;

public class randomnumber {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(1000);
		System.out.println("Random number is " +number);
		randomnum(number);
		String stringnum =Integer.toString(number);
		String revvalue =reversed(stringnum);
		System.out.println("reversed number from string " +revvalue);
		int numbervalue = Integer.parseInt(revvalue);
		System.out.println("reversed number from int " +numbervalue);
		
	}
	
	public static void randomnum(int num) {
		if (num%2==0) {
			System.out.println("Random number is even number " +num);
		}
		else {
			System.out.println("Random number is odd number " +num);
		}
	}
	public static String reversed(String str) {

		String reversednum= new StringBuilder(str).reverse().toString();
		
		return reversednum; 
	}

}
