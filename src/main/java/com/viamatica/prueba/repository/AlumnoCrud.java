package com.viamatica.prueba.repository;

import com.viamatica.prueba.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoCrud extends JpaRepository<Alumno, Integer> {
}
