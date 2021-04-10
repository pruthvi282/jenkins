package day.challegesTest;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/***
 * 
 * @author Pruthvi
 *
 */
public class Day1Test {
	
	@Test
	public void day1Test() throws Throwable{
		WebDriver driver=new FirefoxDriver();
		String browser = System.getProperty("browser");
		if(browser.equals("firefox")){
		

	driver.get("https://www.worldometers.info/world-population/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	int count=1;
	
	System.out.println(driver.findElement(By.xpath("//span[@class='rts-counter' and @rel='current_population']")).getText());
	
	while(count<5){
	System.out.println(driver.findElement(By.xpath("//span[@class='rts-counter' and @rel='current_population']")).getText());
	System.out.println(driver.findElement(By.xpath("//span[@class='rts-counter' and @rel='births_today']")).getText());
	System.out.println(driver.findElement(By.xpath("//span[@class='rts-counter' and @rel='absolute_growth']")).getText());
	System.out.println("*****************************************************************");
	Thread.sleep(1000);
	count++;
				}
			}
		else{
			System.out.println("No browser is selected");
		}	
	driver.close();
	}
	}
