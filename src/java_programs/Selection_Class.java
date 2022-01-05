package java_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_Class {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.findElement(By.name("firstname")).sendKeys("Vishnu");
		
		driver.findElement(By.id("u_0_l_Ca")).sendKeys("Dondeti");
		
		driver.findElement(By.id("u_0_o_tI")).sendKeys("8885990219");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Vardhan@123");
		
		Select day = new Select( driver.findElement(By.id("day")));
		
		day.selectByVisibleText("10");
		
		Select month = new Select( driver.findElement(By.id("month")));
		
		month.selectByIndex(10);
		
		
		Select year = new Select( driver.findElement(By.id("year")));
		
		year.selectByValue("1990");
		
		
		
		
		
		
		

	}

}
