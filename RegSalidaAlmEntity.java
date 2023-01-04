
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Registro_Salida_Almacen")
public class RegSalidaAlmEntity {
    @Id
    //declaracion de variables
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idsalidaoficina")
    private String idsalidaoficina;
    @Column(name="idusuario")
    private String usuario;
    @Column(name="idcolaborador")
    private String colaborador;
    @Column(name="idpatrimonio")
    private String patrimonio;
    @Column(name="cantidad")
    private int cantidad;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name="fechasalida")
    private Date fechasalida;
     @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name="fechaprirenovacion")
    private Date fechaprirenovacion;
      @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name="fechasegrenovacion")
    private Date fechasegrenovacion;
      
    @Column(name="estadosalida")
    private String estadosalida;
    private String talla;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
    
    
    public RegSalidaAlmEntity() {
    }

    public RegSalidaAlmEntity(String idsalidaoficina, String usuario, String colaborador, String patrimonio, int cantidad, Date fechasalida, Date fechaprirenovacion, Date fechasegrenovacion, String estadosalida) {
        this.idsalidaoficina = idsalidaoficina;
        this.usuario = usuario;
        this.colaborador = colaborador;
        this.patrimonio = patrimonio;
        this.cantidad = cantidad;
        this.fechasalida = fechasalida;
        this.fechaprirenovacion = fechaprirenovacion;
        this.fechasegrenovacion = fechasegrenovacion;
        this.estadosalida = estadosalida;
    }
    
    // getter and Setter

    public String getIdsalidaoficina() {
        return idsalidaoficina;
    }

    public void setIdsalidaoficina(String idsalidaoficina) {
        this.idsalidaoficina = idsalidaoficina;
    }

    public String getIdusuario() {
        return usuario;
    }

    public void setIdusuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdcolaborador() {
        return colaborador;
    }

    public void setIdcolaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getIdpatrimonio() {
        return patrimonio;
    }

    public void setIdpatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

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

    public String getEstadosalida() {
        return estadosalida;
    }

    public void setEstadosalida(String estadosalida) {
        this.estadosalida = estadosalida;
    }
    
    
}
