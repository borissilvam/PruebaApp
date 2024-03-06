package com.viamatica.prueba.controller;

import com.viamatica.prueba.entities.Alumno;
import com.viamatica.prueba.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
   @Autowired
    private AlumnoService alumnoService;
    @GetMapping("/all")
   public List<Alumno> getAll(){
       return  alumnoService.getAll();
   }

   @PostMapping("/save")
   public Alumno save(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
   }
   @DeleteMapping("/delete/{id}")
   public void delete(@PathVariable("id") int idAlumno){

   }
}
