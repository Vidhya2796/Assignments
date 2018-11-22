package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment1.MissingNumTest;

public class MissingNumTest {

	@Test
	public void test() {
		int[] arr={2,3,4};
		//MissingNum m = new MissingNum();
		assertEquals(1, MissingNumber.MissingNum(arr));
	}

}
