package Test;

public class Main {

	public static void main(String[] args) {
		String email="ahmetgmail.com";
		RegexTest regexTest= new RegexTest();
	 boolean result=regexTest.isEmailValid(email);
	 System.out.println(result);

	}

}
