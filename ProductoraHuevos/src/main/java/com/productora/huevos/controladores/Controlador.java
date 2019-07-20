package com.productora.huevos.controladores;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@Autowired
	private FincasRepository repoF;
	@Autowired
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
	public String FincaRegistrada(@Valid Fincas finca) {
		try {
			repoF.save(finca);
			return "FincaRegistrada";
		}catch(Exception e) {
			System.out.println(e.toString());
			return "Error";
		}
	}
	
	@RequestMapping("/RegistroEmpleado")
	public String RegistroEmpleado(Model model) {
		List<Fincas> fincas = repoF.findAll();
		model.addAttribute("empleado", new Empleados());
		model.addAttribute("fincas", fincas);
		return "RegistroEmpleado";
	}
	
	@RequestMapping("/EmpleadoRegistrado")
	public String EmpleadoRegistrado(@Valid Empleados empleado) {
		try {
			repoE.save(empleado);
			return "EmpleadoRegistrado";
		}catch(Exception e) {
			System.out.println(e.toString());
			return "Error";
		}
		
	}
	
	@RequestMapping("/ActualizarFinca/{codigo_Finca}")
	public String ActualizarFinca(Model model, @PathVariable(value="codigo_Finca") int id ) {
		Optional<Fincas> finca = repoF.findById(id);
		model.addAttribute("finca", finca);
		return "ActualizarFinca";
	}
	
	@RequestMapping("/FincaActualizada")
	public String FincaActualizada(@Valid Fincas finca) {
		try {
			repoF.save(finca);
			return "ListarFincas";
		}catch(Exception e) {
			System.out.println(e.toString());
			return "Error";
		}
	}
	
	@RequestMapping("/DesactivarCuenta")
	public String DesactivarCuenta() {
		return "DesactivarCuenta";
	}
	
	@RequestMapping("/ListarFincas")
	public String ListarFincas(Model model) {
		model.addAttribute("fincas", repoF.findAll());
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
