package stringg;

public class StringMethods {
	public static void main(String[] args) {
		
		String s="welcome";
		
		//length
		System.out.println(s.length());//no.of charecters in string
		
		//concatenation
		String s1=" To Chennai";
		
		System.out.println(s+s1);
		System.out.println(s.concat(s1));
		
		System.out.println("Marsio"+" Reno");
		System.out.println("Welcomee".concat(s1));
		
		//equals....return type boolean
		String s2="Welcome"; 
		
		System.out.println(s.equals(s2));//case sensitive
		
		System.out.println(s.equalsIgnoreCase(s2));//not case sensitive
		
		//contains
		System.out.println(s2.contains("elc"));
		
		//substring
		System.out.println(s.substring(0,3));
		
		//replace
		System.out.println(s2.replace('e', 'j'));
		System.out.println(s2.replace("come", "klmn"));
	}
}
