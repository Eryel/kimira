package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExcepciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* Este bloque de aqui, sera la parte que va a intentar java ejecutar, pero es posible que algun error ocuurra
		 * si algun error ocuriera, en vez de parar el programa entraria por el catch
		 */
	boolean opera = true;
	
	do {	
		try {
		System.out.println("introduzca el nominador");
		int numero1 = sc.nextInt();
		System.out.println("introduzca el denominador");
		int numero2 = sc.nextInt();
		int resultado = numero1 / numero2;
		
		System.out.println(" el resultado es " + resultado);
		opera = false;
		
		}catch(ArithmeticException ae) {
			//Si ocurre alguna excepcion del tipo Aritmetico entraremos opr esta parte del codigo.
			System.out.println("no se puede dividir por 0");
			System.out.println(ae);
		
		}catch (InputMismatchException ime) {
			System.out.println("No admite caracteres");
			sc.nextLine();
		}catch (Exception e) {
			System.out.println("Error inesperado");
			
		}
		
	}while (opera);
	System.out.println("Fin del programa, gracias por usarlo.");
sc.close();}
	
}