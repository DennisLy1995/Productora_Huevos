package com.productora.huevos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fincas")
public class Fincas {

	
	@Id
	private int codigo_Finca;
	@Column
	private String nombre;
	@Column
	private String direccion;
	@Column
	private String telefono;
	@Column
	private int espacioTotal;
	@Column
	private int espacioConstruido;
	@Column
	private int espacioGallinas;
	@Column
	private int capacidadBodega;
	
	
	
	public Fincas() {}
	
	public Fincas(int codigoFinca, String nombre, String direccion, String telefono, int espacioTotal,
			int espacioConstruido, int espacioGallinas, int capacidadBodega) {
		super();
		this.codigo_Finca = codigoFinca;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.espacioTotal = espacioTotal;
		this.espacioConstruido = espacioConstruido;
		this.espacioGallinas = espacioGallinas;
		this.capacidadBodega = capacidadBodega;
	}
	
	
	//Gets and sets.
	
	
	public int getCodigo_Finca() {
		return codigo_Finca;
	}
	public void setCodigo_Finca(int codigoFinca) {
		this.codigo_Finca = codigoFinca;
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
