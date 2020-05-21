package org.HernandezLucia.EJE4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;



import org.junit.Before;
import org.junit.Test;

public class VectorTest {
private Vector vector;
	
	@Before
	public void setUp() {
		this.vector = new Vector();
	}
	
	@Test
	public void ordenar1() throws InputDataException{
		//ACT
		int[] array = {8,5,3};
		int[] esperado = {3,5,8};
		int[] resultado = this.vector.ordenar(array);
		
		//ARRANGE
		assertArrayEquals(esperado, resultado);
		//Con esto lo que hacemos es revisar que la ordenacion sea correcta
	}
	
	@Test
	public void ordenar2() throws InputDataException{
		//ACT
		int[] array = {9,5,4};
		int[] esperado = {4,5,9};
		//ARRANGE
		assertArrayEquals(esperado,this.vector.ordenar(array));
	}
	
	@Test
	public void ordenar3() throws InputDataException{
		//Vector vacio, devuelve exception
		//ACT
		int[] array = {};
		
		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
	}
	
	@Test
	public void ordenar4() throws InputDataException{
		
		//Vector con mas de 5000 elementos, devuelve exception
		//ACT
		int[] array = new int[5001];
		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}

		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
	}

}
