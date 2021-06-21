package junitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilstest {

	@Test
	void test() {
//		System.out.println("This is test method");
		
		MathUtils mathutil = new MathUtils();
		
		int expected = 2;
		int actual = mathutil.add(1, 1);
		assertEquals(expected , actual, "Can give a string message also here to work as println while displaying output");
		
		
	}

}
