package org.HernandezLucia.Eje3;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UtilidadesTest {
private Utilidades utilidades;
	
	@Before
	public void setUp() {
		this.utilidades = new Utilidades();
	}

	@Test
	public void esPrimo01() throws NumeroException {
		assertThrows(NumeroException.class, ()-> this.utilidades.esPrimo(-1));
		//-1 Hace saltar exception
	}

	@Test
	public void esPrimo02() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(0));
		// "0 NO es primo"
	}

	@Test
	public void esPrimo03() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(1));
		// "1 NO es primo"
		
	}

	@Test
	public void esPrimo04() throws NumeroException {
		assertTrue(this.utilidades.esPrimo(999983));
	
	// "999983 es primo"
	}

	@Test
	public void esPrimo05() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(999999));
	//"999999 NO es primo"
	}
	
	@Test
	public void esPrimo06() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(1000000));
		//"1000000 NO es primo"
	}
	
	@Test
	public void esPrimo07() throws NumeroException {
		assertThrows(NumeroException.class, ()-> this.utilidades.esPrimo(1000001));
// "1000001 hace saltar NumeroException"
	}
}
