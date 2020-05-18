package org.HernandezLucia.EJE1;


public class Cadena {
	private   String cadena;
	
	public Cadena() {
		super();
		
	}
	
	public Cadena(String cadena) {
		super();
		this.cadena = cadena;
	}

	

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public void cDelante(String cadena) {
		this.cadena = cadena + this.cadena;
	}
	
	public void cDetras(String cadena) {
		this.cadena = this.cadena + cadena;
	}

	public static void quitar1(	char d) {
		
	
	
		/*
		 * cadena=cadena.replace(d,""); System.out.println(cadena);
		 */
		
	}
	
	public static void quitar2(char c,int i) {
	
		/*
		 * for(int x=0;x<i;x++) {
		 * 
		 * cadena=cadena.replaceFirst(c, "");
		 * 
		 * }System.out.println(cadena);
		 */
		
	}
	public static void main(String[] args) {
		
	}
}
