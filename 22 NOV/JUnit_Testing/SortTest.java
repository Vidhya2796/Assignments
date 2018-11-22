package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	@Test
	public void test() 
	{
		int arr[]= {9,5,11};
		int res[]= {5,9,11};
		assertArrayEquals(res, Sort.fnSort(arr));
	}

}
