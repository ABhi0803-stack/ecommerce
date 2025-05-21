
public class calculation {

	public static void main(String[] args) {
		int a = 20;
		int b =30 ;
		addition(a,b);
		substraction(a,b);
		muliplcation(a,b);
		division(a,b);
		thisorthat(a,b);
		
	}

	public static void addition(int a, int b) {
		int add = a + b ;
		System.out.println("addition vlaue is " +add);
	
	}
	public static void substraction(int a, int b) {
		int sub = b-a ;
		System.out.println("substraction vlaue is " +sub);
	
	}
	public static void muliplcation(int a, int b) {
		int mul = a*b ;
		System.out.println("multpication vlaue is " +mul);
	
	}
	public static void division(int a, int b) {
		int div = b/a ;
		System.out.println("divison vlaue is " +div);
	
	}
	public static void thisorthat(int a, int b) {
	if(a<b) {
			addition(a,b);
		}
	else if(a>b) {
			substraction(a,b);
		}
	else if(a==b) {
		division(a,b);
	}
	else if ( a< b){
		muliplcation(a,b);
	}
	}
}
