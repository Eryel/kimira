package pruebas;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeli;

public class TestMod {

	public static void main(String[] args) {
		
		DaoPeli daopeli = new DaoPeli();
		Pelicula p1 = new Pelicula();
		p1.setId(1);
		p1.setTitulo("la mazorca");
		p1.setDirector("LCDM");
		p1.setGenero("Politico");
		p1.setAñoDePublicacion("2018");
		
		boolean altapeli = daopeli.modificar(p1);
		
		System.out.println("Pelicula modificada con exito.");

	}

}
