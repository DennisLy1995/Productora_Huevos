package com.productora.huevos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleados {

	@Id
	private int cedula;
	@Column
	private String nombre;
	@Column
	private String tipo;
	@Column
	private String condicion;
	@Column
	@JoinColumn
	private int codigo_Finca;
	
	
	public Empleados() {}
	
	public Empleados(int cedula, String nombre, String tipo, String condicion, int codigoFinca) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.tipo = tipo;
		this.condicion = condicion;
		this.codigo_Finca = codigoFinca;
	}
	
	//Gets and sets.
	
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public int getCodigo_Finca() {
		return codigo_Finca;
	}
	public void setCodigo_Finca(int codigoFinca) {
		this.codigo_Finca = codigoFinca;
	}
	
	
	
}
