<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page pageEncoding="UTF-8" contentType="text/html" />

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
        <link rel="stylesheet" type="text/css" href="${estilo}" />
        <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    </head>
    <body>

        <div id="principal">
            <h2>Actualizaci&oacute;n </h2>
            <form method="post" action="conclusion?op=update">
                <h4 class="subtitulo">Ciclo</h4> 
                <table>
                    <tr>
                        <td>Código</td>
                        <td><input type="text" name="idProf" value="${ciclo.idCiclo}" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>Nombre Ciclo</td>
                        <td><input type="text" name="nombre" value="${ciclo.nombre}" /></td>
                    </tr>
                </table>
                <br><br>
                <h4 class="subtitulo">Modulos</h4>
                <button id="mas">+</button>
                <table>
                    <c:forEach var="m" items="${ciclo.modulos}">
                        <tr id="correos">
                            <td>Denominación Modulos</td>
                            <input name="idCiclo" type="hidden" value="${ciclo.idCiclo}">
                            <input name="idModulo" type="hidden" value="${m.idModulo}">
                            <td><input type="text" name="denominacion" value="${m.denominacion}"/></td>
                        </tr>
                    </c:forEach>
                        
                    <tr>

                        <td colspan="2"><input type="submit" name="enviar" value="Enviar" class="botonEnviar" /></td>
                    </tr>
                </table>
            </form>
                    
        </div>

    <script src="${pageContext.request.contextPath}/js/01-scripts.js"></script>
    </body>
</html>