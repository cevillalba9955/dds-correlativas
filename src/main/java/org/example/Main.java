package org.example;

public class Main {
    public static void main(String[] args) {

        Materia analisis = new Materia("Analisis");
        Materia programacion = new Materia("Programacion");
        Materia paradigmas = new Materia("Paradigmas");
        Materia matematicas = new Materia("Matematicas");

        paradigmas.agregarCorrelativa(matematicas);
        programacion.agregarCorrelativa(analisis);

        Alumno cesar = new Alumno("Cesar");
        cesar.agregarMateriaAprobada(analisis);

        Inscripcion inscripcion = new Inscripcion(cesar);
        inscripcion.inscribirMateria(programacion);
        inscripcion.inscribirMateria(paradigmas);

        if (inscripcion.aprobada()) {
            System.out.print("Aprobada!");
        } else {
            System.out.print("Rechazada!");
        }
    }
}