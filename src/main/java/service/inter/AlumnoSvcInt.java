package service.inter;

import model.Alumno;
import model.ResponseApi;

public interface AlumnoSvcInt {

    public ResponseApi getAlumnos();

    public ResponseApi createAlumno(Alumno alumno);

    public ResponseApi updateAlumno(Alumno alumno);

    public ResponseApi deleteAlumno(Integer carnet);

}
