package com.viamatica.prueba.repository;

import com.viamatica.prueba.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaCrud extends JpaRepository<Materia, Integer> {
}
