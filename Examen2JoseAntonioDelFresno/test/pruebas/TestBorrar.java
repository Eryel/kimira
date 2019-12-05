package pruebas;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeli;

public class TestBorrar {
	public static void main(String[] args) {

		DaoPeli daopeli = new DaoPeli();

		Pelicula p1 = new Pelicula();
		p1.setId(1);

		boolean borrarCoche = daopeli.borrar(p1);

		System.out.println("Se ha borrado la pelicula " + p1.getId() + " con exito");

	}

}
