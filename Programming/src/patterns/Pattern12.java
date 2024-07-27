package patterns;

public class Pattern12 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i = 1;

		while(i <= n) {
			int j = n;
			while(j >= i) {
				System.out.print("*");
				j = j - 1;
			}
			
			System.out.println();
			i = i + 1;
		}
		
	}

}
