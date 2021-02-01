<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page pageEncoding="UTF-8" contentType="text/html" />
<c:url var="estilo" value="/CSS/estilo.css" scope="application"/>
<c:set var="contexto" value="${pageContext.request.contextPath}" scope="application"/>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        <link rel="stylesheet" type="text/css" href="${estilo}" />
    </head>
    <body>

        <div id="principal">
            <h1>Mapeo una a muchos</h1>
            <h2>Elige una opci&oacute;n</h2>
            <ol id="inicial">
                <ul id="menu">
                    <li><a href="eleccion?op=add" class="enlace">Alta</a></li>
                    <li><a href="eleccion?op=list" class="enlace">Listado</a></li>
                    <li><a href="eleccion?op=delete" class="enlace">Delete</a></li>
                    <li><a href="eleccion?op=deleteModulo" class="enlace">Delete Modulo</a></li>
                    <li><a href="eleccion?op=update" class="enlace">Update</a></li>
                </ul>
            </ol>
        </div>


    </body>
</html>