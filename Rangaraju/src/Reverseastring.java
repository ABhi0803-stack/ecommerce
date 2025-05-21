
public class Reverseastring {

	public static String reversed(String str) {

		return new StringBuilder(str).reverse().toString();
	}
	
	

	public static void main(String[] args) {

		System.out.println(reversed("Automation"));
	}

}
