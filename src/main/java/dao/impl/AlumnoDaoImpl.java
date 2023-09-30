package dao.impl;

import java.util.List;

import dao.inter.AlumnoDaoInt;
import dao.repository.AlumnoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Alumno;

@ApplicationScoped
public class AlumnoDaoImpl implements AlumnoDaoInt {
    @Inject
    AlumnoRepository repository;

    @Override
    public List<Alumno> getAlumnos() {
        return repository.listAll();
    }

    @Override
    public Alumno createAlumno(Alumno alumno) {
        repository.persist(alumno);
        return alumno;
    }

    @Override
    public Alumno updateAlumno(Alumno alumno) {
        Alumno alumnoFind = repository.findById(alumno.getCarnet());
        if (!alumnoFind.equals(null)) {
            alumnoFind.setNombre(alumno.getNombre());
            alumnoFind.setDireccion(alumno.getDireccion());
            alumnoFind.setEdad(alumno.getEdad());
            alumnoFind.setTelefono(alumno.getTelefono());
            repository.persistAndFlush(alumnoFind);
            return alumnoFind;
        } else {
            return null;
        }

    }

    @Override
    public Alumno deleteAlumno(Integer carnet) {
        Alumno alumnoFind = repository.findById(carnet);
        if (!alumnoFind.equals(null)) {
            repository.delete(alumnoFind);
            return alumnoFind;
        } else {
            return null;
        }

    }

}
