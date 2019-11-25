package entidad;

public class Persona {

	//Esto es un metodo dinamico, el ciclo de vida de este metodo depende del objeto,. Un metodo dinamico se crea sin poner Static.
	private String nombre;
	private int edad;
	
	//mientras que los de arriba dependeran del objeto que se cree (new) este numeroPersonas no necesitara objeto(new) solo declarar donde esta
	public static int numeroPersonas = 0;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
