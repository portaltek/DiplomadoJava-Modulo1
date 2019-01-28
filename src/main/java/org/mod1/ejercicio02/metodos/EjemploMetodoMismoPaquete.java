package org.mod1.ejercicio02.metodos;

public class EjemploMetodoMismoPaquete {

	public static void main(String... args) {

		EjemploMetodo em = new EjemploMetodo();
//		em.metodoPrivado(); //Error. No puedes acceder a metodos privados desde otra clase
		em.metodoDefault();
		em.metodoPublic();

	}

}
