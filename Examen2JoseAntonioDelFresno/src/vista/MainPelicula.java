package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainPelicula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		GestorPelicula gp = new GestorPelicula();
	

		
		do {
			System.out.println("1- Alta de una pelicula.");
			System.out.println("2- Baja de una pelicula.");
			System.out.println("3- Modificacion de una pelicula");
			System.out.println("4- Buscar pelicula por id");
			System.out.println("5- Lista de todas las peliculas");
			System.out.println("6- Para salir");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el titulo:");
				String titulo = sc.nextLine();
				System.out.println("Introduzca el nombre del director:");
				String nombreDirector = sc.nextLine();
				System.out.println("Introduzca el genero");
				String genero = sc.nextLine();
				System.out.println("Introduzca el año de publicacion:");
				String anioPubli = sc.nextLine();
				
				
				
				Pelicula p = new Pelicula();
				p.setTitulo(titulo);
				p.setGenero(genero);
				p.setAñoDePublicacion(anioPubli);;
				p.setDirector(nombreDirector);
				
				boolean alta = gp.getGp().alta(p);
				if(alta) {
					System.out.println("Pelicula introducida correctamente");
				}else {
					System.out.println("Error al introducir la pelicula");
				}
			}else if(opcion.equals("2")) {
				System.out.println(gp.getListaPelicula());
				System.out.println("Introduzca el id de la pelicula que desea borrar:");
				int i = sc.nextInt();
				
				
				Pelicula p = new Pelicula();
				p.setId(i);
				
				gp.getGp().borrar(p);
				boolean baja = gp.getGp().borrar(p);
				if (baja) {
					System.out.println("Baja realizada correctamente");
				}else {
					System.out.println("No hay ninguna pelicula");
				}
				}else if (opcion.equals("3")) {
					System.out.println(gp.getListaPelicula());
					System.out.println("Di que pelicula quieres modificar");
					
				}else if (opcion.equals("4")) {
					System.out.println("Di el id que buscas:");
					int i = sc.nextInt();
					//Pelicula i = gp.
				}else if(opcion.equals("5")) {
					System.out.println("Estas son las peliculas registradas: \n"+gp.getListaPelicula());
				}
			
				}while(!opcion.equals("6"));
		System.out.println("Fin del programa");
	}	
	}


