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
 * Este es el Interface IntGestiónEmpresa propuesto en la actividad.
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

public interface IntGestionEmpresa {
	
	boolean alta(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	boolean  modificarUno(Empleado empleado);
	ArrayList<Empleado> buscarPorSexo(char sexo);
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);

}
