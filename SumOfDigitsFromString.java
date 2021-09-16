package week2.day2;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceal=text.replaceAll("[\\D]","");
		char array[]=replaceal.toCharArray();
		for (int i = 0; i < array.length; i++)
		{
			sum+=Character.getNumericValue(array[i]);
		}
		System.out.println(replaceal);
		System.out.println(sum);
	
}	
	}  
