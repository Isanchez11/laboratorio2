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
public class Carrera {
    private String codigoCarrera;
    private String nombreCarrera;
    private double valorMatricula;

    
    public Carrera()
    {        
    }
    
    public Carrera(String codigo, String nombre,double valor)
    {
      this.codigoCarrera=codigo;
      this.nombreCarrera= nombre;
      this.valorMatricula= valor;
    }
    
    
    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    
}
