package service.inter;

import model.Asignacion;
import model.ResponseApi;

public interface AsignacionSvcInt {
    public ResponseApi getAsignacion();

    public ResponseApi createAsignacion(Asignacion asignacion);

    public ResponseApi updateAsignacion(Asignacion asignacion);

    public ResponseApi deleteAsignacion(Integer id_asignacion);
}
