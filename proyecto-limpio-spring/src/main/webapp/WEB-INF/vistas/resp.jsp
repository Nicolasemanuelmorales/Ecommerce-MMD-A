<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<title>MMD'A</title>
		<%@include file='head.jsp'%>    
	</head>
	<body class="goto-here">
		<%@include file='barra_superior.jsp'%>
    	<%@include file='menu.jsp'%>
    <!-- END nav -->
	<h1>aca tendria que haber algo</h1>
		<c:if test="${not empty resultado}">
			<c:forEach items="${resultado}" var="v">
				${v.id} - ${v.imagen} - ${v.nombre} - ${v.precio} - ${v.color.nombre} - ${v.material.nombre} - ${v.talle.nombre} - ${v.tipo.nombre}
				<br>
			</c:forEach>
		</c:if>
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