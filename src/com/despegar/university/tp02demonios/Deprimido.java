package com.despegar.university.tp02demonios;

public class Deprimido implements Estado {
    public String getEstado(){
        return "Deprimido";
    }
    public void mejorarEstado(Demonio demonio){
        demonio.setEstado(new Normal());
    }
    public boolean puedeCazar(Alma alma, Demonio demonio){
        return (alma.getBondad()*2 < demonio.getMaldad());
    }
    public boolean puedeCambiar(){
        return false;
    }
}
