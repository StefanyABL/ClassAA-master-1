package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.A;
import logic.B;

public class Btest {
	private B b;
	//validar tama�o arreeglo
	//	assertEquals.size
	//	assertEquals.posicionarreglo
	public void setupEscenarie(){
		b = new B(10);
	}
	@Test
	public void testlistPairs() {
		setupEscenarie();
		assertEquals(9,b.tamano);
	
	}
}
