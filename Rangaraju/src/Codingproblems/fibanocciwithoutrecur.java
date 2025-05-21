package Codingproblems;

public class fibanocciwithoutrecur {
	public static void main(String args[])  
	{   
	//Considering the first two numbers as 0 and 1 
	 int num1=0,num2=1,num3=3,num4,i,count=10;  
	//Count=10 means that only the first 10 fibonacci numbers will be displayed  
	 System.out.print(num1+" "+num2+" "+num3);
	//printing 0 and 1
	 for(i=3;i<count;++i)  
	//looping is initiated from 2 as 0 and 1 are already printed  
	 {
	  num4=num1+num2+num3;
	  System.out.print(" "+num4);
	  num1=num2;
	  num2=num3;
	  num3=num4;
	 }
	}
}
