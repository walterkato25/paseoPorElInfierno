package com.despegar.university.tp02demonios;

public class Normal implements Estado {
    public String getEstado(){
        return "Normal";
    }
    public void mejorarEstado(Demonio demonio){
        demonio.setEstado(new Feliz());
    }
    public boolean puedeCazar(Alma alma, Demonio demonio){
        return (alma.getBondad() < demonio.getMaldad());
    }
    public boolean puedeCambiar(){
        return true;
    }
}
