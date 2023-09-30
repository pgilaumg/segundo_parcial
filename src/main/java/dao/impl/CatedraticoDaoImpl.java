package dao.impl;

import java.util.List;

import dao.inter.CatedraticoDaoInt;
import dao.repository.CatedraticoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Catedratico;

@ApplicationScoped
public class CatedraticoDaoImpl implements CatedraticoDaoInt{
     @Inject
    CatedraticoRepository repository;

    @Override
    public List<Catedratico> getCatedratico() {
        return repository.listAll();
    }

    @Override
    public Catedratico createCatedratico(Catedratico catedratico) {
        repository.persist(catedratico);
        return catedratico;
    }

    @Override
    public Catedratico updateCatedratico(Catedratico catedratico) {
        Catedratico catedraticoFind = repository.findById(catedratico.getCodigo_catedratico());
        if (!catedraticoFind.equals(null)) {
            catedraticoFind.setCodigo_catedratico(catedratico.getCodigo_catedratico());
            catedraticoFind.setNombre(catedratico.getNombre());
            catedraticoFind.setDireccion(catedratico.getDireccion());
            catedraticoFind.setTelefono(catedratico.getTelefono());
            catedraticoFind.setProfesion(catedratico.getProfesion());
            repository.persistAndFlush(catedraticoFind);
            return catedraticoFind;
        } else {
            return null;
        }

    }

    @Override
    public Catedratico deleteCatedratico(Integer codigo_catedratico) {
        Catedratico catedraticoFind = repository.findById(codigo_catedratico);
        if (!catedraticoFind.equals(null)) {
            repository.delete(catedraticoFind);
            return catedraticoFind;
        } else {
            return null;
        }

    }
}
