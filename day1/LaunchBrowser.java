package Week2.day1;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		//btn = driver.findElement((By.name("login"));
		 driver.findElement(By.name("login")).click();
		 String Title=driver.getTitle();
		 System.out.println(Title);
				 
		
		 

		//driver.close();
		

	}

}
