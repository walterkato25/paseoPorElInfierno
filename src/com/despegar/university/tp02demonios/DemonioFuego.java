package com.despegar.university.tp02demonios;

public class DemonioFuego extends Demonio {



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
