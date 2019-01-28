package org.mod1.ejercicio01.hola;

public class HolaConSuma {

	public static void main(String args[]) {
		int primerNumero = Integer.valueOf(args[0]);
		int segundoNumero = Integer.valueOf(args[1]);
		int suma = primerNumero + segundoNumero;
		System.out.println("Hola, sumatoria es " + suma + "!!!");
	}

}
