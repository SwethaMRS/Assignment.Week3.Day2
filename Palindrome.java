package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val = "madam";
		String revval = "";
		
		int len = val.length();
		//System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			//System.out.print(val.charAt(i));
			revval = revval+(val.charAt(i));
		}
		//System.out.println(revval);
		
		boolean compare = revval.equalsIgnoreCase(val);
		if(compare)
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}

}
