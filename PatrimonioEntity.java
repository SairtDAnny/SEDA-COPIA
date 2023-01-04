
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patrimonio")
public class PatrimonioEntity {
        
    @Id
    //declaracion de variables
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idpatrimonio")
    private String idpatrimonio;
    private String descripcionpatrimonio;
    private int stock;
    private String talla;
    private String unidadmedida;
    private String retorno;

    //Cosntructor 

    public PatrimonioEntity() {
    }

    public PatrimonioEntity(String idpatrimonio, String descripcionpatrimonio, int stock, String talla, String unidadmedida, String retorno) {
        this.idpatrimonio = idpatrimonio;
        this.descripcionpatrimonio = descripcionpatrimonio;
        this.stock = stock;
        this.talla = talla;
        this.unidadmedida = unidadmedida;
        this.retorno = retorno;
    }
    //Getter nad Setter

    public String getIdpatrimonio() {
        return idpatrimonio;
    }

    public void setIdpatrimonio(String idpatrimonio) {
        this.idpatrimonio = idpatrimonio;
    }

    public String getDescripcionpatrimonio() {
        return descripcionpatrimonio;
    }

    public void setDescripcionpatrimonio(String descripcionpatrimonio) {
        this.descripcionpatrimonio = descripcionpatrimonio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
    
    
    
}
