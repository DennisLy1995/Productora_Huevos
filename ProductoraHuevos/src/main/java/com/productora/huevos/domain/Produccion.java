package com.productora.huevos.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Producciondiaria")
public class Produccion {

	@Id
	private int codigo;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="codigo_Finca")
	private int codigo_Finca;
	
	
	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	public String getCreatedAsShort() {
	return format.format(fecha);
	}
	
	public Produccion() {}
	
	public Produccion(int codigo, int cantidad, Date fecha, int codigoFinca) {
		super();
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.codigo_Finca = codigoFinca;
	}
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
	public int getCodigo_Finca() {
		return codigo_Finca;
	}
	public void setCodigo_Finca(int codigoFinca) {
		this.codigo_Finca = codigoFinca;
	}
	
	
	
	
	
}
