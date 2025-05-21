package Codingproblems;

public class largeandsmallestnumberinarray {

	public static void main(String[] args) {
		int[] numbers = {200,300,120,860,450,755,977,98,65,564};
		findmaxmin(numbers);
		
	}
public static void findmaxmin(int[] arr) {
	
	int min=arr[0];
	int max= arr[0];
	 
	for(int num :arr) {
		
		if (num<min) {
			min=num;
		}
		if(num>max) {
			max=num;
		}
	}
	System.out.println("Smallest number is " +min);
	System.out.println("largest number is " +max);
}
}
