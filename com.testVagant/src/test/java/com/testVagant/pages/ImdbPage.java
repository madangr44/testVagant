package com.testVagant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbPage {
	WebDriver driver;
	public  String imdbReleaseDateValue;
	public  String imdbCountryValue;
	String MovieName = "Pushpa:The Rise";
	By imbdbSearchEntry = By.xpath("//input[@name='q']");
	By imdbSearchButton = By.id("iconContext-magnify");
	By imdbValue = By.xpath("//*[contains(text(),'Pushpa: The Rise')]");
	By imdbReleaseDate = By.xpath("//a[contains(text(),'Release date')]/parent::li/descendant::a[2]");
	By imdbCountry = By.xpath("//button[text()='Country of origin']/parent::li/descendant::a");

	public ImdbPage(WebDriver driver) {
		this.driver = driver;
	}

	public void IMDBsearchEntry() {
		driver.findElement(imbdbSearchEntry).sendKeys(MovieName);
	}

	public void IMDBsearchBtn() {
		driver.findElement(imdbSearchButton).click();
	}

	public void IMDBsearchByValue() {
		driver.findElement(imdbValue).click();
	}

	public String IMDBReleaseDate() {
		WebElement imdbReleaseDateElement = driver.findElement(imdbReleaseDate);
		imdbReleaseDateValue = imdbReleaseDateElement.getText();
		System.out.println("IMDBReleaseDate :" + imdbReleaseDateValue);
		return imdbReleaseDateValue;

	}

	public String IMDBCountry() {
		WebElement imdbCountryElement = driver.findElement(imdbCountry);
		imdbCountryValue = imdbCountryElement.getText();
		System.out.println("IMDBCountry :" + imdbCountryValue);
		return imdbCountryValue;

	}

}
