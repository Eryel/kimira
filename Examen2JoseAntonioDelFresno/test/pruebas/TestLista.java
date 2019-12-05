package pruebas;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeli;

public class TestLista {

	public static void main(String[] args) {
		DaoPeli daopeli= new DaoPeli();
		
		Pelicula obtenerPeli = daopeli.obtener(2);
		System.out.println("La pelicula seleccionada es "+obtenerPeli);
		

	}

}
