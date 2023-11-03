package org.example.persistencia;
import org.example.logica.Platillo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlatilloJPAController {

    private EntityManagerFactory emf = null;

    public PlatilloJPAController() {
        this.emf = Persistence.createEntityManagerFactory("restaurantePU");

    }

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public void create(Platillo platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();
    }

    public void destroy(Long id){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillo platillo = em.find(Platillo.class, id);
        em.remove(platillo);
        em.getTransaction().commit();
    }
    public void edit(Long id, String nombre, String receta, double precio) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();

        Platillo platillo = em.find(Platillo.class, id);
        Platillo existingPlatillo = em.find(Platillo.class, platillo.getId());
            if (existingPlatillo != null) {
                existingPlatillo.setNombre(nombre);
                existingPlatillo.setReceta(receta);
                existingPlatillo.setPrecio(precio);
                em.merge(existingPlatillo); // Actualizar el platillo en la base de datos
            } else {
                // Manejar el caso en el que el platillo no existe en la base de datos
                System.out.println("El platillo no existe en la base de datos.");
            }
        em.getTransaction().commit();
    }

}
