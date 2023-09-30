package dao.inter;

import java.util.List;

import model.Alumno;

public interface AlumnoDaoInt {

    public List<Alumno> getAlumnos();

    public Alumno createAlumno(Alumno alumno);

    public Alumno updateAlumno(Alumno alumno);

    public Alumno deleteAlumno(Integer carnet);
}
