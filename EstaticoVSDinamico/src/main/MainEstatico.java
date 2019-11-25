package main;

import org.omg.CORBA.PERSIST_STORE;

import entidad.Persona;

public class MainEstatico {

	public static void main(String[] args) {
		// este metodo es estatico no esta ligado a ningun objeto, existe siempre sin necesidad de new
		
		
		Persona p1 = new Persona();
		//fijaos que para acceder al metodo setnombre accedo a traves de la referencia la objeto.
		p1.setNombre("Harry Calahan");
		p1.setEdad(85);
		
		//esto seria necesario para verlo
		imprimir(p1);

		//creamos el objeto main estatico haciendolo un new para que lo vea el dinamico
		MainEstatico mainEstatico = new MainEstatico();
		mainEstatico.imprimirD(p1);
		
		//Si no estoy dentro de la clase que tiene el atributo o el metodo estatico ,se accede a traves del nombre de la clase
		Persona.numeroPersonas ++;
	}
	
	public  static void imprimir(Persona p1){ //ahora mismo no ve la persona de arriba, puesto que es dinamico y no se ha creado se ha declarado pero no creado.
		//como arreglar esto sin necesidad de crear objeto haciendo metodo estatico para que asi si se comunica con el de arrriba
		System.out.println(p1);
		//da error porque desde lo estatico no podemos acceder a lo dinamico
		//imprimirD(p1); (lo marco porque da error)
		
	}
	
	public void imprimirD(Persona p1) {
		System.out.println(p1);
		//en cambio desde lo dinamico si puedo acceder a lo estatico
		imprimir(p1);
	}

}
