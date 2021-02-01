<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page pageEncoding="UTF-8" contentType="text/html" />

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrado</title>
        <link rel="stylesheet" type="text/css" href="${estilo}" />
    </head>
    <body>

        <div id="principal">
            <h2>Elige uno para eliminar</h2>



            <form method="post" action="control?op=deleteModulo">
                <table>
                    <c:forEach var="item" items="${listado}">
                        <tr>  
                            <td>${item.idCiclo}</td>
                            <td>${item.nombre}</td>
                        </tr>
                        <tr>
                        <c:forEach var="modulo" items="${item.modulos}">    
                            <td><input type="radio" name="idModulos" value="${item.idCiclo}-${modulo.idModulo}" /></td>
                            <td>${modulo.denominacion}</td>
                        </c:forEach>    
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="2"><input type="submit" value="Eliminar" class="boton" /></td>
                    </tr>
                </table>
            </form>

        </div>


    </body>
</html>