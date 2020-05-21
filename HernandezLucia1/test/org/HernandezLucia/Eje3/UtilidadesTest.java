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
	public void esPrimo1() throws NumeroException {
		assertThrows("-1 Hace saltar exception", NumeroException.class,()-> this.utilidades.esPrimo(-1));
		//-1 Hace saltar exception
		
	}

	@Test
	public void esPrimo2() throws NumeroException {
		assertFalse("0 NO es primo",this.utilidades.esPrimo(0));
		// 
	}

	@Test
	public void esPrimo3() throws NumeroException {
		assertFalse("1 NO es primo",this.utilidades.esPrimo(1));
		// 
		
	}

	@Test
	public void esPrimo4() throws NumeroException {
		assertTrue("999983 es primo",this.utilidades.esPrimo(999983));
	
	// 
	}

	@Test
	public void esPrimo5() throws NumeroException {
		assertFalse("999999 NO es primo",this.utilidades.esPrimo(999999));
	//
	}
	
	@Test
	public void esPrimo06() throws NumeroException {
		assertFalse("1000000 NO es primo",this.utilidades.esPrimo(1000000));
		//
	}
	
	@Test
	public void esPrimo7() throws NumeroException {
		assertThrows("1000001 hace saltar NumeroException",NumeroException.class, ()-> this.utilidades.esPrimo(1000001));
// 
	}
}
