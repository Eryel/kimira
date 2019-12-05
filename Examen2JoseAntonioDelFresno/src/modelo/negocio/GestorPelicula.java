package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeli;

public class GestorPelicula {

	DaoPeli gp = new DaoPeli();
	private ArrayList<Pelicula> listaPelis = null;

	public DaoPeli getGp() {
		return gp;
	}

	public void setGp(DaoPeli gp) {
		this.gp = gp;
	}

	public ArrayList<Pelicula> getListaPelicula() {
		return listaPelis;
	}

	public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
		this.listaPelis = listaPelicula;
	}

	@Override
	public String toString() {
		return "GestorPelicula [gp=" + gp + ", listaPelicula=" + listaPelis + "]";
	}

	public boolean alta(Pelicula pelicula) {
		List<Pelicula> listaPeliculas = gp.listar();
		for (Pelicula p : listaPeliculas) {
			if (p.getTitulo().equals(pelicula.getTitulo())) {
				return false;
			}else 
				return true;
		}

		if (pelicula.getTitulo().isEmpty()) {
			if (pelicula.getDirector().isEmpty()) {
				if (pelicula.getGenero().isEmpty()) {
					if (pelicula.getAñoDePublicacion().isEmpty()) {
					}
				}
			}
			return false;
		} else {
			return true;
		}

	}
	public Pelicula buscarPorID(int id) {
		for(Pelicula p : listaPeliculas) {
			if(p.getId() == gp.obtener(id) {
				return p;
			}
		}
		return null;
	}
	
	
}

