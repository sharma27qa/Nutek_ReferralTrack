package com.reftrack.pages;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.reftrack.base.Testbase;

	public class LandingPage extends Testbase{
		
		//Page Factory - OR(object Repository):
		@FindBy(name="email")
		WebElement email;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(className="dx-button-content")
		WebElement loginBtn;
		
		@FindBy(linkText="Forgot password?")
		WebElement forgot_password;
		
		@FindBy(xpath="//span[@class='dx-button-text dx-template-wrapper dx-button-content']")
		WebElement reset_password;

		@FindBy(linkText="Sign In")
		WebElement signin_link;
		
		@FindBy(xpath="//dx-button[@text=\"Create account\"]")
		WebElement CreateAccount_btn;
		
		@FindBy(name="firstname")
		WebElement firstname_fld;
		
		@FindBy(name="middlename")
		WebElement middlename_fld;
		
		@FindBy(name="lastname")
		WebElement lastname_fld;
		
		@FindBy(xpath="//form//div[@aria-label=\"Select\"]")
		WebElement organization_dropdown;
		
		@FindBy(xpath="//div[@class='dx-item-content dx-list-item-content']")
		WebElement JPHealth_dpdn;
		
		@FindBy(name="confirmedPassword")
		WebElement confirmedPassword_fld;
		
		@FindBy(className="dx-widget dx-button dx-button-mode-contained dx-button-default")
		WebElement createNew_btn;
		
		//Initializing the Page Objects:
		public LandingPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		/*public boolean validateCRMImage(){
			return crmLogo.isDisplayed();
		}*/
		
		public HomePage login(String un, String pwd){
			email.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}
		
	}

