package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class QMOrangehrm {
	   static WebDriver driver;
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
    	driver=new ChromeDriver();
    
        Map<String, Object> vars = new HashMap<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

     // Wait for password field to be present
 

     // Wait for username field
    


        try {
            // Set browser window size
            driver.manage().window().setSize(new Dimension(550, 699));

            // Open the login page
            driver.get("https://hr.quality-matrix.us/web/index.php/auth/login");
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            new Actions(driver).doubleClick(usernameField).perform();
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            usernameField.sendKeys("admintwo");
            passwordField.sendKeys("Admintwo@123");

            // Extra click on the login slot
            driver.findElement(By.cssSelector(".orangehrm-login-slot")).click();

        

            // Click login button
            driver.findElement(By.cssSelector(".oxd-button")).click();

            // Navigate to Claim
            driver.findElement(By.linkText("Claim")).click();

            // Hover over "My Claims"
            WebElement myClaims = driver.findElement(By.linkText("My Claims"));
            new Actions(driver).moveToElement(myClaims).perform();

            // Click dropdown
            driver.findElement(By.cssSelector(".bi-chevron-down")).click();

            // Click on "Events"
            driver.findElement(By.linkText("Events")).click();

            // Interact with autocomplete input
            WebElement inputField = driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input"));
            inputField.click();
            inputField.sendKeys("anuialdays");

            // Click buttons
            driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
            driver.findElement(By.cssSelector(".oxd-button--secondary")).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
        }
    }
}
