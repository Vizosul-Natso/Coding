package patterns;

public class Pattern9 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i = 1;
		char a = 'A';
		while(i <= n) {
			
			int j = 1;
			while(j <= n) {
				
				System.out.print(a);
				j = j + 1;
				a++;
			}
			
			System.out.println();
			i = i + 1;	
			a = (char)(a - n + 1);
		}
		
	}

}
