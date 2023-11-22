package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class InventarioAuto<T extends Auto> {

    private List<T> autos;

    public InventarioAuto(){
        this.autos = new ArrayList<>();
    }

    public void añadirAuto(T auto){
        autos.add(auto);
        System.out.println(" +++ Auto añadido +++");
    }

    public List<T> buscarMarca(String marca){
        List<T> autosMarca = autos.stream()
                .filter(a -> a.getMarca() == marca)
                .collect(Collectors.toList());

        return autosMarca;
    }

    public List<T> buscarAño(int año){
        List<T> autosAño = autos.stream()
                .filter(a -> a.getAño() == año)
                .collect(Collectors.toList());

        return autosAño;
    }

    public double valorTotal(){
        Double valor = autos.stream()
                .mapToDouble(v -> v.getPrecio()).sum();

        return valor;
    }
}
