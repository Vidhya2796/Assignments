package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment1.Swap2;

public class Swap2Test {

	@Test
	public void test() {
		//Swap2 s = new Swap2();
		int arr[] = {12,18};
		assertArrayEquals(arr, Swap2.swap(18, 12));
	}

}
