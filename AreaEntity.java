package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class AreaEntity {
    @Id
    //declaracion de variables
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idarea")
    private String idArea;
    @Column(name="descripcion")
    private String descripcion;
    //constructor

    public AreaEntity(String idArea, String descripcion) {
        this.idArea = idArea;
        this.descripcion = descripcion;
    }

    public AreaEntity() {
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   /* @OneToMany(mappedBy = "idarea")
    private List<ColaboradorEntity> colaborador;*/

    /*public List<ColaboradorEntity> getColaborador() {
        return colaborador;
    }

    public void setColaborador(List<ColaboradorEntity> colaborador) {
        this.colaborador = colaborador;
    }*/

   /* public AreaEntity(String idArea, String descripcion, List<ColaboradorEntity> colaborador) {
        this.idArea = idArea;
        this.descripcion = descripcion;
        this.colaborador = colaborador;
    }*/
    
    
    
}
