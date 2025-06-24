package Automation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import PolicyPremiumpages.Premiumplanwithsecurityyes;

public class TestPremiumplanwithsecurityYes  {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Premiumplanwithsecurityyes obj = new Premiumplanwithsecurityyes();
     
		   obj.launchApp();
	        obj.navigattopolicydetails();
	        obj.fillForm("100000", "500", "500032");
	        // for 0 to 5 years 
	        obj.selectAgeOfTheBuilding("0 to 5 Years");
			// Select dropdowns
			obj.selectDropdownByValue("//*[@name='effected']", "No");
			obj.selectDropdownByValue("//*[@id='security']", "Yes");
			obj.selectDropdownByValue("//*[@id='person']", "Yes");
			obj.clickViewQuotes();
			obj.selectOneYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹60/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 1 year with security Yes");
			obj.selecttwoYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹114/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 2 years with security Yes");
			obj.selectthreeYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹171/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 3 years with security Yes");
			obj.selectfourYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹228/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 4 years with security Yes");
			obj.selectfiveYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹285/-']");
			obj.takeScreenshot("0 to 5 years premium plan amount for 5 years with security Yes");
			obj.goBackFromPremiumPlan();
			// for 5 to 10 years 
			obj.selectAgeOfTheBuilding("5 to 10 Years");
			obj.selectDropdownByValue("//*[@name='effected']", "No");
			obj.selectDropdownByValue("//*[@id='security']", "Yes");
			obj.selectDropdownByValue("//*[@id='person']", "Yes");
			obj.clickViewQuotes();
			obj.selectOneYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹65/-']");
			obj.takeScreenshot("5 to 10 years premium plan amount for 1 year with security Yes");
			obj.selecttwoYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹124/-']");
			obj.takeScreenshot("Premium plan amount for 2 years for 5 to 10 years with security Yes");
			obj.selectthreeYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹185/-']");
			obj.takeScreenshot("Premium plan amount for 3 years for 5 to 10 years with security Yes");
			obj.selectfourYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹247/-']");
			obj.takeScreenshot("Premium plan amount for 4 years for 5 to 10 years with security Yes");
			obj.selectfiveYearPlan();
			obj.hoverOvertopremiumprice("//*[text()=' ₹309/-']");
			obj.takeScreenshot("Premium plan amount for 5 years for 5 to 10 years with security Yes");
			obj.goBackFromPremiumPlan();

			// for 10 to 15 years 
						obj.selectAgeOfTheBuilding("10 to 15 Years");
						obj.selectDropdownByValue("//*[@name='effected']", "No");
						obj.selectDropdownByValue("//*[@id='security']", "Yes");
						obj.selectDropdownByValue("//*[@id='person']", "Yes");
						obj.clickViewQuotes();
						obj.selectOneYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹70/-']");
						obj.takeScreenshot("10 to 15 years premium plan amount with security Yes");
						obj.selecttwoYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹133/-']");
						obj.takeScreenshot("Premium plan amount for 2 years for 10 to 15 years with security Yes");
						obj.selectthreeYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹200/-']");
						obj.takeScreenshot("Premium plan amount for 3 years for 10 to 15 years with security Yes");
						obj.selectfourYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹266/-']");
						obj.takeScreenshot("Premium plan amount for 4 years for 10 to 15 years with security Yes");
						obj.selectfiveYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹333/-']");
						obj.takeScreenshot("Premium plan amount for 5 years for 10 to 15 years with security Yes");
						obj.goBackFromPremiumPlan();
			// for 15 to 20 years 
						obj.selectAgeOfTheBuilding("15 to 20 Years");
						obj.selectDropdownByValue("//*[@name='effected']", "No");
						obj.selectDropdownByValue("//*[@id='security']", "Yes");
						obj.selectDropdownByValue("//*[@id='person']", "Yes");
						obj.clickViewQuotes();
						obj.selectOneYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹75/-']");
						obj.takeScreenshot("15 to 20 years premium plan amount");
						obj.selecttwoYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹143/-']");
						obj.takeScreenshot("Premium plan amount for 2 years for 15 to 20 years with security Yes");
						obj.selectthreeYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹214/-']");
						obj.takeScreenshot("Premium plan amount for 3 years for 15 to 20 years with security Yes");
						obj.selectfourYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹285/-']");
						obj.takeScreenshot("Premium plan amount for 4 years for 15 to 20 years with security Yes");
						obj.selectfiveYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹356/-']");
						obj.takeScreenshot("Premium plan amount for 5 years for 15 to 20 years with security Yes");
						obj.goBackFromPremiumPlan();
		// for 20 to 25 years 
						obj.selectAgeOfTheBuilding("20 to 25 Years");
						obj.selectDropdownByValue("//*[@name='effected']", "No");
						obj.selectDropdownByValue("//*[@id='security']", "Yes");
						obj.selectDropdownByValue("//*[@id='person']", "Yes");
						obj.clickViewQuotes();
						obj.selectOneYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹80/-']");
						obj.takeScreenshot("20 to 25 years premium plan amount");
						obj.selecttwoYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹152/-']");
						obj.takeScreenshot("Premium plan amount for 2 years for 20 to 25 years with security Yes");
						obj.selectthreeYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹228/-']");
						obj.takeScreenshot("Premium plan amount for 3 years for 20 to 25 years with security Yes");
						obj.selectfourYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹304/-']");
						obj.takeScreenshot("Premium plan amount for 4 years for 20 to 25 years with security Yes");
						obj.selectfiveYearPlan();
						obj.hoverOvertopremiumprice("//*[text()=' ₹380/-']");
						obj.takeScreenshot("Premium plan amount for 5 years for 20 to 25 years with security Yes");

	}
}
