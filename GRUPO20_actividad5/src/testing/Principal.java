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
 * Esta es la clase Principal con main static, correspondiente al último punto de la práctica. 
 * En ella, realizamos una prueba en secuencia, mostrando cada información que sale 
 * de la prueba de cada uno de los 10 métodos propuestos de la gestión de la Empresa.
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

import modelo.dao.Empresa;
import modelo.javabean.*;

public class Principal {
	
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
				+ " * Esta es la clase Principal requerida.\r\n"
				+ " * En ella, realizamos una prueba en secuencia\r\n"
				+ " * de los 10 métodos propuestos de la gestión de la Empresa.");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		/*
		 ******************************************************************************************
		 ******************************************************************************************
		 *  								    DECLARACIÓN DE VARIABLES
		 ******************************************************************************************
		 ******************************************************************************************  
		 */
		Empresa miEmpresa = new Empresa("LOJASOUND RECORDS");
         
		/*
		 * ****************************************************************************************
		 ******************************************************************************************
		 *  								    SECUENCIA DE PROCESOS
		 ******************************************************************************************
		 ******************************************************************************************  
		 */
		/*
		 * Comenzaremos con el método buscarTodos al igual que Tomás en clase, porque nos
		 * va a resultar muy útil a la hora de mostrar los resultados de todos los demás.
		 */
		/*
		 ******************************************************************************************
		 *  								1. TEST METODO BUSCAR TODOS
		 ******************************************************************************************  
		 */
		/*
		 * Imprimimos por pantalla el método buscarTodos sin FOR EACH.
		 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1. TEST METODO BUSCAR TODOS");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Comprobación syso con método buscarTodos sin FOR EACH:");
		System.out.println(miEmpresa.buscarTodos() + "\n");
		/*
		 * Vemos que muestra todos los empleados de la plantilla en pantalla y lo hace sin 
		 * hacer saltos de línea, lo que complica sobremanera la legilibilidad.
		 * Por curiosidad, redefinimos el método toString con Source en la 
		 * clase Empresa y lo utilizamos:
		 */
		System.out.println("Comprobación método toString redefinido con Source por "
				+ "curiosidad:");
		System.out.println(miEmpresa.toString() + "\n");
		/*
		 * Pasa igual que antes, pero añade el nombre de la empresa. 
		 */
		/*
		 * Acabamos entendiendo que la mejor manera de imprimir por pantalla la plantilla es
		 * recorriendo el arraylist con el FOR EACH y el método buscarTodos(), tal y como
		 * vimos en clase con Tomás.
		 */
		System.out.println("Comprobación buscarTodos con FOR EACH:");
		for (Empleado elemento: miEmpresa.buscarTodos()) {
			System.out.println(elemento);
		} 
		 /*
		  * Y creamos un método privado llamado printPlantilla() al final de la clase Principal 
		  * para usarlo a partir de ahora para imprimir la plantilla actualizada.
		 */
		
		/*
		 ******************************************************************************************                                       
		 * 									2. TEST METODO ALTA EMPLEADO
		 ******************************************************************************************
		 */
		/*
		 * Para hacer la prueba creamos dos nuevos empleados:
		 * a) el emp1 con un identicador que no existe en la plantilla,
		 * b) el emp2 con un 'Id' que ya existe en la plantilla.
		 */
		Empleado emp1 = new Empleado
				(100, "PEDRO", "ALMODOVAR GARCIA", 'H', 
				"PEDROALMODOVAR@LOJASOUNDRECORDS.COM", 25000, 5000, null, null);
		Empleado emp2 = new Empleado
				(1, "MARIA", "CASANOVA CASADEMUNT", 'M', 
				"MARIACASANOVA@LOJASOUNDRECORDS.COM", 25000, 5000, null, null);	
		/*
		 * Probamos el método con los dos nuevos empleados y mostramos los resultados en 
		 * la pantalla.
		 */
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("2. TEST METODO ALTA EMPLEADO");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Alta de Pedro Almodóvar, con 100 como identificador único: ");
		System.out.println(miEmpresa.alta(emp1));
		System.out.println("");
		System.out.println("Alta de María Casanova, con 1 como identifcador único (Id "
				+ "que ya existe en la plantilla): ");
		System.out.println(miEmpresa.alta(emp2));
		/*
		 * Como cabía esperar, el método funciona: en la consola nos ha mostrado TRUE para 
		 * el alta de Pedro Almodóvar y FALSE para el alta de María Casanova.
		 */
		/*
		 * Hacemos una segunda comprobación del método mostrando la plantilla completa,
		 * para ver que, efectivamente, la plantilla ahora cuenta con Pedro Almodóvar Id:100.
		 */
		printPlantilla(miEmpresa);
		System.out.println("");
		
		/*
		 ******************************************************************************************
		 *  								3. TEST METODO ELIMINAR UNO
		 ******************************************************************************************  
		 */
		/*
		 * Eliminamos al empleado Pedro Almodóvar con identifación 100, al que habíamos
		 * añadido en plantilla en el método anterior y lo mostramos en la consola:
		 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("3. TEST METODO ELIMINAR UNO");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("\nEliminando empleado creado en el método anterior Id=100: \n"
				+ miEmpresa.eliminarUno(emp1));
		/*
		 * La consola nos devuelve TRUE. Por lo que el método ha funcionado y ha hecho su 
		 * trabajo, en teoría. Para comprobarlo, volvemos a eliminar al empleado id100, ya que 
		 * el método debería darnos FALSE si el empleado no está en plantilla.
		 */
		System.out.println("\nEliminando empleado que ahora no existe: \n" 
				+ miEmpresa.eliminarUno(emp1));
		
		 /* Nos ha dado FALSE así que Ok. 
		  * Y hacemos una segunda comprobación imprimiendo en consola la plantilla 
		  * actualizada.
		 */
		printPlantilla(miEmpresa);
		/*
		 * En la consola hemos podido comprobar visualmente que Pedro Almodóvar con
		 * identifiación 100 ya no está en la plantilla.
		 */

		/*
		 ******************************************************************************************
		 *  								4. TEST METODO MODIFICAR UNO
		 ******************************************************************************************  
		 */
		/*
		 * Vamos a probar a ejecutar el metodo con un empleado que no existe en la plantilla,
		 * Pedro Almodóvar, al que eliminamos antes del la plantilla....
		 * Pongamos que queremos modificar a Pedro Almodóvar por Pedro Almogavers.
		 */
		 /*  
		 * Creamos un nuevo empleado con todo igual pero modificando el apellido.
		 */
		Empleado empMod = new Empleado 
				(100, "PEDRO", "ALMOGAVERS GARCIA", 'H', 
				"PEDROALMOGAVERS@LOJASOUNDRECORDS.COM", 25000, 5000, null, null);
		/*
		 * Probamos el metodo:
		 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("4. TEST METODO MODIFICAR UNO");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("\nModificando al empleado Pedro Almodóvar que no existe:");
		System.out.println(miEmpresa.modificarUno(empMod));
		/*
		 * Nos da FALSE porque el empleado a modificar no existe y no modifica nada. 
		 * Así que hacemos el alta de Pedro Almodóvar.
		 */
		System.out.println("\nAlta de Pedro Almodóvar:\n" +  miEmpresa.alta(emp1));
		/*
		 * Y volvemos a probar a ejecutar el metodo modificarUno, ahora con un empleado
		 * que sí existe.:
		 */
		System.out.println("\nModificando el primer apellido de Pedro Almodóvar  Id=100 "
				+ "tras su alta en plantilla:");
		System.out.println(miEmpresa.modificarUno(empMod));
		/*
		 * El método nos confirma que hemos modificado al empleado Pedro Almodóvar.
		 * Ahora queremos ver los cambios que hemos hecho y para ello imprimimos la
		 * plantilla actualizada.
		 */
		printPlantilla(miEmpresa);
		/*
		 * Efectivamente, vemos como en la plantilla aparece con la identificación 100 el 
		 * empleado Pedro Almogavers. Hemos modificado el emp1 por el empMod. 
		 * Podríamos cambiar cualquier dato que necesitáramos con este método.
		 */
		/*
		 * Ahora vamos a hacer una tercera prueba modificando la identificación del 
		 * empleado, a ver que pasa:
		 */
		Empleado empMod2 = new Empleado 
				(105, "PEDRO", "ALMOGAVERS GARCIA", 'H', 
				"PEDROALMODOVAR@LOJASOUNDRECORDS.COM", 25000, 5000, null, null);
		System.out.println("Modificando la ID del empleado Pedro Almogavers:");
		System.out.println(miEmpresa.modificarUno(empMod2)); 
		/*
		 * El algoritmo no lo encuentra, y suponemos que es porque el método indexOf de la
		 * clase ArrayList trabaja con el primer campo del array, que es el campo clave, 
		 * en este caso, la ID. Al cambiar la ID, y esta ID no está en la plantilla, no la encuentra, 
		 * por lo que el método modificarUno devuelve FALSE. Imprimimos pantalla para 
		 * comprobar que no se ha modificado nada.
		 */
		printPlantilla(miEmpresa);
		/*
		 * Comprobamos visualmente que Pedro Almogavers sigue en la plantilla con su 
		 * identifiación original, con su Id=100.
		 */
		
		/*
		 ******************************************************************************************
		 *  								5. TEST METODO BUSCAR POR SEXO
		 ******************************************************************************************  
		 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("5. TEST METODO BUSCAR POR SEXO");
		System.out.println("-------------------------------------------------------------------");
		/*
		 * Buscamos a las empleadas de la empresa:
		 */
		System.out.println("\nBuscamos a las empleadas de la empresa: ");
		for (Empleado empleado: miEmpresa.buscarPorSexo('M')) {
		System.out.println(empleado);
		}
		
		/*
		 ******************************************************************************************
		 *  								6. TEST METODO BUSCAR UNO
		 ******************************************************************************************  
		 */
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("6. TEST METODO BUSCAR UNO");
		System.out.println("-------------------------------------------------------------------");
		/*
		 * Buscamos el empleado Pedro Almogavers con Id=100 y imprimimos el resultado
		 * por pantalla.
		 */
		System.out.println("\nBuscando al empleado con id=100: ");
		System.out.println(miEmpresa.buscarUno(100));
		/*
		 * Todo Ok. Ha encontrado al empleado y lo ha sacado en pantalla. Ahora veamos que
		 * pasa si buscamos a un empleado que no existe:
		 */
		System.out.println("\nBuscando al empleado con id=200 (no existe esa Id): ");
		System.out.println(miEmpresa.buscarUno(200));
		System.out.println("");
		/*
		 * Nos da como resultado null. No ha encontrado nada.
		 */		
		
		/*
		 ******************************************************************************************
		 *  								7. TEST METODO BUSCAR POR TRABAJO
		 ******************************************************************************************  
		 */
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("7. TEST METODO BUSCAR POR TRABAJO");
		System.out.println("-------------------------------------------------------------------");
		
		/*
		 * Vamos a sacar el resultado del método sin FOR EACH
		 */
		//System.out.println(miEmpresa.buscarPorTrabajo("Operario")); 
		
		System.out.println("\nEn el primer intento de mostrar los resultados del método por"
				+ " pantalla nos dio un Null Pointer Exception.\nDescubrimos que era porque "
				+ "hicimos el alta de Pedro Almogavers con departamento y trabajo nulos. \nAl "
				+  "dar null no funcionaba correctamente.");
		
		/*
		 * Nos daba Null PointerException. ¿Puede ser porque Pedro Almogavers no tiene 
		 * trabajo asignado y da null en su trabajo? Quitamos las líneas de la búsqueda anterior 
		 * para que el error no nos pare el programa y continuamos. Damos de baja al bueno 
		 * de Pedro Almogavers.
		 */
		System.out.println("\nBaja de Pedro Almogavers:\n" + 
				miEmpresa.eliminarUno(empMod));
		/*
		 * Se ha completado correctamente la baja de Pedro, que tiene 0 estabilidad laboral.
		 * Y ahora procedemos de nuevo a buscarPorTrabajo():
		 */
		System.out.println("\nBuscando por trabajo sin FOR EACH:");
		System.out.println(miEmpresa.buscarPorTrabajo("Operario")); 
		/*
		 * Ahora funciona correctamente. Hacemos igual que con buscarTodos ahora
		 * para recorrer el array y ir imprimiendo en pantalla elemento por elemento:
		 */
		System.out.println("\nBuscando por trabajo con FOR EACH:");
		for (Empleado empleado: miEmpresa.buscarPorTrabajo("Operario")) {
			System.out.println(empleado);
		}
		/*
		 * Comprobamos y nos saca la lista de Operarios perfectamente
		 */
		/*
		 * Hemos hecho una mejora en el método añadiendo un If para que si habia nulos
		 * no los metiera en el nuevo array que se iba a mostrar. Así, podemos volver a añadir
		 * a Pedro Almodovar a la plantilla y hacer el buscarPorTrabajo().
		 */
		System.out.println("\nAlta de Pedro Almodóvar:\n" +  miEmpresa.alta(emp1));
		
		/*
		 * Y volvemos a pasar el buscar PorTrabajo:
		 */
		System.out.println("\nBuscando por trabajo con FOR EACH:");
		for (Empleado empleado: miEmpresa.buscarPorTrabajo("Operario")) {
			System.out.println(empleado);
		}
		/*
		 * Ahora funciona correctamento y nos avisa de que hay algún empleado sin trabajo
		 * asignado, y que no se añadirá a los resultados. Y por lo menos no finaliza el 
		 * programa con un Null PointerException.
		 */
		
		/*
		 ******************************************************************************************
		 *  								8. TEST METODO BUSCAR POR PAIS
		 ******************************************************************************************  
		 */
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("8. TEST METODO BUSCAR POR PAIS");
		System.out.println("-------------------------------------------------------------------");
		
		/*
		 * Para comporobar el método cambiamos el metodo cargarDatos y ponemos que
		 * Madrid esté en Japón, para convertir la empresa en internacional. Era nacional.
		 * Así va a ser mas facil saber si el metodo realmente funciona. Y bueno, madrileños, 
		 * ahora sois japoneses en mi programa.
		 */
		System.out.println("\nBuscando empleados en departamento cuya localidad es de"
				+ " Japon:");
		for (Empleado empleado: miEmpresa.buscarPorPais("JapoN")) {
			System.out.println(empleado);
		}
		/*
		 * El metodo funciona perfectamente y nos avisa de que hay empleados sin asignar
		 * a departamentos.
		 */
		
		/*
		 ******************************************************************************************
		 *  						    9. TEST METODO BUSCAR POR DEPARTAMENTO
		 ******************************************************************************************  
		 */
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("9. TEST METODO BUSCAR POR DEPARTAMENTO");
		System.out.println("-------------------------------------------------------------------");
		/*
		 * Vamos a buscar empleados del departamento 5.
		 */
		System.out.println("\nBuscando empleados del departamento IT con ID=5: ");
		for (Empleado empleado: miEmpresa.buscarPorDepartamento(5)) {
			System.out.println(empleado);
		}
		/*
		 * El método funciona perfectamente.
		 */
		
		/*
		 ******************************************************************************************
		 *  						    10. TEST METODO MASA SALARIAL
		 ******************************************************************************************  
		 */
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("10. TEST METODO MASA SALARIAL");
		System.out.println("-------------------------------------------------------------------");
		
		/*
		 * Llamamos al método masa salarial.
		 */
		System.out.println("\nLa masa salarial de la empresa (salarios más comisiones) es: ");
		System.out.println(miEmpresa.masaSalarial()+ " Eurazos");
		/*
		 * Funciona Prefectamente.
		 * Despidamos a Pedro Almogavers y chequeemos cambios
		 */
		System.out.println("\nBaja de Pedro Almogavers:\n" + 
				miEmpresa.eliminarUno(empMod));
		System.out.println("\nLa masa salarial de la empresa (salarios más comisiones) es: ");
		System.out.println(miEmpresa.masaSalarial()+ " Eurazos");
		/*
		 * Vemos que sin Pedro Almogavers la masa salarial baja en 30000 euros, que es el 
		 * resultado de la suma del sueldo y de las comisiones que cobraba Almogavers.
		 * El método funciona.
		 */
		
		/*
		 * FIN DEL PROGRAMA
		 */
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("**FIN DEL PROGRAMA. ciao!");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
	
	}
		
	/*
	 * Métodos Privados
	 */
	
	private static void printPlantilla (Empresa miEmpresa) {
		System.out.println("\nPlantilla actualizada para comprobar el método:");
		for (Empleado elemento: miEmpresa.buscarTodos()) {
			System.out.println(elemento);}
		System.out.println("");
	}
	

}
