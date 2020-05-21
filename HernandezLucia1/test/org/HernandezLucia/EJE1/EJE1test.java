package org.HernandezLucia.EJE1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EJE1test {

	@Test
	public void cDelante01() {
		// ARRANGE
		Cadena actual = new Cadena("lapices");

		// ACT
		actual.cDelante("porta");

		// ASSERT
		assertEquals("portalapices", actual.getCadena(), "porta+lapices=portalapices");
	}

	@Test
	public void cDelante02() {
		// ARRANGE
		Cadena actual = new Cadena("aguas");

		// ACT
		actual.cDelante("par");

		// ASSERT
		assertEquals("paraguas", actual.getCadena(), "para + aguas = paraguas");
	}

	@Test
	public void cDelante03() {
		// ARRANGE
		Cadena actual = new Cadena("baja");

		// ACT
		actual.cDelante("mar");

		// ASSERT
		assertEquals("bajamar", actual.getCadena(), "baja + mar = bajamar");
	}

	@Test
	public void cDelante04() {
		// ARRANGE
		Cadena actual = new Cadena("porta");

		// ACT
		actual.cDelante("monedas");

		// ASSERT
		assertEquals("monedasporta", actual.getCadena(), "monedas + porta = monedasporta");
	}

	// ==========================================================================

	@Test
	public void cDetras01() {
		// ARRANGE
		Cadena actual = new Cadena("caminos");

		// ACT
		actual.cDetras("corre");

		// ASSERT
		assertEquals("caminoscorre", actual.getCadena(), "caminos+corre=caminoscorre");
	}

	@Test
	public void cDetras02() {
		// ARRANGE
		Cadena actual = new Cadena("porta");

		// ACT
		actual.cDetras("monedas");

		// ASSERT
		assertEquals("portamonedas", actual.getCadena(), "porta + monedas = portamonedas");
	}

	@Test
	public void cDetras03() {
		// ARRANGE
		Cadena actual = new Cadena("para");

		// ACT
		actual.cDetras("brisas");

		// ASSERT
		assertEquals("parabrisas", actual.getCadena(), "para + brisas = parabrisas");
	}



	// ==========================================================================

	@Test
	public void quitarChar01() {
		// ARRANGE
		Cadena actual = new Cadena("-x-");

		// ACT
		actual.quitar1('x');

		// ASSERT
		assertEquals("--", actual.getCadena());
	}

	@Test
	public void quitarChar02() {
		// ARRANGE
		Cadena actual = new Cadena("-x-x-y-xxx-");

		// ACT
		actual.quitar1('y');

		// ASSERT
		assertEquals("-x-x--xxx-", actual.getCadena());
	}

	@Test
	public void quitarChar03() {
		//No quita nada porque el valor no existe en la cadena
		// ARRANGE
		Cadena actual = new Cadena("abecedario");

		// ACT
		actual.quitar1('x');

		// ASSERT
		assertEquals("abecedario", actual.getCadena());
	}

	// ==========================================================================

	@Test
	public void quitarCharInt01() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar2('x',2);

		// ASSERT
		assertEquals("-1-2x-3x-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt02() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar2('x',1);

		// ASSERT
		assertEquals("-1-2-3x-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt03() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar2('x',7);

		// ASSERT
		assertEquals("-1-2-3-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt04() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar2('x',0);

		// ASSERT
		assertEquals("-1x-2x-3x-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt05() {
		//deberia saltar error
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar2('x',-1);

		// ASSERT
		assertEquals("-1x-2x-3x-", actual.getCadena());
	}
}
