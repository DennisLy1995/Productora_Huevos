package com.productora.huevos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleados {

	@Id
	private int cedula;
	@Column(name="nombre")
	private String nombre;
	@Column(name="tipo")
	private int tipo;
	@Column(name="condicion")
	private int condicion;
	@Column(name="codigoFinca")
	private int codigoFinca;
	
	
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
	public int getCodigoFinca() {
		return codigoFinca;
	}
	public void setCodigoFinca(int codigoFinca) {
		this.codigoFinca = codigoFinca;
	}
	
	
	
}
