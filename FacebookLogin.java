package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vandana");
		driver.findElement(By.name("lastname")).sendKeys("Nair");
		driver.findElement(By.name("lastname")).sendKeys("9460123881");
		driver.findElement(By.id("password_step_input")).sendKeys("12342");
		
		WebElement source1 = driver.findElement(By.id("day"));
		Select drop1 = new Select(source1);
		drop1.selectByValue("23");
		
		WebElement source2 = driver.findElement(By.id("month"));
		Select drop2 = new Select(source2);
		drop2.selectByValue("5");
		
		WebElement source3 = driver.findElement(By.id("year"));
		Select drop3 = new Select(source3);
		drop3.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		
		
		
		
	}

}
