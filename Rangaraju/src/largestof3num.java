
public class largestof3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 60;
		int num2 = 40;
		int num3 = 50;
		int num4 = 45;
		int largest = (num1>num2)?(num1>num3 ? num1 : num3) : (num2>num3? num2 : num3);
		System.out.println("The largest number is : " +largest);
		
int smallest;
        
        // Compare the numbers using if-else statements
        if (num1 < num2 && num1 < num3 && num1 < num4) {
        	smallest = num1;  // num1 is the largest
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
        	smallest = num2;  // num2 is the largest
        }  else if (num3 < num1 && num2 < num3 && num3 < num4) {
        	smallest = num2;  // num2 is the largest
        }
        else {
        	smallest = num4;  // num3 is the largest
        }
        
        // Print the largest number
        System.out.println("The samlles number is  : " + smallest);
		

	}

}
