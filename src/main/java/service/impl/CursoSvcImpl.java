package service.impl;

import java.util.List;

import dao.inter.CursoDaoInt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Catedratico;
import model.Curso;
import model.ResponseApi;
import service.inter.CursoSvcInt;

@ApplicationScoped
public class CursoSvcImpl implements CursoSvcInt {
    @Inject
    CursoDaoInt dao;

    @Override
    public ResponseApi getCurso() {
        try {
            List<Curso> cursos = dao.getCurso();
            if (cursos.isEmpty()) {
                return new ResponseApi("No hay Cursos", 404, cursos);
            } else {
                return new ResponseApi("Successfull Query", 200, cursos);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi createCurso(Curso curso) {
        try {
            Curso cursoRes = dao.createCurso(curso);
            if (cursoRes == null) {
                return new ResponseApi("Curso no creado", 404, null);
            } else {
                return new ResponseApi("Curso creado", 200, cursoRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi updateCurso(Curso curso) {
        try {
            Curso cursoRes = dao.updateCurso(curso);
            if (cursoRes == null) {
                return new ResponseApi("Curso no actualizado", 404, null);
            } else {
                return new ResponseApi("Curso actualizado", 200, curso);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }
    }

    @Override
    @Transactional
    public ResponseApi deleteCurso(Integer id_curso) {
        try {
            Curso cursoRes = dao.deleteCurso(id_curso);
            if (cursoRes == null) {
                return new ResponseApi("Curso no eliminado", 404, null);
            } else {
                return new ResponseApi("Curso eliminado", 200, cursoRes);
            }
        } catch (Exception e) {
            return new ResponseApi("Error", 500, e.getMessage());
        }

    }
}
