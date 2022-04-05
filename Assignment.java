package org.maven;

import org.openqa.selenium.support.ui.Sleeper;

public class Assignment extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("chrome");
		urlLaunch("https://www.saucedemo.com/");
		implicityWait(10);
		maximize();
		
		Elements e=new Elements();
		sendKeys(e.getTxtUserName(), "standard_user");
		sendKeys(e.getTxtPassword(), "secret_sauce");
		click(e.getBtnLogin());
		
		
		click(e.getAddToCart());
		click(e.getBtnCart());
		click(e.getBtnCheck());
		
		sendKeys(e.getTxtFirstName(), "shimron");
		sendKeys(e.getTxtLastName(), "hetmyer");
		sendKeys(e.getTxtCode(), "18");
		
		click(e.getBtnContinue());
		click(e.getBtnFinish());
		click(e.getBtnHome());
		click(e.getBtnMenu());
		click(e.getBtnLogout());
		
		
		
		
		
		
		
	}
	

}
