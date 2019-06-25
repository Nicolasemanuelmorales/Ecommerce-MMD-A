<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<c:set var="context" value="${pageContext.request.contextPath}"/>

<h3>Listado de productos elegidos</h3>
   <c:forEach items="${listaProductosElegidos}" var="i">${i}<br></c:forEach>
    

  </body>
</html>