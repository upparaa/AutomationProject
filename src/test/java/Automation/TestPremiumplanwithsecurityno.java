package Automation;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PolicyPremiumpages.Premiumplanwithsecurityno;

public class TestPremiumplanwithsecurityno {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 Premiumplanwithsecurityno obj = new Premiumplanwithsecurityno();
	        obj.launchApp();
	        obj.navigattopolicydetails();
	        obj.fillForm("100000", "500", "500032");
	        // for 0 to 5 years 
	        obj.selectAgeOfTheBuilding("0 to 5 Years");
			// Select dropdowns
			obj.selectDropdownByValue("//*[@name='effected']", "No");
			obj.selectDropdownByValue("//*[@id='security']", "No");
			obj.selectDropdownByValue("//*[@id='person']", "Yes");
			obj.clickViewQuotes();
			obj.selectOneYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹80/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 1 year with security no");
			obj.selecttwoYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹152/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 2 years with security no");
			obj.selectthreeYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹228/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 3 years with security no");
			obj.selectfourYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹304/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 4 years with security no");
			obj.selectfiveYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹380/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 5 years with security no");
			obj.goBackFromPremiumPlan();
			// for 5 to 10 years 
			obj.selectAgeOfTheBuilding("5 to 10 Years");
			obj.selectDropdownByValue("//*[@name='effected']", "No");
			obj.selectDropdownByValue("//*[@id='security']", "No");
			obj.selectDropdownByValue("//*[@id='person']", "Yes");
			obj.clickViewQuotes();
			obj.selectOneYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹85/-']");
			obj.takeScreenshot("5 to 10 years premium plan amount for 1 year with security no");
			obj.selecttwoYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹162/-']");
			obj.takeScreenshot("Premium plan amount for 2 years for 5 to 10 years with security no");
			obj.selectthreeYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹242/-']");
			obj.takeScreenshot("Premium plan amount for 3 years for 5 to 10 years with security no");
			obj.selectfourYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹323/-']");
			obj.takeScreenshot("Premium plan amount for 4 years for 5 to 10 years with security no");
			obj.selectfiveYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹404/-']");
			obj.takeScreenshot("Premium plan amount for 5 years for 5 to 10 years with security no");
			obj.goBackFromPremiumPlan();

			// for 10 to 15 years 
						obj.selectAgeOfTheBuilding("10 to 15 Years");
						obj.selectDropdownByValue("//*[@name='effected']", "No");
						obj.selectDropdownByValue("//*[@id='security']", "No");
						obj.selectDropdownByValue("//*[@id='person']", "Yes");
						obj.clickViewQuotes();
						obj.selectOneYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹90/-']");
						obj.takeScreenshot("10 to 15 years premium plan amount with security no");
						obj.selecttwoYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹171/-']");
						obj.takeScreenshot("Premium plan amount for 2 years for 10 to 15 years with security no");
						obj.selectthreeYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹257/-']");
						obj.takeScreenshot("Premium plan amount for 3 years for 10 to 15 years with security no");
						obj.selectfourYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹342/-']");
						obj.takeScreenshot("Premium plan amount for 4 years for 10 to 15 years with security no");
						obj.selectfiveYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹428/-']");
						obj.takeScreenshot("Premium plan amount for 5 years for 10 to 15 years with security no");
						obj.goBackFromPremiumPlan();
			// for 15 to 20 years 
						obj.selectAgeOfTheBuilding("15 to 20 Years");
						obj.selectDropdownByValue("//*[@name='effected']", "No");
						obj.selectDropdownByValue("//*[@id='security']", "No");
						obj.selectDropdownByValue("//*[@id='person']", "Yes");
						obj.clickViewQuotes();
						obj.selectOneYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹95/-']");
						obj.takeScreenshot("15 to 20 years premium plan amount");
						obj.selecttwoYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹181/-']");
						obj.takeScreenshot("Premium plan amount for 2 years for 15 to 20 years with security no");
						obj.selectthreeYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹271/-']");
						obj.takeScreenshot("Premium plan amount for 3 years for 15 to 20 years with security no");
						obj.selectfourYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹361/-']");
						obj.takeScreenshot("Premium plan amount for 4 years for 15 to 20 years with security no");
						obj.selectfiveYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹451/-']");
						obj.takeScreenshot("Premium plan amount for 5 years for 15 to 20 years with security no");
						obj.goBackFromPremiumPlan();
		// for 20 to 25 years 
						obj.selectAgeOfTheBuilding("20 to 25 Years");
						obj.selectDropdownByValue("//*[@name='effected']", "No");
						obj.selectDropdownByValue("//*[@id='security']", "No");
						obj.selectDropdownByValue("//*[@id='person']", "Yes");
						obj.clickViewQuotes();
						obj.selectOneYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹100/-']");
						obj.takeScreenshot("20 to 25 years premium plan amount");
						obj.selecttwoYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹190/-']");
						obj.takeScreenshot("Premium plan amount for 2 years for 20 to 25 years with security no");
						obj.selectthreeYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹285/-']");
						obj.takeScreenshot("Premium plan amount for 3 years for 20 to 25 years with security no");
						obj.selectfourYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹380/-']");
						obj.takeScreenshot("Premium plan amount for 4 years for 20 to 25 years with security no");
						obj.selectfiveYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹475/-']");
						obj.takeScreenshot("Premium plan amount for 5 years for 20 to 25 years with security no");
						obj.goBackFromPremiumPlan();
			
			

			
	}
	}
