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
 * Esta es la clase Empleado propuesta en la actividad.
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


package modelo.javabean;

import java.util.Objects;

public class Empleado {
	
	// Atributos de objeto privados
	
	private int idEmpleado;
	private String nombre, apellidos;
	private char genero;
	private String email;
	private double salario, comision;
	private Trabajo trabajo;
	private Departamento departamento;
	
	// Métodos constructor vacío y completo
	
	public Empleado() {
		super();
	}

	public Empleado(int idEmpleado, String nombre, String apellidos, char genero, 
			String email, double salario, double comision, Trabajo trabajo, 
			Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}
	
	// Getter and Setter

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	// Redefinir métodos de objeto

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + 
				", apellidos=" + apellidos + ", genero=" + genero + ", email=" + email +
				", salario=" + salario + ", comision=" + comision + ", trabajo=" + trabajo +
				", departamento=" + departamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	
	// Métodos de clase
	
	public double salarioBruto () {
		return (this.salario + this.comision);
	} 
	
	
	public double salarioMensual (int meses) {
		return (salario/meses);
	}
	
	public String literalSexo () {
		if (this.genero=='H')
			return "Hombre";
		else
			return "Mujer";
	}
	
	public  String obtenerEmail () {
		
		char inicial;
		inicial = (this.nombre.charAt(0));
		return (inicial + this.apellidos.split(" ")[0]).toLowerCase();	}



	public String nombreCompleto () {
		return ( this.nombre +" " +  this.apellidos );
	}

}
