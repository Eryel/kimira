package pruebas;

import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeli;

public class TestListaTodo {

	public static void main(String[] args) {
		DaoPeli daopeli = new DaoPeli();
		
		List<Pelicula> listaPeliculas = daopeli.listar();
		System.out.println("Las peliculas disponiles son "+listaPeliculas);

	}

}
