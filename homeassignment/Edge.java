package week4.homeassignment;

public class Edge extends Browser {
	
	public void takeSnap()
	{
		System.out.println("Take snap from Edge browser");
		
	}
	public void clearCookies()
	{
		System.out.println("Clearcookies from Edge browser");
	}
	public static void main(String[] args) {
		Edge ed=new Edge();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		ed.takeSnap();
		ed.clearCookies();
	}

}
