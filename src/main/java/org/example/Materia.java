package org.example;

import java.util.List;
import java.util.ArrayList;

public class Materia {
    private final String nombre;
    private final List<Materia> correlativas = new ArrayList<>();

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public String getNombre() {
        return nombre;
    }
}


