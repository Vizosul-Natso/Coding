package strings;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.substring(2));
		
		System.out.println(str.subSequence(2, 6));
		
		System.out.println(str.contains("Wo"));
		
	}

}
