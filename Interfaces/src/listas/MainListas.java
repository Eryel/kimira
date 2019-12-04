package listas;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainListas {

	public static void main(String[] args) {
		
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add("pepe");
		listaStrings.add("pepa");
		
		//las interfaces son una coleccion de metodos abstractos.
		//sirven para varias cosas, entre ellas implementar una herencia multiple, en java con una referencia de una interfaz, podemos apuntar a cualquier objeto
		//que implemente dicha interfaz.
		//las interfaces dicen el "QUE" mientras que las clases que implementan dicha interfaces dicen el "COMO"
		//Ejemplo, la clase ARRAyList es una implementacion de la interfaz list, que por debajo utiliza arrays normales java, y cuando se llena crea uno mas grande.
		
		
		List<String> listadeNombres= new ArrayList<String>();
		listadeNombres.add("Pepe");
		listadeNombres.add("Pepa");
		
		Vector<String> listaVector = new Vector<String>();
		ArrayList<String> listaArray= new ArrayList<String>();
		LinkedList<String> listaLinked = new LinkedList<String>();
		recorrerArray(listaArray);
		recorrerLinked(listaLinked);
		
		
		recorrer(listaArray);
		recorrer(listaLinked);
		
	}

	private static void recorrerLinked (LinkedList<String> lista) {
		for (String s :lista) {
			System.out.println(s);
		}
	}
	private static void recorrerArray (ArrayList<String> lista) {
		for (String s :lista) {
			System.out.println(s);
		}
}
	private static void recorrer (List<String> lista) {
		for (String s :lista) {
			System.out.println(s);
		}
}
}