package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.List;

public class Diablo {
    List<Demonio> demonios;

    public Diablo(List<Demonio> demonios) {
        this.demonios = demonios;
    }

    public void cobrarCuenta(Demonio demonio){
        if(demonio.rendirCuenta().size() == 0){
            this.castigar(demonio);
        }else{
            this.recompensar(demonio);
        }
    }

    public void castigar(Demonio demonio){
        demonio.reducirMaldad();
    }

    public void recompensar(Demonio demonio){
        // nada, lo deja vivir.
    }
}
