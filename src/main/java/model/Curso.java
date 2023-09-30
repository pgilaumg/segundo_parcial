package model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso", schema = "segundo-parcial")
public class Curso implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Integer id_curso;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "num_max_alumnos")
    private Integer num_max_alumnos;
    @Column(name = "codigo_catedratico")
    private Integer codigo_catedratico;
    @Column(name = "alumnos_asignados")
    private Integer alumnos_asignados;

    public Curso(){
        
    }
    public Curso(Integer id_curso, String titulo, Integer num_max_alumnos, Integer codigo_catedratico,
            Integer alumnos_asignados) {
        this.id_curso = id_curso;
        this.titulo = titulo;
        this.num_max_alumnos = num_max_alumnos;
        this.codigo_catedratico = codigo_catedratico;
        this.alumnos_asignados = alumnos_asignados;
    }
    public Integer getId_curso() {
        return id_curso;
    }
    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getNum_max_alumnos() {
        return num_max_alumnos;
    }
    public void setNum_max_alumnos(Integer num_max_alumnos) {
        this.num_max_alumnos = num_max_alumnos;
    }
    public Integer getCodigo_catedratico() {
        return codigo_catedratico;
    }
    public void setCodigo_catedratico(Integer codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }
    public Integer getAlumnos_asignados() {
        return alumnos_asignados;
    }
    public void setAlumnos_asignados(Integer alumnos_asignados) {
        this.alumnos_asignados = alumnos_asignados;
    }


}
