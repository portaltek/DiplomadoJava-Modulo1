package org.mod1.ejercicio02.metodos;

public class EjemploMetodo {

	public static void main(String... args) {

		EjemploMetodo em = new EjemploMetodo();
		em.metodoPrivado();
		em.metodoDefault();
		em.metodoPublic();

	}

	private void metodoPrivado() {
		System.out.println("metodoPrivado");
	}

	void metodoDefault() {
		System.out.println("metodoDefault");
	}

	public void metodoPublic() {
		System.out.println("metodoPublic");
	}

}
