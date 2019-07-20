package com.productora.huevos.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorMenu {

	@RequestMapping("/index")
	public String paginaPrincipal() {
		return "PaginaPrincipal";
	}
	
	@RequestMapping("/RegistroFinca")
	public String RegistroFinca(){
		return "RegistroFinca";
	}
	
	@RequestMapping("/RegistroEmpleado")
	public String RegistroEmpleado() {
		return "RegistroEmpleado";
	}
	
	@RequestMapping("/ActualizarFinca")
	public String ActualizarFinca() {
		return "ActualizarFinca";
	}
	
	@RequestMapping("/DesactivarCuenta")
	public String DesactivarCuenta() {
		return "DesactivarCuenta";
	}
	
	@RequestMapping("/ListarFincas")
	public String ListarFincas() {
		return "ListarFincas";
	}
	
	@RequestMapping("/RegistrarProduccion")
	public String RegistrarProduccion() {
		return "RegistrarProduccion";
	}
	
	@RequestMapping("/ListarProduccion")
	public String ListarProduccion() {
		return "ListarProduccion";
	}
	
}
