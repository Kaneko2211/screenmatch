package com.aluracursos.screematch.modelos;

import com.aluracursos.screematch.calculos.Clasificacion;
import com.sun.jdi.event.ClassPrepareEvent;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if(totalVisualizaciones > 100){
            return 4;
        }else{
            return 2;
        }

    }
}
