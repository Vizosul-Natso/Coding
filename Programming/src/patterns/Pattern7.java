package patterns;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i = 1;
		int p = 1;
		
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}

}
