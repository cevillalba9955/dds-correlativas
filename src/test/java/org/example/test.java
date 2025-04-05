package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMaterias {
    Materia analisis = new Materia("Analisis");
    Materia programacion = new Materia("Programacion");
    Materia paradigmas = new Materia("Paradigmas");
    Materia matematicas = new Materia("Matematicas");
    Materia ciencias = new Materia("Ciencias");
    Materia fisica = new Materia("Fisica");
    Materia quimica = new Materia("Quimica");

    Alumno cesar = new Alumno("Cesar");

    @Test
    public void inscripcionAprobada() {
        // Arrange
        paradigmas.agregarCorrelativa(matematicas);
        programacion.agregarCorrelativa(analisis);
        cesar.agregarMateriaAprobada(analisis);

        Inscripcion inscripcion = new Inscripcion(cesar);
        inscripcion.inscribirMateria(programacion);

        Assertions.assertEquals(true, inscripcion.aprobada());
    }
    @Test
    public void inscripcionRechazada() {
        // Arrange
        paradigmas.agregarCorrelativa(matematicas);
        programacion.agregarCorrelativa(analisis);
        cesar.agregarMateriaAprobada(analisis);

        Inscripcion inscripcion = new Inscripcion(cesar);
        inscripcion.inscribirMateria(programacion);
        inscripcion.inscribirMateria(paradigmas);

        Assertions.assertEquals(false, inscripcion.aprobada());
    }
}