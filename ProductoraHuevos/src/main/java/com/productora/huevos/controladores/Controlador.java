package com.productora.huevos.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productora.huevos.domain.Empleados;
import com.productora.huevos.domain.Fincas;
import com.productora.huevos.repository.EmpleadosRepository;
import com.productora.huevos.repository.FincasRepository;
import com.productora.huevos.repository.ProduccionRepository;


@Controller
public class Controlador {
	
	@Autowired
	private EmpleadosRepository repoE;
	private FincasRepository repoF;
	private ProduccionRepository repoP;

	@RequestMapping("/index")
	public String paginaPrincipal() {
		return "PaginaPrincipal";
	}
	
	@RequestMapping("/RegistroFinca")
	public String RegistroFinca(Model model){
		model.addAttribute("finca", new Fincas());
		return "RegistroFinca";
	}
	
	@RequestMapping("/FincaRegistrada")
	public String FincaRegistrada(@Valid Fincas finca, BindingResult result) {
		repoF.saveAndFlush(finca);
		return "FincaRegistrada";
	}
	
	@RequestMapping("/RegistroEmpleado")
	public String RegistroEmpleado(Model model) {
		model.addAttribute("empleado", new Empleados());
		return "RegistroEmpleado";
	}
	
	@RequestMapping("/EmpleadoRegistrado")
	public String EmpleadoRegistrado(@Valid Empleados empleado) {
		repoE.save(empleado);
		return "EmpleadoRegistrado";
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
