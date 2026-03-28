package javaa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClass {

	@Test
	public void testFindMax() {
		
		assertEquals(4, Arithmatic.findMax(new int [] {1,2,3,4}));
	}

}
