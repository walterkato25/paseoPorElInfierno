package com.despegar.university.tp02demonios;


public class Zafari implements Visitor {
    private Lugar lugar;
    private int porcentaje;

    public Zafari(Lugar lugar, int porcentaje) {
        this.lugar = lugar;
        this.porcentaje = porcentaje;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public int getPorcentaje() {
        return this.porcentaje;
    }

    public boolean ejecutarMision(Demonio demonio){
        int cantAlmasCazables = this.lugar.almasCazables(demonio).size();
        int cantidadACazar = this.getPorcentaje() * this.getLugar().getAlmas().size()/100;
        return (cantAlmasCazables > cantidadACazar );
    }
}
