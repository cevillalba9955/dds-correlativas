package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private final Alumno solicitante;
    private final List<Materia> materiasACursar = new ArrayList<>();

    public Inscripcion(Alumno alumno) {
        this.solicitante = alumno;
    }

    public void inscribirMateria(Materia materia){
        this.materiasACursar.add(materia);
    }

    public Boolean aprobada() {
        return materiasACursar.stream()
                .allMatch(solicitante::puedeCursar);
    }
}