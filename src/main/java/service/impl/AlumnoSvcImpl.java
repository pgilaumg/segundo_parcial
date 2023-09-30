package service.impl;

import java.util.List;

import dao.inter.AlumnoDaoInt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Alumno;
import model.ResponseApi;
import service.inter.AlumnoSvcInt;

@ApplicationScoped
public class AlumnoSvcImpl implements AlumnoSvcInt {

    @Inject
    AlumnoDaoInt dao;

    @Override
    public ResponseApi getAlumnos() {
        try {
            List<Alumno> alumnos = dao.getAlumnos();
            if (alumnos.isEmpty()) {
                return new ResponseApi("No hay alumnos", 404, alumnos);
            } else {
                return new ResponseApi("Successfull Query", 200, alumnos);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi createAlumno(Alumno alumno) {
        try {
            Alumno alumnoRes = dao.createAlumno(alumno);
            if (alumnoRes == null) {
                return new ResponseApi("Alumno no creado", 404, null);
            } else {
                return new ResponseApi("Alumno creado", 200, alumnoRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi updateAlumno(Alumno alumno) {
        try {
            Alumno alumnoRes = dao.updateAlumno(alumno);
            if (alumnoRes == null) {
                return new ResponseApi("Alumno no actualizado", 404, null);
            } else {
                return new ResponseApi("Alumno actualizado", 200, alumno);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi deleteAlumno(Integer carnet) {
        try {
            Alumno alumnoRes = dao.deleteAlumno(carnet);
            if (alumnoRes == null) {
                return new ResponseApi("Alumno no eliminado", 404, null);
            } else {
                return new ResponseApi("Alumno eliminado", 200, alumnoRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }

    }

}
