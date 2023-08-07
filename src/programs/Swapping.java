package programs;

public class Swapping {

	public static void main(String[] args) {
		int a=20;
		int b=50;
		
		System.out.println("Value of A before swapping: " +a);
		System.out.println("Value of B before swapping: " +b);
		
		
		int c;
		c=a; //c=20
		a=b; //a=50
		b=c; //b=20
		
		System.out.println("Value of A after swapping: " +a);
		System.out.println("Value of B after swapping: " +b);

	}

}
