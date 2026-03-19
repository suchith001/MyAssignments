package Week3.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class BookMovieTickets {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com");
		driver.findElement(By.className("cities-placed"));
		driver.findElement(By.xpath("//span[@id='city']/input")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("li[text()='Bengaluru']")).click();
		//driver.findElement(By.linkText("Cinema")).click();
		//driver.findElement(By.linkText("Select Cinema"));
		//driver.findElement;
		
		

	}

}
