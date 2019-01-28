package org.mod1.ejercicio02.metodos;

public class EjemploMetodoParametros {

	public static void main(String... args) {

		EjemploMetodoParametros em = new EjemploMetodoParametros();
		em.metodoParametroInt(3, 5);
		em.metodoParametrosArrayInt(1, 2, 3, 4, 5, 6);
		em.metodoParametrosArrayInt2(1, 2, 4);

	}

	public void metodoParametroInt(int primerNumero, int segundoNumero) {
		System.out.println("=========================================================================");
		System.out.println("primerNumero: " + primerNumero + ", segundoNumero: " + segundoNumero);
		System.out.println("suma: " + (primerNumero + segundoNumero));
	}

	public void metodoParametrosArrayInt(int... arrayEnteros) {
		System.out.println("=========================================================================");
		System.out.println("arrayEnteros: " + arrayEnteros.length);
		System.out.println("arrayEnteros: " + arrayEnteros.toString());
		System.out.println("arrayEnteros: " + arrayEnteros);
	}

	public void metodoParametrosArrayInt2(int primerNumero, int segundoNumero, int... arrayEnteros) {
		System.out.println("=========================================================================");
		System.out.println("primerNumero: " + primerNumero + ", segundoNumero: " + segundoNumero);
		System.out.println("suma: " + (primerNumero + segundoNumero));
		System.out.println("arrayEnteros: " + arrayEnteros.length);
		System.out.println("arrayEnteros: " + arrayEnteros.toString());
		System.out.println("arrayEnteros: " + arrayEnteros);
	}
	
	
//	public void metodoParametrosArray(String... primerArray, int... primerArray) {
//	//ERROR. Solo puede haber un parametro variable por metodo. 
//	}
	
//	public void metodoParametrosArray(int... primerArray, int primerNumero, int segundoNumero, ) {
//	//ERROR. El parametro variable debe estar al final de todos los parametros. 	
//	}
	

}
