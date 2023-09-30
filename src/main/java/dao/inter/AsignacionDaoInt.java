package dao.inter;

import java.util.List;

import model.Asignacion;


public interface AsignacionDaoInt {
    
    public List<Asignacion> getAsignacion();

    public Asignacion createAsignacion(Asignacion asignacion);

    public Asignacion updateAsignacion(Asignacion asignacion);

    public Asignacion deleteAsignacion(Integer id_asignacion);
}
