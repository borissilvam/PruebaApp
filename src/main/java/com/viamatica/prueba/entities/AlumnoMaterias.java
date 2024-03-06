package com.viamatica.prueba.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos_materias")
public class AlumnoMaterias {
    @EmbeddedId
    private AlumnoMateriasPK id;


    //Relaciones
    @MapsId("idAlumno")
    @ManyToOne
    @JoinColumn(name = "id_alumno", insertable = false, updatable = false)
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "id_materia", insertable = false, updatable = false)
    private Materia materia;

}
