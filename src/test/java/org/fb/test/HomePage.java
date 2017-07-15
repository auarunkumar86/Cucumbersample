package org.fb.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//*[text()='Home']")
	private WebElement imgHomePageLogo;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImgHomePageLogo() {
		return imgHomePageLogo;
	}

	public void setImgHomePageLogo(WebElement imgHomePageLogo) {
		this.imgHomePageLogo = imgHomePageLogo;
	}
}
