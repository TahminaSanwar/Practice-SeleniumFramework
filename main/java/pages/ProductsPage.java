package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[contains(.,'Request an Appointment')])[1]")
	public WebElement requestAnAppointmentTab;
	@FindBy(xpath = "(//input[@name='name'])[2]")
	public WebElement nameText;

}
