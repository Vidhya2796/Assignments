package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarksTest {

	@Test
	public void test() {
		int arr1[]= {99,100,45,9,26,51,66,36,84,82,76,74,65,62,96,56,84,83,85,81};
		int arr2[]= {99,100,96};
		assertArrayEquals(arr2, Marks.fnMarks(arr1));
	}

}
