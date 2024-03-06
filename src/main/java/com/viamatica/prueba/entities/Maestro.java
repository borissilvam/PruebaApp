package com.viamatica.prueba.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "maestros")
public class Maestro {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_maestro")
    private  Integer Id;

    private String nombre;

    private String apellido;

    private String titulo;

    //Relaciones

    @OneToMany(mappedBy = "maestro")
    private List<Alumno> alumnos;
}
