package com.junitproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Testcalculator {
Calculator c= new Calculator();
@Before
public void display() {
	System.out.println("hello");
}
@Test
public void testadd() {
	System.out.println(c.add(126, 128));
}
@Test
public void testsub() {
	System.out.println(c.sub());
}
@Test
public void testmultiply() {
	c.multiply(5, 4);
}
@Test
public void testdivide() {
	c.divide();
}
@After
public void end() {
	System.out.println("bye");
	System.out.println();
}
}
