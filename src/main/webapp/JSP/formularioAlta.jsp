<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page pageEncoding="UTF-8" contentType="text/html" />

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta</title>
        <link rel="stylesheet" type="text/css" href="${estilo}" />
    </head>
    <body>

        <div id="principal">
            <h2>Entrada de datos</h2>
        <form method="post" action="control?op=add">
            <h4 class="subtitulo">Ciclo</h4>    
            
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre"/></td>
                </tr>
            </table>
            
            <br><br>
            <h4 class="subtitulo">Modulos</h4>    
            <table>
                <tr>
                    <td>Modulo 1:</td>
                    <td><input type="text" name="denominacion"/></td>
                </tr>
                <tr>
                    <td>Modulo 2:</td>
                    <td><input type="text" name="denominacion"/></td>
                </tr>
                <tr>
                    <td>Modulo 3:</td>
                    <td><input type="text" name="denominacion"/></td>
                </tr>
            </table><br>
            <input type="submit" name="enviar" value="Enviar" class="botonEnviar"/>
            </table>
        </form>
        </div>


    </body>
</html>