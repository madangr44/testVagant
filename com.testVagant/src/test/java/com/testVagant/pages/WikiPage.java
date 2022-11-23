package com.testVagant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiPage {
	WebDriver driver;
	public static String wikiReleaseDateValue;
	public String wikiCountryValue;
	String MovieName = "Pushpa:The Rise";
	By wikiSearchEntry = By.id("searchInput");
	By wikiSearchButton = By.xpath("//button[@type='submit']");
	By wikiValue = By.xpath("//a[@title='Pushpa: The Rise']");
	By wikiReleaseDate = By.xpath("//div[text()='Release date']/parent::th/following-sibling::td/descendant::li");
	By wikiCountry = By.xpath("//th[text()='Country']/following-sibling::td");

	public WikiPage(WebDriver driver) {
		this.driver = driver;
	}

	public void wikisearchEntry() {
		driver.findElement(wikiSearchEntry).sendKeys(MovieName);
	}

	public void wikisearchBtn() {
		driver.findElement(wikiSearchButton).click();
	}

	public void wikisearchByValue() {
		driver.findElement(wikiValue).click();
	}

	public String wikiReleaseDate() {
		WebElement wikiReleaseDateElement = driver.findElement(wikiReleaseDate);
		wikiReleaseDateValue = wikiReleaseDateElement.getText();
		System.out.println("wikiReleaseDate :" + wikiReleaseDateValue);
		return wikiReleaseDateValue;

	}

	public String wikiCountry() {
		WebElement wikiCountryElement = driver.findElement(wikiCountry);
		wikiCountryValue = wikiCountryElement.getText();
		System.out.println("wikiCountry :" + wikiCountryValue);
		return wikiCountryValue;

	}

}
