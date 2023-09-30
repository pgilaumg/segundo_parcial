package dao.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import model.Catedratico;

@ApplicationScoped
public class CatedraticoRepository implements PanacheRepositoryBase<Catedratico, Integer> {
    
}
