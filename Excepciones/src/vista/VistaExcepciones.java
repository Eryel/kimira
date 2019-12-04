package vista;

import java.util.Scanner;

import negocio.GestorCalculadora;

public class VistaExcepciones {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Introduce los dos numeros");
		int nu1=sc.nextInt();
		int nu2=sc.nextInt();
		
		
		GestorCalculadora gc = new GestorCalculadora();
		int resultado = gc.dividir(nu1, nu2);
		System.out.println(resultado);
	} catch (ArithmeticException e) {
		
		//e.printStackTrace();
		System.out.println("No se puede dividir por 0");
	}
	System.out.println("Fin programa");
	}

}
