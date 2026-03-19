package week4.homeassignment;

public class LoginTestData1 extends TestData {

	
	public void enterUsername()
	{
		System.out.println("Enter username from LoginTestdata1 class");
	}
	public void enterPassword()
	{
		System.out.println("Enter password from LoginTestdata1 class");
	}
	public static void main(String[] args) {
		LoginTestData1 ld1=new LoginTestData1();
		ld1.enterUsername();
		ld1.enterPassword();
		ld1.enterCredentials();
		ld1.navigateToHomePage();

	}

}
