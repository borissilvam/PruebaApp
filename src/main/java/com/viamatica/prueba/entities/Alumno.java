package com.viamatica.prueba.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer id;

    private String nombre;

    private String apellido;
    @Column(name = "id_maestro")
    private Integer idMaestro;


    //Relaciones
    @ManyToOne
    @JoinColumn(name = "id_maestro", insertable = false, updatable = false)
    private Maestro maestro;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL)
    private List<AlumnoMaterias> alumnoMaterias;


}
