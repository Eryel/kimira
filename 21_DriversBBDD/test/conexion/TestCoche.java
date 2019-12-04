package conexion;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class TestCoche {

	public static void main(String[] args) {
	

		DaoCoche alta = new DaoCoche();
		boolean estaConectado = alta.alta();
		System.out.println(estaConectado);

	}

}
