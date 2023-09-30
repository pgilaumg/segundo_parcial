package dao.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import model.Curso;

@ApplicationScoped
public class CursoRepository implements PanacheRepositoryBase<Curso, Integer> {
    
}
