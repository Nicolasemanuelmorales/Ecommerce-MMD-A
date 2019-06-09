<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Contacto</title>
    <%@include file='head.jsp'%>    
  </head>
  <body class="container goto-here">
	<%@include file='barra_superior.jsp'%>
    <%@include file='menu.jsp'%>
    <!-- END nav -->
	<form:form action="buscar-esto" method="POST" modelAttribute="producto">
	<div class="row">
		<div class="col-10">
			<form:input path="nombre" type="text" id="nombre" class="form-control"/>
		</div>
		<div class="col-2">
			<button class="btn btn-primary py-3 px-5" Type="Submit">Buscar</button>
		</div>	
	</div>	
	</form:form>
<%@include file='footer.jsp' %>
 	<!-- loader -->
  	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>
  </body>
</html>