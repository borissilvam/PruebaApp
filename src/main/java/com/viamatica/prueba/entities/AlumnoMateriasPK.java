package com.viamatica.prueba.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AlumnoMateriasPK implements Serializable {
    @Column(name = "id_alumno")
    private Integer idAlumno;
    @Column(name = "id_materia")
    private Integer idMateria;
}
