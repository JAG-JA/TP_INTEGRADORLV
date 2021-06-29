<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/style.css"/>
<!-- Font Awesome CSS-->
    <link rel="stylesheet" href="https://d19m59y37dris4.cloudfront.net/universal/2-0-1/vendor/font-awesome/css/font-awesome.min.css">
<!------ Include the above in your HEAD tag ---------->
</head>
<body>
 <jsp:include page="./WEB-INF/views/header.jsp"/>
<div class="container">
   
   		 <div class="col-md-3"></div>
    </div>
   
		     <div id="carouselExampleControls" class="carousel slide mt-2" data-ride="carousel">
				  <div class="carousel-inner">
					    <div class="carousel-item active">
					      <img class="d-block w-100"   src="<c:url value="/images/1.jpg"/>" alt="First slide">
					    </div>
					    <div class="carousel-item">
					      <img class="d-block w-100"  src="<c:url value="/images/2.webp"/>"  alt="Second slide">
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
      	
      

 <jsp:include page="./WEB-INF/views/footer.jsp"/>
</body>
</html>

