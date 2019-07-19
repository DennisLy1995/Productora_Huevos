package com.productora.huevos.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorMenu {

	@RequestMapping("/index")
	public String paginaPrincipal() {
		return "PaginaPrincipal";
	}
	
}
