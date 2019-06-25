<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<title>Ingresar</title>
		<%@include file='head.jsp'%>    
	</head>
	<body class="goto-here">
		<%@include file='barra_superior.jsp'%>
    	<%@include file='menu.jsp'%>
    <!-- END nav -->
    
		<div class = "container">
			<div id="loginbox" style="margin-top:5px;" class="bg-white p-5 contact-form">
				<%--Definicion de un form asociado a la accion /validar-login por POST. Se indica ademas que el model attribute se--%>
				<%--debe referenciar con el nombre usuario, spring mapea los elementos de la vista con los atributos de dicho objeto--%>
					<%--para eso debe coincidir el valor del elemento path de cada input con el nombre de un atributo del objeto --%>
				
				<form:form name="f1" action="validar-login" method="POST" modelAttribute="usuario">
			    	<h1 class="mb-0 bread text-center ">Taller Web I</h1>
					<hr class="colorgraph"><br>

					<%--Elementos de entrada de datos, el elemento path debe indicar en que atributo del objeto usuario se guardan los datos ingresados--%>
					<label for="email">Usuario</label>
					<form:input path="email" id="email" type="email" name="email" class="form-control" /><br>
					<label for="password">Contrase�a</label>
					<form:input path="password" type="password" id="password" name="password" class="form-control"/>    
					<br> 		  
					
					<button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Conectar</button>
				</form:form>

				<%--Bloque que es visible si el elemento error no está vacío	--%>
				<c:if test="${not empty error}">
			        <h4><span>${error}</span></h4>
			        <br>
		        </c:if>	
			</div>
		</div>
		
	<%@include file='footer.jsp' %>
 	<!-- loader -->
  	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>
		
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>
