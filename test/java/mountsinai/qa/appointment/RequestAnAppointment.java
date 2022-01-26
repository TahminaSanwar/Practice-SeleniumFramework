package mountsinai.qa.appointment;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import mountsinai.qa.basic.BasicClass;

public class RequestAnAppointment extends BasicClass {
	@Test
	public void requestAnAppointmentTest() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(productsPage.requestAnAppointmentTab));
		productsPage.requestAnAppointmentTab.click();
		wait.until(ExpectedConditions.visibilityOf(productsPage.nameText));
		String nameText = productsPage.nameText.getText();
		System.out.println(nameText);
		productsPage.nameText.sendKeys("Something");
	}

}
