package dao.impl;

import java.util.List;

import dao.inter.CursoDaoInt;
import dao.repository.CursoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Curso;

@ApplicationScoped
public class CursoDaoImpl implements CursoDaoInt {
    @Inject
    CursoRepository repository;

    @Override
    public List<Curso> getCurso() {
        return repository.listAll();
    }

    @Override
    public Curso createCurso(Curso curso) {
        repository.persist(curso);
        return curso;
    }

    @Override
    public Curso updateCurso(Curso curso) {
        Curso cursoFind = repository.findById(curso.getId_curso());
        if (!cursoFind.equals(null)) {
            cursoFind.setTitulo(curso.getTitulo());
            cursoFind.setNum_max_alumnos(curso.getNum_max_alumnos());
            cursoFind.setCodigo_catedratico(curso.getCodigo_catedratico());
            cursoFind.setAlumnos_asignados(curso.getAlumnos_asignados());
            repository.persistAndFlush(cursoFind);
            return cursoFind;
        } else {
            return null;
        }

    }

    @Override
    public Curso deleteCurso(Integer id_curso) {
        Curso cursoFind = repository.findById(id_curso);
        if (!cursoFind.equals(null)) {
            repository.delete(cursoFind);
            return cursoFind;
        } else {
            return null;
        }

    }
}
