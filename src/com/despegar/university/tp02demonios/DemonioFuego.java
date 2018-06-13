package com.despegar.university.tp02demonios;

import java.util.List;

public class DemonioFuego extends Demonio {


    public DemonioFuego(List<Alma> almas, int maldad, int limiteValor) {
        super(almas, maldad, limiteValor);
    }

    @Override
    public boolean puedeCazar(Alma alma) {
        if(super.puedeCazar(alma)){
            return (!alma.esFriolenta());
        }
        else {
            return false;
        }
    }

    public void aplicarCastigo(Alma alma){
        alma.setFriolenta(false);
    }
}
