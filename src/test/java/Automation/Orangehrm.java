package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.TestUtility;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class Orangehrm {
    public static void main(String[] args) {

        // Initialize ChromeDriver (Make sure chromedriver is in system path)
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // 1. Launch URL
            driver.get("https://hr.quality-matrix.us/web/index.php/auth/login");
            driver.manage().window().maximize();

            // 2. Login
            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            username.sendKeys("admintwo");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Admintwo@123");

            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            loginButton.click();

            // 3. Navigate to Leave > Apply
            WebElement leaveTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']")));
            leaveTab.click();

            WebElement applyLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(., 'Apply')]")));
            applyLink.click();

            // 4. Select Leave Type
            WebElement leaveTypeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.oxd-select-text-input")));
            leaveTypeDropdown.click();

            // Select Casual Leave (assuming it's the visible one)
            WebElement casualLeaveOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Casual Leave']")));
            casualLeaveOption.click();

            // 5. Pick From Date
            WebElement fromDate = driver.findElements(By.cssSelector("input.oxd-input")).get(1);
            fromDate.click();
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-right']")).click();
            driver.findElement(By.xpath("//div[@class='oxd-calendar-date' and text()='4']")).click();

            // 6. Pick To Date
            WebElement toDate = driver.findElements(By.cssSelector("input.oxd-input")).get(2);
            toDate.click();
          
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-right']"));
            Thread.sleep(4000);

WebElement sele= driver.findElement(By.xpath("//div[@class='oxd-calendar-date']/following::div[text()='7']"));
              sele.click();
            // 7. Add Comment
            WebElement commentBox = driver.findElement(By.cssSelector("textarea.oxd-textarea"));
            commentBox.sendKeys("Applying for casual leave.");

            // 8. Submit the Leave Request
            WebElement applyButton = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
            applyButton.click();

            // Optional: Wait for confirmation message
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Successfully Submitted')]")));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // driver.quit();
        }
    }
}
