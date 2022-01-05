package java_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Projects\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		driver.manage().window().maximize();
		
		String Parent_window = driver.getWindowHandle();
		
		System.out.println(Parent_window);
		
		Set<String> Child_window = driver.getWindowHandles();
		
	
		
		System.out.println(Child_window);
		
		Iterator<String> itr = Child_window.iterator();
		
		while(itr.hasNext()){
		
			String window = itr.next();
			
			if(!Parent_window.equals(window)){
				
				driver.switchTo().window(window);
				
				System.out.println(driver.switchTo().window(window).getTitle());
				
				driver.close();
				
				
			}
			
			
		}
			
		driver.switchTo().window(Parent_window);
			
		}
			

	}

