package strings;

public class StringDeclaration {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		// s1 and s2 share the same reference in string constant pool
		System.out.println(s1==s2);
		
		//s3 new object is created
		System.out.println(s1==s3);
	}

}
