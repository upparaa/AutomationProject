package Automation;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fetchdatafromexcel {

    public static void main(String[] args) throws IOException, InterruptedException {

        // 1. Load Excel File
        String excelPath = "C:\\Users\\usrin\\Downloads\\Book1.xlsx"; 
        FileInputStream fis = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        // 2. Read data from Row 1 (Index 1 - first data row)
        Row row = sheet.getRow(1);
        String username = row.getCell(0).toString();
        String password = row.getCell(1).toString();
        

        System.out.println("Username from Excel: " + username);
        System.out.println("Password from Excel: " + password);

        // 3. Launch Browser and Open Login Page
        WebDriver driver = new ChromeDriver();
        driver.get("https://hr.quality-matrix.us/web/index.php/auth/login");
        Thread.sleep(4000); // Wait for page to load

        // 4. Use Excel Data in Selenium Login Test
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

      
        System.out.println("Status updated in Excel: Passed");

        // 7. Close Browser
        //driver.quit();
    }
}
