<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Contacto</title>
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
            <h1 class="mb-0 bread">Contact Us</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section contact-section bg-light">
      <div class="container">
      	<div class="row d-flex mb-5 contact-info">
          <div class="w-100"></div>
          <div class="col-md-3 d-flex">
          	<div class="info bg-white p-4 text-center">
	            <p>	Florencio Varela 1903, B1754 San Justo, Buenos Aires</p>
	          </div>
          </div>
          <div class="col-md-3 d-flex">
          	<div class="info bg-white p-4 text-center">
	            <p>+54 11 3523 5598</p>
	          </div>
          </div>
          <div class="col-md-3 d-flex">
          	<div class="info bg-white p-4 text-center">
	            <p>MMD'A@unlam.com</p>
	          </div>
          </div>
          <div class="col-md-3 d-flex">
          	<div class="info bg-white p-4 text-center">
	            <p>WWW.MMD-A.com.ar</p>
	          </div>
          </div>
        </div>
        <div class="row block-9">
          <div class="col-md-6 order-md-last d-flex">
            
            <form action="enviar-mensaje" method="GET" class="bg-white p-5 contact-form">
              <div class="form-group">
                <input type="text" name="nombre" id="nombre" class="form-control" placeholder="Nombre">
              </div>
              <div class="form-group">
                <input type="text" name="correo" id="correo" class="form-control" placeholder="Email">
              </div>
              <div class="form-group">
                <input type="text" name="asunto" id="asunto" class="form-control" placeholder="Asunto">
              </div>
              <div class="form-group">
                <textarea rows ="7" cols ="50" name="mensaje" id="mensaje" class="form-control"></textarea>
              </div>
             
              <div class="form-group">
                <input type="submit" value="Enviar" class="btn btn-primary py-3 px-5">
              </div>
            </form>
          
          </div>

          <div class="col-md-6 d-flex">
          	<div id="map" class="bg-white"></div>
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