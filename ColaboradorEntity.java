
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.servlet.annotation.MultipartConfig;

@Entity
@Table(name="colaborador")
public class ColaboradorEntity implements Serializable{
    
    @Id
    //declaracion de campos de la clase area
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
        private String idcolaborador;
        private String idarea;
        private String nombrecolaborador;
        private String cargo;
    
    
    //constructor

    public ColaboradorEntity() {
    }
    
    //getter and setter

    public String getIdcolaborador() {
        return idcolaborador;
    }

    public void setIdcolaborador(String idcolaborador) {
        this.idcolaborador = idcolaborador;
    }

    public String getIdarea() {
        return idarea;
    }

    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    public String getNombrecolaborador() {
        return nombrecolaborador;
    }

    public void setNombrecolaborador(String nombrecolaborador) {
        this.nombrecolaborador = nombrecolaborador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
 
}
