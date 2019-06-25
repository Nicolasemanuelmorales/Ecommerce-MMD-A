<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<form:form name="f2" action="buscar-esto" method="POST" modelAttribute="producto">
	<div class="row justify-content-center subscribe-form">
		<div class="col-7">
			<form:input path="nombre" type="text" id="nombre" class="form-control" style=" height:90%!important"/>
		</div>
		<div class="col-1">
			<button class="btn btn-primary"  style="margin-top:-3%!important" Type="Submit">Buscar</button>
		</div>	
	</div>	
	</form:form>
<br>