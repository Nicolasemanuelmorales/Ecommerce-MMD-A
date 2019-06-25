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

	<c:set var="context" value="${pageContext.request.contextPath}"/>

    <div class="hero-wrap hero-bread" style="background-image: url('${context}/images/bg_6.jpg');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
            <h1 class="mb-0 bread">Mi Carro</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section ftco-cart">
			<div class="container">
				<div class="row">
    			<div class="col-md-12 ftco-animate">
    				<div class="cart-list">
	    				<table class="table">
						    <thead class="thead-primary">
						      <tr class="text-center">
						        <th>&nbsp;</th>
						        <th>&nbsp;</th>
						        <th>Descripcion</th>
						        <th>Precio</th>
						        <th>Cantidad</th>
						        <th>Total</th>
						      </tr>
						    </thead>
						    <tbody>
						    
						    <c:forEach items="${xd}" var="i">
	
						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url(${context}/${i.imagen});"></div></td>
						        
						        <td class="product-name">
						        	<div style="color: black; font-weight: bold;">${i.nombre}</div>
						       
						        	<div style="color: #A29C9A;">COLOR    ${i.color}</div>
						        	
						        	
						        	<div style="color: #A29C9A;">MATERIAL    ${i.material}</div>
						        	
						        </td>
						        
						        
						        <td class="price">$ ${i.precio}</td>
						        
						        <td>
						
							<div class="input-group col-md-12 mb-15" >
				             	<span class="input-group-btn mr-2">
				                	<button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="">
				                   <i class="ion-ios-remove"></i>
				                	</button>
				            		</span>
				             	<input type="text" id="quantity" name="quantity" class="form-control input-number" value="1" min="1" max="${i.stock}">
				             	<span class="input-group-btn ml-2">
				                	<button type="button" class="quantity-right-plus btn" data-type="plus" data-field="">
				                     <i class="ion-ios-add"></i>
				                 </button>
				             	</span>
				          	</div>
					          </td>
						        
						        <td class="total">
						        <div class="row"">
						        <div class="col-md-12">
							           <div class="select-wrap">
						                  <select name="" id="" class="form-control" >
						                  	<option value="">Small</option>
						                    <option value="">Medium</option>
						                    <option value="">Large</option>
						                    <option value="">Extra Large</option>
						                  </select>
						                </div>
				           			 </div>
									</div>
						        </td>
						      </tr><!-- END TR-->
						      
						      </c:forEach>




						    </tbody>
						  </table>
					  </div>
    			</div>
    		</div>
    		<div class="row justify-content-center">
    			<div class="col col-lg-5 col-md-6 mt-5 cart-wrap ftco-animate">
    				<div class="cart-total mb-3">
    					<h3>Total de la compra</h3>
    					<p class="d-flex">
    						<span>Subtotal</span>
    						<span>$20.60</span>
    					</p>
    					<p class="d-flex">
    						<span>Delivery</span>
    						<span>$0.00</span>
    					</p>
    					
    					<hr>
    					<p class="d-flex total-price">
    						<span>Total</span>
    						<span>$17.60</span>
    					</p>
    				</div>
    				<p class="text-center"><a href="checkout.html" class="btn btn-primary py-3 px-4">Realizar compra</a></p>
    			</div>
    		</div>
			</div>
		</section>

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