package com.reftrack.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.reftrack.base.Testbase;
//home page refers to the page after teh login page i.e., the dashboard page 
	public class HomePage extends Testbase {

		@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
		@CacheLookup
		WebElement userNameLabel;

		@FindBy(xpath = "//a[contains(text(),'Contacts')]")
		WebElement contactsLink;
		
		@FindBy(xpath = "//a[contains(text(),'New Contact')]")
		WebElement newContactLink;
		

		@FindBy(xpath = "//a[contains(text(),'Deals')]")
		WebElement dealsLink;

		@FindBy(xpath = "//a[contains(text(),'Tasks')]")
		WebElement tasksLink;

		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		
		public boolean verifyCorrectUserName(){
			return userNameLabel.isDisplayed();
		}
		
		public ContactsPage clickOnContactsLink(){
			contactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickOnDealsLink(){
			dealsLink.click();
			return new DealsPage();
		}
		
		public TasksPage clickOnTasksLink(){
			tasksLink.click();
			return new TasksPage();
		}
		
		public void clickOnNewContactLink(){
			Actions action = new Actions(driver);
			action.moveToElement(contactsLink).build().perform();
			newContactLink.click();
			
		}
		
		
		
		
		
		
		

	}
}
