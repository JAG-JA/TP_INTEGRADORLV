<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<title>Banco online</title>
<style type="text/css">
.caja {
   margin-left: 16px;
   border:1px solid #d9d9d9;
   height:30px;
   overflow: hidden;
   width: 230px;
   position:relative;
}
select {
   background: transparent;
   border: none;
   font-size: 14px;
   height: 30px;
   padding: 5px;
   width: 250px;
}
select:focus{ outline: none;}

.caja::after{
	content:"\025be";
	display:table-cell;
	padding-top:7px;
	text-align:center;
	width:30px;
	height:30px;
	background-color:#d9d9d9;
	position:absolute;
	top:0;
	right:0px;	
	pointer-events: none;
}
</style>
</head>
<body>
  <jsp:include page="header.jsp"/>
  <div class="row" style="background: #dcd9d9;">
   
  </div>
  <div class="container">
      <div class="row">
           <div class="col-md-8">
      		<h4><span>Cuentas</span></h4>
      		<div class="card" style="margin-bottom: 31px;">
			  <div class="card-body">
			     <div class="row">
			        <div class="col-md-6">
			           <span><b>Caja de Ahorro$</b> 000000001 </span>
			        </div>
			          <div class="col-md-6">
			           <span><b>Saldo$</b> 000000001 </span>
			        </div>
			     </div>
			  </div>
			  <div class="card-footer">
			   <div class="row">
			        <div class="col-md-6">
			          <a><span style="color:blue">Transferir</span></a> 
			        </div>
			          <div class="col-md-6">
			             <a><span style="color:blue">Historial </span></a>
			        </div>
			     </div>
			  </div>
			</div>
			<div class="card">
			  <div class="card-body">
			    <div class="row">
			    	<div class="col-md-4">
			    			<div class="col-md-2"></div>
								<select class="caja" aria-label=".form-select-sm example">
								  <option selected>Selccione una cuenta</option>
								  <option value="1">000001</option>
								  <option value="2">000002</option>
								  <option value="3">000003</option>
								</select>
			    	</div>
			    	<div class="col-md-3">
			    			<input type="text" class="form-control" placeholder="Cliente" style="disabled" name="cliente" required>
			    	</div>
			    	<div class="col-md-2">
			    		<input type="text" class="form-control" placeholder="Importe" style="disabled" name="importe" required>
			    	</div>
			    	<div class="col-md-2">
			    		<button  type="button" class="btn btn-secondary btn-round">
                               Aceptar
                          </button>
			    	</div>
				
					
			    </div>
			  </div>
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