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

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Navigate to https://www.Amazon.in/. 
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.Amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  Thread.sleep(1000);
		  //Search for "oneplus 9 pro"
		  Actions act=new Actions(driver);
		  WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		  act.click(search).sendKeys("oneplus 9 pro").perform();
		  WebElement cli1=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		  act.click(cli1).perform();
		  Thread.sleep(200);
		  
		  //Get the price of the first product
		  WebElement amount=driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']/span/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div/a/span"));
		  String amount_string=amount.getText();
		  String amount_2=amount_string.replaceAll("[^0-9]","");
		  System.out.println("Amount of first product is :"+amount_2);
		  
		  //Print the number of customer ratings for the first displayed product
		  WebElement customer_rating=driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']/span/div/div/div/div[2]/div/div/div[2]/div/span"));
		  System.out.println("Customer rating of first product is "+customer_rating.getText());
		  
		  //Click the first text link of the first image
		  WebElement text_link=driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']/span/div/div/div/div[2]/div/div/div"));
		  act.click(text_link).perform();
		  
		  String parentWindow = driver.getWindowHandle();
	        Set<String> childWindow = driver.getWindowHandles();
	        List<String> listWindow=new ArrayList<String>(childWindow);
	        driver.switchTo().window(listWindow.get(1));
	        
	        Thread.sleep(500);
	        //Take a screenshot of the product displayed
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot, new File("C:\\Downloads\\page_Amazon_product_latest.png"));
		    Thread.sleep(500);
		    
		    // Click the 'Add to Cart' button
	        WebElement addcart=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	        act.click(addcart).perform();
	        
	        //Get the cart subtotal and verify if it is correct
	        WebElement cartsubtotal=driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']/span[2]/span[2]"));
	        String cartsubtotal_string=cartsubtotal.getText();
	        String cartsubtotal_2=cartsubtotal_string.replaceAll(",","" );
	        System.out.println("cart subtotal is :"+cartsubtotal_2);
	        if(amount_2.equals(cartsubtotal_2))
	         System.out.println("Cart subtotal is matching with product amount");
	        else
	        	System.out.println("Cart subtotal is not matching");
	       Thread.sleep(500);
	        driver.close();
	        driver.switchTo().window(parentWindow);
	        driver.close();
	        

	}

}
