package patterns;

public class Pattern6 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int i = 1;
		
		while(i <= n) {
			int j = 1;
			int p = i;
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
