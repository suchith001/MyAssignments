package homeassignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeassignment_delete_lead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9742745295");
		//System.out.println("print this ====== "+driver.findElement(By.linkText("Find Leads")));
		Thread.sleep(7000);
		//driver.findElement(By.linkText("Find Leads")).click();
		//WebElement leadbtn=driver.findElement(By.xpath("//div[@class='x-panel-mr']/button")).click();
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

driver.findElement(By.xpath("//button[text()='Find Leads']")).click();


         Thread.sleep(2000);
		WebElement leadID=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text1=leadID.getText();
		Thread.sleep(2000);
		leadID.click();
		Thread.sleep(3000);
		//System.out.println("Captured resulting Lead ID is :"+text1);
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.name("id")).sendKeys(text1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	}

}
