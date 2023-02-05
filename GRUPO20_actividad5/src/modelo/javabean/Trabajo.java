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
 * Esta es la clase Trabajo propuesta en la actividad.
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

public class Trabajo {
	
	// Atributos de objeto
	
	private String idTrabajo, descripcion;
	private double minSalario, maxSalario;
	
	// Métodos constructor vacío y completo
	
	public Trabajo() {
		super();
	}

	public Trabajo(String idTrabajo, String descripcion, double minSalario, 
			double maxSalario) {
		super();
		this.idTrabajo = idTrabajo;
		this.descripcion = descripcion;
		this.minSalario = minSalario;
		this.maxSalario = maxSalario;
	}

	//Getter and Setter
	
	public String getIdTrabajo() {
		return idTrabajo;
	}

	public void setIdTrabajo(String idTrabajo) {
		this.idTrabajo = idTrabajo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMinSalario() {
		return minSalario;
	}

	public void setMinSalario(double minSalario) {
		this.minSalario = minSalario;
	}

	public double getMaxSalario() {
		return maxSalario;
	}

	public void setMaxSalario(double maxSalario) {
		this.maxSalario = maxSalario;
	}

	// redefinir métodos de Object
	
	@Override
	public String toString() {
		return "Trabajo [idTrabajo=" + idTrabajo + ", descripcion=" + descripcion + 
				", minSalario=" + minSalario + ", maxSalario=" + maxSalario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTrabajo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Trabajo))
			return false;
		Trabajo other = (Trabajo) obj;
		return Objects.equals(idTrabajo, other.idTrabajo);
	}
	
}
