package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment1.Swap1;

public class Swap1Test {

	@Test
	public void test() {
		//Swap1 s = new Swap1();
		int arr[] = {12,18};
		assertArrayEquals(arr, Swap1.swap(18, 12));
	}

}
