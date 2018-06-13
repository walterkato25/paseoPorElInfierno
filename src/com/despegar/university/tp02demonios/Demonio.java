package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.List;

abstract public class Demonio {

    private List<Alma> almas = new ArrayList<Alma>();
    private int cantJodidas = 0;
    private int maldad;
    private int limiteValor;

    public Demonio(List<Alma> almas, int maldad, int limiteValor) {
        this.almas = almas;
        this.maldad = maldad;
        this.limiteValor = limiteValor;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    public boolean puedeCazar(Alma alma){
        return (this.maldad > alma.getBondad()); //modificar en breve para que devuelva la comparacion del nivel de  maldad
    };

    public void atormentar(Alma alma){
        alma.descontarBondad();
        this.incrementarAtormentado();
        this.aumentarMaldad();
        this.aplicarCastigo(alma);
    }

    protected abstract void aplicarCastigo(Alma alma);

    public int getLimiteValor() {
        return limiteValor;
    }

    public void aumentarMaldad(){
        this.maldad = this.cantJodidas + this.almas.size() * 2;
    }

    public void incrementarAtormentado(){
        this.cantJodidas = this.cantJodidas + 1;
    }

    public void reducirMaldad(){
        this.setMaldad(this.maldad/10);
    }

    public List<Alma> rendirCuenta(){
        return this.almas;
    }
}
/*
● una condición​ propia de cada tipo de demonio:


○ para los demonios de fuego​, que el alma NO sea friolenta.
 */