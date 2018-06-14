package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.List;

abstract public class Demonio implements Visitable{

    private List<Alma> almas = new ArrayList<Alma>();
    private int cantJodidas = 0;
    private int maldad;
    private int limiteValor;
    private int id;

    public Demonio(List<Alma> almas, int maldad, int limiteValor, int id) {
        this.almas = almas;
        this.maldad = maldad;
        this.limiteValor = limiteValor;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAlmas(List<Alma> almas) {
        this.almas = almas;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    public boolean puedeCazar(Alma alma){
        return (this.getMaldad() > alma.getBondad()); //modificar en breve para que devuelva la comparacion del nivel de  maldad
    };

    public boolean puedeAtormentar(Alma alma){
        return !(this.puedeCazar(alma));
    }

    public void atormentar(Alma alma){
        alma.descontarBondad();
        this.incrementarAtormentado();
        this.aumentarMaldad();
        this.aplicarCastigo(alma);
    }

    public List<Alma> getAlmas() {
        return almas;
    }

    public void cazar(Lugar lugar){
        List<Alma> almasAux = new ArrayList<Alma>();
        for(Alma alma: lugar.getAlmas()){
            if(this.puedeCazar(alma)){
                almasAux.add(alma);
                this.addAlma(alma);
            }else{
                this.atormentar(alma);
            }
        }
        lugar.getAlmas().removeAll(almasAux);
    }

    public void addAlma(Alma alma){
        this.getAlmas().add(alma);
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

    public int rendirCuenta(){
        int poder = 0;
        for (Alma alma: this.getAlmas()){
            poder = poder + alma.getBondad() + alma.getValor();
        }
        this.setAlmas(new ArrayList<Alma>());
        return poder;
    }

    public boolean aceptarTarea(Visitor mision){
        return mision.ejecutarMision(this);
    }
}
/*
● una condición​ propia de cada tipo de demonio:


○ para los demonios de fuego​, que el alma NO sea friolenta.
 */