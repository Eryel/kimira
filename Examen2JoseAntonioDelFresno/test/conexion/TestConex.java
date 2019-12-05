package conexion;

import modelo.persistencia.DaoPeli;

public class TestConex {
	public static void  main (String[] args) {
	
	DaoPeli daoPeli = new DaoPeli();
	boolean estaConectado = daoPeli.abrirConexion();
	System.out.println(estaConectado);
	}
	
}
