package Website;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Feature {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//Enter webdriver location exe file
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91905\\Downloads\\chromedriver_win93\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// Dropdown class
		WebElement D = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		Select d = new Select(D);
		d.selectByVisibleText("Hrvatski");
		Thread.sleep(1000);
		
		// Selecting English language again
		d.selectByVisibleText("English");
		driver.findElement(By.name("search")).sendKeys("India");
		
		// Getting entered data
		String data = driver.findElement(By.name("search")).getAttribute("value");
		System.out.println(data);
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
		//Page Scrolling 
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        
		// clicking on settings button in langugages
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Language settings']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Login screen
		driver.findElement(By.linkText("Log in")).click();
		driver.navigate().back();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(2000);
		
        //Entering into the image 
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/div[6]/div/div[2]/div/div[1]/a/img")).click();
		Thread.sleep(1000);
		
		//Closing the image 
		driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/button[1]")).click();
		
		//closing browser
		driver.close();
	}

}
