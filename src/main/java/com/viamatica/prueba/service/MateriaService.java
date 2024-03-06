package com.viamatica.prueba.service;

import com.viamatica.prueba.entities.Materia;
import com.viamatica.prueba.repository.MateriaCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {
    @Autowired
    private MateriaCrud materiaCrud ;

    public List<Materia> getAll(){
        return  materiaCrud.findAll();
    }

    public Materia save(Materia materia){
        return  materiaCrud.save(materia);
    }

    public void  delete(int idMateria){
        materiaCrud.deleteById(idMateria);
    }
}
