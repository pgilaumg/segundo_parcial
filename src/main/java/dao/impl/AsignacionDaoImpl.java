package dao.impl;

import java.util.List;

import dao.inter.AsignacionDaoInt;
import dao.repository.AsignacionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Asignacion;

@ApplicationScoped
public class AsignacionDaoImpl implements AsignacionDaoInt {
    @Inject
    AsignacionRepository repository;

    @Override
    public List<Asignacion> getAsignacion() {
        return repository.listAll();
    }

    @Override
    public Asignacion createAsignacion(Asignacion asignacion) {
        repository.persist(asignacion);
        return asignacion;
    }

    @Override
    public Asignacion updateAsignacion(Asignacion asignacion) {
        Asignacion asignacionFind = repository.findById(asignacion.getId_asignacion());
        if (!asignacionFind.equals(null)) {
            asignacionFind.setId_asignacion(asignacion.getId_asignacion());
            asignacionFind.setCarnet(asignacion.getCarnet());
            asignacionFind.setId_curso(asignacion.getId_curso());
            repository.persistAndFlush(asignacionFind);
            return asignacionFind;
        } else {
            return null;
        }

    }

    @Override
    public Asignacion deleteAsignacion(Integer id_asignacion) {
        Asignacion asignacionFind = repository.findById(id_asignacion);
        if (!asignacionFind.equals(null)) {
            repository.delete(asignacionFind);
            return asignacionFind;
        } else {
            return null;
        }

    }

}
