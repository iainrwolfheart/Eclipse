package tdd2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2Test {

	@Test
	public void test() {
		int x=4;
		int y=4;
		int z=x+y;
		
		System.out.println(z);
		
		assertEquals(8,z);
		fail("Incorrect sum");
	}

}
