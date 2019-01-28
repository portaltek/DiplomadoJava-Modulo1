package org.mod1.ejercicio03.clases;

public class EjemploClase {

	public static void main(String... args) {

		EjemploClase ecp = new EjemploClase();
		ecp.metodo();

	}

	public void metodo() {
	
	}

	private class ClasePrivada {

		public void imprimir() {
			System.out.println("Hola soy una Clase Privada");
		}

	}

	class ClaseDefault {

		public void imprimir() {
			System.out.println("Hola soy una Clase Default");
		}

	}

}

//private class ClasePrivada { //Error. Clases privadas deben de estar adentro de una clase publica o default.
//}

class ClaseDefault { //Puedes definir muchas clases default en el mismo archivo .java
}
