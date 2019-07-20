package com.productora.huevos.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producciondiaria")
public class Produccion {

	@Id
	private int codigo;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="codigoFinca")
	private int codigoFinca;
	
	
	//Gets and sets.
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCodigoFinca() {
		return codigoFinca;
	}
	public void setCodigoFinca(int codigoFinca) {
		this.codigoFinca = codigoFinca;
	}
	
	
	
	
	
}
