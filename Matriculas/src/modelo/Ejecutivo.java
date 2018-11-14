/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author isaias sanchez
 */
public class Ejecutivo {
    
    private String nombre;
    private int cargaTrabajo;
    
    
    public Ejecutivo(){}
    
    public Ejecutivo(String ejecutivo,int trabajo)
    {
      this.nombre = ejecutivo;
      this.cargaTrabajo= trabajo;
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(int cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }
    
    
}
