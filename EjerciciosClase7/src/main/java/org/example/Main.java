package org.example;

import org.example.persistencia.ControladorPersistencia;
import org.example.logica.Platillo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    /*  ---- Ejercicio 1 ----

    // Configura la información de la base de datos
    private static final String URL = "jdbc:mysql://localhost/universidad";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Alex@Contrasena42";

    // Método para agregar un nuevo estudiante a la base de datos
    public static void agregarEstudiante(String nombre, int edad, double calificacion) {
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA)) {
            String sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.setDouble(3, calificacion);
            statement.executeUpdate();
            System.out.println("Estudiante agregado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para recuperar la lista de todos los estudiantes
    public static void listarEstudiantes() {
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA)) {
            String sql = "SELECT * FROM estudiantes";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                double calificacion = resultSet.getDouble("calificacion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Añadir estudiantes y mostrarlo con  el metodo de la lista
        agregarEstudiante("Juan", 20, 85.5);
        agregarEstudiante("Maria", 22, 92.0);
        listarEstudiantes();
    }

     */

    //  ---- Ejercicio 2 ----

    /* lo primero es crear los archivos y carpetas necesarias para utilizar maven y conecar con nuestra base de datos de mysql
    en la que primero creamos una base de datos de nombre restaurante vacia

    Lo primero es crear la carpeta "META-INF" con el archivo XML de nombre persistence.xml y copiar el codigo necesario:
    <?xml version="1.0" encoding="UTF-8"?>
        <persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
            <persistence-unit name="restaurantePU" transaction-type="RESOURCE_LOCAL">
                <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
                <class>org.example.logica.Platillo</class>
                <properties>
                    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/clinica?serverTimezone=UTC"/>
                    <property name="javax.persistence.jdbc.user" value="root"/>
                    <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
                    <property name="javax.persistence.jdbc.password" value="Alex@Contrasena42"/>
                    <property name="javax.persistence.schema-generation.database.action" value="create"/>
                </properties>
            </persistence-unit>
        </persistence>

        modificando los nombres de la base de datos y de la logica de platillo

        despues creamos las carpetas logica donde tendremos la estructura de la clase platillo con sus atributos y la carpeta de persistencia con el controlador que simplemente
        llama a las clases de CRUD que creemos, y la clase personaJPAController, donde tendremos estas clases CRUD

        Una vez que completemos esto en el main llamaremos a las clases necesarias para crear la base y los platillos

     */

    public static void main(String[] args) throws ClassNotFoundException{
        ControladorPersistencia controlador = new ControladorPersistencia();

        Platillo platillo1 = new Platillo(1L, "Macarrones", "RecetaMacarrones", 12.9);
        Platillo platillo2 = new Platillo(2L, "Paella", "RecetaPaella", 19.9);
        Platillo platillo3 = new Platillo(3L, "Pescado", "RecetaPescado", 21.9);
        controlador.crearPlatillo(platillo1);
        //Comprobamos en nuestra base de datos que se ha creado el plato


        controlador.crearPlatillo(platillo2);
        controlador.crearPlatillo(platillo3);
        controlador.eliminarPlatillo(platillo2.getId());
        controlador.editarPlatillo(platillo2.getId(), "Arroz", "RecetaArroz", 29);


    }


}
