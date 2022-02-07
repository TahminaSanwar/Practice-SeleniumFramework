package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import mountsinai.qa.basic.BasicClass;
import reporting.Java_logger;

public class CommonMethods {
	public void hoverover(WebDriver driver, WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
			Java_logger.getLog(element + ":Doing hover over");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Java_logger.getLog(element + "element Not Found");
			Assert.fail();

		}

	}

	public void clickable(WebElement element) {
		try {
			BasicClass.waits.waitUntilClickable(element);
			Java_logger.getLog(element + "clicked");
			element.click();

		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
			Java_logger.getLog(element + "element Not Found");
			Assert.fail();
		}

	}

	public void sendText(WebElement element, String value) {
		try {
			BasicClass.waits.waitUntilClickable(element);
			element.sendKeys(value);
			Java_logger.getLog(element + ":Selected by visibility" + element);

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			Java_logger.getLog(element + ":Element not found");
			Assert.fail();

		}

	}

	public void dropDown(WebElement element, String text) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(text);
			Java_logger.getLog(text + ":Entered text" + element);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Java_logger.getLog(text + ":Element not found");
			Assert.fail();
		}

	}

	public void sleep(int sec) {
		try {
			Thread.sleep(sec * 3000);
			Java_logger.getLog("Sleepin");
		} catch (InterruptedException e) {
			e.printStackTrace();
			Java_logger.getLog("Sleeping interuppted...");

		}
	}

}


