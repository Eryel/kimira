package modelo.entidad;

import java.util.ArrayList;

public class Libreria {

	private String nombre_libreria;
	private ArrayList<Libro> listaLibros;

	public String getNombre_libreria() {
		return nombre_libreria;
	}

	public void setNombre_libreria(String nombre_libreria) {
		this.nombre_libreria = nombre_libreria;
	}

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Libreria [nombre_libreria=" + nombre_libreria + ", listaLibros=" + listaLibros + "]";
	}

}
