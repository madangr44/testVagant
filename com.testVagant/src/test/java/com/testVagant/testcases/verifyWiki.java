package com.testVagant.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testVagant.pages.WikiPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyWiki {
	@Test(priority = 2)
	public void wikiWebPage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.wikipedia.org");
		WikiPage wiki = new WikiPage(driver);
		wiki.wikisearchEntry();
		wiki.wikisearchBtn();
		wiki.wikisearchByValue();
		wiki.wikiReleaseDate();
		wiki.wikiCountry();
		driver.quit();
	}

}
