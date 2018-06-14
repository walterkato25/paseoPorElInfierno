package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diablo {
    List<Demonio> demonios;
    HashMap<Integer,Integer> poder;

    public Diablo(List<Demonio> demonios) {
        this.demonios = demonios;
        this.poder = new HashMap<Integer, Integer>();
    }

    public List<Demonio> getDemonios() {
        return this.demonios;
    }

    public HashMap<Integer, Integer> getPoder() {
        return this.poder;
    }

    public void cobrarCuenta(){
        for (Demonio demonio: this.getDemonios()){
            //se fija la cantidad de almas para castigarlo o no.
            if (demonio.getAlmas().size() > 0){
                this.recompensar(demonio);
            }else{
                this.castigar(demonio);
            }
            //devuelve el poder por demonio, limpia la lista de almas del demonio.
            // cargo los valores en el diablo.
            int auxPoder = 0;
            if (this.getPoder().containsKey(demonio.getId())){
                auxPoder = this.getPoder().get(demonio.getId());
            }
            this.poder.put(demonio.getId(),(auxPoder + demonio.rendirCuenta()));
        }
    }

    private Demonio getDemonioById(int id){
        Demonio aux = this.getDemonios().get(0);
        for (Demonio demonio: this.getDemonios()){
            if(demonio.getId() == id){
                aux = demonio;
                break;
            }
        }
        return aux;
    }

    public Demonio pequenioDemonio(){
        Integer minimo = new Integer(99999999);
        Integer demonioId = new Integer(0);
        for (Map.Entry<Integer, Integer> entry : this.getPoder().entrySet()){
            if(minimo > entry.getValue()){
                minimo = entry.getValue();
                demonioId = entry.getKey();
            }
        }
        return this.getDemonioById(demonioId);
    }

    public void castigar(Demonio demonio){
        demonio.reducirMaldad();
        demonio.setEstado(new Deprimido());
    }

    public void recompensar(Demonio demonio){
        // nada, lo deja vivir.
    }
}
