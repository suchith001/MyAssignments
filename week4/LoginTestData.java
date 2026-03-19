package homeassignments.week4;

public class LoginTestData extends TestData {
	
	public void enterUsername()
	{
		System.out.println("Enter username from LoginTestdata class");
	}
	public void enterPassword()
	{
		System.out.println("Enter password from LoginTestdata class");
	}

	public static void main(String[] args) {
		LoginTestData ld=new LoginTestData();
		ld.enterCredentials();
		ld.navigateToHomePage();
		ld.enterUsername();
		ld.enterPassword();
		

	}

}
