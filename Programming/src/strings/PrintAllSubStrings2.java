package strings;

public class PrintAllSubStrings2 {
	
	public static void printSubstrings(String str) {
		
		for(int l = 1; l <= str.length(); l++) {
			
			for(int s = 0 ; s <= str.length()-l; s++) {
				
					int e =s + l - 1;
					System.out.println(str.substring(s,e+1));
				
			}
			
			
		}

	}
	
	public static void main(String[] args) {
		
		String str = "pqrs";
		printSubstrings(str);
		
		
	}

}
