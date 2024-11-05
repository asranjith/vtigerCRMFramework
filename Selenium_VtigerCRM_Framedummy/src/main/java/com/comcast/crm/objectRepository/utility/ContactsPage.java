package com.comcast.crm.objectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    public ContactsPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(name = "search_text")
    private WebElement searchForTextField;
    
    @FindBy(xpath = "//div[@id='basicsearchcolumns_real']/select")
    private WebElement inDropDown;
    
    @FindBy(name = "submit")
    private WebElement searchNowButton;
    
    @FindBy(xpath = "//img[@alt='Create Contact...']")
    private WebElement createContact;

	public WebElement getSearchForTextField() {
		return searchForTextField;
	}

	public WebElement getInDropDown() {
		return inDropDown;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getCreateContact() {
		return createContact;
	}
    
}
