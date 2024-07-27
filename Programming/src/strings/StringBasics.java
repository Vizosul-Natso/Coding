package strings;

import javax.swing.plaf.synth.SynthToolTipUI;

public class StringBasics {
	
	public static void main(String[] args) {
		char arr[] = {'c','o','d','i','n','g'};
		String str1 = "coding";
		String str2 = "is fun";
		String str3 = "coding";
		String str4 = new String("coding");
		System.out.println( str1 + " " + str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str4));
		System.out.println(str1==str4);
		
		System.out.println(str1.substring(0,3));
		
	}

}
