package strings;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String str = "java is fun";
		String revStr = "";
			
		for(int i = str.length() - 1; i >= 0 ; i--) {
			
				if(str.charAt(i) != ' ') {
					
					revStr = revStr + str.charAt(i) ;
					System.out.println(str.charAt(i));
				}else {
					revStr = revStr + " " ;
				}
		}
		
		System.out.println("The reversed is : "+revStr);
		
	}

}
