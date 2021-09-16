package week2.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String Test = "i hai"; 
		String[] str=Test.split(" ");
		String str1="";
		for (int i = 0; i < str.length; i++) {
			if(i%2!=0)
			{  
			        StringBuilder sb=new StringBuilder();  
			        sb.reverse(); 
			        str1+=sb.toString()+" ";  
			        System.out.println(str1);
			}
		}
}
}
