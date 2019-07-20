package com.productora.huevos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productora.huevos.domain.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{
	
}
