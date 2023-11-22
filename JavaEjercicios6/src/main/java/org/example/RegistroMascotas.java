package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascotas <T extends Mascota> {
    private List<T> mascotas;

    public RegistroMascotas(){
        this.mascotas = new ArrayList<>();
    }

    public void añadirMascota(T mascota){
        mascotas.add(mascota);
        System.out.println(" +++ Mascota añadido +++");
    }

    public List<T> buscarNombre(String nombre){
        List<T> mascotaNombre = mascotas.stream()
                .filter(a -> a.getNombre() == nombre)
                .collect(Collectors.toList());

        return mascotaNombre;
    }
    public List<T> buscarEspecie(String especie){
        List<T> mascotaEspecie = mascotas.stream()
                .filter(a -> a.getEspecie() == especie)
                .collect(Collectors.toList());

        return mascotaEspecie;
    }

    public int contarMascotas(){
        return mascotas.size();
    }

    public void MascotaAleatoria() {
        String[] nombres = {"Max", "Rider", "Plumas", "Marco", "Chica", "Roco"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};
        Random random = new Random();

        int id = random.nextInt(1000);
        int edad = random.nextInt(12) + 1; //Sumamos uno para que no de edad 0
        String nombreRandom = nombres[random.nextInt(nombres.length)];
        String especieRandom = especies[random.nextInt(especies.length)];

        Mascota<T> mascotaAleatoria = new Mascota<>(id, nombreRandom, edad, especieRandom);
        añadirMascota((T) mascotaAleatoria);
        //System.out.println("Mascota aleatoria añadida");
    }

}
