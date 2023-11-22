<%-- 
    Document   : index
    Created on : 22 nov 2023, 10:50:53
    Author     : alexd
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.ejerciciosclase13.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <title>Votacion</title>
    <!-- Agregar estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
    <div class="container mt-4">
        <h2>Formulario Partido</h2>
        <form action="PartidoSv" method="post">
        <%-- Para crear los partidos
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
            </div>
        --%>
            <div class="form-group">
                <label for="opcion">Selecciona un Partido:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" id="Partido1" name="opciones" value="Partido1">
                    <label class="form-check-label" for="Partido1">Partido 1</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" id="Partido2" name="opciones" value="Partido2">
                    <label class="form-check-label" for="Partido2">Partido 2</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" id="Partido3" name="opciones" value="Partido3">
                    <label class="form-check-label" for="Partido3">Partido 3</label>
                </div>
            </div>       
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>

        <hr>

        <hr>

        <h2>Consultar Votacion</h2>
        <form action="PartidoSv" method="get">
            <button type="submit" class="btn btn-primary">Consultar</button>
        </form>
   
    <br>
    <br>
    <!-- Resultados en tabla -->
        <div class="results-table">
            <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (ArrayList<Partido>) request.getAttribute("resultados")) { %>
                            <tr>
                                <td><%= partido.getNombre() %></td>
                                <td><%= partido.getVotos() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
    </div>
</html>
<%--
<form action="PartidoSv" method="post">
            <div class="form-group">
                <label for="opcion">Selecciona un Partido:</label>
                <select class="form-control" id="opcion" name="opcion">
                    <option value="opcion1">Partido 1</option>
                    <option value="opcion2">Partido 2</option>
                    <option value="opcion3">Partido 3</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
--%>