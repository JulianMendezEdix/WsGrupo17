package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.*;

public class EmpresaDaoImpList {
	
	// Atributos de objeto privados
	
	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	/* Método Constructor requerido (con un parámetro tipo String
	 *con nombreEmpresa, y en él hacer el new ArrayList)
	 */
	
	public EmpresaDaoImpList (String nombreEmpresa) {
		
		this.nombre = nombreEmpresa;
		plantilla = new ArrayList<>();	
		cargarDatos();
		
	}

	
	// Getter and Setter requeridos (Sólo de de nombre)
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Métodos privados
	
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
					(14628061, "TAYLOR", "SWIFT SCHUMANN", 'M', 
							"TAYLORSWIFT@LOJASOUNDRECORDS.COM", 60000, 10000, tra1, dep1));
			plantilla.add(new  Empleado 
					(14628062, "HANNAH", "MONTANA BEETHOVEN", 'M', 
							"FUJURSTRAUSS@LOJASOUNDRECORDS.COM", 60000, 10000, tra1, dep2));
			plantilla.add(new Empleado
					(14628063, "BARBARA", "STREISAND PUGACHOVA", 'M', 
							"BARBARASTREISAND@LOJASOUNDRECORDS.COM", 60000,
							10000, tra1 , dep3));
			plantilla.add(new Empleado
					(14628064, "MILEY", "CYRUS SHAKIRA", 'M', 
							"MILEYCYRUS@LOJASOUNDRECORDS.COM", 60000,
							10000, tra1 , dep4));
			plantilla.add(new Empleado
					(14628065, "BJORK", "MADONNA HOUSTON", 'M', 
							"BJORKMADONNA@LOJASOUNDRECORDS.COM", 60000,
							10000, tra1 , dep5));
			
			// Office Managers
			
			plantilla.add(new  Empleado 
					(14628061, "JULIAN", "MENDEZ PODADERA", 'H', 
							"JULIANMENDEZ@LOJASOUNDRECORDS.COM", 40000, 8000, tra2, dep1));
			plantilla.add(new  Empleado 
					(14628062, "FUJUR", "STRAUSS  MENDEZ", 'H', 
							"FUJURSTRAUSS@LOJASOUNDRECORDS.COM", 40000, 8000, tra2, dep2));
			plantilla.add(new Empleado
					(14628063, "PAUL", "MCCARTNEY DYLAN", 'H', 
							"PAULMCCARTNEY@LOJASOUNDRECORDS.COM", 40000,
							8000, tra2 , dep3));
			plantilla.add(new Empleado
					(14628064, "JOHN", "LENNON STRAVINSKY", 'H', 
							"JOHNLENNON@LOJASOUNDRECORDS.COM", 40000,
							8000, tra2 , dep4));
			plantilla.add(new Empleado
					(14628065, "ROBERT", "ZIMMERMAN MOZART", 'H', 
							"ROBERTZIMMERMAN@LOJASOUNDRECORDS.COM", 40000,
							8000, tra2 , dep5));

			// Operarios
			
			plantilla.add(new  Empleado 
					(14628061, "ANA", "BOLENA MARTINEZ", 'M', 
							"ANABOLENA@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep1));
			plantilla.add(new  Empleado 
					(14628061, "ROSA", "LOPEZ FERNANDEZ", 'M', 
							"ROSALOPEZ@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep1));
			plantilla.add(new  Empleado 
					(14628061, "LEIRE", "MILTON GARCIA", 'M', 
							"LEIREMILTON@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep2));
			plantilla.add(new  Empleado 
					(14628061, "MATEO", "BUSTINGORRI FRESNEDA", 'H', 
							"MATEOBUSTINGORRI@LOJASOUNDRECORDS.COM", 25000, 
							5000, tra3, dep3));
			plantilla.add(new  Empleado 
					(14628061, "ANACLETO", "RUIZ STRAWBERRY", 'H', 
							"ANACLETORUIZ@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep5));
			plantilla.add(new  Empleado 
					(14628061, "BILL", "GATES HISPANO", 'H', 
							"BILLGATES@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep5));
			plantilla.add(new  Empleado 
					(14628061, "MARIA", "PITA CHAMPOLION", 'M', 
							"MARIAPITA@LOJASOUNDRECORDS.COM", 25000, 5000, tra3, dep5));


		
		
		
	}

	
	
	

}
