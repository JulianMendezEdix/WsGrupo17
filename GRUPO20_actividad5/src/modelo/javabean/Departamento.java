/*
 ***********************************************************************************************
 * 
 * AD-5. Tarea en equipo. Interrelación entre clases.
 * Programación 1ºDAW EDIX 2023
 * GRUPO 20
 * Autores: Julián Méndez Podadera.
 * 
 **^*******************************************************************************************
 * 
 * Descripcion:
 * Esta es la clase Departamento propuesta en la actividad.
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

public class Departamento {
	
	// Atributos de objeto
	
	private int idDepar;
	private String descripcion;
	private Localidad localidad;
	
	// Métodos constructor vacío y completo
	
	public Departamento() {
		super();
	}

	public Departamento(int idDepar, String descripcion, Localidad localidad) {
		super();
		this.idDepar = idDepar;
		this.descripcion = descripcion;
		this.localidad = localidad;
	}

	// Getter and Setter
	
	public int getIdDepar() {
		return idDepar;
	}

	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	// Redefinir métodos de object

	@Override
	public String toString() {
		return "Departamento [idDepar=" + idDepar + ", descripcion=" + descripcion + ", localidad=" + localidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Departamento))
			return false;
		Departamento other = (Departamento) obj;
		return idDepar == other.idDepar;
	}

}
