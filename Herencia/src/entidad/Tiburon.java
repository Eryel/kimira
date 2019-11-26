package entidad;

public class Tiburon extends Pez {

	@Override
	public void comer(Object comida) {
		// TODO Auto-generated method stub
		// super.comer(comida);
		if (comida instanceof Pez) {
			Pez pez = (Pez)comida;
			System.out.println("Soy el tiburon "+ getNombre()+ " "+ " y me voy a comer el pez de tipo "+pez.getClass().getSimpleName()+ " y se llama "+pez.getNombre());
		}else {
			System.out.println("Soy un tiburon y solo como peces");
		}
	}
	
	

}
