package patterns;

public class Pattern11 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i = 1;

		while(i <= n) {
			
			int s = 1;
			while(s <= n - i) {
				System.out.print(" ");
				s = s + 1;
			}
			
			int star = 1;
			while(star <= i) {
				System.out.print("*");
				star = star + 1;
			}
			
			System.out.println();
			i = i + 1;
		}		
		
	}

}
