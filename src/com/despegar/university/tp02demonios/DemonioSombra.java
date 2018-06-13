package com.despegar.university.tp02demonios;


public class DemonioSombra extends Demonio {

    private final Integer limiteValor = 50;


    public boolean puedeCazar(Alma alma){
        if(super.puedeCazar(alma)){
           return (alma.getValor() < this.getLimiteValor());
        }
        else{
            return false;
        }
    }

    public void atormentar(Alma alma){
        super.atormentar(alma);
        alma.disminuirMitadBondad();
        this.incrementarAtormentado();
    }
    public void aplicarCastigo(Alma alma){
        alma.disminuirMitadBondad();
    }

}
/*○ para el demonio de sombras​, que el nivel de valor del alma esté por debajo de
un límite dado, que actualmente es de 50 y es el mismo para todos los demonios
de sombras. El Diablo tiene un programa de entrenamiento de demonios muy
riguroso con el que pretende poder ir aumentando este límite, pero siempre para
todos por igual.*/