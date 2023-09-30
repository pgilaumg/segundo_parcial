package dao.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import model.Asignacion;

@ApplicationScoped
public class AsignacionRepository implements PanacheRepositoryBase<Asignacion, Integer> {

}
