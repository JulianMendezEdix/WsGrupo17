/*
 ***********************************************************************************************
 * 
 * AD-5. Tarea en equipo. Interrelación entre clases.
 * Programación 1ºDAW EDIX 2023
 * GRUPO 17
 * Autores: Julián Méndez Podadera.
 * 
 **^*******************************************************************************************
 * 
 * Descripcion:
 * Esta es la clase Empresa propuesta en la actividad.
 * 
 ***********************************************************************************************
 * 
 * NOTAS: 
 * los demás compañeros del grupo no han aparecido tras intentos continuados 
 * de contacto vía mensaje en el campus de EDIX. Aporto capturas de pantalla en carpeta
 * "Documentación".
 * 
 ***********************************************************************************************
 */

package modelo.dao;
import java.util.ArrayList;
import modelo.javabean.*;

/*
 * 1. Creamos la Clase Empresa. 
 */

public class Empresa implements IntGestionEmpresa  {
	
	/*
	 * 2. Atributos de objeto privados:
	 * datos privados del diagrama de la actividad.
	 */
	
	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	/* 3. Método Constructor requerido:
	 * Un constructor con un parámetro tipo String con nombreEmpresa, 
	 * y en él hacer el new ArrayList.
	 */
	
	public Empresa (String nombreEmpresa) {
		
		this.nombre = nombreEmpresa;
		plantilla = new ArrayList<>();	
		cargarDatos();
		
	}

