package test;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class borrar {

	public static void main(String[] args) {

		DaoCoche daocoche = new DaoCoche();

		Coche c1 = new Coche();
		c1.setId(2);

		boolean borrarCoche = daocoche.borrar(c1);

		System.out.println("Se ha borrado el coche " + c1.getId() + " con exito");

	}

}
