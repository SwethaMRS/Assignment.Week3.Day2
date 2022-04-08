package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,6,12,25,63,20};
		Arrays.sort(a);
		List<Integer> sec= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			sec.add(a[i]);
		}
		//System.out.println(sec);
		
		System.out.println("The size is "+sec.size());
		System.out.println("The second largest is "+sec.get((sec.size())-2));

	}

}
