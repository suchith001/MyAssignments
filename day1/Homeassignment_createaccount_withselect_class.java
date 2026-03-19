package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homeassignment_createaccount_withselect_class {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement account_name=driver.findElement(By.id("accountName"));
		account_name.sendKeys("Sample34");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(industryDD);
		sel.selectByIndex(3);
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select sel1=new Select(ownershipDD);
		sel1.selectByVisibleText("S-Corporation");
		WebElement sourceDD=driver.findElement(By.id("dataSourceId"));
		Select sel2=new Select(sourceDD);
		sel2.selectByValue("LEAD_EMPLOYEE");
		WebElement campaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select sel3=new Select(campaignDD);
		sel3.selectByIndex(6);
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4=new Select(stateDD);
		sel4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement account_name1=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String account=account_name1.getText();
		System.out.println("Account name is "+account);
		driver.close();

	}

}
