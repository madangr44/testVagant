package com.testVagant.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testVagant.pages.ImdbPage;
import com.testVagant.pages.WikiPage;

public class validation {
	WebDriver driver;
	ImdbPage imdbValidate = new ImdbPage(driver);
	WikiPage wikiValidate = new WikiPage(driver);
	String ImdbCountry = imdbValidate.imdbCountryValue;
	String ImdbRealese = imdbValidate.imdbReleaseDateValue;
	String WikiCountry = wikiValidate.wikiCountryValue;
	String WikiRelease = wikiValidate.wikiReleaseDateValue;

	@Test(priority = 3)
	public void validateValues() {

		Assert.assertEquals(ImdbCountry, WikiCountry);
		Assert.assertEquals(ImdbRealese, WikiRelease);

	}
}
