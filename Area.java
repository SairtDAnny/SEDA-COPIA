
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Area {
    
     @Id
    //declaracion de variables
    @Column(name="idareat")
    private String idareat;
    @Column(name="descripciont")
    private String descripciont;

    public Area() {
    }

    public String getIdareat() {
        return idareat;
    }

    public void setIdareat(String idareat) {
        this.idareat = idareat;
    }

    public String getDescripciont() {
        return descripciont;
    }

    public void setDescripciont(String descripciont) {
        this.descripciont = descripciont;
    } 
}
