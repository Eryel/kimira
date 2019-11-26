package entidad;

public class Oso extends Animal {

	@Override
	public void comer(Object comida) {
		// TODO Auto-generated method stub
		if (comida instanceof Animal) {
			Animal a = (Animal)comida;
			System.out.println("Soy un oso que me llamo "+nombre+" y me voy a comer el animal de tipo "+a.getClass().getSimpleName()+" y que se llama "+a.nombre);
		}else {
			System.out.println("Wy Bubu los osos solo comemos animales");
		}
	}

}
