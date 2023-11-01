package org.example;
import java.time.LocalDate;
public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    //private LocalDate fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        //this.fecha = LocalDate.now();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public boolean aprobada(){
        return !this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno);
    }
}
