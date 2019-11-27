package entidad;

import java.util.ArrayList;

public class Directores extends Empleado {
	
	
	private ArrayList<Empleado> listaE;
	
	public ArrayList<Empleado> getListaE() {
		return listaE;
	}
	public void setListaE(ArrayList<Empleado> listaE) {
		this.listaE = listaE;
	}
	@Override
	public String toString() {
		return "Directores [listaE=" + listaE + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}
	@Override
	public double sTotal() {
		// TODO Auto-generated method stub
		return getSalarioBase()+(listaE.size()*100);
		
		
	}

	
	
	 
	 
	 
	

}
