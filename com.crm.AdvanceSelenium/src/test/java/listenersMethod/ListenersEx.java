package listenersMethod;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
@Listeners(com.crm.listeners.TestCaseFailSc.class)
public class ListenersEx extends BaseClass{
	@Test(priority = 0)
	public void display() {
		assertEquals("Java", "Java","It is not same");
		Reporter.log("display It is pass",true);
	}
	
	@Test(priority = 1)
	public void display2() {
		assertEquals("Selenium", "selenium","It is not same");
		Reporter.log("display2 It is pass",true);
	}
	
	@Test(priority = 2, dependsOnMethods = "display2")
	public void display3() {
		assertEquals("poli", "pholi", "It is not same");
		Reporter.log("display3 It is pass",true);
	}
}
