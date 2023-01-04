
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Registro_Entrada_Almacen")
public class RegEntradaAlmEntity {
        public static String fechaActual(){
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
            return formato.format(fecha);
        }
    @Id
    //declaracion de variables
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="identradaoficina")
    
    private String identradaoficina;
    private String idusuario;
    private String idpatrimonio;
    private String talla;
    private int cantidad;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date fechaentrada;
    private String estadoentrada;
    
    //contructores

    public RegEntradaAlmEntity() {
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public RegEntradaAlmEntity(String identradaoficina, String idusuario, String idpatrimonio, int cantidad, Date fechaentrada, String estadoentrada) {
        this.identradaoficina = identradaoficina;
        this.idusuario = idusuario;
        this.idpatrimonio = idpatrimonio;
        this.cantidad = cantidad;
        this.fechaentrada = fechaentrada;
        this.estadoentrada = estadoentrada;
    }
    
    //Getter and Setter

    public String getIdentradaoficina() {
        return identradaoficina;
    }

    public void setIdentradaoficina(String identradaoficina) {
        this.identradaoficina = identradaoficina;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdpatrimonio() {
        return idpatrimonio;
    }
    
    public void setIdpatrimonio(String idpatrimonio, String talla) {
        this.idpatrimonio = idpatrimonio;
    }
    
 
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getEstadoentrada() {
        return estadoentrada;
    }

    public void setEstadoentrada(String estadoentrada) {
        this.estadoentrada = estadoentrada;
    }

    public void setIdpatrimonio(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
