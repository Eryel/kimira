package modelo.entidad;

public class Libro {

	private String titulo;
	private String editorial;
	private int a�o_publicacion;
	private String ISBN;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getA�o_publicacion() {
		return a�o_publicacion;
	}

	public void setA�o_publicacion(int a�o_publicacion) {
		this.a�o_publicacion = a�o_publicacion;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", editorial=" + editorial + ", a�o_publicacion=" + a�o_publicacion
				+ ", ISBN=" + ISBN + "]";
	}

}
