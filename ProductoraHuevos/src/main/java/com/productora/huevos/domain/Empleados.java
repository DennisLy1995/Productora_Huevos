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
	private int tipo;
	@Column
	private int condicion;
	@Column
	@JoinColumn
	private int codigo_Finca;
	
	
	public Empleados() {}
	
	public Empleados(int cedula, String nombre, int tipo, int condicion, int codigoFinca) {
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getCondicion() {
		return condicion;
	}
	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}
	public int getCodigo_Finca() {
		return codigo_Finca;
	}
	public void setCodigo_Finca(int codigoFinca) {
		this.codigo_Finca = codigoFinca;
	}
	
	
	
}
