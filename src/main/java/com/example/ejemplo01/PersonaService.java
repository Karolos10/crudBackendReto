package com.example.ejemplo01;

import java.util.List;

public interface PersonaService {

    List<Persona>findAll();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona P);
    Persona delete(int id);
}
