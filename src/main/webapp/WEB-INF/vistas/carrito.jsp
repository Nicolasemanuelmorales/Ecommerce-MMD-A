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
						    
<!--  iniciamos el contador  -->
<c:set var="contador" value="${1}" />

						    <tbody>
<form action="${context}/checkout" method="GET">					    
						    <c:forEach items="${xd}" var="i">
<input type="text" value="${i.id }" name="id" hidden="">
						      <tr class="text-center">
						        <td class="product-remove"><a href="${context}/quitarDelCarro/${i.id}"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url(${context}/${i.imagen});"></div></td>
						        
						        <td class="product-name">
						        	<div style="color: black; font-weight: bold;">${i.nombre}</div>
						       
						        	<div style="color: #A29C9A;">COLOR    ${i.color}</div>
						        	
						        	
						        	<div style="color: #A29C9A;">MATERIAL    ${i.material}</div>
						        	<div id="stock${contador }">${i.stock }</div>
						        	
						        </td>
						        
						        
						        <td id="precio${contador }" data-value="${i.precio }">$ ${i.precio }</td>
						        <td>
						
							<div class="input-group col-md-12 mb-15" >
				             	<span class="input-group-btn mr-2">
				                	<button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="" onclick="restar(${contador})">
				                   <i class="ion-ios-remove"></i>
				                	</button>
				            		</span>
				             	<input type="text" id="quantity${contador}" name="quantity" class="form-control input-number" value="0" min="0" max="${i.stock}" readonly>
				             	<span class="input-group-btn ml-2">
				                	<button type="button" class="quantity-right-plus btn" data-type="plus" data-field="" onclick="sumar(${contador})">
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
<!--  incrementamos el contador  -->
<c:set var="contador" value="${contador + 1}" />
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
    						<span id="subtotal">$0.00</span>
    					</p>
    					<p class="d-flex">
    						<span>Delivery</span>
    						<span id="delivery">$0.00</span>
    					</p>
    					
    					<hr>
    					<p class="d-flex total-price">
    						<span>Total</span>
    						<span id="total">$0.00</span>
    					</p>
    				</div>
    				<%if (contCart == null){ %>
    				< p class="text-center"><a href="checkout.html" class="btn btn-primary py-3 px-4 disabled">Realizar compra</a></p>
    				<%}else{ %>
    				<!-- p class="text-center"><a href="checkout.html" class="btn btn-primary py-3 px-4">Realizar compra</a></p-->
    				<input type="submit" value="Realizar compra" class="btn btn-primary py-3 px-4">
    				<%}%>
    			</div></form>
    		</div>
			</div>
		</section>
		<%@include file='newsletter.jsp' %>
	<%@include file='footer.jsp' %>
	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
	<%@include file='footer_script.jsp' %>

  
   <script> 
    var sub=0.0;
    var delivery = 0.0;
    var total = 0.0;
    function sumar(orden){
    	//aumenta cantidad
		var cantidad = parseInt($('#quantity'+orden).val()); 
		$('#quantity'+orden).val(cantidad + 1);
		cantidad = parseInt($('#quantity'+orden).val()); 
		//baja stock
		var stock = parseInt($('#stock'+orden).html());
		$('#stock'+orden).html(stock - 1);
		
		//aumenta subtotal
		var precio = parseFloat($('#precio'+orden).data("value"));
		sub = sub+precio;
		$('#subtotal').html("$"+sub);
		
		//calcula el valor del delivery, si >=1000 se le cobra el 10%
		if(sub>=1000){
			delivery = sub*0.1;
			$('#delivery').html("$"+delivery);
		}
		
		total = sub + delivery;
		$('#total').html("$"+total);
    };
    
    //hay que generar la suma de los dos productos x estos acumulan por separado
    
    function restar(orden){
		var cantidad = parseInt($('#quantity'+orden).val()); 
		if(cantidad>0){
			$('#quantity'+orden).val(cantidad - 1);
			var stock = parseInt($('#stock'+orden).html());
			$('#stock'+orden).html(stock + 1);
			
			//aumenta subtotal
			var precio = parseFloat($('#precio'+orden).data("value"));
			sub = sub-precio;
			$('#subtotal').html("$"+sub);
		}
		
		
    };
    </script>
  </body>
</html>