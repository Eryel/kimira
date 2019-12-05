package pruebas;


import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeli;

public class TestAlta {

	public static void main(String[] args) {

		DaoPeli daopeli = new DaoPeli();

		Pelicula p1 = new Pelicula();
		p1.setTitulo("la mazorca");
		p1.setDirector("LCDM");
		p1.setGenero("Politico");
		p1.setAñoDePublicacion("2019");

		boolean altapeli = daopeli.alta(p1);

		System.out.println("Se ha dado de alta la pelicula");

	}

}


