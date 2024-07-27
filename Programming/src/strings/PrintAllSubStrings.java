package strings;

public class PrintAllSubStrings {
	
	public static void printSubstrings(String str) {
		
		for(int start = 0; start < str.length(); start++) {
//			print all substrings with char at index start
			for(int end = start; end < str.length(); end++) {
				System.out.println(str.substring(start, end + 1));
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "pqrs";
		printSubstrings(str);
		
		
	}

}
