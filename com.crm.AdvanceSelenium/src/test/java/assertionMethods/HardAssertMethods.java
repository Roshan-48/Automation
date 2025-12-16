package assertionMethods;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HardAssertMethods {
	@Test
	public void main() {
		String expected_output = "Rosh";
		String actual_output = "Rosh";
		assertEquals(actual_output, expected_output,"TestCase fail");
		System.out.println("TestCase Pass");
		System.out.println("Next Steps");
		System.out.println("Click");
		System.out.println("Close");		
	}
}
