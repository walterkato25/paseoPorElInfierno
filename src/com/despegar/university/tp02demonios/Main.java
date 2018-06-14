package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alma> almas = new ArrayList<Alma>();
        almas.add(new Alma("walter", 200, 300, true));
        almas.add(new Alma("nico", 50, 30, false));
        Lugar elParaiso = new Lugar("El paraiso", almas);
        List<Demonio> demonios = new ArrayList<Demonio>();
        Demonio fuego = new DemonioFuego(new ArrayList<Alma>(), 200, 50, 1);
        Demonio hielo = new DemonioHielo(new ArrayList<Alma>(), 2030, 50, 2);
        demonios.add(fuego);
        demonios.add(hielo);
        Diablo diablito = new Diablo(demonios);
        //creo la mision
        List<Lugar> lugares = new ArrayList<Lugar>();
        lugares.add(elParaiso);
        Tormento tormento = new Tormento(lugares);
        //Zafari mision = new Zafari(elParaiso,30);

        for (Demonio demonio: diablito.getDemonios()){
            demonio.aceptarTarea(tormento);
        }
        for (Alma alma: almas){
            System.out.println(alma.getNombre() + alma.getBondad());
        }


    }
}
