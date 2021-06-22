<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<!-- Font Awesome CSS-->
    <link rel="stylesheet" href="https://d19m59y37dris4.cloudfront.net/universal/2-0-1/vendor/font-awesome/css/font-awesome.min.css">
<!------ Include the above in your HEAD tag ---------->
  <script type="text/javascript">
  $( document ).ready(function() {
	  document.getElementById( 'idFormularioLogin' ).style.display = 'none';
   });
  </script>
</head>
<body>
<div class="top-bar">
        <div class="container">
          <div class="row d-flex align-items-center">
            <div class="col-md-6 d-md-block d-none">
              <p>Contacto +91 1112223311 o ale@gmail.com.</p>
            </div>
            <div class="col-md-6">
              <div class="d-flex justify-content-md-end justify-content-between">
                <ul class="list-inline contact-info d-block d-md-none">
                  <li class="list-inline-item"><a href="#"><i class="fa fa-phone"></i></a></li>
                  <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                </ul>
                <div class="login">
                	<a href="#" data-toggle="modal" onclick="onClick();"  data-target="#login-modal" class="login-btn"><i class="fa fa-sign-in"></i>
                	<span class="d-none d-md-inline-block">Sign In</span></a>
                	<a href="customer-register.html" class="signup-btn"><i class="fa fa-user"></i>
                	<span class="d-none d-md-inline-block">Sign Up</span></a>
                </div>
                <ul class="social-custom list-inline">
                  <li class="list-inline-item"><a href="#"><i class="fa fa-facebook"></i></a></li>
                  <li class="list-inline-item"><a href="#"><i class="fa fa-google-plus"></i></a></li>
                  <li class="list-inline-item"><a href="#"><i class="fa fa-twitter"></i></a></li>
                  <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>

<div class="container">
    <div class="row"  id="idFormularioLogin">
        <div class="col-md-3"></div>
        <div class="col-md-6 mt-2">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login
                 </div>
                 <div class="panel-header" style="width: 50%;text-align: center;margin-left: 26%;margin-top: 8px;color: chocolate;">
                   <span>No brindes datos personales por correo, teléfono, SMS o redes sociales.</span>
                 </div>
                <div class="panel-body">
                  <form action="login" method="post" class="form-horizontal">
                    <div class="form-group">
                        <label for="usuario" class="col-sm-3 control-label" >
                            Usuario</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" placeholder="Usuario" name="username" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="form-group">
                        
                    </div>
                    <div class="form-group last" style="float:right">
                      
                        <div class="col-md-4">
                            <button type="submit" class="btn btn-primary btn-round" style="margin-right:18px">
                               Aceptar
                             </button>
                                                             
                        </div>
                         <div class="col-md-4">
                            <button  type="button" onclick="onSalir();" class="btn btn-secondary btn-round">
                               Cancelar
                          </button>
                                                             
                        </div>
                    </div>
                    </form>
                </div>
               
            </div>
        </div>
   		 <div class="col-md-3"></div>
    </div>
   
		     <div id="carouselExampleControls" class="carousel slide mt-2" data-ride="carousel">
				  <div class="carousel-inner">
					    <div class="carousel-item active">
					      <img class="d-block w-100"   src="images/1.jpg" alt="First slide">
					    </div>
					    <div class="carousel-item">
					      <img class="d-block w-100"    src="images/2.webp" alt="Second slide">
					    </div>
					   
				  </div>
			  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div> 
      	
      
     </div>


</div>
 <jsp:include page="footer.jsp"/>
</body>
</html>
<script type="text/javascript">

function onClick(){
	document.getElementById( 'idFormularioLogin' ).style.display = 'inline';
}
function onSalir(){
	document.getElementById( 'idFormularioLogin' ).style.display = 'none';
}
</script>
