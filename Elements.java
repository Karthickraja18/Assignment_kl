package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends BaseClass {
	public Elements() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@id='user-name']")
private WebElement txtUserName;

@FindBy(xpath="//input[@type='password']")
private WebElement txtPassword;

@FindBy(xpath="//input[@id='login-button']")
private WebElement btnLogin;

@FindBy(xpath="//button[text()='Add to cart']//ancestor::div[@class='pricebar']//child::div[text()='29.99']")
private WebElement addToCart;

@FindBy(xpath="//div[@id='shopping_cart_container']")
private WebElement btnCart;

@FindBy(xpath="//button[text()='Checkout']")
private WebElement btnCheck;

@FindBy(xpath="//input[@id='first-name']")
private WebElement txtFirstName;


@FindBy(xpath="//input[@id='last-name']")
private WebElement txtLastName;

@FindBy(xpath="//input[@name='postalCode']")
private WebElement txtCode;

@FindBy(xpath="//input[@id='continue']")
private WebElement btnContinue;

@FindBy(xpath="//button[@id='finish']")
private WebElement btnFinish;

@FindBy(xpath="//button[text()='Back Home']")
private WebElement btnHome;

@FindBy(xpath="//button[@id='react-burger-menu-btn']")
private WebElement btnMenu;

@FindBy(xpath="//a[text()='Logout']")
private WebElement btnLogout;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

public WebElement getAddToCart() {
	return addToCart;
}

public WebElement getBtnCart() {
	return btnCart;
}

public WebElement getBtnCheck() {
	return btnCheck;
}

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getTxtCode() {
	return txtCode;
}

public WebElement getBtnContinue() {
	return btnContinue;
}

public WebElement getBtnFinish() {
	return btnFinish;
}

public WebElement getBtnHome() {
	return btnHome;
}

public WebElement getBtnMenu() {
	return btnMenu;
}

public WebElement getBtnLogout() {
	return btnLogout;
}



}





