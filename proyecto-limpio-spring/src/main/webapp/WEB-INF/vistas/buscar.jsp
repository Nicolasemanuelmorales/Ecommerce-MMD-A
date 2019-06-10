<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Contacto</title>
    <%@include file='head.jsp'%>    
  </head>
  <body class=" goto-here">
	<%@include file='barra_superior.jsp'%>
    <%@include file='menu.jsp'%>
    <!-- END nav -->
    
    <br>
	<form:form action="buscar-esto" method="POST" modelAttribute="producto">
	<div class="row justify-content-center subscribe-form">
		<div class="col-7">
			<form:input path="nombre" type="text" id="nombre" class="form-control" style=" height:90%!important"/>
		</div>
		<div class="col-1">
			<button class="btn btn-primary px-5"  style="margin-top:-3%!important" Type="Submit">Buscar</button>
		</div>	
	</div>	
	</form:form>
	
	<br><br>
	<%@include file='footer.jsp' %>
 	<!-- loader -->
  	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>
  </body>
</html>