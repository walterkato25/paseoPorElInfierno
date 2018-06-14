package com.despegar.university.tp02demonios;

import java.util.List;

public class DemonioFuego extends Demonio {


    public DemonioFuego(List<Alma> almas, int maldad, int limiteValor, int id) {
        super(almas, maldad, limiteValor, id);
    }

    @Override
    public boolean puedeCazar(Alma alma) {
        boolean puedeCazar = super.puedeCazar(alma);
        if(puedeCazar){
            if(this.getEstado().puedeCambiar()){
                alma.setFriolenta(false);
            }
        }
        return puedeCazar;
    }

    public void aplicarCastigo(Alma alma){
        alma.setFriolenta(false);
    }
}
