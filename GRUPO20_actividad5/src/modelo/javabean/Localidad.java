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
 * Esta es la clase Localidad propuesta en la actividad.
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

public class Localidad {
	
	// Atributos de objeto
	
	private int idLocalidad;
	private String direccion;
	private String ciudad;
	private String pais;
	
	// Métodos constructor vacío y completo
	
	public Localidad() {
		super();
	}
	

	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		super();
		this.idLocalidad = idLocalidad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	// Getter and Setter
	
	public int getIdLocalidad() {
		return idLocalidad;
	}


	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}

	// redefinir métodos de Object

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idLocalidad);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Localidad))
			return false;
		Localidad other = (Localidad) obj;
		return idLocalidad == other.idLocalidad;
	}
	
}
