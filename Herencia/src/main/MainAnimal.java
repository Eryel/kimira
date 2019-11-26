package main;

import java.util.ArrayList;

import entidad.Animal;
import entidad.Oso;
import entidad.Pez;
import entidad.PezPayaso;
import entidad.Placton;
import entidad.Tiburon;
import entidad.Trucha;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiburon tiburon = new Tiburon();
		tiburon.setEdad(4);
		tiburon.setNombre("Gary");
		tiburon.setPeso(250);
		tiburon.setNumeroAletas(6);

		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(tiburon);

		Pez pez = new PezPayaso();
		pez.setEdad(1);
		pez.setNombre("Nemo");
		pez.setNumeroAletas(4);
		pez.setPeso(2.6);

		listaAnimales.add(pez);

		pez = new Trucha();
		pez.setEdad(2);
		pez.setNombre("Elisa");
		pez.setNumeroAletas(2);
		pez.setPeso(0.3);

		listaAnimales.add(pez);

		Oso oso = new Oso();
		oso.setEdad(8);
		oso.setNombre("Yogi");
		oso.setPeso(280);

		listaAnimales.add(oso);

		Placton p = new Placton();
		p.setCalorias(500);

		for (Animal animal : listaAnimales) {
			Oso osoAlimento = new Oso();
			osoAlimento.setNombre("Tarzan");
			animal.comer(osoAlimento);
			// no importa la referencia cada objeto ejecutara su metodo comer.

		}
	}

}
