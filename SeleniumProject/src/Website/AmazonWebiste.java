package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonWebiste {

	public static void main(String[] args) throws InterruptedException {
		//Enter webdriver location exe file
				System.setProperty("webdriver.chrome.driver","C:\\Users\\91905\\Downloads\\chromedriver_win94\\Chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.findElement(By.xpath("//a[@role='button']")).click();
				driver.findElement(By.xpath("//i[@class='nav-sprite hmenu-arrow-next']")).click();
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[2]/li[5]/a")).click();
				Thread.sleep(1000);				
				//quantity selection 
				WebElement Q =driver.findElement(By.xpath("//select[@id='quantity']"));
				driver.findElement(By.xpath("//select[@id='quantity']")).click();
				Select D= new Select(Q);
				D.selectByVisibleText("3");
				Thread.sleep(1000);
				driver.findElement(By.linkText("Add to Wish List")).click();
				driver.navigate().back();
				Thread.sleep(1000);
				driver.close();

				
	}
}
