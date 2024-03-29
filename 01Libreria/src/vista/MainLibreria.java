package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.negocio.GestorLibros;

public class MainLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String opcion = "0"; // profe iguala a 0

		GestorLibros gl = new GestorLibros();
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		Libreria libreria = new Libreria();
		libreria.setListaLibros(listaLibros);
		gl.setLibreria(libreria);

		System.out.println("*+*+*+* Bienvenido a la libreria JDFL *+*+*+*");
		do {
			System.out.println("Que desea realizar: \n");
			System.out.println("1. Alta libros");
			System.out.println("2. Consulta libros");
			System.out.println("3. Busqueda libros por titulo");
			System.out.println("4. Busqueda por ISBN");
			System.out.println("5. Busqueda por editorial \n");
			System.out.println("****Pulse 0 para salir*****");
			opcion = sc.nextLine();
			if (opcion.equals("1")) {
				System.out.println("Bienvenido al alta, introduzca el nombre del libro a dar de alta");
				String titulo = sc.nextLine();
				System.out.println("Ahora introduzca la editorial: ");
				String editorial = sc.nextLine();
				System.out.println("Cual es el a�o de publicacion...");
				String a�o_publicacion = sc.nextLine();
				System.out.println("Introduzca por ultimo su ISBN");
				String ISBN = sc.nextLine();

				int ia�o = Integer.parseInt(a�o_publicacion);

				Libro l = new Libro();
				l.setTitulo(titulo);
				l.setEditorial(editorial);
				l.setA�o_publicacion(ia�o);
				l.setISBN(ISBN);

				boolean alta = gl.alta(l);
				if (alta) {
					System.out.println("Libro introducido correctamente.");
				} else {
					System.out.println("Errores al ingresar libro. Revisa los datos.");
				}
			} else if (opcion.equals("2")) {
				ArrayList<Libro> libro = gl.getLibreria().getListaLibros();
				for (Libro l : libro) {
					System.out.println(l);
				}
			} else if (opcion.equals("3")) {
				System.out.println("Introduzca el libro a buscar:");
				String titulo = sc.nextLine();
				Libro l = gl.buscaPorTitulo(titulo);
				if (l == null) {
					System.out.println("Libro no encontrado");
				} else {
					System.out.println("Este es el libro que buscas: \n" + l);
				}
			} else if (opcion.equals("4")) {
				System.out.println("Introduzca el ISBN:");
				String ISBN = sc.nextLine();
				Libro l = gl.buscaPorISBN(ISBN);
				if (l == null) {
					System.out.println("Libro no encontrado");
				} else {
					System.out.println("Este es el libro que buscas: \n" + l);
				}
			} else if (opcion.equals("5")) {
				System.out.println("Introduzca la editorial:");
				String editorial = sc.nextLine();
				ArrayList<Libro> lista = gl.buscarPorEditorial(editorial);
				if (lista.size() != 0) {
					System.out.println("La lista de libros de este genero son:");
					for (Libro l : lista) {
						System.out.println(l);
					}
				} else {
					System.out.println("No hay coincidencias por editorial.");
				}

			}

		} while (!opcion.equals("0"));
		System.out.println("Adios, esperamos que vuelvas pronto.");
	}

}
