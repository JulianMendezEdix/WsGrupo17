/*
 ***********************************************************************************************
 * 														INFO
 ***********************************************************************************************
 *
 * AD-5. Tarea en equipo. Interrelación entre clases.
 * Programación 1ºDAW EDIX 2023
 * GRUPO 20
 * Autores: Julián Méndez Podadera.
 * 
 ***********************************************************************************************
 * 
 * Descripcion:
 * Esta es la clase TestingEmpleado requerida
 * 
 * *********************************************************************************************
 * 
 * NOTAS: 
 * los demás compañeros del grupo no han aparecido tras intentos continuados 
 * de contacto vía mensaje en el campus de EDIX. Aporto capturas de pantalla en carpeta
 * "Documentación".
 * 
 ***********************************************************************************************
 ********************************************************************************************** 
 */

package testing;

import modelo.javabean.*;

public class TestingEmpleado {
	
	public static void main(String[] args) {
		/*
		 ******************************************************************************************
		 ******************************************************************************************
		 *  								    CABECERA INFORMACIÓN
		 ******************************************************************************************
		 ******************************************************************************************  
		 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("**INICIO DEL PROGRAMA");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(" * AD-5. Tarea en equipo. Interrelación entre clases.\r\n"
				+ " * Programación 1ºDAW EDIX 2023\r\n"
				+ " * GRUPO 17\r\n"
				+ " * Autores: Julián Méndez Podadera.");
		System.out.println(" * Descripcion:\r\n"
				+ " * Esta es la clase TestingEmpleado requerida.");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		
		/*
		 * Crear al menos, un objeto Localización, otro de Departamento con esa
		 *  Localidad, un Trabajo, y un Empleado con su departamento y su Trabajo.
		 */
		
		Localidad loc1 = new Localidad(100, "CALLE DOLORES, 2", "GRANADA", "ESPAÑA");
		Departamento dep1 = new Departamento(1, "EDITORIAL", loc1);
		Trabajo tra1 = new Trabajo
										   ("DIRECCION", "MAXIMA RESPONSABILIDAD DEPARTAMENTO", 
										   50000, 80000);
		Empleado emp1 = new Empleado 
												   (6, "JULIAN", "MENDEZ PODADERA", 'H', 
						                           "JMENDEZPOD@GMAIL.COM", 60000, 10000, tra1, dep1);
		
		/*
		 * La información completa de un empleado SIN usar toString:
		 * Nombre, apellidos, género, nombre del departamento, 
		 * nombre de su trabajo, dirección , ciudad y país.
		 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Esta es la información completa de un empleado "
				+ "SIN usar toString:");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		
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
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Extraer del empleado su trabajo y departamento en variables\n"
				+ "de su tipo y pintarlas con syso:");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		
		Trabajo trabajoEmp1 = emp1.getTrabajo();
		System.out.println(trabajoEmp1);
		
		Departamento departamento = new Departamento();
		departamento = emp1.getDepartamento();
		System.out.println(departamento);
		
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("**FIN DEL PROGRAMA. Agur!");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		
	}
		
}
