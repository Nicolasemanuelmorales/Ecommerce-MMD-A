<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>MMD'A</title>
  <%@include file='head.jsp'%> 
  </head>
  <body class="goto-here">
	<%@include file='barra_superior.jsp'%>
    <%@include file='menu.jsp'%>
    <!-- END nav -->

    <div class="hero-wrap hero-bread" style="background-image: url('images/bg_6.jpg');">
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
		    					<a href="#" class="img-prod"><img class="img-fluid" src="${i.imagen}" alt="Colorlib Template">
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
		    							<a href="#" class="add-to-cart text-center py-2 mr-1"><span>Carro <i class="ion-ios-add ml-1"></i></span></a>
		    							<a href="#" class="buy-now text-center py-2">Comprar<span><i class="ion-ios-cart ml-1"></i></span></a>
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
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Remeras</a></h2>
		    			<ul>
								<li><a href="/proyecto-limpio-spring/shop/RemeraMangalarga">Manga larga</a></li>
								<li><a href="/proyecto-limpio-spring/shop/RemeraMangacorta">Manga corta</a></li>
								<li><a href="/proyecto-limpio-spring/shop/RemeraMusculosa">Musculosa</a></li>
		    			</ul>
		    		</div>
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Camisas</a></h2>
		    			<ul>
								<li><a href="/proyecto-limpio-spring/shop/CamisaMangalarga">Manga larga</a></li>
								<li><a href="/proyecto-limpio-spring/shop/CamisaMangacorta">Manga corta</a></li>
								<li><a href="/proyecto-limpio-spring/shop/CamisaElegante">Elegante</a></li>
		    			</ul>
		    		</div>
						<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Buzos</a></h2>
		    			<ul>
								<li><a href="/proyecto-limpio-spring/shop/BuzoCanguro">Canguro</a></li>
								<li><a href="/proyecto-limpio-spring/shop/BuzoBasico">Basico</a></li>
								<li><a href="/proyecto-limpio-spring/shop/BuzoElegante">Elegante</a></li>
		    			</ul>
		    		</div>
		    		
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Pantalon</a></h2>
		    			<ul>
								<li><a href="/proyecto-limpio-spring/shop/PantalonJean">Jean</a></li>
								<li><a href="/proyecto-limpio-spring/shop/PantalonJoggin">Joggin</a></li>
								<li><a href="/proyecto-limpio-spring/shop/PantalonGabardina">Gabardina</a></li>
		    			</ul>
		    		</div>
		    		
		    		<div class="sidebar-box-2">
		    			<h2 class="heading mb-4"><a href="#">Bermuda</a></h2>
		    			<ul>
								<li><a href="/proyecto-limpio-spring/shop/BermudaJean">Jean</a></li>
								<li><a href="/proyecto-limpio-spring/shop/BermudaJoggin">Joggin</a></li>
								<li><a href="/proyecto-limpio-spring/shop/BermudaGabardina">Gabardina</a></li>
		    			</ul>
		    		</div>
		    		
    			</div>
    		</div>
    	</div>
    </section>

    <footer class="ftco-footer bg-light ftco-section">
      <div class="container">
      	<div class="row">
      		<div class="mouse">
						<a href="#" class="mouse-icon">
							<div class="mouse-wheel"><span class="ion-ios-arrow-up"></span></div>
						</a>
					</div>
      	</div>
        <div class="row mb-5">
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2">MMD'A</h2>
              <p>Uso total para el proyecto de Taller web 1</p>
              <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                <li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
            <div class="ftco-footer-widget mb-4 ml-md-5">
              <h2 class="ftco-heading-2">Menu</h2>
              <ul class="list-unstyled">
                <li><a href="#" class="py-2 d-block">Home</a></li>
                <li><a href="#" class="py-2 d-block">Productos</a></li>
                <li><a href="#" class="py-2 d-block">Nosotros</a></li>
                <li><a href="#" class="py-2 d-block">Blog</a></li>
                <li><a href="#" class="py-2 d-block">Contacto</a></li>
              </ul>
            </div>
          </div>
          <div class="col-md-4">
             <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2">Ayuda</h2>
              <div class="d-flex">
	              <ul class="list-unstyled mr-l-5 pr-l-3 mr-4">
	                <li><a href="#" class="py-2 d-block">Informacion de envio</a></li>
	                <li><a href="#" class="py-2 d-block">Devoluciones</a></li>
	                <li><a href="#" class="py-2 d-block">Terminos y Condiciones</a></li>
	                <li><a href="#" class="py-2 d-block">Politica de privacidad</a></li>
	              </ul>
	              
	            </div>
            </div>
          </div>
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
            	<h2 class="ftco-heading-2">Tienes una Pregunta?</h2>
            	<div class="block-23 mb-3">
	              <ul>
	                <li><span class="icon icon-map-marker"></span><span class="text">Florencio Varela 1903, B1754 San Justo, Buenos Aires</span></li>
	                <li><a href="#"><span class="icon icon-phone"></span><span class="text">+54 11 3523 5598</span></a></li>
	                <li><a href="#"><span class="icon icon-envelope"></span><span class="text">MMD'A@unlam.com</span></a></li>
	              </ul>
	            </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12 text-center">

            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						  Copyright &copy;<script>document.write(new Date().getFullYear());</script> Todos los derechos reservados | MMD'A
						  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						</p>
          </div>
        </div>
      </div>
    </footer>
    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


<%@include file='footer_script.jsp' %>
    
  </body>
</html>