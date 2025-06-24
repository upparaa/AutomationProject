package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class asfasf {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Start ChromeDriver
            driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Actions actions = new Actions(driver);

            driver.manage().window().setSize(new Dimension(1550, 830));
            driver.get("https://hr.quality-matrix.us/web/index.php/auth/login");
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usernameField.sendKeys("admintwo");
            // Login
            driver.findElement(By.name("password")).sendKeys("Admintwo@123");
            driver.findElement(By.cssSelector(".oxd-button")).click();

            // Navigate to My Info > Contact Details
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(6) .oxd-text"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Details"))).click();

            // Fill in address fields
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-input--focus"))).sendKeys("Nagendra Nagar");
            
            // There might be multiple .oxd-input--focus fields; use proper indexing if needed
            driver.findElements(By.cssSelector(".oxd-input--focus")).get(1).sendKeys("Andhra Pradesh");
            driver.findElements(By.cssSelector(".oxd-input--focus")).get(2).sendKeys("518004");

            // Interact with country dropdown if required
            WebElement countryDropdown = driver.findElement(By.cssSelector(".oxd-select-text-input"));
            countryDropdown.click();

            // Hover (optional)
            WebElement formArea = driver.findElement(By.cssSelector(".oxd-form"));
            actions.moveToElement(formArea).release().perform();

            System.out.println("Form filled successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
               // driver.quit();
            }
        }
    }
}
