package com.productora.huevos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productora.huevos.domain.Produccion;

public interface ProduccionRepository  extends JpaRepository<Produccion, Integer> {

}
