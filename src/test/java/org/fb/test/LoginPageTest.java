package org.fb.test;

import org.fb.pages.HomePage;
import org.fb.pages.LoginPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

public class LoginPageTest {
	static WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	Base base = new Base();

	@BeforeClass
	public static void launchBrowser() {
		driver = Base.getDriver();

	}

	@Test
	public void verifyLoginDetails() {

		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		Assert.assertTrue(base.elementFound(driver, 10,
				loginPage.getImgFbLogo()));
		base.getScreenShot("facebookPage");

		base.setText(loginPage.getTxtUserName(), "ramesh@gmail.com");
		base.getScreenShot("username");
		Assert.assertEquals("ramesh@gmail.com",
				base.getText(loginPage.getTxtUserName()));
		base.getScreenShot("password");
		loginPage.setTxtPassword("12345");
		base.setText(loginPage.getTxtPassword(), "12345");
		base.getScreenShot("login");
		Assert.assertEquals("12345", base.getText(loginPage.getTxtPassword()));
		base.clickBtn(loginPage.getBtnLogin());
		base.getScreenShot("after login");

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}
