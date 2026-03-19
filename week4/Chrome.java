package homeassignments.week4;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("Open incognito mode from Chrome browser");
		
	}
	public void  clearCache()
	{
		System.out.println("Clear cache method from Chrome browser");
	}
	
	public static void main(String[] args) {
		Chrome ch=new Chrome();
		ch.browserName="Chrome";
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		ch.openIncognito();
		ch.clearCache();
				

	}

}
