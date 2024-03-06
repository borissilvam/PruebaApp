package com.viamatica.prueba.controller;

import com.viamatica.prueba.entities.Materia;
import com.viamatica.prueba.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping("/all")
    public List<Materia> getAll(){
        return  materiaService.getAll();
    }
    @PostMapping("/save")
    public Materia save(@RequestBody Materia materia){
        return materiaService.save(materia);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int idMateria){
        materiaService.delete(idMateria);
    }

}
