package testing;

import modelo.dao.Empresa;
import modelo.javabean.*;

public class Principal {

	public static void main(String[] args) {

		Empresa miEmpresa =new Empresa("LOJASOUND RECORDS");
		
		// TEST METODO ALTA EMPLEADO
		
		Empleado empIdUnica = new Empleado
				(100, "PEDRO", "ALMODOVAR GARCIA", 'H', 
				"PEDROALMODOVAR@LOJASOUNDRECORDS.COM", 25000, 5000, null, null);
		Empleado empIdRepetida = new Empleado
				(1, "MARIA", "CASANOVA CASADEMUNT", 'M', 
				"MARIACASANOVA@LOJASOUNDRECORDS.COM", 25000, 5000, null, null);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("TEST METODO ALTA EMPLEADO");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.print("Alta de Pedro Almodóvar, con identificación única: ");
		System.out.println(miEmpresa.altaEmpleado(empIdUnica));
		System.out.print("Alta de María Casanova, con identifcación que ya "
				+ "existe en la plantilla: ");
		System.out.println(miEmpresa.altaEmpleado(empIdRepetida));
		System.out.println("");
		System.out.println("Plantilla actualizada:");
		for (Empleado elemento: miEmpresa.buscarTodos()) {
			System.out.println(elemento);}
		System.out.println("");
		
		// TEST METODO ELIMINAR UNO
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("TEST METODO ELIMINAR UNO");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Eliminando empleado creado en el método anterior con Id=100: "
				+ miEmpresa.eliminarUno(empIdUnica));
		//Volvemos a eliminar IdEmpleadoUnica que ya no existe para que devuelva false.
		System.out.println("Eliminando empleado que ahora no existe: " 
				+ miEmpresa.eliminarUno(empIdUnica));
		System.out.println("");
		System.out.println("Plantilla actualizada:");
		for (Empleado elemento: miEmpresa.buscarTodos()) {
			System.out.println(elemento);}
		System.out.println("");
		
		// TEST METODO BUSCAR TODOS
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("TEST METODO BUSCAR TODOS");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		for (Empleado elemento: miEmpresa.buscarTodos()) {
			System.out.println(elemento);
		}  
		
		


		

		
		
		
	}

}
