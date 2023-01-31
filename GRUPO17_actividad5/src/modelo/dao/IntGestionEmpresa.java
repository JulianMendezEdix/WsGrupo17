package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.*;

public interface IntGestionEmpresa {
	
	boolean altaEmpleado(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	boolean modificarUno(Empleado empleado);
	ArrayList<Empleado> buscarPorSexo();
	Empleado buscarUno(int IdEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);

}
