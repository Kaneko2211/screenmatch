package com.aluracursos.screematch.calculos;

import com.aluracursos.screematch.modelos.Pelicula;
import com.aluracursos.screematch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
