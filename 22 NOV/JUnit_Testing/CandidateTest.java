package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateTest {

	@Test
	public void test() {

		assertEquals(1,Candidate.check("Yes","BTech",2018,2012));
		assertEquals(0,Candidate.check("Yes","BA",2018,2006));
		assertEquals(0,Candidate.check("No","BA",2018,2006));
	}

}
