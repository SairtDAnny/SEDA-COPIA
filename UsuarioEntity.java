
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioEntity {
    
     @Id
    //declaracion de variables
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String idusuario;
    private String nombreusuario;
    private String usuario;
    private String contraseña;
    
    //constructor

    public UsuarioEntity() {
    }

    public UsuarioEntity(String idusuario, String idarea, String nombreusuario, String usuario, String contraseña) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    //Getter and setter

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }   
}
