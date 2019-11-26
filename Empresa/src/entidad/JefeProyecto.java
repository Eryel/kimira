package entidad;

public class JefeProyecto extends Empleado {

	private double incentivos = 0;
	@Override
	public double sTotal() {
		// TODO Auto-generated method stub
		return getSalarioBase() + incentivos;
	}



	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "JefeProyecto [incentivos=" + incentivos + "]";
	}


	

	
}
