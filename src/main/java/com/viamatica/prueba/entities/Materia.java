package com.viamatica.prueba.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private  Integer id;

    private String descripcion;
    private String puntos;




}
