package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inscripcion {
    private final Alumno solicitante;
    private List<Materia> materiasACursar;

    public Inscripcion(Alumno alumno) {
        this.solicitante = alumno;
        this.materiasACursar = new ArrayList<>() ;
    }

    public void inscribirMateria(Materia materia){
        this.materiasACursar.add(materia);
    }

    public Boolean aprobada() {
        return materiasACursar.stream()
                .allMatch(solicitante::puedeCursar);
    }
}