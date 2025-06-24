package Automation;

import PolicyPremiumpages.Premiumplanwithsecurityno;
import PolicyPremiumpages.Premiumplanwithsecurityyes;

public class Premiumplanpricewithsecurityyesandno{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
			
	     
	        Premiumplanwithsecurityyes obj2 = new Premiumplanwithsecurityyes();
	        obj2.launchApp();
	        obj2.navigattopolicydetails();
	        obj2.fillForm("100000", "500", "500032");
	        // for 0 to 5 years 
	        obj2.selectAgeOfTheBuilding("0 to 5 Years");
			// Select dropdowns
			obj2.selectDropdownByValue("//*[@name='effected']", "No");
			obj2.selectDropdownByValue("//*[@id='security']", "Yes");
			obj2.selectDropdownByValue("//*[@id='person']", "Yes");
			obj2.clickViewQuotes();
			obj2.selectOneYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹60/-']");
			obj2.takeScreenshot("0 to 5 years premium plan amount for 1 year with security Yes");
			obj2.selecttwoYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹114/-']");
			obj2.takeScreenshot("0 to 5 years premium plan amount for 2 years with security Yes");
			obj2.selectthreeYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹171/-']");
			obj2.takeScreenshot("0 to 5 years premium plan amount for 3 years with security Yes");
			obj2.selectfourYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹228/-']");
			obj2.takeScreenshot("0 to 5 years premium plan amount for 4 years with security Yes");
			obj2.selectfiveYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹285/-']");
			obj2.takeScreenshot("0 to 5 years premium plan amount for 5 years with security Yes");
			obj2.goBackFromPremiumPlan();
			// for 5 to 10 years 
			obj2.selectAgeOfTheBuilding("5 to 10 Years");
			obj2.selectDropdownByValue("//*[@name='effected']", "No");
			obj2.selectDropdownByValue("//*[@id='security']", "Yes");
			obj2.selectDropdownByValue("//*[@id='person']", "Yes");
			obj2.clickViewQuotes();
			obj2.selectOneYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹65/-']");
			obj2.takeScreenshot("5 to 10 years premium plan amount for 1 year with security Yes");
			obj2.selecttwoYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹124/-']");
			obj2.takeScreenshot("Premium plan amount for 2 years for 5 to 10 years with security Yes");
			obj2.selectthreeYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹185/-']");
			obj2.takeScreenshot("Premium plan amount for 3 years for 5 to 10 years with security Yes");
			obj2.selectfourYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹247/-']");
			obj2.takeScreenshot("Premium plan amount for 4 years for 5 to 10 years with security Yes");
			obj2.selectfiveYearPlan();
			obj2.hoverOvertopremiumprice("//*[text()=' ₹309/-']");
			obj2.takeScreenshot("Premium plan amount for 5 years for 5 to 10 years with security Yes");
			obj2.goBackFromPremiumPlan();

			// for 10 to 15 years 
						obj2.selectAgeOfTheBuilding("10 to 15 Years");
						obj2.selectDropdownByValue("//*[@name='effected']", "No");
						obj2.selectDropdownByValue("//*[@id='security']", "Yes");
						obj2.selectDropdownByValue("//*[@id='person']", "Yes");
						obj2.clickViewQuotes();
						obj2.selectOneYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹70/-']");
						obj2.takeScreenshot("10 to 15 years premium plan amount with security Yes");
						obj2.selecttwoYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹133/-']");
						obj2.takeScreenshot("Premium plan amount for 2 years for 10 to 15 years with security Yes");
						obj2.selectthreeYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹200/-']");
						obj2.takeScreenshot("Premium plan amount for 3 years for 10 to 15 years with security Yes");
						obj2.selectfourYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹266/-']");
						obj2.takeScreenshot("Premium plan amount for 4 years for 10 to 15 years with security Yes");
						obj2.selectfiveYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹333/-']");
						obj2.takeScreenshot("Premium plan amount for 5 years for 10 to 15 years with security Yes");
						obj2.goBackFromPremiumPlan();
			// for 15 to 20 years 
						obj2.selectAgeOfTheBuilding("15 to 20 Years");
						obj2.selectDropdownByValue("//*[@name='effected']", "No");
						obj2.selectDropdownByValue("//*[@id='security']", "Yes");
						obj2.selectDropdownByValue("//*[@id='person']", "Yes");
						obj2.clickViewQuotes();
						obj2.selectOneYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹75/-']");
						obj2.takeScreenshot("15 to 20 years premium plan amount");
						obj2.selecttwoYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹143/-']");
						obj2.takeScreenshot("Premium plan amount for 2 years for 15 to 20 years with security Yes");
						obj2.selectthreeYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹214/-']");
						obj2.takeScreenshot("Premium plan amount for 3 years for 15 to 20 years with security Yes");
						obj2.selectfourYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹285/-']");
						obj2.takeScreenshot("Premium plan amount for 4 years for 15 to 20 years with security Yes");
						obj2.selectfiveYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹356/-']");
						obj2.takeScreenshot("Premium plan amount for 5 years for 15 to 20 years with security Yes");
						obj2.goBackFromPremiumPlan();
		// for 20 to 25 years 
						obj2.selectAgeOfTheBuilding("20 to 25 Years");
						obj2.selectDropdownByValue("//*[@name='effected']", "No");
						obj2.selectDropdownByValue("//*[@id='security']", "Yes");
						obj2.selectDropdownByValue("//*[@id='person']", "Yes");
						obj2.clickViewQuotes();
						obj2.selectOneYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹80/-']");
						obj2.takeScreenshot("20 to 25 years premium plan amount");
						obj2.selecttwoYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹152/-']");
						obj2.takeScreenshot("Premium plan amount for 2 years for 20 to 25 years with security Yes");
						obj2.selectthreeYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹228/-']");
						obj2.takeScreenshot("Premium plan amount for 3 years for 20 to 25 years with security Yes");
						obj2.selectfourYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹304/-']");
						obj2.takeScreenshot("Premium plan amount for 4 years for 20 to 25 years with security Yes");
						obj2.selectfiveYearPlan();
						obj2.hoverOvertopremiumprice("//*[text()=' ₹380/-']");
						obj2.takeScreenshot("Premium plan amount for 5 years for 20 to 25 years with security Yes");
              
	}
 
}
