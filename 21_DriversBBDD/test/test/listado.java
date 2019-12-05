package test;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class listado {

	public static void main(String[] args) {

		DaoCoche daocoche = new DaoCoche();

		// Coche c1 = new Coche();
		// c1.setId(3);

		Coche obtenerCoche = daocoche.obtener(6);

		System.out.println("El coche seleccionado es " + obtenerCoche);

	}

}