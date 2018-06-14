package com.despegar.university.tp02demonios;

public class Feliz implements Estado {
    public String getEstado(){
        return "Feliz"
    }

    public void mejorarEstado(Demonio demonio){
        demonio.setMaldad(demonio.getMaldad()+5);
    }

    public boolean puedeCazar(Alma alma, Demonio demonio){
        return (alma.getBondad()/2 < demonio.getMaldad());
    }
    ublic boolean puedeCambiar(){
        return true;
    }p
}
