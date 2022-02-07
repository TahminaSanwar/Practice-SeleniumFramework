package mountsinai.qa.appointment;

import org.testng.annotations.Test;

import mountsinai.qa.basic.BasicClass;

public class RequestAnAppointment extends BasicClass {
	@Test
	public void requestAnAppointmentTest() throws InterruptedException {
		productPages.requestAnAppointmentTabMethod(cm);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		productPages.nameTextMethod(cm);
		Thread.sleep(3000);
		
	}

}
