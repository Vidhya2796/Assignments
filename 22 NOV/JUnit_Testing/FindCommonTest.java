package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindCommonTest {

	@Test
	public void test() {
		int ar1[] = {1, 5, 20, 40, 80};
        int ar2[] = {6, 20, 80, 100};
        int ar3[] = {3, 15, 20, 70, 80, 120};
        int arr[] = {20,80};
        FindCommon fc=new FindCommon();
        assertArrayEquals(arr,FindCommon.findCommon(ar1, ar2, ar3));
	}

}
