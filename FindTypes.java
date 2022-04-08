package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

				char[] ch = test.toCharArray();
				int len= ch.length;
				System.out.println(len);
				for(int i=0;i<len;i++)
				{
					if(Character.isLetter(ch[i]))
					{
						letter++;
					}
					else if(Character.isDigit(ch[i]))
					{
						num++;
					}
					else if(ch[i]==' ')
					{
						space++;
					}
					else
					{
						specialChar++;
					}
				}

		
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

		

	}

}
