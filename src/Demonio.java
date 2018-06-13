package tp02demonios;

import java.util.ArrayList;
import java.util.List;

abstract public class Demonio {

    private List<Alma> almas = new ArrayList<Alma>();
    private Integer maldad;

    public boolean puedeCazar(Alma alma){
        return (this.maldad > alma.getBondad()); //modificar en breve para que devuelva la comparacion del nivel de  maldad
    };




}
/*
● una condición​ propia de cada tipo de demonio:


○ para los demonios de fuego​, que el alma NO sea friolenta.
 */