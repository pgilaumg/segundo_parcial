package service.impl;

import java.util.List;

import dao.inter.CatedraticoDaoInt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Catedratico;
import model.ResponseApi;
import service.inter.CatedraticoSvcInt;

@ApplicationScoped
public class CatedraticoSvcImpl implements CatedraticoSvcInt{
    @Inject
    CatedraticoDaoInt dao;

    @Override
    public ResponseApi getCatedratico() {
        try {
            List<Catedratico> catedraticos = dao.getCatedratico();
            if(catedraticos.isEmpty()){
                return new ResponseApi("No hay catedraticos", 404, catedraticos);
            }else{
                return new ResponseApi("Successfull Query", 200, catedraticos);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
}

    @Override
    @Transactional
    public ResponseApi createCatedratico(Catedratico catedratico) {
        try {
            Catedratico catedraticoRes = dao.createCatedratico(catedratico);
            if (catedraticoRes == null) {
                return new ResponseApi("Catedratico no creado", 404, null);
            } else {
                return new ResponseApi("Catedratico creado", 200, catedraticoRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi updateCatedratico(Catedratico catedratico) {
        try {
            Catedratico catedraticoRes = dao.updateCatedratico(catedratico);
            if (catedraticoRes == null) {
                return new ResponseApi("Catedratico no actualizado", 404, null);
            } else {
                return new ResponseApi("Catedratico actualizado", 200, catedraticoRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi deleteCatedratico(Integer codigo_catedratico) {
        try {
            Catedratico asignacionRes = dao.deleteCatedratico(codigo_catedratico);
            if (asignacionRes == null) {
                return new ResponseApi("Catedratico no eliminado", 404, null);
            } else {
                return new ResponseApi("Catedratico eliminado", 200, asignacionRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }

    }

}
