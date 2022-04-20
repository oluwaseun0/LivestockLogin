package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\LivestockLogin\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open application url
		driver.get("https://livestocklog-frontend-stg.herokuapp.com/");
		//to maximize browser
		driver.manage().window().maximize();
		//to manage timeouts
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to click  on Login Tab
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/div[1]/a[1]")).click();
		//to enter Email
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("bolu@gmail.com");
		//to enter Password
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Bayo");		
		//to click Login
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/form/button")).click();
	

		
	}
}
