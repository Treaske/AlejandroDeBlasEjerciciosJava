/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.proyectopartidos.servlets;

import com.mycompany.proyectopartidos.logica.Controladora;
import com.mycompany.proyectopartidos.logica.Equipo;
import com.mycompany.proyectopartidos.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexd
 */
@WebServlet("/EquipoSv")
public class EquipoSv extends HttpServlet {
    private List<Equipo> listaEquipo = new ArrayList<>();
    private Controladora control = new Controladora();

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        int victorias = 0;

        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        equipo.setVictorias(victorias);

        //modificamos la lista por el método crear
       control.crearEquipo(equipo);

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        //Acá traeremos la lista de personas desde la base de datos. Ya no trabajaremos con la bd lógica (lista)
        listaEquipo = control.traerEquipo();
        
        ArrayList<Equipo> equipos = new ArrayList<>();

        for (Equipo equipo : listaEquipo) {
            equipos.add(equipo);
        }
                
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("equipos", equipos);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

}