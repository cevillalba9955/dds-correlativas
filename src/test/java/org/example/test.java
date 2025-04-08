package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMaterias {
    Materia materia_sin_correlativas = new Materia("Analisis");
    Materia materia_con_correlativas = new Materia("Programacion");

    Alumno alumno = new Alumno("Cesar");

    Inscripcion inscripcion = new Inscripcion(alumno);

    @Test
    public void inscripcion_a_materia_sin_correlativas() {
        inscripcion.inscribirMateria(materia_sin_correlativas);
        Assertions.assertEquals(true, inscripcion.aprobada());
    }

    @Test
    public void inscripcion_a_materia_con_correlativa_NO_aprobadas() {
        // Arrange
        materia_con_correlativas.agregarCorrelativa(materia_sin_correlativas);
        inscripcion.inscribirMateria(materia_con_correlativas);
        Assertions.assertEquals(false, inscripcion.aprobada());
    }

    @Test
    public void inscripcion_a_materia_con_correlativa_aprobadas() {
        // Arrange
        materia_con_correlativas.agregarCorrelativa(materia_sin_correlativas);
        alumno.agregarMateriaAprobada(materia_sin_correlativas);
        inscripcion.inscribirMateria(materia_con_correlativas);
        Assertions.assertEquals(true, inscripcion.aprobada());
    }
}