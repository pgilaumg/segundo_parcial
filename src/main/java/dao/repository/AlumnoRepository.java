package dao.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import model.Alumno;

@ApplicationScoped
public class AlumnoRepository implements PanacheRepositoryBase<Alumno, Integer> {

}
