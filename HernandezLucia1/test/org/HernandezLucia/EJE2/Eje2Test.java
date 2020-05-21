package org.HernandezLucia.EJE2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Eje2Test {
	
		private Eje2 utils;
		
		@Before
		public void setUp() {
			this.utils = new Eje2();
		}
		
		@Test
		public void esFinDeSemana01() throws FechaException {		
			assertTrue(this.utils.esFinDeSemana(2,11,2019));

		}
		
		@Test
		public void esFinDeSemana02() throws FechaException {		
			assertTrue(this.utils.esFinDeSemana(14,9,2019));

		}
		
		@Test
		public void esFinDeSemana03() throws FechaException {
			assertFalse(this.utils.esFinDeSemana(23,6,2020));

		}
		
		@Test
		public void esFinDeSemana04() throws FechaException {
			assertFalse(this.utils.esFinDeSemana(1,1,1900));

		}
		
		@Test
		public void esFinDeSemana05() throws FechaException {
			assertFalse(this.utils.esFinDeSemana(1,1,3000));

		}
		
		@Test
		public void esFinDeSemana06() throws FechaException {
			assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(25,5,1899));

		}
		
		@Test
		public void esFinDeSemana07() throws FechaException {		
			assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(8,11,3001));
		}

}
