package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0,i,j;
		String[] str=text.split(" ");
		for (i = 0; i < str.length; i++) {
			for(j=i+1;j<str.length-1;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;	
				}
			}
	}
		
			

}
}