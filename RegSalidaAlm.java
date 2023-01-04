
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegSalidaAlm {
    @Id
    //declaracion de variables
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="_codigo")
    private String idsalidaoficina;
    @Column(name="_usuario")
    private String usuario;
    @Column(name="_colaborador")
    private String colaborador;
    @Column(name="_patrimonio")
    private String patrimonio;
     @Column(name="_talla")
    private String talla;
    @Column(name="_cantidad")
    private int cantidad;
    @Column(name="estadosalida")
    private String estadosalida;
    
    @Column(name="fechasalida")
    private Date fechasalida;
    @Column(name="fechaprirenovacion")
    private Date fechaprirenovacion;
    @Column(name="fechasegrenovacion")
    private Date fechasegrenovacion;

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Date getFechaprirenovacion() {
        return fechaprirenovacion;
    }

    public void setFechaprirenovacion(Date fechaprirenovacion) {
        this.fechaprirenovacion = fechaprirenovacion;
    }

    public Date getFechasegrenovacion() {
        return fechasegrenovacion;
    }

    public void setFechasegrenovacion(Date fechasegrenovacion) {
        this.fechasegrenovacion = fechasegrenovacion;
    }
   
    
    
    
    
    
    
    /*@Column(name="fechasalida")
    private Date fechasalida;
    @Column(name="fechaprirenovacion")
    private Date fechaprirenovacion;
    @Column(name="fechasegrenovacion")
    private Date fechasegrenovacion;*/
    

    public RegSalidaAlm() {
    }
    
    
    //Getter and Setter
    
    public String getIdsalidaoficina() {
        return idsalidaoficina;
    }

    public void setIdsalidaoficina(String idsalidaoficina) {
        this.idsalidaoficina = idsalidaoficina;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
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

    public String getEstadosalida() {
        return estadosalida;
    }

    public void setEstadosalida(String estadosalida) {
        this.estadosalida = estadosalida;
    }
    
    
    
}
