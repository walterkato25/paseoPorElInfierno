package com.despegar.university.tp02demonios;

import java.util.List;

public class Tormento implement Visitor {
    List<Lugar> lugares;

    public Tormento(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public boolean ejecutarTarea(Demonio demonio){
        Demonio copiaDemonio = demonio // es porque cuando atormento, me aumenta los valores de demonio, entonces se lo sumo a la copia y el original queda igual.
        boolean rta = new Boolean();
        for(Lugar lugar: this.getLugares()){
            List<Alma> copiaDeAlmas = lugar.getAlmas();
            boolean hayAtormentadoHastaLaLocura = false;
            for(Alma alma: copiaDeAlmas){

                copiaDemonio.atormentar(alma);
                if(alma.getBondad() < 10){
                    hayAtormentadoHastaLaLocura = true;
                }
            }
            if(!hayAtormentadoHastaLaLocura){
                break;
            }
            rta = hayAtormentadoHastaLaLocura;
        }
        return rta ;
    }
}
