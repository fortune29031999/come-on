package com.junitproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AssertProgram {
@Test
public void testEqual() {
	assertEquals(5,5);
}
@Test
public void testnull() {
	assertNull(null,null);
}
@Test
public void testtrue() {
	assertTrue(10>7);
}
@Test
public void testsame() {
	assertSame("nisha", "nisha");
}
@Test
public void testArrayEqual() {
	int[]a= {5,10,20};
	int[]b= {5,10,20};
	assertArrayEquals(a, b);
}
Calculator c= new Calculator();
@Test
public void testCalculator() {
	assertNotSame(2, c.add(0, 1));
}


}
