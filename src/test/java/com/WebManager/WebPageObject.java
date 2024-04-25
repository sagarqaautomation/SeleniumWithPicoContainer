package com.WebManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import web.pages.LoginPage;

public class WebPageObject {

	public WebDriver driver;
	private LoginPage getLoginPage;

	public WebPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (getLoginPage == null) ? getLoginPage = new LoginPage(driver) : getLoginPage;
	}
	
}
