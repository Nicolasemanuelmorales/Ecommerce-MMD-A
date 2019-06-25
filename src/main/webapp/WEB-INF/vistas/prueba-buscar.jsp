<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <section id="home-section" class="hero">
		  <div class="home-slider js-fullheight owl-carousel">
	      <div class="slider-item js-fullheight">
	      	<div class="overlay"></div>
	        <div class="container-fluid p-0">
	          <div class="row d-md-flex no-gutters slider-text js-fullheight align-items-center justify-content-end" data-scrollax-parent="true">
	          	<div class="one-third order-md-last img js-fullheight" style="background-image:url(images/bg_1.jpg);">
	          	</div>
		          <div class="one-forth d-flex js-fullheight align-items-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
		          	<div class="text">
		          		<span class="subheading">MMD'A eCommerce Shop</span>
		          		<div class="horizontal">
		          			<h3 class="vr" style="background-image: url(images/divider.jpg);">Establecido desde el ano 2019</h3>
				            <h1 class="mb-4 mt-3">Atrapa tu propio <br><span>Aspecto elegante</span></h1>
				            <p>Un pequeno rio llamado Duden fluye por su lugar y lo suministra con los regelialia necesarios. Es un pais paradisematico..</p>
				            
				            <p><a href="#" class="btn btn-primary px-5 py-3 mt-3">Descubrir ahora</a></p>
				          </div>
		            </div>
		          </div>
	        	</div>
	        </div>
	      </div>
	      </div>
	         </section>
		<hr>

	<%@include file='newsletter.jsp' %>
	<%@include file='footer.jsp' %>
  	<!-- loader -->
  	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>
  </body>
</html>