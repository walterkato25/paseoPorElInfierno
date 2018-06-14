package com.despegar.university.tp02demonios;
public interface Estado {
    public String getEstado();
    public void mejorarEstado(Demonio demonio);
    public boolean puedeCazar(Alma alma, Demonio demonio);
    public boolean puedeCambiar();
}
