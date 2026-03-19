package homeassignments.week4;

public class Safari extends Browser {
	
	public void readerMode() 
	{
		System.out.println("Reader mode from Safari browser");
	}
    public void fullScreenMode()
    {
    	System.out.println("Fullscreen mode from safari browser");
    }
    public static void main(String[] args) {
		Safari sf=new Safari();
		sf.openURL();
		sf.closeBrowser();
		sf.navigateBack();
		sf.readerMode();
		sf.fullScreenMode();
	}
}
