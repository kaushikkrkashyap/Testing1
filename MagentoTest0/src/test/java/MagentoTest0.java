package com.abc.MagentoMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.abc.MagentoObjects.Home;
import com.abc.MagentoObjects.Login;
import com.abc.MagentoObjects.Welcome;
@Test
public class MagentoTest0 {

	public void positiveCr() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l=new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePwd("Welcome@123");
		l.clickLogin();
		Home h=new Home(driver);
		h.clickOnLogout();

	}
}
