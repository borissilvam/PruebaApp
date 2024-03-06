package com.viamatica.prueba.service;

import com.viamatica.prueba.entities.Maestro;
import com.viamatica.prueba.repository.MaestroCrud;
import com.viamatica.prueba.repository.MateriaCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestroService {
    @Autowired
    private MaestroCrud maestroCrud;

    public List<Maestro> getAll(){
        return  maestroCrud.findAll();
    }

    public Maestro save(Maestro maestro){
        return  maestroCrud.save(maestro);
    }

    public void delete(int idMaestro){
        maestroCrud.deleteById(idMaestro);
    }
}
