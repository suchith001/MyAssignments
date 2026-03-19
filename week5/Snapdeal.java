package homeassignments.week5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 ChromeDriver driver=new ChromeDriver();
		 // Navigate to https://www.bigbasket.com/. 
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions act=new Actions(driver);
        
        // Click on "Shop by Category". 
        WebElement shopbycat=driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]/button"));
        act.click(shopbycat).perform();
        Thread.sleep(200);
        //Mouse over "Foodgrains, Oil & Masala". 
        WebElement mousehover=driver.findElement(By.xpath("(//a[contains(normalize-space(text()),'Foodgrains, Oil & Masala')])[2]"));
        act.moveToElement(mousehover).perform();
        //Mouse over "Rice & Rice Products". 
        WebElement mousehover2=driver.findElement(By.xpath("//a[contains(normalize-space(text()),'Rice & Rice Products')]"));
        act.moveToElement(mousehover2).perform();
        // Click on "Boiled & Steam Rice"
        WebElement cli=driver.findElement(By.xpath("//a[contains(normalize-space(text()),'Boiled & Steam Rice')]"));
        act.click(cli).perform();
        
        
        //Filter the results by selecting the brand "bb Royal" 
        WebElement cli2=driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
        act.click(cli2).perform();
        
        Thread.sleep(1000);
        //Click on "Tamil Ponni Boiled Rice"
        WebElement cli3=driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]/parent::div/parent :: a/parent:: h3/following-sibling::div[3]/div/div[2]/button[text()='Add']"));
        act.click(cli3).perform();
        //Check and note the price of the rice
        WebElement amount=driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]/parent::div/parent :: a/parent:: h3/following-sibling::div/div/span"));
        System.out.println("Amount of Tamil ponni rice of 1 kg is :"+amount.getText());
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@id='toast']/div")));
        
        
       System.out.println(popup.getText());
       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(screenshot, new File("C:\\Downloads\\page.png"));
        

        
        
        
        
	}

}
