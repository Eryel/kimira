package vista;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Directores;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class Vista {

	public static void main(String[] args) {

		ArrayList<Empleado> lis = new ArrayList<Empleado>();
		ArrayList<Empleado> lisJe = new ArrayList<Empleado>();
		Scanner sc = new Scanner(System.in);
		String opcion = "0";

		Directores je = new Directores();
		je.setNombre("Leyre");
		je.setDni("6845224E");
		je.setEdad(45);
		je.setSalarioBase(25000.00);
		je.setListaE(lisJe);

		Empleado pro1 = new Programador();
		pro1.setNombre("Jaimito");
		pro1.setDni("0245845L");
		pro1.setEdad(36);
		pro1.setSalarioBase(1500.00);
		lisJe.add(pro1);

		Empleado pro2 = new Programador();
		pro2.setNombre("Billy");
		pro2.setEdad(28);
		pro2.setDni("55875251L");
		pro2.setSalarioBase(1400.50);

		Empleado pro3 = new Programador();
		pro3.setNombre("Berto");
		pro3.setEdad(51);
		pro3.setDni("5555951W");
		pro3.setSalarioBase(1800.50);

		Empleado pro4 = new Programador();
		pro4.setNombre("Laura");
		pro4.setEdad(38);
		pro4.setDni("25875251L");
		pro4.setSalarioBase(1700.20);
		lisJe.add(pro4);
		

		Empleado jp1 = new JefeProyecto();
		JefeProyecto b = (JefeProyecto) jp1;
		b.setNombre("Paloma");
		b.setDni("3698757Ñ");
		b.setEdad(52);
		b.setSalarioBase(15000.00);
		b.setIncentivos(5000);

		Empleado jp2 = new JefeProyecto();
		JefeProyecto a = (JefeProyecto) jp2;
		a.setIncentivos(2000.00);
		a.setNombre("Luisin");
		a.setDni("01248575Q");
		a.setEdad(59);
		a.setSalarioBase(21000.00);
		lisJe.add(a);

		lis.add(a);
		lis.add(b);
		lis.add(pro1);
		lis.add(pro2);
		lis.add(pro3);
		lis.add(pro4);
		lis.add(je);
		

		System.out.println("Bienvenido a nuestra empresa");
		do {
			System.out.println("Que desea realizar:\n");
			System.out.println("1. Alta empleado");
			System.out.println("2. Consultar empleados");
			System.out.println("3. Calcular salario de los empleados");
			System.out.println("\n ****Pulse 0 para salir*****");
			opcion = sc.nextLine();
			if (opcion.equals("1")) {
				System.out.println(
						"Bienvenido al alta, introduzca el tipo de empleado:\n 1-Alta programador. \n 2-Alta jefe de proyecto. \n 3.Alta director. \n");
				String cual = "0";
				cual = sc.nextLine();
				if (cual.equals("1")) {
					System.out.println("Introduzca el nombre: \n");
					String na = sc.nextLine();
					System.out.println("Introduzca su DNI: \n");
					String dn = sc.nextLine();
					System.out.println("Introduzca su salario base: \n");
					String sb = sc.nextLine();
					System.out.println("Introduzca su edad");
					String edad = sc.nextLine();

					int iaño = Integer.parseInt(edad);
					double isalario = Double.parseDouble(sb);

					Programador p = new Programador();
					p.setNombre(na);
					p.setDni(dn);
					p.setEdad(iaño);
					p.setSalarioBase(isalario);
					lis.add(p);
				} else if (cual.equals("2")) {
					System.out.println("Introduzca el nombre: \n");
					String na = sc.nextLine();
					System.out.println("Introduzca su DNI: \n");
					String dn = sc.nextLine();
					System.out.println("Introduzca su salario base: \n");
					String sb = sc.nextLine();
					System.out.println("Cual son sus incentivos?");
					String in = sc.nextLine();
					System.out.println("Introduzca su edad");
					String edad = sc.nextLine();

					int iaño = Integer.parseInt(edad);
					double isalario = Double.parseDouble(sb);
					double ince = Double.parseDouble(in);
					JefeProyecto jp = new JefeProyecto();
					jp.setNombre(na);
					jp.setDni(dn);
					jp.setEdad(iaño);
					jp.setIncentivos(ince);
					jp.setSalarioBase(isalario);
					lis.add(jp);

				} else if (cual.equals("3")) {
					System.out.println("Introduzca el nombre: \n");
					String na = sc.nextLine();
					System.out.println("Introduzca su DNI: \n");
					String dn = sc.nextLine();
					System.out.println("Introduzca su salario base: \n");
					String sb = sc.nextLine();
					System.out.println("Introduzca su edad: \n");
					String edad = sc.nextLine();
			

					int iaño = Integer.parseInt(edad);
					double isalario = Double.parseDouble(sb);
					Directores d = new Directores();
					d.setNombre(na);
					d.setDni(dn);
					d.setEdad(iaño);
					d.setSalarioBase(isalario);
					lis.add(d);
					System.out.println("Estos son los empleados de la empresa: \n");
					int indice = 0;
					for (Empleado ele: lis) {
						System.out.println(indice + " - " + ele);
						indice++;
					}
					System.out.println("Seleccione 1 para ingresar empleados y 0  para salir: ");
					String nl= sc.nextLine();
					while (nl != "0") {
						 String asa= sc.nextLine();
						System.out.println("Seleccione el numero de empleado que desea ingresar en su plantilla, pulse 9 para salir: ");
						ArrayList<Empleado> gh =new ArrayList<Empleado>();
						if ( asa == "0") {
							gh.add(a);
							
						}else if (asa == "1"){
							gh.add(b);
						}else if (asa == "2") {
							gh.add(pro1);
						}else if (asa == "3") {
							gh.add(pro2);
						}else {
							System.out.println("Concluyo.");
						}
					
					}
					
					


				}

			} else if (opcion.equals("2")) {
				System.out.println("Estos son los empleados\n" + lis);
			} else if (opcion.equals("3")) {
				for (Empleado sueldo : lis) {

					System.out.println(
							sueldo.getClass().getSimpleName() + " " + sueldo.getNombre() + " " + sueldo.sTotal());
				}

			}

		} while (!opcion.equals("0"));
		System.out.println("Adios, esperamos que vuelvas pronto.");

	}

}
