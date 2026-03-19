package homeassignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Homeassignment_Editlead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Suchith");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vasudevan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Suchi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Development");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi, learning Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suchithpkd@gmail.com");
		WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel=new Select(stateDD);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton"));
		driver.findElement(By.linkText("Edit"));
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learning selenium webdriver");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
