package modelo.negocio;

import java.util.ArrayList;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class GestorLibros {

	private Libreria libreria;

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	public boolean alta(Libro l) {

		if (l.getTitulo().length() == 0) {
			return false;
		}

		if (l.getISBN().length() == 0) {
			return false;
		}

		for (Libro libro : libreria.getListaLibros()) {
			if (libro.getISBN().equals(l.getISBN())) {
				return false;
			}
		}

		libreria.getListaLibros().add(l);
		return true;
	}

	public Libro buscaPorTitulo(String titulo) {
		for (Libro l : libreria.getListaLibros()) {
			if (l.getTitulo().equals(titulo)) {
				return l;
			}

		}
		return null;
	}

	public Libro buscaPorISBN(String ISBN) {
		for (Libro l : libreria.getListaLibros()) {
			if (l.getISBN().equals(ISBN)) {
				return l;
			}

		}
		return null;
	}

	public ArrayList<Libro> buscarPorEditorial(String editorial) {
		ArrayList<Libro> listaLibroEdi = new ArrayList<Libro>();
		for (Libro l : libreria.getListaLibros()) {
			if (l.getEditorial().equals(editorial)) {
				listaLibroEdi.add(l);
			}
		}
		return listaLibroEdi;

	}

}
