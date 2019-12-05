
package test;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class modificar {

	public static void main(String[] args) {

		DaoCoche daocoche = new DaoCoche();

		Coche c1 = new Coche();
		c1.setId(1);
		c1.setMatricula("modificado");
		c1.setMarca("modif");
		c1.setModelo("Super modif");

		boolean modificarCoche = daocoche.modificar(c1);

		System.out.println("Se ha modificado el coche con exito");

	}
}