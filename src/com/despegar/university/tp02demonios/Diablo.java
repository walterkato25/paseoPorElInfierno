package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diablo {
    List<Demonio> demonios;
    Map<int,int> poder;

    public Diablo(List<Demonio> demonios) {
        this.demonios = demonios;
        this.poder = new HashMap<int, int>();
    }

    public List<Demonio> getDemonios() {
        return demonios;
    }

    public HashMap<int, int> getPoder() {
        return poder;
    }

    public void cobrarCuenta(Demonio demonio){
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
        Demonio aux = new Demonio();
        for (Demonio demonio: this.getDemonios()){
            if(demonio.getId() = id){
                aux = demonio;
                break;
            }
        }
        return aux;
    }

    public Demonio pequenioDemonio(){
        int minimo = 99999999;
        int demonioId = 0;
        for (Map.Entry<int, int> entry : this.getPoder().entrySet()){
            if(minimo > entry.getValue()){
                minimo = entry.getValue();
                demonioId = entry.getKey();
            }
        }
        return this.getDemonioById(demonioId);
    }

    public void castigar(Demonio demonio){
        demonio.reducirMaldad();
    }

    public void recompensar(Demonio demonio){
        // nada, lo deja vivir.
    }
}
