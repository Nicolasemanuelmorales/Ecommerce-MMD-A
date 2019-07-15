<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<br>
	<form:form name="f2" action="buscar-esto" method="POST" modelAttribute="producto">
	
	<div class="row justify-content-center subscribe-form" style="margin-right: 0 !important;">
		<div class="col-7 text-center">
			<form:input path="nombre" type="text" id="nombre" class="form-control" style=" height:100%!important"/>
		</div>
		<div class="col-2 text-center">
			<button class="btn btn-primary" Type="Submit">Buscar</button>
		</div>	
	</div>	
	</form:form>
<br>