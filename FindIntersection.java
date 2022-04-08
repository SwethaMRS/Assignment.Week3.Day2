package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		
//		List<Integer> l1=new ArrayList<Integer>();
//		List<Integer> l2=new ArrayList<Integer>();
//		
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			s1.add(a[i]);
		}
		for(int j=0;j<b.length;j++)
		{
			s2.add(b[j]);
		}
		
		System.out.println(s1);
		System.out.println(s2);
		s2.retainAll(s1);
		
		System.out.println("The intersection is "+s2);
		
		
		
		
		
		
	}

}
