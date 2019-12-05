


package test;

import java.util.List;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class listaTodo {

	public static void main(String[] args) {

		DaoCoche daocoche = new DaoCoche();

		// Coche c1 = new Coche();
		// c1.setId(3);

		List<Coche> listadoCoches = daocoche.listar();

		System.out.println("Los coches disponibles son  " + listadoCoches);

}}