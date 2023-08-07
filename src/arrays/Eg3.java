package arrays;

public class Eg3 {

	public static void main(String[] args) {
		//with no limits on entry
		
		int a[]= {10,20,30,40,50};
		System.err.println(a.length);
		
		int sum=0;
		
		for (int i:a) {
		
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
