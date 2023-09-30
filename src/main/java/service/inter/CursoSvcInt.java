package service.inter;

import model.Curso;
import model.ResponseApi;

public interface CursoSvcInt {
        
    public ResponseApi getCurso();

    public ResponseApi createCurso(Curso curso);

    public ResponseApi updateCurso(Curso curso);

    public ResponseApi deleteCurso(Integer id_curso);
}
