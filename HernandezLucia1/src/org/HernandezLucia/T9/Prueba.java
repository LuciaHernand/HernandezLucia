package org.HernandezLucia.T9;
public class Prueba {
    public static void main(String[] args) {
        new Prueba().f();
        
    }

    // Pintar título, cuerpo y final
    private void f() {
        
        tema1();
        espaciado();
        refactorizacion();
      
    }

	private void tema1() {
		// Raya encabezado superior
        encabezado();
        
        titulo("TEMA 1. CONTROL de VERSIONES");
        
        encabezado();

        titulo("1. Conceptos generales");
        
        //Separador
        separador();
        
        //Separador
        titulo("2. Repositorio centralizado. SVN");
        separador();

        //Separador
        titulo("3. Repositorio distribuido. GIT");
        

        encabezado();
	}

	private void titulo(String titulo) {
		System.out.println(titulo);
	}

	private void refactorizacion() {
		encabezadoInferior();
        
		titulo("REFACTORIZACIÓN");
        
        // Raya encabezado inferior
        encabezadoInferior();

        titulo("1. Bad smells");
        
        separador();
        
        //Separador
        titulo("2. Refactorizaciones habituales");
        separador();

        //Separador
        titulo("3. Refactorizando con Eclipse");
        

        encabezadoInferior();
	}

	private void espaciado() {
		System.out.println();
        System.out.println();
	}

	private void encabezadoInferior() {
		for (int i=0;i<2;i++) {
            for (int j=0;j<20;j++) {
                System.out.print("=");
            }
            System.out.println();
        }
	}

	private void separador() {
		for (int i=0;i<1;i++) {
            for (int j=0;j<7;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

	private void encabezado() {
		for (int i=0;i<2;i++) {
            for (int j=0;j<15;j++) {
                System.out.print("=");
            }
            System.out.println();
        }
	}
}
