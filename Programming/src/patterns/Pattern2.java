package patterns;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i =1;
		
		while(i<=n) {
			
			int j = 1;
			
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			
			System.out.println();
			i = i + 1;
		}
		
	}

}
