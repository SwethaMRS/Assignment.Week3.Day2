package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.ajio.com/");
			//In the search box, type as "bags" and press enter
			
			driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
			Thread.sleep(2000);
			// To the left  of the screen under " Gender" click the "Men"
			driver.findElement(By.xpath("//label[@for='Men']")).click();
			
			//Under "Category" click "Fashion Bags"
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			
			// Print the count of the items Found.
			String totalItems = driver.findElement(By.className("length")).getText();
			System.out.println("Total number of items : " + totalItems);
	        //Get the list of brand of the products displayed in the page and print the list.
			System.out.println(" List of Brands");
			List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			System.out.println(" Size :" + bagBrandList.size());

			for (WebElement webElement : bagBrandList) {
				String text = webElement.getText();
				System.out.println(text);
			}
			// Get the list of names of the bags and print it
			List<WebElement> bagNameList = driver.findElements(By.className("name"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement webElement : bagNameList) {
				String text = webElement.getText();
				System.out.println(text);
			}
			
		
	}

}
