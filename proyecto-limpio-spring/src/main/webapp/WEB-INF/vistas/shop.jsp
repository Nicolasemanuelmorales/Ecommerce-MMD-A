<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<c:set var="context" value="${pageContext.request.contextPath}"/>
 <head>
    <title>MMD'A</title>
    <%@include file='head.jsp'%>    
  </head>
  <body class="goto-here">
	<%@include file='barra_superior.jsp'%>
    <%@include file='menu.jsp'%>
    <!-- END nav -->

    <div class="hero-wrap hero-bread" style="background-image: url('${context}/images/bg_6.jpg');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          
            <h1 class="mb-0 bread">Productos de coleccion</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section bg-light">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-8 col-lg-10 order-md-last">
    				<div class="row">
    				<c:forEach items="${xd}" var="i">
    				<div class="col-sm-6 col-md-6 col-lg-4 ftco-animate">
		    				<div class="product">
		    					<a href="${context}/detalleProducto/${i.id}/${i.tipo.nombre}" class="img-prod"><img class="img-fluid" src="${context}/ ${i.imagen}" alt="Colorlib Template">
		    						<div class="overlay"></div>
		    					</a>
		    					<div class="text py-3 px-3">
		    						<h3><a href="#">${i.nombre}</a></h3>
		    						<div class="d-flex">
		    							<div class="pricing">
				    						<p class="price"><span class="price-sale">$ ${i.precio}</span></p>
				    					</div>
				    					<div class="rating">
			    							<p class="text-right">
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    							</p>
			    						</div>
			    					</div>
			    					<p class="bottom-area d-flex px-3">
			    						<a href="${context}/agregarAlCarro/${i.id}" class="add-to-cart text-center py-2">Carro<span><i class="ion-ios-cart ml-1"></i></span></a>
		    							<a href="${context}/detalleProducto/${i.id}/${i.tipo.nombre}" class="buy-now text-center py-2 mr-1"><span>Detalle<i class="ion-ios-add ml-1"></i></span></a>
		    						</p>
		    					</div>
		    				</div>
		    			</div>
		    			</c:forEach>
		    		</div>
		    		<div class="row mt-5">
		          <div class="col text-center">
		            <div class="block-27">
		              <ul>
		                <li><a href="#">&lt;</a></li>
		                <li class="active"><span>1</span></li>
		                <li><a href="#">2</a></li>
		                <li><a href="#">3</a></li>
		                <li><a href="#">4</a></li>
		                <li><a href="#">5</a></li>
		                <li><a href="#">&gt;</a></li>
		              </ul>
		            </div>
		          </div>
		        </div>
		    	</div>
			
		    	<div class="col-md-4 col-lg-2 sidebar">
		    	<form action="${context}/shop/" method="GET">
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Remeras</a></h2>
		    			
		    			<ul>
		    					<div class="radio">
								<li>
 								 <input type="radio" name="filtro" value="RemeraMangalarga">Manga larga</li></div>
 								 
 								 <div class="radio">
								<li><input type="radio" name="filtro" value="RemeraMangacorta">Manga corta</li></div>


								<div class="radio">
								<li><input type="radio" name="filtro" value="RemeraMusculosa">Remera Musculosa</li></div>
		    			</ul>
		    			

		    			
		    		</div>
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Camisas</a></h2>
		    			<ul>
								<div class="radio">
								<li><input type="radio" name="filtro" value="CamisaMangaLarga">Manga Larga</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="CamisaMangacorta">Manga Corta</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="CamisaElegante">Elegante</li></div>
		    			</ul>
		    		</div>
						<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Buzos</a></h2>
		    			<ul>
									<div class="radio">
								<li><input type="radio" name="filtro" value="BuzoCanguro">Canguro</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="BuzoBasico">Básico</li></div>
								
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="BuzoElegante">Elegante</li></div>
		    			</ul>
		    		</div>
		    		
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Pantalon</a></h2>
		    			<ul>
									<div class="radio">
								<li><input type="radio" name="filtro" value="PantalonJean">Jean</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="PantalonJoggin">Joggin</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="PantalonGabardina">Gabardina</li></div>
		    			</ul>
		    		</div>
		    		
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Bermuda</a></h2>
		    			<ul>
									<div class="radio">
								<li><input type="radio" name="filtro" value="BermudaJean">Jean</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="BermudaJoggin">Joggin</li></div>
								
									<div class="radio">
								<li><input type="radio" name="filtro" value="BermudaGabardina">Gabardina</li></div>
		    			</ul>
		    		
		    		 <input type="number" value="${formaDeFiltro}" name="formaDeFiltro">
		    		<br>
		    		<input type="number" value="${formaDeFiltro2}" name="formaDeFiltro2">
    				<button type="submit">Filtrar</button>
		    	</form>
		    	</div>
    			</div>

    		</div>
    	</div>
    </section>
<%@include file='newsletter.jsp' %>
<%@include file='footer.jsp' %>
  	<!-- loader -->
  	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>
  </body>
</html>