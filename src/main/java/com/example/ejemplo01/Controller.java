package com.example.ejemplo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/ejemplo01/personas")
public class Controller {

    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona>findAll(){
        return service.findAll();
    }

    @PostMapping
    public Persona add(@RequestBody Persona p){
        return service.add(p);
    }
}
