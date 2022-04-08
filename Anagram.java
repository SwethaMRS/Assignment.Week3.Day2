package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="stops";
		String text2="potss";
		boolean status = false;
		
		int len1= text1.length();
		int len2 = text2.length();
		
		if(len1!=len2)
		{
			status = false;
		}
		else
		{
			char[] t1=text1.toCharArray();
			char[] t2= text2.toCharArray();
			Arrays.sort(t1);
			Arrays.sort(t2);
			status=Arrays.equals(t1, t2);
		}
		if(status)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
		
		
	}

}
