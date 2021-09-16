package week2.day2;

public class ReverseString {
	
	public static void main(String[] args) {
		String test = "feeling good";
		char[] array1=test.toCharArray();
		for (int i = array1.length-1; i>=0; i--) {
			char c = array1[i];
			System.out.print(c);
			
		}
	}


}
