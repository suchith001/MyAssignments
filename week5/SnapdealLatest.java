package homeassignments.week5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealLatest {

	/*1. Launch (https://www.snapdeal.com/) 
      2. Go to "Men's Fashion". 
      3. Go to "Sports Shoes". 
      4. Get the count of sports shoes. 
      5. Click on "Training Shoes". 
      6. Sort the products by "Low to High". 
      7. Check if the displayed items are sorted correctly. 
      8. Select any price range ex:(500-700). 
      9. Filter by any colour. 
     10. Verify all the applied filters. 
     11. Mouse hover on the first resulting "Training Shoes". 
     12. Click the "Quick View" button. 
     13. Print the cost and the discount percentage. 
     14. Take a snapshot of the shoes. 
     15. Close the current window. 
     16. Close the main window. 
	 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		 // Launch (https://www.snapdeal.com/) 
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       Actions act=new Actions(driver);
       
       //2. Go to "Men's Fashion"
       WebElement mousehover=driver.findElement(By.xpath("//div[@id='tab-category-0']/div"));
       act.moveToElement(mousehover).perform();
       
       //Go to "Sports Shoes"
       WebElement mousehover2=driver.findElement(By.xpath("//div[text()='Sports Shoes']"));
       act.click(mousehover2).perform();
       
       //Get the count of sports shoes
       WebElement count_sports_shoes=driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div"));
       System.out.println("Count of sports shoes is :"+count_sports_shoes.getText());
       
       //Click on "Training Shoes"
       WebElement click_1=driver.findElement(By.xpath("//div[text()='Training Shoes']"));
       act.click(click_1).perform();
       
       
       
       //Sort the products by "Low to High"
       WebElement sort_by=driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']/div/span"));
       act.click(sort_by).perform();
       WebElement sort=driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']/ul/li[2]"));
       System.out.println(sort.getText());
       act.click(sort).perform();
       
       Thread.sleep(1500);
       //Select any price range ex:(500-700)
       WebElement low_price=driver.findElement(By.xpath("(//div[@class='price-text-box'])[1]/input"));
       low_price.clear();
       act.sendKeys(low_price, "700").perform();
       WebElement high_price=driver.findElement(By.xpath("(//div[@class='price-text-box'])[2]/input"));
       high_price.clear();
       act.sendKeys(high_price, "1500").perform();
       WebElement filter=driver.findElement(By.xpath("(//div[@class='price-input'])[2]/following-sibling::div"));
       act.click(filter).perform();
       
       //Filter by any colour
       WebElement click_color=driver.findElement(By.xpath("//div[@data-name='Color_s']/div/label/span"));
       act.click(click_color).perform();
       
       
       //Mouse hover on the first resulting "Training Shoes"
       WebElement first_element=driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
       act.moveToElement(first_element).perform();
       
       
       Thread.sleep(1000);
       //Click the "Quick View" button
       WebElement click_quickview=driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
       act.click(click_quickview).perform();
       /*
       String parentWindow = driver.getWindowHandle();
       Set<String> childWindow = driver.getWindowHandles();
       List<String> listWindow=new ArrayList<String>(childWindow);
       driver.switchTo().window(listWindow.get(1));
       */
       Thread.sleep(1000);
       //Print the cost and the discount percentage
       WebElement cost=driver.findElement(By.xpath("//div[@class='quickViewHead']/following-sibling ::div[2]/div[2]/div[2]/span[1]"));
       WebElement discount_percentage=driver.findElement(By.xpath("//div[@class='quickViewHead']/following-sibling ::div[2]/div[2]/div[2]/span[2]"));
       System.out.println("Cost of the shoes is :"+cost.getText());
       System.out.println("Discount of the shoes is :"+discount_percentage.getText());
       
       
       //Take snapshot of the shoes
       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(screenshot, new File("C:\\Downloads\\page_shoes_pic.png"));
       
       //close the window
       driver.close();
       
	}

}
