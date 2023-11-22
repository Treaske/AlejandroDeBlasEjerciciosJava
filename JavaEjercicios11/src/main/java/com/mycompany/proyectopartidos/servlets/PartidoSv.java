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
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        String fecha = request.getParameter("fecha");
        String localNomb = request.getParameter("local");
        String visitanteNomb = request.getParameter("visitante");
        String resLocalNomb = request.getParameter("localRes");
        String resVisitanteNomb = request.getParameter("visitanteRes");
        
        
        try {
            Long idLocal = Long.parseLong(localNomb);
            Long idVisitantes = Long.parseLong(visitanteNomb);
            
            Equipo local = control.findEquipo(idLocal);
            Equipo visitante = control.findEquipo(idVisitantes);

            int resLocal = Integer.parseInt(resLocalNomb);
            int resVisitante = Integer.parseInt(resVisitanteNomb);
            
            if(resLocal>resVisitante){
                local.setVictorias(local.getVictorias()+1);
                control.editarEquipo(local);
            }else{
                visitante.setVictorias(visitante.getVictorias()+1);
                control.editarEquipo(visitante);
            }
            

            Partido partido = new Partido();
            partido.setFecha(fecha);
            partido.setLocal(local);
            partido.setVisitante(visitante);
            partido.setResLocal(resLocal);
            partido.setResVisitante(resVisitante);

            //modificamos la lista por el método crear
            control.crearPartido(partido);
            
            response.sendRedirect("index.jsp");
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Manejo de errores (puedes cambiar esto según tus necesidades)
            // Manejar el error, redirigir a una página de error, etc.
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        //Acá traeremos la lista de personas desde la base de datos. Ya no trabajaremos con la bd lógica (lista)
        listaPartidos = control.traerPartido();
                
        // Array para guardar las coincidencias de apellido
        ArrayList<Partido> partidos = new ArrayList<>();

        for (Partido partido : listaPartidos) {
            partidos.add(partido);            
        }

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("partidos", partidos);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

}