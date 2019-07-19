package com.productora.huevos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fincas")
public class Fincas {

	
	@Id
	private int codigoFinca;
	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="espacioTotal")
	private int espacioTotal;
	@Column(name="espacioConstruido")
	private int espacioConstruido;
	@Column(name="espacioGallinas")
	private int espacioGallinas;
	@Column(name="capacidadBodega")
	private int capacidadBodega;
	
	
	
	//Gets and sets.
	
	public int getCodigoFinca() {
		return codigoFinca;
	}
	public void setCodigoFinca(int codigoFinca) {
		this.codigoFinca = codigoFinca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEspacioTotal() {
		return espacioTotal;
	}
	public void setEspacioTotal(int espacioTotal) {
		this.espacioTotal = espacioTotal;
	}
	public int getEspacioConstruido() {
		return espacioConstruido;
	}
	public void setEspacioConstruido(int espacioConstruido) {
		this.espacioConstruido = espacioConstruido;
	}
	public int getEspacioGallinas() {
		return espacioGallinas;
	}
	public void setEspacioGallinas(int espacioGallinas) {
		this.espacioGallinas = espacioGallinas;
	}
	public int getCapacidadBodega() {
		return capacidadBodega;
	}
	public void setCapacidadBodega(int capacidadBodega) {
		this.capacidadBodega = capacidadBodega;
	}
	
	
	
	
	
}
