package homeassignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homeassignment_Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sudhish");
		driver.findElement(By.name("lastname")).sendKeys("kerala");
		driver.findElement(By.name("reg_email__")).sendKeys("sample@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("$#@12kerala");
		WebElement BDDD=driver.findElement(By.name("birthday_day"));
		Select sel=new Select(BDDD);
		sel.selectByValue("10");
		
		WebElement BMDD=driver.findElement(By.name("birthday_month"));
		Select sel1=new Select(BMDD);
		sel1.selectByValue("4");
		
		WebElement BYDD=driver.findElement(By.name("birthday_year"));
		Select sel2=new Select(BYDD);
		sel2.selectByValue("1995");
		driver.findElement(By.xpath("//input[@value=2]")).click();

	}

}
