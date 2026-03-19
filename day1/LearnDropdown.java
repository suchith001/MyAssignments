package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suchith");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasudevan");
		WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		WebElement industryDD=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("IND_HEALTH_CARE");
		
		

	}

}
