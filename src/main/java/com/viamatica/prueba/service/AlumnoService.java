package com.viamatica.prueba.service;

import com.viamatica.prueba.entities.Alumno;
import com.viamatica.prueba.repository.AlumnoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoCrud alumnoCrud ;

    public List<Alumno> getAll(){
        return alumnoCrud.findAll();
    }

    public Alumno save(Alumno alumno){
        return alumnoCrud.save(alumno);
    }

    public void delete(int idAlumno){
        alumnoCrud.deleteById(idAlumno);
    }
}
