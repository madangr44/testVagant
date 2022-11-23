package com.testVagant.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testVagant.pages.ImdbPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyIMDB {
	@Test(priority = 1)
	public void imdbWebPage() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.imdb.com");
		ImdbPage imdb = new ImdbPage(driver);
		imdb.IMDBsearchEntry();
		imdb.IMDBsearchBtn();
		imdb.IMDBsearchByValue();
		imdb.IMDBReleaseDate();
		imdb.IMDBCountry();
		driver.quit();
	}

}
