package com.viamatica.prueba.repository;

import com.viamatica.prueba.entities.Maestro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaestroCrud extends JpaRepository<Maestro, Integer> {
}
