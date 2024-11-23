package SeleniumProgramPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinksProgram {

		@Test
		    public void AllLinks() {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(options);
			//WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			
			driver.get("https://www.amazon.in/");
			List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
			int count=allLinks.size();
			System.out.println(count);
			for(int i=0;i<count;i++) 
			{
				String text = allLinks.get(i).getText();
				System.out.println(text);
			}
			driver.close();
				
		}

	}



