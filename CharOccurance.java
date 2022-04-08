package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "Welcome to Chennai";
		char ch ='n';
		int count =0;
		//int len= str.length();

		char[] ch1= str.toCharArray();
		int len = ch1.length;
		//System.out.println(len);
		for(int i=0;i<len;i++)
		{
			if(ch1[i]==ch)
			{
				count++;
			}
		}
		System.out.println("The count is "+count);
	}

}
