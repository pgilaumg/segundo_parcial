package service.impl;

import java.util.List;

import dao.inter.AsignacionDaoInt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Asignacion;
import model.ResponseApi;
import service.inter.AsignacionSvcInt;

@ApplicationScoped
public class AsignacionSvcImpl implements AsignacionSvcInt {

    @Inject
    AsignacionDaoInt dao;

    @Override
    public ResponseApi getAsignacion() {
        try {
            List<Asignacion> aignaciones = dao.getAsignacion();
            if (aignaciones.isEmpty()) {
                return new ResponseApi("No hay adignaciones", 404, aignaciones);

            } else {
                return new ResponseApi("Successfull Query", 200, aignaciones);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi createAsignacion(Asignacion asignacion) {
        try {
            Asignacion asignacionRes = dao.createAsignacion(asignacion);
            if (asignacionRes == null) {
                return new ResponseApi("Asignacion no creado", 404, null);
            } else {
                return new ResponseApi("Asignacion creado", 200, asignacionRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi updateAsignacion(Asignacion asignacion) {
        try {
            Asignacion asignacionRes = dao.updateAsignacion(asignacion);
            if (asignacionRes == null) {
                return new ResponseApi("Asignacion no actualizado", 404, null);
            } else {
                return new ResponseApi("Asignacion actualizado", 200, asignacion);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi deleteAsignacion(Integer id_asignacion) {
        try {
            Asignacion asignacionRes = dao.deleteAsignacion(id_asignacion);
            if (asignacionRes == null) {
                return new ResponseApi("Asignacion no eliminado", 404, null);
            } else {
                return new ResponseApi("Asignacion eliminado", 200, asignacionRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }

    }

}
