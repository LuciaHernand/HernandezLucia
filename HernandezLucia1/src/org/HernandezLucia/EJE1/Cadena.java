package org.HernandezLucia.EJE1;

import java.util.Scanner;

public class Cadena {
	static String cadena="Hola amigos vamos a quitar una letra"; 
	static Scanner scan=new Scanner(System.in);
	 char c='o';
	public Cadena() {
		super();
		// TODO Auto-generated constructor stub
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

	public static void quitar1(String d) {
		
	
	
			cadena=cadena.replace(d, "");
			System.out.println(cadena);
		
		
	}
	
	public static void quitar2(String c,int i) {
	
		for(int x=0;x<i;x++) {
		
			cadena=cadena.replaceFirst(c, "");
			
		}System.out.println(cadena);
		
	}
	public static void main(String[] args) {
		
	}
}
