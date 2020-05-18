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
	public void ordenar01() throws InputDataException{
		//ACT
		int[] array = {8,5,3};
		int[] esperado = {3,5,8};
		int[] res = this.vector.ordenar(array);
		
		//ARRANGE
		assertArrayEquals(esperado, res);//arrays iguales
	}
	
	@Test
	public void ordenar02() throws InputDataException{
		//ACT
		int[] array = {4,5,9};
		
		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
	}
	
	@Test
	public void ordenar03() throws InputDataException{
		//ACT
		int[] array = {8,6,2};
		
		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
	}
	
	@Test
	public void ordenar04() throws InputDataException{
		//ACT
		int[] array = new int[100];
		for(int i=0; i<100; i++) {
			array[i] = i;
		}

		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
	}

}
