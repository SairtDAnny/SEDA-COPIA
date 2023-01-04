
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.repository.query.Param;

@Entity
public class RegEntradaAlm {
    
    
        
    @Id
    //declaracion de variables
    @Column(name="_codigo")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String identradaoficina;
    
    @Column(name="_usuario")
    private String usuario;
     
    @Column(name="_patrimonio")
    private String patrimonio;
     
    @Column(name="_talla")
        private String talla;
    
    @Column(name="_cantidad")
    private int cantidad;
    
    @Column(name="_estado")
        private String estado;
   
    
    
//constructor
    public RegEntradaAlm() {
    }

    public String getIdentradaoficina() {
        return identradaoficina;
    }

//getter and setter
    public void setIdentradaoficina(String identradaoficina) {
        this.identradaoficina = identradaoficina;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Getter and Setter de la consulta de list

    
    
    

}
