package org.mod1.ejercicio02.metodos.otropaquete;

import org.mod1.ejercicio02.metodos.EjemploMetodo;

public class EjemploMetodoOtroPaquete {

	public static void main(String... args) {

		EjemploMetodo em = new EjemploMetodo();
//		em.metodoPrivado(); //Error. No puedes acceder a metodos privados desde otra clase
//		em.metodoDefault(); //Error. No puedes acceder a metodos default desde otra clase
		em.metodoPublic();

	}

}
