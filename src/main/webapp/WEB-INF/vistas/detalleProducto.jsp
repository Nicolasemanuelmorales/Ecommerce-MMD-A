<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>MMD'A</title>
    <%@include file='head.jsp'%>
  </head>
<body class="goto-here">
<c:set var="context" value="${pageContext.request.contextPath}"/>
	<%@include file='barra_superior.jsp'%>
    <%@include file='menu.jsp'%>
    <!-- END nav -->

    <section class="">
    <br>
    	<div class="container">
    		<div class="row">
    		<c:forEach items="${xd}" var="i">
    			<div class="col-lg-6 mb-5 ftco-animate">
    				<a href="${context}/${i.imagen}" class="image-popup"><img src="${context}/${i.imagen}" class="img-fluid" alt="Colorlib Template"></a>
    			</div>
    			<div class="col-lg-6 product-details pl-md-5 ftco-animate">
    				<h3>${i.nombre}</h3>
    				<div class="rating d-flex">
							<p class="text-left mr-4">
								<a href="#" class="mr-2">5.0</a>
								<a href="#"><span class="ion-ios-star-outline"></span></a>
								<a href="#"><span class="ion-ios-star-outline"></span></a>
								<a href="#"><span class="ion-ios-star-outline"></span></a>
								<a href="#"><span class="ion-ios-star-outline"></span></a>
								<a href="#"><span class="ion-ios-star-outline"></span></a>
							</p>
							<p class="text-left mr-4">
								<a href="#" class="mr-2" style="color: #000;">100 <span style="color: #bbb;">Ranking</span></a>
							</p>
							<p class="text-left">
								<a href="#" class="mr-2" style="color: #000;">500 <span style="color: #bbb;">Vendidos</span></a>
							</p>
						</div>
    				<p class="price" style="font-weight: 1000";><span>$ ${i.precio}</span></p>
    				
			<div class="row mt-4">
						
	          	
	          	<div class="col-md-12">
	          		<div style="color: black; font-weight: bold;">Stock disponible: </div>
	          		<div style="color: #A29C9A;">${i.stock} </div>
	          	</div><br>
	          	
	          	<div class="col-md-12">
	          		<div style="color: black; font-weight: bold;">Talles disponibles: </div>
	          		<div style="color: #A29C9A;">${i.talle} </div>
	          	</div><br>
	          	
	          	<div class="col-md-12">
	          		<div style="color: black; font-weight: bold;">Color: </div>
	          		<div style="color: #A29C9A;">${i.color} </div>
	          	</div><br>
	          	
	          	<div class="col-md-12">
	          		<div style="color: black; font-weight: bold;">Material: </div>
	          		<div style="color: #A29C9A;">${i.material} </div>          	
          	</div>	</div><br>
          	
          	
          	
          	<p><a href="${context}/agregarAlCarro/${i.id}" class="btn btn-black py-3 px-5">Agregar al carro</a></p>
    			</div>
    		</div>
    		</c:forEach>
    	</div>
    </section>

    <section class=" bg-light">
    <br><br>
    	<div class="container">
				<div class="row justify-content-center mb-3 pb-3">
          <div class="col-md-12 heading-section text-center ftco-animate">
            <h2 class="mb-4">Productos Relacionados</h2>
          </div>
        </div>   		
    	</div>
    	<div class="container">
    		<div class="row">
    			
    			<c:forEach items="${xd2}" var="i">
    			
    			
    			<div class="col-sm col-md-6 col-lg ftco-animate">
    				<div class="product">
    					<a href="#" class="img-prod"><img class="img-fluid" src="${context}/${i.imagen}" alt="Colorlib Template">
    						
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
    	</div>
    </section>

<%@include file='newsletter.jsp' %>
<%@include file='footer.jsp' %>
  	<!-- loader -->
  	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>

  <script>
		$(document).ready(function(){

		var quantitiy=0;
		   $('.quantity-right-plus').click(function(e){
		        
		        // Stop acting like a button
		        e.preventDefault();
		        // Get the field name
		        var quantity = parseInt($('#quantity').val());
		        
		        // If is not undefined
		            
		            $('#quantity').val(quantity + 1);

		          
		            // Increment
		        
		    });

		     $('.quantity-left-minus').click(function(e){
		        // Stop acting like a button
		        e.preventDefault();
		        // Get the field name
		        var quantity = parseInt($('#quantity').val());
		        
		        // If is not undefined
		      
		            // Increment
		            if(quantity>0){
		            $('#quantity').val(quantity - 1);
		            }
		    });
		    
		});
	</script>
    
  </body>
</html>