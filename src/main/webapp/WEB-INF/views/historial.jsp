<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" href="https://d19m59y37dris4.cloudfront.net/universal/2-0-1/vendor/font-awesome/css/font-awesome.min.css">
<title>Banco online</title>
</head>
<body>
  <jsp:include page="header.jsp"/>
  <div class="container">
      <div class="row">
           <div class="col-md-8">
      		 <hr>
      		 <div class="card" style="background-color: #ecf7ef">
      		 		<div class="card-body">
      		 		 <div class="row">
      		 		   <div class="col-md-4">
          		 		    	<span><b>Caja de ahorro $</b> ${cuenta.nroCuenta}</span>
          		 		     </div>
          		 		     <div class="col-md-4" > 
          		 		         <img alt="Historial" src="images/historial.png" width="80%">
          		 		     </div>
          		 		     <div class="col-md-4" > 
          		 		        <span><b>Saldo disponible $</b> ${cuenta.saldo} </span>
      		 		    </div>
      		 		 </div>
      		 		
      		 		</div>
      		 </div>
      		 <div class="row mt-2 ml-2">
      		   <h3><span style="color:#53b6b8">Últimos movimientos</span></h3>
      		     <table class="table table-hover" style="98%">
					  <thead style="background:#e0e1e2">
					    <tr>
					      <th scope="col">Fecha</th>
					      <th scope="col">Concepto</th>
					      <th scope="col">Importe</th>
					  
					    </tr>
					  </thead>
					  <tbody>
				 <c:forEach var="mov" items="${movimiento}">
    						    <tr>
    						      <th scope="row">${mov.fechaAlta}</th>
    						      <td>${mov.detalleMovimiento}</td>
    						      <td>${mov.importe}</td>
    						     
    						    </tr>
					  </c:forEach>
					  </tbody>
					</table>
      		 </div>
      		  	
      	   </div>
      	   <div class="col-md-4" >
      	   	  <div class="card" style="margin-top: 12px;margin-bottom: 31px; background: #53b6b8;">
				  <div class="card-body">
				     <div class="row">
				        <div class="col-md-6">
				           <span><b>Puntos  </b>2000 </span>
				        </div>
				          
				     </div>
				  </div>
			  </div>
			  <div>
			     <div class="row">
			     
			     </div>
			  </div>
		      <table style="width: 100%; border: 1px solid #8e7a7a;" > 
		          <tr style="width: 100%; border: 1px solid #8e7a7a;height: 51px;"><td style="text-align:center">Mi perfil</td></tr>
		          <tr style="width: 100% ;border: 1px solid #8e7a7a;height: 51px;"><td style="text-align:center">Movimiento</td></tr>
		          <tr style="width: 100%; border: 1px solid #8e7a7a;height: 51px;"><td style="text-align:center">Claves</td></tr>  
		          <tr style="width: 100%; border: 1px solid #8e7a7a;height: 51px;"><td style="text-align:center">Limites</td></tr>
		          <tr style="width: 100%; border: 1px solid #8e7a7a;height: 51px;"><td style="text-align:center">Pgos</td></tr>
				</table>
			</div>
		
      </div>
 
    
</div>
   <jsp:include page="footer.jsp"/>
</body>

</html>