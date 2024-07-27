package strings;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i = 0;
		for(; i < str.length(); i++) {
			if(str.charAt(i) == ' ') 
			{
				int currentWordEnd = i - 1;
				String reversedWord = "";
				for(int j = currentWordEnd; j >= currentWordStart ; j--) {
					reversedWord += str.charAt(j);
				}
				
//				or use this to reverse
//				for(int j = currentWordStart; j <= currentWordEnd ; j--) {
//					reversedWord += str.charAt(j) + reversedWord;
//				}				
				ans += reversedWord + " ";
				currentWordStart = i + 1;
			}
				
			
		}
		int currentWordEnd = i - 1;
		String reversedWord = "";
		for(int j = currentWordEnd; j >= currentWordStart ; j--) {
			reversedWord += str.charAt(j);
		}
		ans += reversedWord;
		
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "abc def ghi";
		System.out.println(reverseEachWord(s));
		
	}

}
