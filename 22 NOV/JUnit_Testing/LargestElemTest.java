package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment1.LargestElemTest;

public class LargestElemTest {

	@Test
	public void test() {
		//LargestElem l1 = new LargestElem();
		int arr[] = {1,2,3,4,5};
		int arr1[] = {5,4,3};
		assertArrayEquals(arr1, LargestElem.largest(arr));
	}

}
