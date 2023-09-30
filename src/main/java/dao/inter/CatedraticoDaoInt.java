package dao.inter;

import java.util.List;

import model.Catedratico;

public interface CatedraticoDaoInt {
    
    public List<Catedratico> getCatedratico();

    public Catedratico createCatedratico(Catedratico catedratico);

    public Catedratico updateCatedratico(Catedratico catedratico);

    public Catedratico deleteCatedratico(Integer codigo_catedratico);
}
