package service.inter;

import model.Catedratico;
import model.ResponseApi;

public interface CatedraticoSvcInt {
    
    public ResponseApi getCatedratico();

    public ResponseApi createCatedratico(Catedratico catedratico);

    public ResponseApi updateCatedratico(Catedratico catedratico);

    public ResponseApi deleteCatedratico(Integer codigo_catedratico);
}
