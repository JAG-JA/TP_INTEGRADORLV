<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ <link rel="stylesheet" type="text/css" href="css/style.css"/>---->
 <link rel="stylesheet" th:href="@{/css/style.css}">
<link rel="stylesheet" href="https://d19m59y37dris4.cloudfront.net/universal/2-0-1/vendor/font-awesome/css/font-awesome.min.css">
<title>Banco online</title>
</head>
<body>
  <jsp:include page="header.jsp"/>
  <div class="row" style="background: #dcd9d9;">
     <div class="col-md-12">
         <div class="col-md-2">
               <img  style="height: 63%!important;" src="images/id-card.png" alt="First slide">
         </div>
     	 <div class="col-md-6 mt-2" style="margin-top: 48px!important; margin-left: 114px;">
     	 	<span style="color: white; ">
     	 		¡Actualizá tus datos!
				 Mantener tus datos actualizados te permite identificarte de manera simple y operar de forma más segura.
     	 	</span>
     	 </div>
     	  <div class="col-md-2">
         </div>
     </div>
  </div>
   <div class="container">
      <div class="row">
           <div class="col-md-8">
      		<h4><span>Bienvenido ${cliente.apellido} ${cliente.nombre}</span></h4>
      		
      		<c:forEach var="cuenta" items="${sListCuenta}">
		
				  <div class="card" style="margin-bottom: 31px;">
				  <div class="card-body">
				     <div class="row">
				        <div class="col-md-6">
				           <span><b>Caja de Ahorro$ </b> ${cuenta.nroCuenta} </span>
				        </div>
				          <div class="col-md-6">
				           <span><b>Saldo$ </b> ${cuenta.saldo} </span>
				        </div>
				     </div>
				  </div>
				  <div class="card-footer">
				   <div class="row">
				        <div class="col-md-6">
				          <a href="transferencia/${cuenta.idCuenta}" ><span style="color:blue">Transferir </span></a> 
				        </div>
				          <div class="col-md-6">
				             <a href="historial/${cuenta.id}" ><span style="color:blue">Historial </span></a>
				        </div>
				     </div>
				  </div>
				</div>
				<br>
			
			</c:forEach>
 		  	
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