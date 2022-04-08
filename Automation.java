package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation aut = new Automation();
		aut.selenium();
		aut.python();
		aut.ruby();
		aut.java();

	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium Automation");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java Language");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
		
	}

}
