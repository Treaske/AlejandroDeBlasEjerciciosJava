package org.example.persistencia;
import org.example.logica.Platillo;

public class ControladorPersistencia {

    PlatilloJPAController platilloJPA = new PlatilloJPAController();

    public void crearPlatillo(Platillo platillo){
        platilloJPA.create(platillo);
    }

    public void eliminarPlatillo(Long id){
        platilloJPA.destroy(id);
    }
    public void editarPlatillo(Long id, String nombre, String receta, double precio){
        platilloJPA.edit(id, nombre, receta, precio);
    }
}
