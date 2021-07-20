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
		<div class="col-md-12">
            <table class="table table-striped table-condensed">
                  <thead>
                  <tr>
                      <th>Nombre</th>
                      <th>Apellido</th>
                      <th>Dirección</th>
                      <th>Acción</th>                                     
                  </tr>
              </thead>   
              <tbody>
              
                  <c:forEach var="cli" items="${list}">
                     <tr>
                    
                     <td>
                     	 	${cli.nombre}
                     </td>
                     <td>
                     	   ${cli.apellido}
                     </td>
                     <td>
                     	   ${cli.direccion}
                     </td>
                      <td>
                      	 <a  href="viewDelete/${cli.idCliente}" class="btn btn-secondary">
                      			 <i class="fa fa-trash"></i>
                      	 </a>
                      	  <a href="updateregistro/${cli.idCliente}"  class="btn btn-secondary">
                      	    <i class="fa fa-user"></i>
                      	 </a>
                      	  <a  href="registar" class="btn btn-secondary">
                      	 <i class="fa fa-plus"></i>
                      	 </a>
                      </td>
                     </tr>
                  </c:forEach>
                                         
              </tbody>
            </table>
            </div>
	</div>
</div>
   	
    <jsp:include page="footer.jsp"/>
</body>

</html>