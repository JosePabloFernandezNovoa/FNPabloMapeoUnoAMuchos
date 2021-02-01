/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author jp-9
 */
public class Ciclo implements Serializable{
    private Integer idCiclo;
    private String nombre;
    private List<Modulo> modulos;

    /**
     * @return the idCiclo
     */
    public Integer getIdCiclo() {
        return idCiclo;
    }

    /**
     * @param idCiclo the idCiclo to set
     */
    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the modulos
     */
    public List<Modulo> getModulos() {
        return modulos;
    }

    /**
     * @param modulos the modulos to set
     */
    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    
 
    
}
