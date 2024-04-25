package StepDefinations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.TestContext.ScenarioContext;
import com.TestContext.WebTestContext;

import genericFunctions.ReusableMethods;
import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.LoginPage;

public class OnboardCustomerSteps {
	
	private WebTestContext webTestContext;
	private ScenarioContext scenarioContext;
	private LoginPage loginPage ;
	

	public OnboardCustomerSteps(WebTestContext webTestContext, ScenarioContext scenarioContext) throws IOException {
		this.webTestContext = webTestContext;
		this.scenarioContext = scenarioContext;
		loginPage = this.webTestContext.getWebPageObject().getLoginPage();
		
	}

}
