package patterns;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int i = 1;
		
		while(i <= n) {
			int j =1;
			while(j <=n) {
				System.out.print('*');
				j = j + 1;
			}
			System.out.println();
			i = i +1;
		}
		
	}

}
