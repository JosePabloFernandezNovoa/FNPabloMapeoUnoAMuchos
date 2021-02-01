package es.albarregas.beans;

import java.io.Serializable;


public class Modulo implements Serializable {

    private Integer idModulo;
    private String denominacion;

    /**
     * @return the idModulo
     */
    public Integer getIdModulo() {
        return idModulo;
    }

    /**
     * @param idModulo the idModulo to set
     */
    public void setIdModulo(Integer idModulo) {
        this.idModulo = idModulo;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    
}
