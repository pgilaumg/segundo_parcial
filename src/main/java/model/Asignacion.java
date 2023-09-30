package model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "asignacion", schema = "segundo-parcial")
public class Asignacion implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion")
    private Integer id_asignacion;
    @Column(name = "carnet")
    private Integer carnet;
    @Column(name = "id_curso")
    private Integer id_curso;

    public Asignacion(){
        
    }
    public Asignacion(Integer id_asignacion, Integer carnet, Integer id_curso) {
        this.id_asignacion = id_asignacion;
        this.carnet = carnet;
        this.id_curso = id_curso;
    }
    public Integer getId_asignacion() {
        return id_asignacion;
    }
    public void setId_asignacion(Integer id_asignacion) {
        this.id_asignacion = id_asignacion;
    }
    public Integer getCarnet() {
        return carnet;
    }
    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }
    public Integer getId_curso() {
        return id_curso;
    }
    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    
    
}
