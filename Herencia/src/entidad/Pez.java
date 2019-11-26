package entidad;

//para heredar una clase de otra se utiliza la palabra reservada extends

public class Pez extends Animal {
	private int numeroAletas;

	
	public void comer(Object comida) {
		
	
		
		//instanceof preguntamos la clase del objeto al que apuntamos
		
		if (comida instanceof Placton) {
			Placton p = (Placton) comida;
			System.out.println("Soy un pez y como "+nombre + " y me voy a comer un placton con "+ p.getCalorias());
			//la division entre al menos un numero entero siempre devuelve un numero entero
			double nuevoPeso = p.getCalorias()/1000.0;
			this .setPeso(getPeso()+ nuevoPeso);
		}else {
			System.out.println("no me gusta eso :(( :((");
		}
		
		
	}

	
	public int getNumeroAletas() {
		return numeroAletas;
	}


	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}


	//tenemos que coger los getter heredados de animal ya que los atributos son privados y no podemos acceder desde esta clase
	// otra opcion hubiera sido haberlos hecho protected
	@Override
	public String toString() {
		return "Pez [numeroAletas=" + numeroAletas + ", nombre=" + nombre + ", getNombre()=" + getNombre()
				+ ", getPeso()=" + getPeso() + ", getEdad()=" + getEdad() + "]";
	}

	
	
}
