package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.A;

public class Atest {
	private A a;

	public void setupEscenarie(){
		a = new A(10);
	}
	@Test
	public void testIsPar() {
		setupEscenarie();
		assertTrue(a.isPar());
		
		a.setNumber(17);
		assertFalse(a.isPar());
		
		a.setNumber(20);
		assertTrue(a.isPar());
	}
	
	public void testIsCousing(){
		setupEscenarie();
		assertFalse(a.isCousing());
		
		a.setNumber(17);
		assertTrue(a.isCousing());
		
		a.setNumber(49);
		assertFalse(a.isCousing());
		
	}
	public void testValueAbsolute(){
		setupEscenarie();
		assertEquals(10, a.valueAbsolute());
		a.setNumber(-5);
		assertEquals(-5,a.valueAbsolute());
	}

	
}
