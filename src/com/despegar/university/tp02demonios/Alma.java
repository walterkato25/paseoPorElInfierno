package com.despegar.university.tp02demonios;//package tp02demonios;

public class Alma {

    private String nombre;
    private Integer bondad;
    private Integer valor;
    private boolean friolenta;

    public Integer getBondad() {
        return this.bondad;
    }

    public Integer getValor() {
        return this.valor;
    }

    public boolean esFriolenta() {
        return this.friolenta;
    }

    public void setFriolenta(boolean friolenta) {
        this.friolenta = friolenta;
    }

    public void descontarBondad(){
        this.bondad = this.bondad - 5;
    }

    public void disminuirMitadBondad(){
        this.bondad = this.bondad / 2;
    }

}
