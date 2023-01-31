package testing;

import modelo.javabean.*;

public class TestingEmpleado {
	
	public static void main(String[] args) {
		
		/*
		 * Crear al menos, un objeto Localización, otro de Departamento con esa
		 *  Localidad, un Trabajo, y un Empleado con su departamento y su Trabajo.
		 */
		
		Localidad loc1 = new Localidad(100, "CALLE DOLORES, 2", "GRANADA", "ESPAÑA");
		Departamento dep1 = new Departamento(1, "EDITORIAL", loc1);
		Trabajo tra1 = new Trabajo
										   ("DIRECCION", "MÁXIMA RESPONSABILIDAD DEPARTAMENTO", 
										   50000, 80000);
		Empleado emp1 = new Empleado 
												   (14628069, "JULIÁN", "MÉNDEZ PODADERA", 'H', 
						                           "JMENDEZPOD@GMAIL.COM", 60000, 10000, tra1, dep1);
		
		/*
		 * La información completa de un empleado SIN usar toString:
		 * Nombre, apellidos, género, nombre del departamento, 
		 * nombre de su trabajo, dirección , ciudad y país.
		 */
		
		System.out.println("Nombre: " + emp1.getNombre());
		System.out.println("Apellidos: " + emp1.getApellidos());
		System.out.println("Género: " + emp1.getGenero());
		System.out.println("Nombre del departamento: " + 
										  emp1.getDepartamento().getDescripcion());
		System.out.println("Nombre de su trabajo: " + emp1.getTrabajo().getIdTrabajo());
		System.out.println("Dirección: " + 
										  emp1.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad: " + emp1.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País: " + emp1.getDepartamento().getLocalidad().getPais());
		
		/*
		 * Extraer del empleado su trabajo y su departamento en variables de su tipo. 
		 * Y pintarlas con syso.
		 */
		
	}
		
}
