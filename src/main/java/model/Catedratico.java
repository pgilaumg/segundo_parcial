package model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * Catedratico
 */
@Entity
@Table(name = "catedratico", schema = "segundo-parcial")
public class Catedratico  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_catedratico")
    private Integer codigo_catedratico;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "profesion")
    private String profesion;

    public Catedratico(){
        
    }
    public Catedratico(Integer codigo_catedratico, String nombre, String direccion, String telefono, String profesion) {
        this.codigo_catedratico = codigo_catedratico;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }
    public Integer getCodigo_catedratico() {
        return codigo_catedratico;
    }
    public void setCodigo_catedratico(Integer codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}