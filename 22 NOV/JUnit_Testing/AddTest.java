package Assignment1;
import static org.junit.Assert.*;

import org.junit.Test;

import Assignment1.AddTest;
public class AddTest {
	@Test
	public void test() {
		//AddTwoNumbers a1 = new AddTwoNumbers();
		assertEquals(27, AddTwoNumbers.add(12, 15));
	}

}
