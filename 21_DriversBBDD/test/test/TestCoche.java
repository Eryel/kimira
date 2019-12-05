package test;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class TestCoche {

	public static void main(String[] args) {

		DaoCoche daocoche = new DaoCoche();
		// boolean altaCoche = daocoche.alta();

		Coche c1 = new Coche();
		c1.setMatricula("222222222j");
		c1.setMarca("aaaaaaa");
		c1.setModelo("Super Ecologico");

		boolean altaCoche = daocoche.alta(c1);

		System.out.println("Se ha dado de alta el coche");

	}

}
