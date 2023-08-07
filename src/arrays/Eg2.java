package arrays;

public class Eg2 {
	public static void main(String[] args) {
		
		String a[]=new String[3];
		
		a[0]="Welcome";
		a[1]="to";
		a[2]="chennai";
		
		//to find the length of the array
		System.out.println(a.length);//->3
		
		for(String s:a) {
			System.out.println(s);
	}
	}
}
