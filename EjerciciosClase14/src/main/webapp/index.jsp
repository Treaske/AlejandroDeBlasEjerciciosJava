<%-- 
    Document   : index
    Created on : 22 nov 2023, 17:09:16
    Author     : alexd
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.proyectopartidos.logica.Partido"%>
<%@page import="com.mycompany.proyectopartidos.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <title>NBA</title>
    <!-- Agregar estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
    <div class="container mt-4">
        <h2>Equipos</h2>
        <form action="EquipoSv" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
            </div>
            <div class="form-group">
                <label for="ciudad">Ciudad:</label>
                <input type="text" class="form-control" id="ciudad" name="ciudad">
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        
        <hr>
       
        <h2>Tabla Equipos</h2>
        
        <form action="EquipoSv" method="get">
            <button type="submit" class="btn btn-primary">Mostrar</button>
        </form>
    
        <!-- Resultados en tabla -->
        <div class="results-table">
            <% if (request.getAttribute("equipos") != null) { %>
                <h3>Equipos:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                            <th>Victorias</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (ArrayList<Equipo>) request.getAttribute("equipos")) { %>
                            <tr>
                                <td><%= equipo.getId() %></td>
                                <td><%= equipo.getNombre() %></td>
                                <td><%= equipo.getCiudad() %></td>
                                <td><%= equipo.getVictorias() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
       
        
        <h2>Partidos</h2>
        <form action="PartidoSv" method="post">
            <div class="form-group">
                <label for="fecha">Fecha (yyyy-MM-dd):</label>
                <input type="text" class="form-control" id="fecha" name="fecha">
            </div>
            <div class="form-group">
                <label for="local">Id Equipo Local:</label>
                <input type="text" class="form-control" id="local" name="local">
            </div>
            <div class="form-group">
                <label for="visitante">Id Equipo Visitante:</label>
                <input type="text" class="form-control" id="visitante" name="visitante">
            </div>
            <div class="form-group">
                <label for="localRes">Equipo Local Resultado:</label>
                <input type="text" class="form-control" id="localRes" name="localRes">
            </div>
            <div class="form-group">
                <label for="visitanteRes">Equipo Visitante Resultado:</label>
                <input type="text" class="form-control" id="visitanteRes" name="visitanteRes">
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        
        <hr>
        
        <h2>Tabla Partidos</h2>
        
        <form action="PartidoSv" method="get">
            <button type="submit" class="btn btn-primary">Mostrar</button>
        </form>
    
        <!-- Resultados en tabla -->
        <div class="results-table">
            <% if (request.getAttribute("partidos") != null) { %>
                <h3>Partido:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Local</th>
                            <th>Visitante</th>
                            <th>Resultado Local</th>
                            <th>Resultado Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (ArrayList<Partido>) request.getAttribute("partidos")) { %>
                            <tr>
                                <td><%= partido.getFecha() %></td>
                                <td><%= partido.getLocalNombre() %></td>
                                <td><%= partido.getVisitanteNombre() %></td>
                                <td><%= partido.getResLocal() %></td>
                                <td><%= partido.getResVisitante() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
       
        
    </div>
</html>
