package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

import modelo.entidad.Coche;

/**
 * Esta clase se encarga de la persistencia con la clase. Esta clase hara un Crud (Create Read Update Delete) 
 * sobre la entidad coche. Un DAO es el acronimo de DataAccessObject y es un objeto que suele encargarse de interactuar 
 * los objetos con la base de datos.
 * 
 * Nosotros vamosa desarrollar este DAO mediante el Api de java JDBC (java data base conection), un api
 * es un conjunto de librerias que porporcionan  una funcionalidad, y en este caso nos daran la funcionalidad
 * para conectarnos a una base de datos.
 * Hay otras APIS para base de datos como por ejemplo JPA(Java persistence API)
 * 
 *  Para usar JDBC o JPA, necesitamos los drivers de conexion que ha hecho el proveedor de conexion de nuestra base de datos, en nuestro 
 *  caso MYSQL, dependiendo de la base de datos a la que nos conectemos necesitaremos unos drivers u otros ( por ejemplo ORACLE; POSTGRES, SQLite, etc..)
 *  asi pues lo primero que tenemos que hacer es obtener los drivers e incluirlos en nuestro proyecto, en nuestro caso necesitamos los drivers de MYSQL 8.0,
 *  (ojo con la version) que los meteremos en la carpeta lib (que tenemos que crear) y a continuacion decirle a java que tiene que utilizar 
 *  dichos drivers, para ello tenemos que modificar el classpath de nuestra aplicacion Java.
 *  Para modificar el classPath boton derecho sobre el proyecto y BuildPath -- configure -- ClassPath.
 *  
 * 
 * @author jose
 * @see Coche
 * @since 04-12-2019
 *@version 1.0
 * 
 */

public class DaoCoche {

	
	private Connection conexion;
	
	
	/*static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Driver no cargado");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	*/
	public boolean abrirConexion() {
		//protocolo: subprotocolo//ip:puerto/nombre_esquema
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=" + TimeZone.getDefault().getID();
		String usu = "root";
		String pass = "root";
		
		//getconection me devuelve un objeto que lleva la conexion a la bbdd
		//Esta clase (driverManager) es la clase que lleva el control del driver.
		//Estamos aploando la inyeccion de dependencias es de cir no creo el objeto aqui (no hago new), es el metodo getconection
		//el que me va a crear el objeo en mi lugar
		
		try {
			conexion = DriverManager.getConnection(url, usu, pass);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	public boolean cerrarConexiones() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
		
		
		//alta coche
	}
	public boolean alta(Coche coche) {
		if(!abrirConexion()) {
			return false;
		}
		boolean alta= true;
		
		//asi no se debe hacer asique lo dejo comentado
		/*
		String query ="insert into coches (matricula,marca,modelo) "
				+ "value("+coche.getMatricula()+","+coche.getMarca()+","+coche.getModelo()+")";*/
		
		/*
		 * como hay que hacerlo es con consultadas preparadas, parametrizadas 
		 */
		
		String query = "insert into coches (matricula,marca,modelo) values(?,?,?)";
		try {
			//le decimos ala conexion que nos haga una consulta parametrizada a  partir de la query anterior
			PreparedStatement ps =conexion.prepareStatement(query);
			ps.setString(1, coche.getMatricula());
			//substituimos la primera interrogante por la matricula
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			
			//esta funcion me devuelve el numero de filas afectadas
			int numeroFilas =ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al insertar");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {//el bloque finally se va a ejecutar siempre!!
			//no importa si ha pasado por el bloque try o catch
			cerrarConexiones();
			
		}
	}
	
	//modificar coche
	
	
	public boolean modificar(Coche coche) {
		if(!abrirConexion()) {
			return false;
		}
		
		//asi no se debe hacer asique lo dejo comentado
		/*
		String query ="insert into coches (matricula,marca,modelo) "
				+ "value("+coche.getMatricula()+","+coche.getMarca()+","+coche.getModelo()+")";*/
		
		/*
		 * como hay que hacerlo es con consultadas preparadas, parametrizadas 
		 */
		
		String query = "update coches set matricula=?,marca=?,modelo=? where id=?";
		try {
			//le decimos ala conexion que nos haga una consulta parametrizada a  partir de la query anterior
			PreparedStatement ps =conexion.prepareStatement(query);
			ps.setString(1, coche.getMatricula());
			//substituimos la primera interrogante por la matricula
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setInt(4, coche.getId());
			
			//esta funcion me devuelve el numero de filas afectadas
			int numeroFilas =ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al modificar");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {//el bloque finally se va a ejecutar siempre!!
			//no importa si ha pasado por el bloque try o catch
			cerrarConexiones();
			
		}
	}
	
	//baja coche
	public boolean borrar(Coche coche) {
		if(!abrirConexion()) {
			return false;
		}
		
	
		String query = "delete from coches where id=?";
		try {
			//le decimos ala conexion que nos haga una consulta parametrizada a  partir de la query anterior
			PreparedStatement ps =conexion.prepareStatement(query);
			
			ps.setInt(1, coche.getId());
			
			//esta funcion me devuelve el numero de filas afectadas
			int numeroFilas =ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al borrar");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {//el bloque finally se va a ejecutar siempre!!
			//no importa si ha pasado por el bloque try o catch
			cerrarConexiones();
			
		}
	}
	
	//leer coches
	public Coche obtener(int id) {
		if(!abrirConexion()) {
			return null;
		}
		
		
		String query = "select id,matricula,marca,modelo from coches where id=?";
		try {
			//le decimos ala conexion que nos haga una consulta parametrizada a  partir de la query anterior
			PreparedStatement ps =conexion.prepareStatement(query);
			
			ps.setInt(1, id);
			
			//esta funcion me devuelve el numero de filas afectadas
			ResultSet rs =ps.executeQuery();
			
			Coche coche= null;
			//resultset es un objeto que tiene toda la lista de registros que ha devuelto la consulta
			//asi pues, podemos recorrer la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				coche = new Coche();
				coche.setId(rs.getInt(1));
				coche.setMatricula(rs.getString(2));
				coche.setMarca(rs.getString(3));
				coche.setModelo(rs.getString(4));
				
				return coche;
				
			}
		} catch (SQLException e) {
			System.out.println("Error al leer");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {//el bloque finally se va a ejecutar siempre!!
			//no importa si ha pasado por el bloque try o catch
			cerrarConexiones();
			
		}
		return null;
	}
	
	
}
