package patterns;

public class Pattern10 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i = 1;
		
		while(i <= n) {
			
			int j = 1;
			while(j <= n) {
				char jChar = (char)('A' + j - 1);
				System.out.print(jChar);
				j = j + 1;
			}
			
			System.out.println();
			i = i + 1;
			
		}
		
	}

}
