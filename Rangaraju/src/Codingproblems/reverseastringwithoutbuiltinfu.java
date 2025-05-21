package Codingproblems;

public class reverseastringwithoutbuiltinfu {

	public static void main(String[] args) {
		String name = "Rangaraju";
		String reversed = reverseString(name);
		System.out.println("Reversed String " + reversed);
	}
		
		public static String reverseString(String str) {
			
			char[] charArray = str.toCharArray();
			int left=0,right = charArray.length-1;
			
			while(left<right) {
				char temp = charArray[left];
				 charArray[left]= charArray[right];
				 charArray[right]=temp;
				 
				 left++;
				 right--;
			}
			return new String(charArray);
			
		}

	}


