package com.example.ejemplo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
