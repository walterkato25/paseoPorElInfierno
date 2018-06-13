package com.despegar.university.tp02demonios;

import java.util.ArrayList;
import java.util.List;

public class Lugar {

    private String nombre;
    private List<Alma> almas = new ArrayList<Alma>();

    public void agregarAlma(Alma alma){
        this.almas.add(alma);
    }

    public boolean removerAlma(Alma alma){
       return(this.almas.remove(alma));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
/*
    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + ((precioFinal == null) ? 0 : precioFinal.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((productoCompra == null) ? 0 : productoCompra.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //comparar objetus nulos, iguales, o clases
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        final CompraDespegar other = (CompraDespegar) obj;

        //comparar parametros
        if (precioFinal != other.precioFinal) return false;
        if (cliente == null) {
            if (other.cliente!= null) return false;
        } else if (!cliente.equals(other.cliente)) return false;
        if (productoCompra == null) {
            if (other.productoCompra != null) return false;
        } else if (!productoCompra.equals(other.productoCompra)) return false;
        // comparar parametros

        return true;
    }


 */