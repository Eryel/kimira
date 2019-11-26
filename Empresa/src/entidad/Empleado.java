package entidad;

public abstract class Empleado {

	private String dni = null;
	private String nombre = null;
	private double  salarioBase = 0;
	private int edad = 0;
	public abstract double sTotal();
	
	

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", salarioBase=" + salarioBase + ", edad=" + edad + "]";
	}
	

	
	
	
}
