package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a string
		String s ="PayPal India";
		
		// convert to char[]
		char[] s1=s.toCharArray();
//		for (char c : s1) {
//			System.out.print(c);
//		}
		
		//declare a set
		Set<Character> set=new TreeSet<Character>();
		for (char ch : s1) {
			set.add(ch);
			
		}
		//System.out.println(set);
		for (char ch1 : set) {
			if (ch1 != ' ')
			{
				System.out.print(ch1);
			}
				
			
		}
		
		
		
		

	}

}
