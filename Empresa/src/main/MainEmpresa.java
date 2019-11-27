package main;

import java.util.ArrayList;

import entidad.Directores;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class MainEmpresa {

	public static void main(String[] args) {
		
		
		ArrayList<Empleado> listaE =new ArrayList<Empleado>();
		
	
		
		Directores je = new Directores();
		je.setNombre("Leyre");
		je.setDni("6845224E");
		je.setEdad(45);
		je.setSalarioBase(25000.00);
		je.setListaE(listaE);
		
		
		Empleado pro1 = new Programador();
		pro1.setNombre("Jaimito");
		pro1.setDni("0245845L");
		pro1.setEdad(36);
		pro1.setSalarioBase(1500.00);
		listaE.add(pro1);
	
		
		Empleado pro2 = new Programador();
		pro2.setNombre("Billy");
		pro2.setEdad(28);
		pro2.setDni("55875251L");
		pro2.setSalarioBase(1400.50);
		listaE.add(pro2);
		
		Empleado pro3 = new Programador();
		pro3.setNombre("Berto");
		pro3.setEdad(51);
		pro3.setDni("5555951W");
		pro3.setSalarioBase(1800.50);
	
		
		Empleado pro4 = new Programador();
		pro4.setNombre("Laura");
		pro4.setEdad(38);
		pro4.setDni("25875251L");
		pro4.setSalarioBase(17000.20);
	
		
		Empleado jp1 = new JefeProyecto();
		JefeProyecto b = (JefeProyecto) jp1;
		b.setNombre("Paloma");
		b.setDni("3698757Ñ");
		b.setEdad(52);
		b.setSalarioBase(15000.00);
		b.setIncentivos(5000);
		listaE.add(jp1);
		
		Empleado jp2 = new JefeProyecto();
		JefeProyecto a = (JefeProyecto) jp2;
		a.setIncentivos(2000.00);
		a.setNombre("Luisin");
		a.setDni("01248575Q");
		a.setEdad(59);
		a.setSalarioBase(21000.00);

		ArrayList<Empleado> all = new ArrayList<Empleado>();
		all.add(pro1);
		all.add(pro2);
		all.add(pro3);
		all.add(pro4);
		all.add(a);
		all.add(b);
		all.add(je);
		
		
		


		
		System.out.println("El sueldo total del director es "+je.sTotal()+" Euros");
		System.out.println("El sueldo total de el jefe de proyecto 1 es "+jp1.sTotal()+" Euros");
		System.out.println("El sueldo total de el jefe de proyecto 2 es "+jp2.sTotal()+" Euros");
		System.out.println("El sueldo total de programador 1  es "+pro1.sTotal()+" Euros");
		System.out.println("El sueldo total de programador 2  es "+pro2.sTotal()+" Euros");
		System.out.println("El sueldo total de programador 3  es "+pro3.sTotal()+" Euros");
		System.out.println("El sueldo total de programador 4  es "+pro4.sTotal()+" Euros");
	}

}
