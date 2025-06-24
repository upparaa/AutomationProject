package PolicyPremiumpages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Premiumplanwithsecurityno {
	
	static WebDriver driver;
	    

	public void launchApp() {
        driver = new ChromeDriver();
        driver.get("http://183.82.106.55:9093/");
        driver.manage().window().maximize();
        }
	    public void navigattopolicydetails() {
	        driver.findElement(By.xpath("//a[@class=' text-decoration-none ']")).click();
	    }
	    public void fillForm(String marketvalue, String carpet, String pincode) {
			driver.findElement(By.xpath("//*[@id='outlined-textarea']")).sendKeys(marketvalue);
			driver.findElement(By.xpath("(//*[@id='outlined-textarea'])[2]")).sendKeys(carpet);
			driver.findElement(By.xpath("(//*[@id='outlined-textarea'])[3]")).sendKeys(pincode);
			
		}
	    public void selectAgeOfTheBuilding(String ageText) throws InterruptedException {
			try {
				driver.findElement(By.xpath("//*[text()='" + ageText + "']")).click();
				Thread.sleep(1000); // Optional wait
			} catch (Exception e) {
				System.out.println("Error selecting age: " + ageText);
			}}
	    public static void selectDropdownByValue(String xpath, String value) {
			try {
				WebElement dropdown = driver.findElement(By.xpath(xpath));

				dropdown.click();
				Select select = new Select(dropdown);

				select.selectByVisibleText(value);

			} catch (Exception e) {
				System.out.println("Error selecting dropdown (" + xpath + "): " + e.getMessage());
			}}
	

	    public void clickViewQuotes() {
	        driver.findElement(By.xpath("//*[text()=' View Quotes ']")).click();
	    }
	    public void selectOneYearPlan() {
	        // Click the dropdown
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']")).click();

	        // Click the first option (assumed to be "1 Year")
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']//following::ul/li[1]")).click();
	    }
	    public void selecttwoYearPlan() {
	        // Click the dropdown
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']")).click();

	        // Click the second option (assumed to be "2 Year")
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']//following::ul/li[2]")).click();
	    }

	    public void selectthreeYearPlan() {
	        // Click the dropdown
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']")).click();

	        // Click the third option (assumed to be "3 Year")
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']//following::ul/li[3]")).click();
	    }
	    public void selectfourYearPlan() {
	        // Click the dropdown
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']")).click();

	        // Click the fourth option (assumed to be "4 Year")
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']//following::ul/li[4]")).click();
	    }
	    
	    public void selectfiveYearPlan() {
	        // Click the dropdown
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']")).click();

	        // Click the last option (assumed to be "5 Year")
	        driver.findElement(By.xpath("//*[@id='demo-simple-select']//following::ul/li[5]")).click();
	    }


	
	    public void hoverOvertopremiumprice(String xpath) {
	        try {
	            WebElement element = driver.findElement(By.xpath(xpath));
	            Actions actions = new Actions(driver);
	            actions.moveToElement(element).perform();
	            System.out.println("Hovered over element: " + xpath);
	        } catch (Exception e) {
	            System.out.println("Failed to hover over element: " + xpath + " - " + e.getMessage());
	        }
	    }
	    public static void takeScreenshot(String fileName) {
	    	
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String destPath = System.getProperty("user.dir") + "/src/test/resources/validation/" + fileName + ".png";
			try {
				Files.copy(screenshot.toPath(), Paths.get(destPath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Screenshot saved at: " + destPath);
		
		}
	    
	    
	    public void goBackFromPremiumPlan() {
	        driver.findElement(By.xpath("//*[@title='Back']")).click();
	    }  
}

	

