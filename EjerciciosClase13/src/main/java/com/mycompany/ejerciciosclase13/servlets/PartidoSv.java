/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.ejerciciosclase13.servlets;

import com.mycompany.ejerciciosclase13.logica.Controladora;
import com.mycompany.ejerciciosclase13.logica.Partido;
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
@WebServlet("/PartidoSv")
public class PartidoSv extends HttpServlet {
    private List<Partido> listaPartidos = new ArrayList<>();
    private Controladora control = new Controladora();

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String opcion = request.getParameter("opciones");

        Partido partido = control.getPartido(opcion);
        
        partido.setVotos(partido.getVotos()+1);
      
        //modificamos la lista por el método crear
       control.editarPartido(partido);

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        //Acá traeremos la lista de personas desde la base de datos. Ya no trabajaremos con la bd lógica (lista)
        listaPartidos = control.traerPartido();
                
        // Array para guardar las coincidencias de apellido
        ArrayList<Partido> partidosVotos = new ArrayList<>();

        for (Partido partido : listaPartidos) {
            partidosVotos.add(partido);            
        }

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", partidosVotos);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

}
