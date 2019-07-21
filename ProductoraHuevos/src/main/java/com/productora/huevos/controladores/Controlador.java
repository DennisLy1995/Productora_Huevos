package com.productora.huevos.controladores;

import java.util.ArrayList;
import java.util.Date;
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
import com.productora.huevos.domain.Produccion;
import com.productora.huevos.repository.EmpleadosRepository;
import com.productora.huevos.repository.EmpleadosRepositoryCustom;
import com.productora.huevos.repository.FincasRepository;
import com.productora.huevos.repository.ProduccionRepository;


@Controller
public class Controlador {
	
	@Autowired
	private EmpleadosRepository repoE;
	@Autowired
	private EmpleadosRepositoryCustom repoEC;
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
		List<Fincas> fincas = repoF.findAll();
		Fincas finca = new Fincas();
		finca.setCodigo_Finca(fincas.size()+1);
		model.addAttribute("finca", finca);
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
	
	
	@RequestMapping("/ActualizarEmpleado/{cedula}")
	public String ActualizarEmpleado(Model model, @PathVariable(value="cedula") int id ) {
		Optional<Empleados> empleado = repoE.findById(id);
		model.addAttribute("empleado", empleado);
		return "ActualizarEmpleado";
	}
	
	@RequestMapping("/EmpleadoActualizado")
	public String EmpleadoActualizada(@Valid Empleados empleado) {
		try {
			repoE.save(empleado);
			return "ListarEmpleados";
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
	
	
	@RequestMapping("/ListarEmpleados/{codigo_Finca}")
	public String ListarEmpleados(Model model, @PathVariable(value="codigo_Finca") int id) {
		List<Empleados> lista = repoE.findAll();
		List<Empleados> listaRetorno = new ArrayList<Empleados>();
		for(Empleados e: lista) {
			if(e.getCodigo_Finca() == id && e.getCondicion().equals("Activo")) {
				listaRetorno.add(e);
			}
		}
		model.addAttribute("empleados", listaRetorno);
		return "ListarEmpleados";
	}
	
	
	@RequestMapping("/RegistrarProduccion")
	public String RegistrarProduccion(Model model) {
		List<Fincas> fincas = repoF.findAll();
		Produccion produccion = new Produccion();
		produccion.setCodigo(repoP.findAll().size()+1);
		model.addAttribute("produccion", produccion);
		model.addAttribute("fincas", fincas);
		return "RegistrarProduccion";
	}
	
	@RequestMapping("/ListarProduccion")
	public String ListarProduccion(Model model) {
		
		List<Produccion> registros = repoP.findAll();
		List<Produccion> registrosRetorno = new ArrayList<Produccion>();

		for(Produccion p: registros) {
			if(p.getFecha().getMonth() == (new Date()).getMonth()) {
				registrosRetorno.add(p);
			}
		}
		model.addAttribute("registros", registrosRetorno);
		return "ListarProduccion";
	}
	
	@RequestMapping("/ProduccionRegistrado")
	public String ProduccionRegistrado(@Valid Produccion produccion) {
		try {
			repoP.save(produccion);
			return "PaginaPrincipal";
		}catch(Exception e) {
			System.out.println(e.toString());
			return "Error";
		}
		
	}
	
}