	/*
	 * 4. Getter and Setter requeridos:
	 * geter an settr SOLO de nombre.
	 */
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombreEmpresa) {
		this.nombre = nombreEmpresa;
	}
	
	/*
	 * 5. Métodos de implementación de Interface:
	 *  Implementación de los métodos del interface y del contenido de cada uno de ellos.
	 */
	
	@Override
	public boolean alta(Empleado empleado) {
		/*
		 * vamos a incluir un IF para que cualquier IdEmpleado sea único y no pueda estar 
		 * repetido en la plantilla. Y usaremos el método add() de la clase ArrayList.
		 */	
		if (plantilla.contains(empleado)) 
			return false;
		else
			return plantilla.add(empleado);	
	}

	@Override
	public boolean eliminarUno(Empleado empleado) {
		/*
		 * Usaremos el método remove de la clase ArrayList.
		 */
		return plantilla.remove(empleado);
	}
	
	/*
	 * Utilizaremos el indexOf tal y como vimos en clase para saber la posición en el el
	 * arraylist del empleado. Y, si el empleado no está en el arraylist nos devolverá FALSE y 
	 * no modificará nada, obviamente. Y, si el empleado está en el  
	 */
	@Override
	public boolean modificarUno(Empleado empleado) {
		int posicion = plantilla.indexOf(empleado);
		if (posicion == -1)
			return false;
		else 
			System.out.println("Empleado modificado: " +plantilla.set(posicion, empleado)); 
			return true;
	}

	@Override
	public ArrayList<Empleado> buscarPorSexo() {
		return null;
	}

	/*
	 * Vamos a utilizar el truco de Tomás para evitar hacer un FOR en el buscarUno. 
	 * Vamos a crear un empleado  con lo mínimo, con el campo clave. Y vamos a utilizar un 
	 * indexOf para localizar la posición y una vez localizada utilizar el get para devolver
	 * el empleado.
	 */
	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado emp = new Empleado();
		emp.setIdEmpleado(idEmpleado);
		int posicion = plantilla.indexOf(emp);
		if (posicion == -1)
			return null;
		else ; 
			return plantilla.get(posicion);
	}
	
	/*
	 * Dejo la opcion con FOR por aquí para probarla.
	 */		
	/*@Override
	public Empleado buscarUno(int idEmpleado) {
		 for (Empleado ele: plantilla) {
		 		if (ele.getIdEmpleado() == idEmpleado)
		 			return ele;
		  }
		  */

	@Override
	public ArrayList<Empleado> buscarTodos() {
		return plantilla ;
	}

	@Override
	public double masaSalarial() {
		return 0;
	}

	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepar) {
		return null;
	}

	@Override
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		return null;
	}

	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		return null;
	}
	
	/*
	 * 6. Métodos privados requeridos:
	 * Crear un método privado cargarDatos(): void. En donde creamos Empleados para 
	 * probar, de distintos trabajos, departamentos con sus localidades.
	 */
	
	private void cargarDatos() {
		
		// Creación de Localidades 
		
		Localidad loc1 = new Localidad(100, "CALLE ALEGRIA, 2", "GRANADA", "ESPAÑA");
		Localidad loc2 = new Localidad(200, "CALLE NEPTUNO, 10", "LOJA", "ESPAÑA");
		Localidad loc3 = new Localidad(300, "CALLE LUNA, 20", "MADRID", "ESPAÑA");
		
		// Creación de Departamentos 
		
		Departamento dep1 = new Departamento(1, "EDITORIAL", loc1 );
		Departamento dep2 = new Departamento(2, "DISCOGRAFICA", loc1);
		Departamento dep3 = new Departamento(3, "ESTUDIO DE GRABACION", loc2);
		Departamento dep4 = new Departamento(4, "MARKETING", loc3 );
		Departamento dep5 = new Departamento(5, "IT", loc3 );

		// Creación de Trabajos

		Trabajo tra1 = new Trabajo
				("DIRECCION", "MÁXIMA RESPONSABILIDAD DEPARTAMENTO", 
						50000, 80000);
		Trabajo tra2 = new Trabajo
				("OFFICE MANAGER", "SE ENCARGA DE LA GESTION Y FINANZAS", 
						30000, 50000);
		Trabajo tra3 = new Trabajo
				("OPERARIO", "SE ENCARGA DE DIFERENTES LABORES ASIGNADAS",
						20000, 30000);
		
		// Creación de Empleados
		
			// Directores
		
			plantilla.add(new  Empleado 
					(1, "TAYLOR", "SWIFT SCHUMANN", 'M', 
							"TAYLORSWIFT@LOJASOUNDRECORDS.COM", 60000, 10000, tra1, dep1));
			plantilla.add(new  Empleado 
					(2, "HANNAH", "MONTANA BEETHOVEN", 'M', 
							"FUJURSTRAUSS@LOJASOUNDRECORDS.COM", 60000, 10000, tra1, dep2));
			plantilla.add(new Empleado
					(3, "BARBARA", "STREISAND PUGACHOVA", 'M', 
							"BARBARASTREISAND@LOJASOUNDRECORDS.COM", 60000,
							10000, tra1 , dep3));
			plantilla.add(new Empleado
					(4, "MILEY", "CYRUS SHAKIRA", 'M', 
							"MILEYCYRUS@LOJASOUNDRECORDS.COM", 60000,
							10000, tra1 , dep4));
			plantilla.add(new Empleado
					(5, "BJORK", "MADONNA HOUSTON", 'M', 
							"BJORKMADONNA@LOJASOUNDRECORDS.COM", 60000,
							10000, tra1 , dep5));
			
			// Office Managers
			
			plantilla.add(new  Empleado 
					(6, "JULIAN", "MENDEZ PODADERA", 'H', 
							"JULIANMENDEZ@LOJASOUNDRECORDS.COM", 40000, 8000, tra2, dep1));
			plantilla.add(new  Empleado 
					(7, "FUJUR", "STRAUSS  MENDEZ", 'H', 
							"FUJURSTRAUSS@LOJASOUNDRECORDS.COM", 40000, 8000, tra2, dep2));
			plantilla.add(new Empleado
					(8, "PAUL", "MCCARTNEY DYLAN", 'H', 
							"PAULMCCARTNEY@LOJASOUNDRECORDS.COM", 40000,
							8000, tra2 , dep3));
			plantilla.add(new Empleado
					(9, "JOHN", "LENNON STRAVINSKY", 'H', 
							"JOHNLENNON@LOJASOUNDRECORDS.COM", 40000,
							8000, tra2 , dep4));
			plantilla.add(new Empleado
					(10, "ROBERT", "ZIMMERMAN MOZART", 'H', 
							"ROBERTZIMMERMAN@LOJASOUNDRECORDS.COM", 40000,
							8000, tra2 , dep5));

			// Operarios
			
			plantilla.add(new  Empleado 
					(11, "ANA", "BOLENA MARTINEZ", 'M', 
							"ANABOLENA@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep1));
			plantilla.add(new  Empleado 
					(12, "ROSA", "LOPEZ FERNANDEZ", 'M', 
							"ROSALOPEZ@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep1));
			plantilla.add(new  Empleado 
					(13, "LEIRE", "MILTON GARCIA", 'M', 
							"LEIREMILTON@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep2));
			plantilla.add(new  Empleado 
					(14, "MATEO", "BUSTINGORRI FRESNEDA", 'H', 
							"MATEOBUSTINGORRI@LOJASOUNDRECORDS.COM", 25000, 
							5000, tra3, dep3));
			plantilla.add(new  Empleado 
					(15, "ANACLETO", "RUIZ STRAWBERRY", 'H', 
							"ANACLETORUIZ@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep5));
			plantilla.add(new  Empleado 
					(16, "BILL", "GATES HISPANO", 'H', 
							"BILLGATES@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep5));
			plantilla.add(new  Empleado 
					(17, "MARIA", "PITA CHAMPOLION", 'M', 
							"MARIAPITA@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep5));
	}

	
	/*
	 * Método ToString Redefinido para comprobar el porqué de utilizar un FOR EACH para
	 * imprimir los datos de un array list.
	 */
	
	
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", plantilla=" + plantilla + "]";
	}
	


}


