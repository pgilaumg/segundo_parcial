package dao.inter;

import java.util.List;

import model.Curso;

public interface CursoDaoInt {

    public List<Curso> getCurso();

    public Curso createCurso(Curso curso);

    public Curso updateCurso(Curso curso);

    public Curso deleteCurso(Integer id_curso);
}
