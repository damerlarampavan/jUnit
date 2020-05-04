package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addString("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
