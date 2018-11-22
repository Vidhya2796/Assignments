package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment1.SmallestTest;

public class SmallestTest {

	@Test
	public void test() {
		//Smallest sm = new Smallest();
		assertEquals(5, Smallest_3.min(12, 6, 5));
	}

}
