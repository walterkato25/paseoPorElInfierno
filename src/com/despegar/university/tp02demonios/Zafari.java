package com.despegar.university.tp02demonios;

import java.util.List;

public class Zafari implement Visitor {
    Lugar lugar;
    int porcentaje;

    public Zafari(Lugar lugar, int porcentaje) {
        this.lugar = lugar;
        this.porcentaje = porcentaje;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public boolean ejecutarMision(Demonio demonio){
        int cantAlmasCazables = this.lugar.almasCazables(demonio).size();
        int cantidadACazar = (this.getPorcentaje() * this.getLugar().getAlmas())/100;
        return (cantAlmasCazables > cantidadACazar )
    }
}
