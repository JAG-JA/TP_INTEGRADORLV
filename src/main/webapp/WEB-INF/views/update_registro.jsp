<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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

<style type="text/css">

.form-heading { color:#fff; font-size:23px;}
.panel h2{ color:#444444; font-size:18px; margin:0 0 8px 0;}
.panel p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}
.login-form .form-control {
  background: #f7f7f7 none repeat scroll 0 0;
  border: 1px solid #d4d4d4;
  border-radius: 4px;
  font-size: 14px;
  height: 50px;
  line-height: 50px;
}
.main-div {
  background: #ffffff none repeat scroll 0 0;
  border-radius: 2px;
  margin: 10px auto 30px;
  max-width: 38%;
  padding: 50px 70px 70px 71px;
}

.login-form .form-group {
  margin-bottom:10px;
}
.login-form{ text-align:center;}
.forgot a {
  color: #777777;
  font-size: 14px;
  text-decoration: underline;
}
.login-form  .btn.btn-primary {
  background: #f0ad4e none repeat scroll 0 0;
  border-color: #f0ad4e;
  color: #ffffff;
  font-size: 14px;
  width: 100%;
  height: 50px;
  line-height: 50px;
  padding: 0;
}
.forgot {
  text-align: left; margin-bottom:30px;
}
.botto-text {
  color: #ffffff;
  font-size: 14px;
  margin: auto;
}
.login-form .btn.btn-primary.reset {
  background: #ff9900 none repeat scroll 0 0;
}
.back { text-align: left; margin-top:10px;}
.back a {color: #444444; font-size: 13px;text-decoration: none;}
</style>


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
     	 		¡No compartas tu información!<br>
				Actualizacion del Usuario.
     	 	</span>
     	 </div>
     	  <div class="col-md-2">
         </div>
     </div>
  </div>
<div class="container">
		<h1 class="form-heading">Formulario para registrar</h1>
		<div class="login-form">
			    <div class="panel">
				   <h2> Informacion del Usuario</h2>
				   <p> Mi Perfil - </p>
			   </div>
			    <form:form id="Update_registro" action="../updateCliente" modelAttribute="cliente">
			       	       			 
			    	<div class="row">
			    	
			    	    <div class="col-md-6">
			    	    	  <div class="form-group">
			       	       			 <form:input path="nombre" class="form-control"  placeholder="Nombre"/>
				       		 </div>
			    	    </div>
			    	     <div class="col-md-6">
			    	     		<div class="form-group">
				            	  <form:input path="apellido" class="form-control"  placeholder="Apellido"/>
				       		  </div>
			    	     </div>
			    	</div>
				    <div class="row">
				    		<div class="col-md-6">
				    			<div class="form-group">
						             <form:input path="dni" class="form-control"  placeholder="DNI"/>
						        </div>
				    		</div>
				    		<div class="col-md-6">
				    			<div class="form-group">
				        			<form:select path="sexo" class="form-control" items="${sListSex}" style="height: 47px;"> </form:select>	
								</div>
				    		</div>
				    		
				    </div>  
				    <div class="row">
			    		<div class="col-md-6">
			    			<div class="form-group">
					             <form:input path="direccion" class="form-control"  placeholder="Dirección"/>
					        </div>
			    		</div>
			    		<div class="col-md-6">
			    			<div class="form-group">
			        		  <form:input path="fechaNacimiento" class="form-control" placeholder="MM/DD/YYYY"/>
							</div>
			    		</div>
				    </div>  
				    <div class="row">
			    		<div class="col-md-6">
			    			<div class="form-group">
					            	<form:select path="localidad" class="form-control" items="${sComboLocalidades}"  style="height: 47px;"> </form:select>
					        </div>
			    		</div>
			    		<div class="col-md-6">
			    			<div class="form-group">
				        			<form:select path="nacionalidad" class="form-control" items="${sListNacionalidad}" style="height: 47px;"> </form:select>	
								</div>
				    		</div>				    								
			    		</div>	
				    </div>  	    
				    
			    	<div class="row">
			    	 <div class="col-md-6">
			    	    	  <div style="display:none" class="form-group">
			       	       			 <form:input path="idCliente" class="form-control"  placeholder="Id"/>
				       		 </div>
			    	 </div>
			    	</div>
				    
			            <button type="submit" class="btn btn-primary">Aceptar</button>
			    </form:form>
		   
		</div>
	</div>
   <jsp:include page="footer.jsp"/>
</body>

</html>