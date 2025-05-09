package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

public class Alumno {
    @Getter
    private final String nombre;

    private final List<Materia> aprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.aprobadas = new ArrayList<>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.aprobadas.add(materia);
    }

    public boolean puedeCursar(Materia materia) {
        return this.aprobadas.containsAll(materia.getCorrelativas());
    }
    
    
}
