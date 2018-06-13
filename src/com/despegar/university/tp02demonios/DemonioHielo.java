package com.despegar.university.tp02demonios;


import java.util.List;

public class DemonioHielo extends Demonio {

    public DemonioHielo(List<Alma> almas, int maldad, int limiteValor) {
        super(almas, maldad, limiteValor);
    }
    @Override
    public boolean puedeCazar(Alma alma) {
        if(super.puedeCazar(alma)){
            return (alma.esFriolenta());
        }
        else {
            return false;
        }
    }

    public void aplicarCastigo(Alma alma){
        alma.setFriolenta(true);
    }
}
/*

○ para los demonios de hielo​, que el alma sea friolenta. De cada alma se sabe si
es friolenta o no.
 */