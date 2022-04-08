package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a Software tester";
		String even ="";
		String reveven = "";
		//boolean flag = true;
		// split the words
		
		String[] split= test.split(" ");
//		for (String n : split) {
//			System.out.print(n);
//		}
		//System.out.println(split.length);
		for(int i=0;i<split.length;i++)
		{
			if(i%2!=0)
			{
				//flag = false;
				even= even+split[i];
			}
		}
		//System.out.println(even);
		String[] split2=even.split("");
		int len = split2.length;
		//System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			//System.out.print(val.charAt(i));
			reveven = reveven+split2[i];
		}
		//System.out.println(reveven);
		
	}

}
